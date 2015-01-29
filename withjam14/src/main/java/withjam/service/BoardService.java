package withjam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.BoardDao;
import withjam.domain.Board;

@Service
public class BoardService {
	
	@Autowired
	  BoardDao boardDao;

	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		boardDao.insertBoard(board);
	}

	public Board BoardPlayList(Board board) {
		// TODO Auto-generated method stub
	    return 	boardDao.BoardPlayList(board);
	}

	public void insertReply(Board board) {
		// TODO Auto-generated method stub
		boardDao.insertReply(board);
	}


	
	
}
