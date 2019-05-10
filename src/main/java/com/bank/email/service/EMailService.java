package com.bank.email.service;

import com.bank.email.dao.impl.MailSendDAO;
import com.bank.email.model.RequestModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

@Path("/email")
public class EMailService implements Serializable {

    @POST
    @Path("/sendMail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendEmail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendMail(request);
    }

    @POST
    @Path("/sendOkMail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendOkMail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendOkMail(request);
    }

    @POST
    @Path("/sendErrortoUser")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendErrortoUser(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendErrortoUser(request);
    }

    @POST
    @Path("/sendErrorMail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendErrorMail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendErrorMail(request);
    }

    @POST
    @Path("/control")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean isAlive() {
        return true;
    }

}
