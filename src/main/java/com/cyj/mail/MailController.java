package com.cyj.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * Created by cyj
 * on 2018/11/27.
 *
 * @author cyj
 */
@RestController
@RequestMapping("/MailController")
public class MailController {
    @Autowired
    private MailUtils mailUtils;
    @Resource
    TemplateEngine templateEngine;

    @GetMapping("sendSimpleMail")
    public void sendSimpleMail() {
        mailUtils.sendSimpleMail("sbksendmail@126.com", "这是第一封邮件测试", "大家好，这是我的第一封邮件");
        System.out.println("发送完成");
    }

    @GetMapping("sendHtmlMail")
    public void sendHtmlMail() throws MessagingException {
        String content = "<html>\n" + "<body>\n" + "<h3>这是第一封Html邮件</h3>\n" + "</body>\n" + "</html>";
        mailUtils.sendHtmlMail("sbksendmail@126.com", "这是第一封Html邮件", content);
        System.out.println("发送完成");
    }

    @GetMapping("sendAttachmentMail")
    public void sendAttachmentMail() throws MessagingException {
        String filePath = "C:\\Users\\cyj\\Downloads\\SpringQuick\\mail.zip";
        mailUtils.sendAttachmentMail("sbksendmail@126.com", "这是第一封带附件邮件", "这是第一封带附件邮件", filePath);
        System.out.println("发送完成");
    }

    @GetMapping("sendPicMail")
    public void sendPicMail() {
        String rscPath = "C:\\Users\\cyj\\Desktop\\pic.png";
        String rscId = "pic001";
        //多个邮件就加多个img标签
        String content = "<html><body>\n这是第一封图片邮件:<img src=\'cid:" + rscId + "\'></body></html>";
        System.out.println(content);
        mailUtils.sendPicMail("sbksendmail@126.com", "这是第一封图片邮件", content, rscPath, rscId);
        System.out.println("发送完成");
    }

    @GetMapping("sendTemplatesMail")
    public void sendTemplatesMail() throws MessagingException {
        Context context = new Context();
        context.setVariable("id", "002");

        String emailContext = templateEngine.process("emailTemplate", context);
        mailUtils.sendHtmlMail("sbksendmail@126.com", "这是一个模板邮件", emailContext);
        System.out.println("发送完成");
    }
}
