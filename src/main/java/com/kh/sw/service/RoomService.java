package com.kh.sw.service;

import java.util.List;

import com.kh.sw.vo.RoomVO;


public interface RoomService {

	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	public List<RoomVO> RoomList(RoomVO room);

	//�긽�뭹 �깮�꽦(異붽�)
	public int RoomInsert(RoomVO room);
	
	//�긽�뭹 �닔�젙
	public int RoomUpdate(RoomVO room);
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	public RoomVO RoomDetail(int ro_pid);
	
	//�긽�뭹 �궘�젣
	public int RoomDelete(int ro_pid);
	
}
