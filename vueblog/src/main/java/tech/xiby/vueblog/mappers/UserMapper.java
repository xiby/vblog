package tech.xiby.vueblog.mappers;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
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
     * @param user 要登陆的用户信息,包含邮箱和密码
     * @return UserInfo 查询到的用户信息
     */
    UserInfo getByUser(UserInfo user);

    /**
     * 根据token查询用户信息
     *
     * @param token 用户token
     * @return 用户信息
     */
    UserInfo getByToken(String token);

    /**
     * 根据email查询用户信息
     *
     * @param email
     * @return
     */
    UserInfo getByEmail(String email);

    /**
     * 更新用户token
     *
     * @param userId 用户id
     * @param token  要更新的token
     */
    void updateToken(@Param("userId") Long userId, @Param("token") String token);

    /**
     * 新增用户
     *
     * @param user
     */
    void insert(UserInfo user);
}
