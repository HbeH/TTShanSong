package tt.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tt.manager.mapper.TtUserMapper;
import tt.manager.pojo.TtUser;
import tt.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TtUserMapper ttUserMapper;
	
	@Override
	public TtUser getTTUser(String id) {
		// TODO Auto-generated method stub
		return ttUserMapper.getTTUser(id);
	}

}
