package com.joy.photobooth_be.controller.qrcode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ImageController {

    @GetMapping("/{imgUrl}")
    public String index(@PathVariable String imgUrl, Model model) {
        model.addAttribute("s3ImageUrl", imgUrl);
        return "index";
    }
}
