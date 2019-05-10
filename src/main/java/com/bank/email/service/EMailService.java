package com.bank.email.service;

import com.bank.email.dao.impl.MailSendDAO;
import com.bank.email.model.RequestModel;
import com.bank.email.model.ResponseModel;

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
    public ResponseModel sendEmail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendMail(request);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setSuccess(true);
        return responseModel;
    }

    @POST
    @Path("/sendOkMail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseModel sendOkMail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendOkMail(request);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setSuccess(true);
        return responseModel;
    }

    @POST
    @Path("/sendErrortoUser")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseModel sendErrortoUser(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendErrortoUser(request);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setSuccess(true);
        return responseModel;
    }

    @POST
    @Path("/sendErrorMail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseModel sendErrorMail(RequestModel request) {
        MailSendDAO mailSendDAO = new MailSendDAO();
        mailSendDAO.sendErrorMail(request);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setSuccess(true);
        return responseModel;
    }

    @POST
    @Path("/control")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseModel isAlive() {
        ResponseModel responseModel = new ResponseModel();
        responseModel.setSuccess(true);
        return responseModel;
    }

}
