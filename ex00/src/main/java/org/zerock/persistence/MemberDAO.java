package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	public String getTime(); //����� �ú���
	public void insertMember(MemberVO vo); //ȸ������
}
