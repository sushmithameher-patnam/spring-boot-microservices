package io.sushmitha.moviecatalogueservice.resources;

import io.sushmitha.moviecatalogueservice.model.CatalogueItem;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/catalogue",method= RequestMethod.GET)
public class MovieCatalogueResource{
   @GetMapping("/get/{userId}")
   public List<CatalogueItem> getCatalogue(@PathVariable String userId){
   return Collections.singletonList(
           new CatalogueItem("Heirs","korean drama",5)
   );
   }
}

