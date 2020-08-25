package com.lucasvitor.projetocurso.services;

import org.springframework.mail.SimpleMailMessage;

import com.lucasvitor.projetocurso.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
