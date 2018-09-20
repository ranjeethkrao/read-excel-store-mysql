package com.seosaph.telecomone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetBuddyRepo extends JpaRepository<NetBuddy, Integer> {

}
