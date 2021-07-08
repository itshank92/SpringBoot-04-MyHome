package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // @GetMapping의 경우 어노테이션 뒤에 ("경로")가 작성이 되어 해당 경로로 요청이 들어오는 순간
    // 가장 먼저 GetMapping 어노테이션이 실행되는 것을 의미한다.
    // 단, 첫페이지와 같이 경로가 따로 없는 경우, @GetMapping 뒤에 경로값을 입력하지 않아도 된다.
    @GetMapping
    public String index() {
        return "index";
    }

}
