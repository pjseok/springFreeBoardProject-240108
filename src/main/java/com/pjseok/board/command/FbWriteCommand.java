package com.pjseok.board.command;

import com.pjseok.board.dao.FreeBoardDao;

public class FbWriteCommand {
	
	public void execute(String fbtitle, String fbname, String fbcontent) {
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		
		freeBoardDao.write(fbtitle, fbname, fbcontent);
	}
	
	
}
