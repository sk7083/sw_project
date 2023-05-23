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
	
	//상품 전체 리스트
	@Override
	public List<ProductVO> ProductAllList(ProductVO product){

		return productDao.ProductAllList(product);
	}
	
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
		return productDao.ProductUpdate(product);
	}
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	@Override
	public ProductVO productDetail(int pr_pid){
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
	
	//카테고리 리스트
	@Override
	public List<CategoryVO> CategoryList(){
		return productDao.CategoryList();
	}
	
	//카테고리 리스트 (수정)
	@Override
	public List<CategoryVO> CategoryList2(CategoryVO category){
		return productDao.CategoryList2(category);
	}

	@Override
	public List<ProductVO> productInfoList() {
		// TODO Auto-generated method stub
		return productDao.productInfoList();
	}

	
}
