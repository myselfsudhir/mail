package com.te.mail.dao;

import java.util.List;

import com.te.mail.bean.MailBean;
import com.te.mail.bean.UserBean;

public interface MailDAO {
	
	
	public boolean userRegister(UserBean bean);
	public UserBean login(String email, String password);
	public List<MailBean> getAllMail(int from_id);
	public boolean sendMail(String subject, String msg, int to_id, int from_id);
	public boolean deleteMail(int mid);
	public UserBean searchByEmail(String email);
	public boolean changePassword(String email, String password);

}
