package com.het.boot.web.controller;

import com.het.boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("getById.json")
    public ResponseEntity getOne(HttpSession session, String id) {
        System.out.println(session.getAttribute("product"));
        session.setAttribute("product", productService.getById(Long.valueOf(id)));
        return ResponseEntity.ok(productService.getById(Long.valueOf(id)));
    }

}
