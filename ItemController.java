package com.debbie.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model){
        List<Item> result = itemRepository.findAll();

//        System.out.println(result.get(0).price);
//        System.out.println(result.get(0).title);
        var a = new Item();
        System.out.println(a.toString());


//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(30);
//        a.add(40);
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
        model.addAttribute("items",result);
        return "list.html";
    }

}
