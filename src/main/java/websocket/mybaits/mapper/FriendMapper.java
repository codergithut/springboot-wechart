package websocket.mybaits.mapper;

import org.apache.ibatis.annotations.Mapper;
import websocket.entity.Friend;
import websocket.entity.User;

import java.util.List;

/**
 * Created by xujiashuai on 2016/6/18.
 * 普通的mapper对象需要有xml文件与之对应
 */
@Mapper
public interface FriendMapper {
    int insertFriend(Friend friend);
    Friend selectById(String id);
    int updateFriend(Friend friend);
    List<Friend> selectByUserId(String userid);
}
