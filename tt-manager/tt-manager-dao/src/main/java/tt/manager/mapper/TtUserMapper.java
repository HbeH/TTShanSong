package tt.manager.mapper;

import org.apache.ibatis.annotations.Param;

import tt.manager.pojo.TtUser;

public interface TtUserMapper {

	TtUser getTTUser(@Param("id")String id);
}
