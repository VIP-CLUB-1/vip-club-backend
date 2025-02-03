package com.wthallys.vip_club.repository;

import com.wthallys.vip_club.model.UserVip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVipRepository extends JpaRepository<UserVip, String> {
}
