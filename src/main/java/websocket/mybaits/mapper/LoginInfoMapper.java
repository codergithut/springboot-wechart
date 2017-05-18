package websocket.mybaits.mapper;

import org.apache.ibatis.annotations.Mapper;
import websocket.entity.Friend;
import websocket.entity.LoginInfo;

import java.util.List;

/**
 * Created by xujiashuai on 2016/6/18.
 * 普通的mapper对象需要有xml文件与之对应
 */
@Mapper
public interface LoginInfoMapper {
    int insertLoginInfo(LoginInfo loginInfo);
    LoginInfo selectById(String id);
    int updateLoginInfo(LoginInfo loginInfo);
    List<LoginInfo> selectByToken(String token);
}
