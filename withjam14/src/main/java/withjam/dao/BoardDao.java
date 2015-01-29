package withjam.dao;

import withjam.domain.Board;




public interface BoardDao {

	void insertBoard(Board board);

	Board BoardPlayList(Board board);

	void insertReply(Board board);

	
}