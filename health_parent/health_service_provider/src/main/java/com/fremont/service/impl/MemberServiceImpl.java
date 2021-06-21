package com.fremont.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fremont.dao.MemberDao;
import com.fremont.pojo.Member;
import com.fremont.service.MemberService;
import com.fremont.service.OrderService;
import com.fremont.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-14:33
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service(interfaceClass = MemberService.class)
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Member findByTelephone(String telephone) {
        return memberDao.findByTelephone(telephone);
    }

    @Override
    public void add(Member member) {
        if(member.getPassword() != null){
            member.setPassword(MD5Utils.md5(member.getPassword()));
        }
        memberDao.add(member);
    }

    @Override
    public List<Integer> findMemberCountByMonth(List<String> list) {
        List<Integer> res = new ArrayList<>();
        for(String m : list){
            m = m + ".31";//格式：2019.04.31
            Integer count = memberDao.findMemberCountBeforeDate(m);
            res.add(count);
        }
        return res;
    }
}
