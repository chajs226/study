package study.zz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.fw.core.exception.StudyBizException;

@Controller
public class SampleController {

    @RequestMapping("STUDY001")
    public @ResponseBody String retrieveSampleList(@RequestBody String body) throws Exception {

        //String test = "A";

        System.out.println("print");

/*        if ("A".equals(test))
        {
            throw new StudyBizException();
        }*/

        System.out.println("After BizException");
        return body;
//        throw new WrongStudyException();

    }
}
