package com.fremont.service;

import com.fremont.pojo.Member;

import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-14:33
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface MemberService {

    Member findByTelephone(String telephone);

    void add(Member member);

    List<Integer> findMemberCountByMonth(List<String> list);
}
