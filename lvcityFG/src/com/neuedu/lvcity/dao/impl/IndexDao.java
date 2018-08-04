package com.neuedu.lvcity.dao.impl;

import java.util.List;

import com.neuedu.lvcity.model.ArticleDto;
import com.neuedu.lvcity.model.BanarDto;
import com.neuedu.lvcity.model.FoodDto;
import com.neuedu.lvcity.model.ScenicDto;

/**
 * 首页dao接口类
 * @author LiQi
 *
 */
public interface IndexDao {
	/**
	 * 广告大图
	 * @return 返回显示广告大图
	 */
	public List<BanarDto> findBanar();
	
	/**
	 * 首页文章
	 * @return 返回显示首页文章
	 */
	public List<ArticleDto> findIndexArticle();
	
	/**
	 * 首页风景图片
	 * @return 返回显示首页风景图片
	 */
	public List<ScenicDto> findIndexScenic();
	
	/**
	 * 首页美食图片
	 * @return 返回显示首页美食图片
	 */
	public List<FoodDto> findIndexFood();
	
}
