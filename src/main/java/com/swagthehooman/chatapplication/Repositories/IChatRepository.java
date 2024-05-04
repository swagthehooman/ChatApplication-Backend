package com.swagthehooman.chatapplication.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.swagthehooman.chatapplication.Models.Chat;
import java.util.List;

public interface IChatRepository extends JpaRepository<Chat, UUID> {
    public List<Chat> findByRecipientUserId(UUID recipientUserId);

    public List<Chat> findByAuthorUserId(UUID authorUserId);

    @Query("select c from chat c where c.authoruserid = :id or c.recipientuserid = :id")
    public List<Chat> findByUserId(@Param("id") UUID userId);
}
