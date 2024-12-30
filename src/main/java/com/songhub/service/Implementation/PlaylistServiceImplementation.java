package com.songhub.service.Implementation;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songhub.entity.Playlist;
import com.songhub.entity.Song;
import com.songhub.repository.PlaylistRepo;
import com.songhub.service.PlaylistService;

@Service
public class PlaylistServiceImplementation implements PlaylistService {
	
	@Autowired
	PlaylistRepo playlistRepo;

	@Override
	public void savePlaylist(Playlist playlist) {
		Playlist existingPlaylist=playlistRepo.findByName(playlist.getName());
		if(existingPlaylist==null) {
			
			playlistRepo.save(playlist);
			System.out.println("succesfull");
		}
		else {
			System.out.println("Playlist available with same name");
		}
		
	}

	@Override
	public List<Playlist> getAllPlaylist() {
		
		return playlistRepo.findAll();
	}

	

}
