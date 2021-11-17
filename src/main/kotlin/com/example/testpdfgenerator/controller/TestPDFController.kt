package com.example.testpdfgenerator.controller

import com.example.testpdfgenerator.controller.service.TestPDF
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class TestPDFController {
    @Autowired
    var testPDF : TestPDF? = null

    //@GetMapping("/getpdf")
    @RequestMapping("/")
    fun create(): String {
        testPDF?.generatePDF()
        return " OK "
    }
}