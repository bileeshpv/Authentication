package com.sample.user.management.service;

import com.sample.user.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.user.management.entity.UserDetailsBean;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public UserDetailsBean save(UserDetailsBean bean) {
		repository.save(bean);
		return bean;
	}

	public void delete(UserDetailsBean bean) {
		repository.delete(bean);
	}

	public UserRepository getRepository() {
		return repository;
	}

}
