package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.ProductVO;


public interface ProductDAO {
	
	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	public List<ProductVO> ProductList();
	
	//�긽�뭹 �깮�꽦(異붽�)
	public int ProductInsert(ProductVO product);
	
	//�긽�뭹 �닔�젙
	public int ProductUpdate(ProductVO board);
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	public ProductVO ProductSelect(int pr_pid);

	//�긽�뭹 �궘�젣
	public int ProductDelete(int pr_pid);
	
	//移댄뀒怨좊━ �쟾泥� 由ъ뒪�듃
	public List<ProductVO> CategoryList();
}
