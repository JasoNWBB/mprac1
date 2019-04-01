package dao;

import java.util.List;
import model.User;
import model.UserExample;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	User selectByPrimaryKey(int userId);
}