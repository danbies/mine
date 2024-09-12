package com.debbie.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardRepository boardRepository;

    @GetMapping("/board")
    String board(Model model){
        List<Board> result = boardRepository.findAll();

        model.addAttribute("boards",result);
        return "board.html";
    }
}
