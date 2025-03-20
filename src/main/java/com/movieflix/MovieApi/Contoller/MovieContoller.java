package com.movieflix.MovieApi.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.movieflix.MovieApi.Entity.Movie;
// import com.movieflix.MovieApi.Repository.MovieRepo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MovieContoller {
    
    // @Autowired
    // MovieRepo movieRepo;

    // @GetMapping("/hello")
    // public List<Movie> getData(){
    //     return movieRepo.findAll();
    // }

    // @PostMapping("/hello")
    // public String postMethodName(@RequestBody Movie movie) {
        
    //     movieRepo.save(movie);
        
    //     return "Done";
    // }
    
    @GetMapping("/hello")
    public String getMethodName() {
        return new String("Hello World");
    }
    
}
