package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("경로")를 통해서 해당 컨트롤러가 어떤 공통 경로에 대해서 작동할 지 설정
// 공통 경로 아래의 세부 경로의 경우 컨트롤러 내부의 @GetMapping()을 사용해서 설정
// (컨트롤러가 하나의 경로에 대해서만 작동하는 경우 @RequestMapping없이 @GetMapping만으로 수행가능)
@RequestMapping("/board")
public class BoardController {

    // .../board/list 경로에 대한 처리
    @GetMapping("/list")
    public String list() {
        return "board/list";
    }
}
