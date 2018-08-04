package com.neuedu.lvcity.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.model.ArticleDto;
import com.neuedu.lvcity.model.BanarDto;
import com.neuedu.lvcity.model.FoodDto;
import com.neuedu.lvcity.model.ScenicDto;

public class IndexDaoImp implements IndexDao {
	/**
	 * 数据库连接
	 */
	private Connection connection;
	/**
	 * 构造方法
	 * @param connection 数据库连接
	 */
	public IndexDaoImp(Connection connection) {
		this.connection = connection;
	}
	
	/**
	 * 广告大图
	 * @return 返回显示广告大图
	 */
	@Override
	public List<BanarDto> findBanar() {
		List<BanarDto> banarDtos = new ArrayList<>();
		BanarDto banarDto = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "select image from banar";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				banarDto = new BanarDto();
				banarDto.setImage(resultSet.getString("image"));
				banarDtos.add(banarDto);
			}
		} catch (Exception e) {
			System.out.println("广告大图显示失败...");
			e.printStackTrace();
		}finally {
			DBUtils.closeStatement(resultSet, preparedStatement);
		}
		return banarDtos;
	}
	
	/**
	 * 首页文章
	 * @return 返回显示首页文章
	 */
	@Override
	public List<ArticleDto> findIndexArticle() {
		List<ArticleDto> articleDtos = new ArrayList<>();
		ArticleDto articleDto = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "select content, image from article";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				articleDto = new ArticleDto();
				articleDto.setContent(resultSet.getString("content"));
				articleDto.setImage(resultSet.getString("image"));
				articleDtos.add(articleDto);
			}
		} catch (Exception e) {
			System.out.println("首页文章显示失败...");
			e.printStackTrace();
		}finally {
			DBUtils.closeStatement(resultSet, preparedStatement);
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
		ScenicDto scenicDto = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "select sname, image from scenic";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				scenicDto = new ScenicDto();
				scenicDto.setSname(resultSet.getString("sname"));
				scenicDto.setImage(resultSet.getString("image"));
				scenicDtos.add(scenicDto);
			}
		} catch (Exception e) {
			System.out.println("首页风景图片显示失败...");
			e.printStackTrace();
		}finally {
			DBUtils.closeStatement(resultSet, preparedStatement);
		}
		return scenicDtos;
	}

	/**
	 * 首页美食图片
	 * @return 返回显示首页美食图片
	 */
	@Override
	public List<FoodDto> findIndexFood() {
		List<FoodDto> foodDtos = new ArrayList<>();
		FoodDto foodDto = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "select * from food";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				foodDto = new FoodDto();
				foodDto.setFid(resultSet.getInt("fid"));
				foodDto.setAid(resultSet.getInt("aid"));
				foodDto.setFname(resultSet.getString("fname"));
				foodDto.setFtid(resultSet.getInt("ftid"));
				foodDto.setImage(resultSet.getString("image"));
				foodDtos.add(foodDto);
			}
		} catch (Exception e) {
			System.out.println("首页美食图片显示失败...");
			e.printStackTrace();
		}finally {
			DBUtils.closeStatement(resultSet, preparedStatement);
		}
		return foodDtos;
	}

	
}
