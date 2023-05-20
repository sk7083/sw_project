package com.kh.sw.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.kh.sw.vo.MemberVO;



public interface MemberService {
	//�쉶�썝 �쟾泥� �젙蹂� 遺덈윭�삤湲�
	public List<MemberVO> memberLoad(MemberVO member);
	//�쉶�썝媛��엯
	public boolean registerMember(MemberVO member);
	//�쉶�썝 濡쒓렇�씤
	public MemberVO memberLogin(MemberVO member);
	

	//�쉶�썝 �젙蹂� �닔�젙
	public int memberUpdate(MemberVO member);
	
	//�쉶�썝 �긽�꽭 �럹�씠吏�
	public MemberVO memberDetail(String me_id);
	
	//�쉶�썝 �궘�젣
	public int memberDelete(String me_id);
	
	//�븘�씠�뵒 以묐났泥댄겕
	public int idCheck(String id);
}
