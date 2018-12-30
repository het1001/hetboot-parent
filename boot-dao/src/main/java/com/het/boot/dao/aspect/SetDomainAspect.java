package com.het.boot.dao.aspect;

import com.het.boot.dao.entity.BaseEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class SetDomainAspect {

    @Pointcut(value = "@annotation(com.het.boot.dao.aspect.SetDomain)")
    public void addAdvice() {
    }

    @Around("addAdvice()")
    public Object handler(ProceedingJoinPoint point) throws Throwable {

        // 此处从ThreadLocal取
        String domain = "ALIPAY";

        Object[] args = point.getArgs();
        if (args != null && args.length == 1) {
            Object arg = args[0];
            if (arg instanceof Map) {
                Map map = (Map) arg;
                map.put("domain", domain);
            } else if (arg instanceof BaseEntity) {
                BaseEntity model = (BaseEntity) arg;
                model.setDomain(domain);
            }
        }

        return point.proceed();

    }
}
