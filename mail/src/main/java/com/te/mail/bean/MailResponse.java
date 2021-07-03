package com.te.mail.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@XmlRootElement(name="mail-response")
@JsonRootName("mail-response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MailResponse {

	@JsonProperty
	@XmlElement
	private int status_code;
	
	@JsonProperty
	@XmlElement
	private String message;
	
	@JsonProperty
	@XmlElement
	private List<UserBean> userBean;
	
	@JsonProperty
	@XmlElement
	private List<MailBean> mailBean;

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<UserBean> getUserBean() {
		return userBean;
	}

	public void setUserBean(List<UserBean> userBean) {
		this.userBean = userBean;
	}

	public List<MailBean> getMailBean() {
		return mailBean;
	}

	public void setMailBean(List<MailBean> mailBean) {
		this.mailBean = mailBean;
	}
	
	

	
}