package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.CategoryVO;
import com.kh.sw.vo.ProductVO;
import com.kh.sw.vo.RoomVO;


public interface ProductDAO {
	
	
	//상품 전체 리스트
	public List<ProductVO> ProductAllList(ProductVO product);
	
	public List<ProductVO> ProductList();
	
	//�긽�뭹 �깮�꽦(異붽�)
	public int ProductInsert(ProductVO product);
	
	//�긽�뭹 �닔�젙
	public int ProductUpdate(ProductVO board);
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	public ProductVO ProductSelect(int pr_pid);

	//�긽�뭹 �궘�젣
	public int ProductDelete(int pr_pid);
	
	//카테고리 리스트
	public List<CategoryVO> CategoryList();
	//카테고리 리스트 (수정)
	public List<CategoryVO> CategoryList2(CategoryVO category);
	
	public String getCateName(String id);
	
	public List<ProductVO> productInfoList();
	
	//Room insert.
	public int insertRoom(RoomVO room);
}
