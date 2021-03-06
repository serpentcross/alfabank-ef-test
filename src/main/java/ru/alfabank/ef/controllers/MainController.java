package ru.alfabank.ef.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.alfabank.ef.configurations.React;

import javax.script.ScriptException;
import java.io.FileNotFoundException;

@Controller
public class MainController {

    private final React react;

    @Autowired
    public MainController(React react) {
        this.react = react;
    }

    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String mainPage(Model model) throws JsonProcessingException, ScriptException, FileNotFoundException {

        String renderedHTML = react.renderEntryPoint();

        model.addAttribute("content", renderedHTML);

        return "index";
    }
}
