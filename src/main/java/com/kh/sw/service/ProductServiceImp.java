package com.kh.sw.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.sw.dao.ProductDAO;
import com.kh.sw.vo.CategoryVO;
import com.kh.sw.vo.ProductVO;

@Service
public class ProductServiceImp implements ProductService{
	@Autowired
	ProductDAO productDao;
	
	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	@Override
	public List<ProductVO> productList(ProductVO board){
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			list =  productDao.ProductList();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	//�긽�뭹 �깮�꽦(異붽�)
	@Override
	public int productAdd(ProductVO product){
		if(product == null) {
			System.out.println("Product null 諛쒖깮");
			return 0;
		}
		return productDao.ProductInsert(product);
	}
	
	//�긽�뭹 �닔�젙
	@Override
	public int productUpdate(ProductVO product){
		if(product == null || productDao.ProductList().size() == 0) {
			return 0;
		}
		return productDao.ProductUpdate(product);
	}
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	@Override
	public ProductVO productDetail(int pr_pid){
		if(pr_pid == 0) {
			return null;
		}
		return productDao.ProductSelect(pr_pid);
	}
	
	//�긽�뭹 �궘�젣
	@Override
	public int productDelete(int pr_pid){
		if(pr_pid == 0) {
			return 0;
		}
	
		return productDao.ProductDelete(pr_pid);
	}
	
	//移댄뀒怨좊━ �쟾泥� 由ъ뒪�듃
	@Override
	public List<CategoryVO> CategoryList(){
		return productDao.CategoryList();
	}
}
