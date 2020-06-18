package com.ybsteer.demon.Controler;


import com.ybsteer.demon.Questionnaire.Questionnaire;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class APIController {
    @PostMapping("answer")
        public String answer(Questionnaire questionnaire){
                if ("".equals(questionnaire.getAnswerOfQuestion_0())) {
                    return "不能为空";
                }
                else
                    System.out.println(questionnaire.toString());
                    return "已提交";
    }

}
