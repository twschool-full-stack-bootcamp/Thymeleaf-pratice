package com.example.Thymeleafpratice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class ProductController {
  @GetMapping("/")
  public String index(Model model) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Product product = new Product("蛋糕", 70, sdf.parse("2019-12-18"));
    model.addAttribute("product", product);
    return "index";
  }
}
