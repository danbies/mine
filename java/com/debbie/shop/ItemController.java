package com.debbie.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@ModelAttribute Item item){
        //@Requestparam Map 어쩌구
        //@Requestparam (name="저쩌구") String 저쩌구
        //String title, Integer price
        
//        HashMap<String,String> testMap = new HashMap<>();
//        testMap.put("title","공기밥");
//        testMap.put("price","3000");
//        System.out.println(testMap);


//        Item item = new Item();
//        item.setTitle(title);
//        item.setPrice(price);

//        System.out.println(item);
        itemRepository.save(item);
        return "redirect:/list";
    }

}
