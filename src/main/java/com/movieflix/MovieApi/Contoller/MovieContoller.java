package com.movieflix.MovieApi.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



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
    
    
    //controller

    @GetMapping
    public String getHello() {

        return new String("Hello World");
    }


    @GetMapping("/hello")
    public String getMethodName() {

        return new String("Hello World");
    }
    
}
