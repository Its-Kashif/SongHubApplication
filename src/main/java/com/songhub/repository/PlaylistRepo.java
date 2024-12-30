package com.songhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.songhub.entity.Playlist;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer>{

	Playlist findByName(String name);

}

