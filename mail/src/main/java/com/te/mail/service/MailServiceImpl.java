package com.te.mail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mail.bean.MailBean;
import com.te.mail.bean.UserBean;
import com.te.mail.dao.MailDAO;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private MailDAO dao;

	@Override
	public boolean userRegister(UserBean bean) {
		// TODO Auto-generated method stub
		return dao.userRegister(bean);
	}

	@Override
	public UserBean login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.login(email, password);
	}

	@Override
	public List<MailBean> getAllMail(int from_id) {
		// TODO Auto-generated method stub
		return dao.getAllMail(from_id);
	}

	@Override
	public UserBean searchByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.searchByEmail(email);
	}

	@Override
	public boolean sendMail(String subject, String msg, int to_id, int from_id) {
		// TODO Auto-generated method stub
		return dao.sendMail(subject, msg, to_id, from_id);
	}

	@Override
	public boolean deleteMail(int mid) {
		// TODO Auto-generated method stub
		return dao.deleteMail(mid);
	}

	@Override
	public boolean changePassword(String email, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(email, password);
	}

	

		
}
