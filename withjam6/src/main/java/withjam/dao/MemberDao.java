package withjam.dao;

import java.util.Map;

import withjam.domain.Member;


public interface MemberDao {
	
	void insert(Member member);
	Member existUser(Map<String,String> params);
}