package withjam.dao;

import java.util.List;

import withjam.domain.Message;




public interface MessageDao {

	List<?> sendMsgBox(Message message);

	void mySendMsgDel(int msgNo);

	void mySendMsgDelCheck(Message message);

	List<?> takeMsgBox(Message message);

	void myTakeMsgDelCheck(Message message);
}