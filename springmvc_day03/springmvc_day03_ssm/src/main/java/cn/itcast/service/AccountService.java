package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    //保存账户信息
    public void saveAccount(Account account);

    //查询所有账户
    public List<Account> findAll();
}
