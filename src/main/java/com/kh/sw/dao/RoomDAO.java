package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.RoomVO;



public interface RoomDAO {
	
	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	public List<RoomVO> RoomList();
	
	//�긽�뭹 �깮�꽦(異붽�)
	public int RoomInsert(RoomVO room);
	
	//�긽�뭹 �닔�젙
	public int RoomUpdate(RoomVO room);
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	public RoomVO RoomSelect(int ro_pid);

	//�긽�뭹 �궘�젣
	public int RoomDelete(int ro_pid);
	
}
