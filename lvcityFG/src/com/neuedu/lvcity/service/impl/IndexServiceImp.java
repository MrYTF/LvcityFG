package com.neuedu.lvcity.service.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.common.ServiceException;
import com.neuedu.lvcity.dao.impl.IndexDao;
import com.neuedu.lvcity.dao.impl.IndexDaoImp;
import com.neuedu.lvcity.model.ArticleDto;
import com.neuedu.lvcity.model.BanarDto;
import com.neuedu.lvcity.model.FoodDto;
import com.neuedu.lvcity.model.ScenicDto;

public class IndexServiceImp implements IndexService{
	/**
	 * 类实例
	 */
	private static final IndexService Instance = new IndexServiceImp();
	
	/**
	 * 取得实例
	 * @return
	 */
	public static IndexService getInstance() {
		return Instance;
	}
	
	/**
	 * 构造方法
	 */
	public IndexServiceImp() {
		
	}
	
	/**
	 * 广告大图
	 * @return 返回显示广告大图
	 */
	@Override
	public List<BanarDto> findBanar() {
		List<BanarDto> banarDtos = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			IndexDao indexDao = new IndexDaoImp(connection);
			banarDtos = indexDao.findBanar();
		} catch (Exception e) {
			throw new ServiceException("service.findBanaar false...", e);
		}finally {
			DBUtils.closeConnection(connection);
		}
		return banarDtos;
	}
	
	/**
	 * 首页文章
	 * @return 返回显示首页文章
	 */
	@Override
	public List<ArticleDto> findIendexArticle() {
		List<ArticleDto> articleDtos = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			IndexDao indexDao = new IndexDaoImp(connection);
			articleDtos = indexDao.findIndexArticle();
		} catch (Exception e) {
			throw new ServiceException("service.findIendexArticle false...", e);
		}finally {
			DBUtils.closeConnection(connection);
		}
		return articleDtos;
	}
	
	/**
	 * 首页风景图片
	 * @return 返回显示首页风景图片
	 */
	@Override
	public List<ScenicDto> findIndexScenic() {
		List<ScenicDto> scenicDtos = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			IndexDao indexDao = new IndexDaoImp(connection);
			scenicDtos = indexDao.findIndexScenic();
		} catch (Exception e) {
			throw new ServiceException("service.findIndexScenic false...", e);
		}finally {
			DBUtils.closeConnection(connection);
		}
		return scenicDtos;
	}
	
	/**
	 * 首页美食图片
	 * @return 返回显示首页美食图片
	 */
	@Override
	public List<FoodDto> finIndexFood() {
		List<FoodDto> foodDtos = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			IndexDao indexDao = new IndexDaoImp(connection);
			foodDtos = indexDao.findIndexFood();
		} catch (Exception e) {
			throw new ServiceException("service.finIndexFood false...", e);
		}finally {
			DBUtils.closeConnection(connection);
		}
		return foodDtos;
	}

}
