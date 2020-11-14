package com.huofei.demo.service.impl;

import com.huofei.demo.entity.User;
import com.huofei.demo.mapper.UserMapper;
import com.huofei.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huofei
 * @since 2020-11-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
