package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.MessageDao;
import withjam.domain.Message;

@Service
public class MessageService {
	
	@Autowired
	  MessageDao messageDao;

	public List<?> sendMsgBox(Message message) {
		// TODO Auto-generated method stub
		return messageDao.sendMsgBox(message);
	}

	public void mySendMsgDel(int msgNo) {
		// TODO Auto-generated method stub
		 messageDao.mySendMsgDel(msgNo);
	}
	
	public void mySendMsgDelCheck(Message message) {
		// TODO Auto-generated method stub
		messageDao.mySendMsgDelCheck(message);
	}

	public List<?> takeMsgBox(Message message) {
		// TODO Auto-generated method stub
		return messageDao.takeMsgBox(message);
	}

	public void myTakeMsgDelCheck(Message message) {
		// TODO Auto-generated method stub
		messageDao.myTakeMsgDelCheck(message);
	}

	
}
