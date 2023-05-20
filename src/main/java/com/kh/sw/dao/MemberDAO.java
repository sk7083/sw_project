package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.MemberVO;

public interface MemberDAO {
	
	//�쉶�썝 �쟾泥� �젙蹂�
	public List<MemberVO> selectList();
	
	//�쉶�썝媛��엯
	int insertMember(MemberVO member);
	
	//濡쒓렇�씤
	public MemberVO login(MemberVO member);
	//�꽭�뀡 濡쒓렇�씤
	public MemberVO selectMemberById(String string);

	//�쉶�썝 �젙蹂� �닔�젙
	public int MemberUpdate(MemberVO member);
	
	//�쉶�썝 �긽�꽭 �럹�씠吏�
	public MemberVO MemberSelect(String me_id);
	
	//�쉶�썝 �궘�젣
	public int MemberDelete(String me_id);
	
	//�븘�씠�뵒 以묐났泥댄겕
	public int idCheck(String me_id);
}
