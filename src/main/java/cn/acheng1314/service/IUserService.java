package cn.acheng1314.service;

import cn.acheng1314.domain.User;

/**
 * Created by zqchen on 16/12/9.
 */
public interface IUserService extends BaseService<User> {
    void add(User user) throws Exception;
}
