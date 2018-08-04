package com.neuedu.lvcity.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.lvcity.model.ArticleDto;
import com.neuedu.lvcity.model.BanarDto;
import com.neuedu.lvcity.model.FoodDto;
import com.neuedu.lvcity.model.ScenicDto;
import com.neuedu.lvcity.service.impl.IndexService;
import com.neuedu.lvcity.service.impl.IndexServiceImp;

public class IndexServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取session
		HttpSession session = req.getSession();
		//调用service方法
		IndexService indexService = IndexServiceImp.getInstance();
		
		List<BanarDto> banarDtos = indexService.findBanar();
		session.setAttribute("banarList", banarDtos);
		List<ArticleDto> articleDtos = indexService.findIendexArticle();
		session.setAttribute("articleList", articleDtos);
		List<ScenicDto> scenicDtos = indexService.findIndexScenic();
		session.setAttribute("scenicList", scenicDtos);
		List<FoodDto> foodDtos = indexService.finIndexFood();
		session.setAttribute("foodList", foodDtos);
		System.out.println("oooooooooooooooooo");
		resp.sendRedirect(req.getContextPath()+"/User/index.jsp");
	}
}
