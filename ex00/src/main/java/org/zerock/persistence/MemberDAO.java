package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	public String getTime(); //년월일 시분초
	public void insertMember(MemberVO vo); //회원가입
}
