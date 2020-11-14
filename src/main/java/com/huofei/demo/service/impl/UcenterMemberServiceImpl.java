package com.huofei.demo.service.impl;

import com.huofei.demo.entity.UcenterMember;
import com.huofei.demo.mapper.UcenterMemberMapper;
import com.huofei.demo.service.UcenterMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author huofei
 * @since 2020-11-04
 */
@Service
public class UcenterMemberServiceImpl extends ServiceImpl<UcenterMemberMapper, UcenterMember> implements UcenterMemberService {
    public void f(){
        UcenterMember member = UcenterMember.builder().age(1).build();
        save(member);
    }
}
