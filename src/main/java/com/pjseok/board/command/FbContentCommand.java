package com.pjseok.board.command;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.pjseok.board.dao.FreeBoardDao;
import com.pjseok.board.dto.FboardDto;

public class FbContentCommand implements fbCommand {
	
	public void execute(Model model) {
		
		Map<String, Object> requestMap = model.asMap();
		HttpServletRequest request = (HttpServletRequest) requestMap.get("request");
		
		String fbnum = request.getParameter("fbnum");//클릭한 글번호
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		FboardDto fboardDto = freeBoardDao.content_view(fbnum);
		
		model.addAttribute("fboardDto", fboardDto);
	} 

}