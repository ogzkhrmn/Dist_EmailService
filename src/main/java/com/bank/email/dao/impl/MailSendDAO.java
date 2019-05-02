package com.bank.email.dao.impl;

import com.bank.email.model.RequestModel;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailSendDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailSendDAO.class);

    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final boolean SSL_FLAG = true;

    public void sendMail(RequestModel requestModel) {
        try {
            Email email = getEmail(requestModel);
            email.setMsg(requestModel.getName() + " " + requestModel.getSurname() + " adlı kullanıcıya para gönderim talebiniz alınmıştır.");
            email.addTo(requestModel.getAccountMail());
            email.send();
        } catch (Exception ex) {
            LOGGER.error("Unable to send email", ex);
        }
    }

    public void sendOkMail(RequestModel requestModel) {
        try {
            Email email = getEmail(requestModel);
            email.setMsg(requestModel.getName() + " " + requestModel.getSurname() + " adlı kullanıcıya para gönderim talebiniz tamamlandı.");
            email.addTo(requestModel.getAccountMail());
            email.send();
        } catch (Exception ex) {
            LOGGER.error("Unable to send email", ex);
        }
    }

    private Email getEmail(RequestModel requestModel) throws EmailException {
        Email email = new SimpleEmail();
        email.setCharset(org.apache.commons.mail.EmailConstants.UTF_8);
        email.setHostName(HOST);
        email.setSmtpPort(PORT);
        email.setAuthenticator(new DefaultAuthenticator("ogz.khrmn52@gmail.com", "oguz123oguz"));
        email.setSSLOnConnect(SSL_FLAG);
        email.setFrom("bank@bank.com");
        email.setSubject(requestModel.getType() + " gönderimi alındı");
        return email;
    }

}
