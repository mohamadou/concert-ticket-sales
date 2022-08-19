package com.mohamadou.concertticketsales.services;

import com.mohamadou.concertticketsales.model.concerts.Artist;
import com.mohamadou.concertticketsales.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    private  ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public ArtistService() {}

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Artist getArtistById(Long artistId) {
        Optional<Artist> optionalArtist = artistRepository.findById(artistId);

        if(optionalArtist.isEmpty()) {
            throw new RuntimeException("Artist id not found "+ artistId);
        }

        return optionalArtist.get();
    }

   /* public List<Artist> search(String name) {
        return artistRepository.findAll(name);
    }*/

    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Artist updateArtist(Artist artist) {
        this.isEntityExist(artist.getId());

        return artistRepository.save(artist);
    }

    public int deleteArtist(Long artistId) {
        this.isEntityExist(artistId);

        artistRepository.deleteById(artistId);

        return 0;
    }

    public void isEntityExist(Long idEntity) {
        Optional<Artist> optionalArtist = artistRepository.findById(idEntity);

        if(optionalArtist.isEmpty()) {
            throw new RuntimeException("Artist id not found "+ idEntity);
        }
    }

}
