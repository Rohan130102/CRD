package com.dailywork.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.dailywork.form.LoginForm;
import com.dailywork.form.SignupForm;
import com.dailywork.pojo.Task;
import com.dailywork.pojo.User;
import com.dailywork.service.UserService;
import com.dailywork.service.impl.UserServiceImpl;

public class UserAction extends DispatchAction {

	private UserService userService;

	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String status = "";
		userService = new UserServiceImpl();
		String email = ((LoginForm) form).getEmail();
		String password = ((LoginForm) form).getPassword();
		User user = userService.login(email, password);
		status = (user != null) ? "success" : "failure";
		request.setAttribute("user", user);
		return mapping.findForward(status);
	}

	public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Create Hit......");
		String status = "";
		userService = new UserServiceImpl();
		User user = new User();
		BeanUtils.copyProperties(user, (SignupForm) form);
		List<Task> tasks = new ArrayList<Task>();
		Task t = new Task("Name","Description",new Date(), user);
		user.setTasks(tasks);
		userService.save(user);
		status = userService.save(t);
		return mapping.findForward(status);
	}

	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String status = "";
		userService = new UserServiceImpl();
		User user = new User();
		BeanUtils.copyProperties(user, (SignupForm) form);
		status = userService.update(user);
		return mapping.findForward(status);
	}

}
