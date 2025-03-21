package com.EmpTrack.EmpTrack_Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@PostMapping("/mail/{toEmail}/{subject}/{text}")
	public void sendMail(@PathVariable String toEmail,@PathVariable String subject,@PathVariable String text) {
	
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(toEmail);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
	javaMailSender.send(mailMessage);
	
	}
}
