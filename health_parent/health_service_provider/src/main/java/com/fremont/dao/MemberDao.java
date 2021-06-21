package com.fremont.dao;

import com.fremont.pojo.Member;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/19-21:03
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface MemberDao {

    List<Member> findAll();

    Page<Member> selectByCondition(String queryString);

    void add(Member member);

    void deleteById(Integer id);

    Member findById(Integer id);

    Member findByTelephone(String telephone);

    void edit(Member member);

    Integer findMemberCountBeforeDate(String date);

    Integer findMemberCountByDate(String date);

    Integer findMemberCountAfterDate(String date);

    Integer findMemberTotalCount();

}
