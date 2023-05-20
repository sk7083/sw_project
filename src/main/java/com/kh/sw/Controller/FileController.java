package com.kh.sw.Controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileController {
	
	// �뙆�씪 �뾽濡쒕뱶 �뤌
	@GetMapping("/fileUploadForm")
	public String fileUploadFormView() {
		return "main/fileUploadForm";
	}
		
	//�뙆�씪 �뾽濡쒕뱶 2
	@PostMapping("/fileUploadForm")
	public String upload(@RequestParam("file") MultipartFile file) {
		String fileRealName = file.getOriginalFilename(); //�뙆�씪紐낆쓣 �뼸�뼱�궪 �닔 �엳�뒗 硫붿꽌�뱶!
		long size = file.getSize(); //�뙆�씪 �궗�씠利�
		
		System.out.println("�뙆�씪紐� : "  + fileRealName);
		System.out.println("�슜�웾�겕湲�(byte) : " + size);
		//�꽌踰꾩뿉 ���옣�븷 �뙆�씪�씠由� fileextension�쑝濡� .jsp�씠�윴�떇�쓽  �솗�옣�옄 紐낆쓣 援ы븿
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."),fileRealName.length());
		String uploadFolder = "C:\\test\\upload";
		

		/*
		  �뙆�씪 �뾽濡쒕뱶�떆 �뙆�씪紐낆씠 �룞�씪�븳 �뙆�씪�씠 �씠誘� 議댁옱�븷 �닔�룄 �엳怨� �궗�슜�옄媛� 
		  �뾽濡쒕뱶 �븯�뒗 �뙆�씪紐낆씠 �뼵�뼱 �씠�쇅�쓽 �뼵�뼱濡� �릺�뼱�엳�쓣 �닔 �엳�뒿�땲�떎. 
		  ���씤�뼱瑜� 吏��썝�븯吏� �븡�뒗 �솚寃쎌뿉�꽌�뒗 �젙�궛 �룞�옉�씠 �릺吏� �븡�뒿�땲�떎.(由щ늼�뒪媛� ���몴�쟻�씤 �삁�떆)
		  怨좎쑀�븳 �옖�뜕 臾몄옄瑜� �넻�빐 db�� �꽌踰꾩뿉 ���옣�븷 �뙆�씪紐낆쓣 �깉濡�寃� 留뚮뱾�뼱 以��떎.
		 */
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String[] uuids = uuid.toString().split("-");
		
		String uniqueName = uuids[0];
		System.out.println("�깮�꽦�맂 怨좎쑀臾몄옄�뿴" + uniqueName);
		System.out.println("�솗�옣�옄紐�" + fileExtension);
		
		// File saveFile = new File(uploadFolder+"\\"+fileRealName); uuid �쟻�슜 �쟾
		
		File saveFile = new File(uploadFolder+"\\"+uniqueName + fileExtension);  // �쟻�슜 �썑
		try {
			file.transferTo(saveFile); // �떎�젣 �뙆�씪 ���옣硫붿꽌�뱶(filewriter �옉�뾽�쓣 �넀�돺寃� �븳諛⑹뿉 泥섎━�빐以��떎.)
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String fi_ori_name = fileExtension;
		String fi_name = fileRealName;
		long fi_size = size;
		
		System.out.println("fi_ori_name 媛�" + fi_ori_name);
		System.out.println("fi_name 媛�" + fi_name);
		System.out.println("fi_size 媛�" + fi_size);
		return "/";
	}
	
	
	
//	// �뙆�씪 �뾽濡쒕뱶
//		@RequestMapping(value = "/fileUploadForm", method = RequestMethod.POST)
//		public ModelAndView fileUpLoadView(@RequestParam("uploadFile") MultipartFile file, ModelAndView mv) 
//					throws IOException {
//			
//			
//			// 1. �뙆�씪 ���옣 寃쎈줈 �꽕�젙 : �떎�젣 �꽌鍮꾩뒪�릺�뒗 �쐞移�(�봽濡쒖젥�듃 �쇅遺��뿉 ���옣)
//			String uploadPath = "D:\\git\\upload\\save/";
//			// 留덉�留됱뿉 / �엳�뼱�빞�븿
//			
//			// 2. �썝蹂� �뙆�씪 �씠由� �븣�븘�삤湲�
//			String originalFileName = file.getOriginalFilename();
//			
//			// 3. �뙆�씪 �씠由꾩씠 以묐났�릺吏� �븡�룄濡� �뙆�씪 �씠由� 蹂�寃� : �꽌踰꾩뿉 ���옣�븷 �씠由�
//			// UUID �겢�옒�뒪 �궗�슜
//			UUID uuid = UUID.randomUUID();
//			String savedFileName = uuid.toString() + "_" + originalFileName;
//			
//			// 4. �뙆�씪 �깮�꽦
//			File newFile = new File(uploadPath + savedFileName);
//			
//			// 5. �꽌踰꾨줈 �쟾�넚
//			file.transferTo(newFile);
//			
//			// Model �꽕�젙 : 酉� �럹�씠吏��뿉�꽌 �썝蹂� �뙆�씪 �씠由� 異쒕젰
//			mv.addObject("originalFileName", originalFileName);
//			mv.setViewName("main/fileUploadResult");
//			return mv;
//		}
		
		//硫붿씤 �솕硫�
		@RequestMapping(value = "/fileUploadResult", method = RequestMethod.GET)
		public ModelAndView fileUploadResult(ModelAndView mv) throws Exception{
			
			mv.setViewName("main/fileUploadResult");
			
			return mv;
		}	
		
	}

	

