package com.mohamadou.concertticketsales.controllers;

import com.mohamadou.concertticketsales.model.concerts.Artist;
import com.mohamadou.concertticketsales.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/artist")
public class ArtistController {
    private ArtistService artistService;

    public ArtistController(){}

    @Autowired
    public ArtistController(ArtistService artistService){
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        System.out.println("GetAllArtist.............");
        return artistService.getAllArtists();
    }

    @GetMapping(path = "/{artistId}")
    public Artist getArtistById(@PathVariable Long artistId) {
        return artistService.getArtistById(artistId);
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.createArtist(artist);
    }

    @PutMapping
    public Artist updateArtist(@RequestBody Artist artist) {
        return artistService.updateArtist(artist);
    }

    @DeleteMapping(path = "/{artistId}")
    public int deleteArtist(@PathVariable Long artistId) {
        return artistService.deleteArtist(artistId);
    }
}
