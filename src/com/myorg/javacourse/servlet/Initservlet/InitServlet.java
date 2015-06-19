package com.myorg.javacourse.servlet.Initservlet;

import javax.servlet.ServletException;

import org.algo.service.ServiceManager;

import com.myorg.javacourse.exception.BalanceException;
import com.myorg.javacourse.exception.PortfolioFullException;
import com.myorg.javacourse.exception.StockAlreadyExistsException;
import com.myorg.javacourse.exception.StockNotExistException;
import com.myorg.javacourse.service.PortfolioManager;

@SuppressWarnings("serial")
public class InitServlet extends  javax.servlet.http.HttpServlet{

	@Override
	public void init() throws ServletException {
		super.init();
		PortfolioManager pm = new PortfolioManager();
		ServiceManager.setPortfolioManager(pm);	

	}
}