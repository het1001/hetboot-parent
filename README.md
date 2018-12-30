# hetboot-parent

springboot模板

> 开发前请仔细阅读该文档  

`数据库模型和dao、mapper初始化文件都是通过maven-mybatis-generator生成
添加新表之后在pom根目录下执行mvn mybatis-generator:generate
详解文档：https://www.jianshu.com/p/e09d2370b796 给写这个文档的哥们点赞，写得太好了  
警告：此工具只是辅助生成新表的模型+mapper文件，已经生成的不要再重复执行，避免出现不必要的麻烦`
---  

包含：
- web模块
    - websocket
- session模块（虽然单应用使用redis保存session有点小题大做，但是方便扩展）
- security 权限模块 （user - role - permission 内置）
- aop 拦截
- 事务

