package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 데이터 기반으로 api 응답 생성을 위해 @RestController 사용
public class PostController {
    // SSR -> jsp, thymeleaf, mustache, freemarker
    //        -> html rendering 서버에서 렌더링해서 데이터 전송
    // SPA -> vue
    //        -> javaScript + <-> API (JSON 형태로 응답 처리)
    //        vue -> vue+SSR = nuxt
    //        react -> react+SSR = next.js
    @GetMapping("/posts")
    public String get() {
        return "Hello World";
    }
}
