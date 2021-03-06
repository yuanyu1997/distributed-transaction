package cn.yuanyu.dtxtcc.construction.controller;


import cn.yuanyu.dtxtcc.construction.entity.AccountInfo;
import cn.yuanyu.dtxtcc.construction.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author yuanyu
 */
@RestController
@RequestMapping("/transfer")
public class TransferController {

    @Autowired
    AccountInfoService accountInfoService;

    /**
     * 转入接口
     *
     * @param to     收款人
     * @param amount 收款金额
     */
    @PostMapping("/in")
    public boolean transferIn(String to, Double amount) {
        accountInfoService.transferIn(to, amount);
        return true;
    }


    /**
     * http://localhost:56084/construction/transfer/all
     */
    @GetMapping("/all")
    public List<AccountInfo> getAllUserInfo() {
        return accountInfoService.getAllUserInfo();
    }


}
