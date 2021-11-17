package com.example.testpdfgenerator.controller.service

import com.example.testpdfgenerator.controller.model.CustomerSaleFormHistory
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder
import org.jsoup.Jsoup
import org.jsoup.helper.W3CDom
import org.jsoup.nodes.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.thymeleaf.context.Context
import org.thymeleaf.spring5.SpringTemplateEngine
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.*


private const val Customer_Sale_Form_History = "saleHistory"
private const val BASE_URL = "baseUrl"

@Service
class TestPDF(){

    @Autowired
    var templateEngine :SpringTemplateEngine? = null

    fun generatePDF(){
        val locale = Locale.forLanguageTag("en")
        val context1 = Context(locale).apply {
            setVariable(Customer_Sale_Form_History, createModel())
            //setVariable(USER, detail)
            //setVariable(BASE_URL, jHipsterProperties.mail.baseUrl)
        }
        val context2 = Context(locale).apply {
            setVariable(Customer_Sale_Form_History, createModel())
            //setVariable(BASE_URL, jHipsterProperties.mail.baseUrl)
        }

        //val template =  "templates/index.html"
        try {
            val template1 =  "mytest"
            val template2 =  "vitamin"
            val content1 = templateEngine?.process(template1, context1)
            val content2 = templateEngine?.process(template2, context2)

            ByteArrayOutputStream().use { os1 ->

                if (content1 != null) {
                    createpdf1(content1,os1)
                    //createpdf2(content1,os1)
                }

                val convertFile = File("D:\\Foad\\webhead\\mypdf1.pdf" )
                convertFile.createNewFile()
                val fout = FileOutputStream(convertFile)
                fout.write(os1.toByteArray())
                fout.close()

                var log: String = "ok!"
            }
            ByteArrayOutputStream().use { os2 ->

                if (content2 != null) {
                    createpdf1(content2,os2)
                    //createpdf2(content2,os2)
                }

                val convertFile = File("D:\\Foad\\webhead\\mypdf2.pdf" )
                convertFile.createNewFile()
                val fout = FileOutputStream(convertFile)
                fout.write(os2.toByteArray())
                fout.close()

                var log: String = "ok!"
            }
        }catch (e: Exception){
            e.printStackTrace()
        }


    }

    fun createpdf1(content:String ,os: ByteArrayOutputStream){
        val document: Document = Jsoup.parse(content, "UTF-8")
        val builder = PdfRendererBuilder()
        //builder.withUri(outputPdf)
        builder.withW3cDocument(W3CDom().fromJsoup(document), "/")
        builder.toStream(os)
        //builder.useFont(new File(getClass().getClassLoader().getResource("fonts/PRISTINA.ttf").getFile()), "PRISTINA");

        /*val baseUrl = FileSystems.getDefault()
            .getPath("src/main/resources/")
            .toUri().toURL().toString()
        builder.withW3cDocument(W3CDom().fromJsoup(doc), baseUrl)*/
        builder.run()
    }

    fun createpdf2(content:String ,os: ByteArrayOutputStream) {
        val builder = PdfRendererBuilder()
        builder.withHtmlContent(content, "file:")
        builder.toStream(os)
        builder.run()
    }

    fun createModel() : CustomerSaleFormHistory {
        var customerSaleFormHistory: CustomerSaleFormHistory = CustomerSaleFormHistory()
        return customerSaleFormHistory;
    }
}