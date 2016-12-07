package com.ononeleg.controller;

/**
 * Created by ilya on 07/12/2016.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.ononeleg.beans.Offer;
import com.ononeleg.beans.Request;
import com.ononeleg.beans.Response;
import com.ononeleg.services.MainService;
import com.sun.webkit.dom.CSSMediaRuleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/RequestMapping")
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Response test(@RequestParam(value="name", defaultValue="00TestResponse") String name) {
        return new Response(name,"Shoes");
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response getResponse(Request request) {
        return mainService.getResponse(request);
    }
    @RequestMapping(value = "/getOffers", method = RequestMethod.GET)
    public List<Offer> getOffers(){
       return mainService.getOffers();
    }
    @RequestMapping(value = "/offers", method=RequestMethod.POST)
    @ResponseBody
    public void addOffer(Offer offer){
        mainService.addOffer(offer);
    }
    @RequestMapping(value = "/offers", method=RequestMethod.DELETE)
    @ResponseBody
    public void deleteOffer(String id){
        mainService.deleteOffer(id);
    }




}