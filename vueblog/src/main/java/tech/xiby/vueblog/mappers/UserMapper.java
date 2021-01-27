package tech.xiby.vueblog.mappers;

import org.springframework.stereotype.Repository;
import tech.xiby.vueblog.domain.dto.User;
import tech.xiby.vueblog.domain.po.UserInfo;

/**
 * 用户Mapper
 *
 * @author xiby
 */
@Repository
public interface UserMapper {
    /**
     * 根据用户查询用户信息
     *
     * @param user 要登陆的用户信息
     * @return UserInfo 查询到的用户信息
     */
    UserInfo getByUser(User user);
}
