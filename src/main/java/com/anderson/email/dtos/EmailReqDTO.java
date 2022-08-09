package com.anderson.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailReqDTO {
    @NotBlank(message = "ownerRef não pode ser vazio ou nulo!")
    private String ownerRef;
    @NotBlank(message = "emailFrom não pode ser vazio ou nulo!")
    @Email(message = "E-mail inválido")
    private String emailFrom;
    @NotBlank(message = "emailTo não pode ser vazio ou nulo!")
    @Email(message = "E-mail inválido")
    private String emailTo;
    @NotBlank(message = "subject não pode ser vazio ou nulo!")
    private String subject;
    @NotBlank(message = "subject não pode ser vazio ou nulo!")
    private String text;

    public String getOwnerRef() {
        return ownerRef;
    }

    public void setOwnerRef(String ownerRef) {
        this.ownerRef = ownerRef;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
