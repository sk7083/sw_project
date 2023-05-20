package com.kh.sw.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {
	
	// �뙆�씪 紐⑸줉 蹂댁뿬二쇨린
	@RequestMapping("/fileDownloadList")
	public ModelAndView fileDownloadList(ModelAndView mv) {
		File path = new File("C:/test/upload");
		String[] fileList = path.list();
		
		mv.addObject("fileList", fileList);
		mv.setViewName("main/fileDownloadListView");
		
		return mv;
	}
	
	// �뙆�씪 �떎�슫濡쒕뱶 
	@RequestMapping("/fileDownload/{file}")
	public void ModelAndView(@PathVariable String file, HttpServletResponse response) throws IOException {
		System.out.println("�뱾�뼱�솕�뒿�땲�떎!");
		System.out.println("file�뿉 ���빐�꽌 : "+file);
		File f = new File("C:/test/upload", file);
		System.out.println("f�뿉 ���빐�꽌2 : "+f);

		System.out.println("�뱾�뼱�솕�뒿�땲�떎222");
		// file �떎�슫濡쒕뱶 �꽕�젙
		response.setContentType("application/download");
		response.setContentLength((int)f.length());
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + file + "\"");
		System.out.println("�뱾�뼱�솕�뒿�땲�떎33333");
		// �떎�슫濡쒕뱶 �떆 ���옣�릺�뒗 �씠由꾩� Response Header�쓽 "Content-Disposition"�뿉 紐낆떆
		OutputStream os = response.getOutputStream();
		System.out.println("�뱾�뼱�솕�뒿�땲�떎444444444444");
		System.out.println("�뙆�씪 �긽�깭 泥댄겕 file : "+file);
		System.out.println("�뙆�씪 �긽�깭 泥댄겕 f : "+f);
		FileInputStream fis = new FileInputStream(f);
		System.out.println("�뙆�씪 �긽�깭 鍮꾧탳 : "+fis);
		System.out.println("�뱾�뼱�솕�뒿�땲�떎5555");
		FileCopyUtils.copy(fis, os);
		System.out.println("�뱾�뼱�솕�뒿�땲�떎6666666666");
		 fis.close();
		 os.close();
		
	}
}