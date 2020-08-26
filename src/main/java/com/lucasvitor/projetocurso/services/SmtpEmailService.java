package com.lucasvitor.projetocurso.services;

<<<<<<< HEAD
import javax.mail.internet.MimeMessage;

=======
>>>>>>> 8ce105bc8bd1a5524e48ff85d9c74b9bc6b399fa
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
<<<<<<< HEAD
import org.springframework.mail.javamail.JavaMailSender;
=======
>>>>>>> 8ce105bc8bd1a5524e48ff85d9c74b9bc6b399fa

public class SmtpEmailService extends AbstractEmailService {

	@Autowired
	private MailSender mailSender;
<<<<<<< HEAD
	
	@Autowired
	private JavaMailSender javaMailSender;
=======
>>>>>>> 8ce105bc8bd1a5524e48ff85d9c74b9bc6b399fa

	private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);

	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Enviando email...");
		mailSender.send(msg);
		LOG.info("Email enviado");
	}
<<<<<<< HEAD
	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Enviando email...");
		javaMailSender.send(msg);
		LOG.info("Email enviado");
	}
=======
>>>>>>> 8ce105bc8bd1a5524e48ff85d9c74b9bc6b399fa
}
