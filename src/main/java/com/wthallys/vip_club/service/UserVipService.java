package com.wthallys.vip_club.service;

import com.wthallys.vip_club.model.UserVip;
import com.wthallys.vip_club.repository.UserVipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserVipService {

    @Autowired
    private UserVipRepository userVipRepository;

    public void saveUser(UserVip user) {
        userVipRepository.save(user);
    }
}
