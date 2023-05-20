package com.kh.sw.service;

import java.util.List;

import com.kh.sw.vo.CategoryVO;
import com.kh.sw.vo.ProductVO;

public interface ProductService {

	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	public List<ProductVO> productList(ProductVO product);

	//�긽�뭹 �깮�꽦(異붽�)
	public int productAdd(ProductVO product);
	
	//�긽�뭹 �닔�젙
	public int productUpdate(ProductVO product);
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	public ProductVO productDetail(int pr_pid);
	
	//�긽�뭹 �궘�젣
	public int productDelete(int pr_pid);
	
	//移댄뀒怨좊━ �쟾泥� 由ъ뒪�듃
	public List<CategoryVO> CategoryList();
}
