package com.codeproj.monitor.email;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailMail
{
	private MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
	
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String dear, String content) {
		SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);
		
		message.setText(String.format(
				content, dear, content));

		mailSender.send(message);
	}
}
