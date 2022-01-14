package com.wediscussmovies.project.repository;

import com.wediscussmovies.project.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer> {
}