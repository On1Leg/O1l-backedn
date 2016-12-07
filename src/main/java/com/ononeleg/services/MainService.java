package com.ononeleg.services;

import com.ononeleg.beans.Offer;
import com.ononeleg.beans.Request;
import com.ononeleg.beans.Response;
import com.ononeleg.dao.OfferRepository;
import com.ononeleg.dao.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.util.List;

/**
 * Created by ilya on 07/12/2016.
 */

@Component
public class MainService {

    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private RequestRepository requestRepository;

    private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup()
            .lookupClass());

    public Response getResponse(Request request) {
        requestRepository.save(request);
        return new Response(request.getName(),request.getContent());
    }

    public List<Offer> getOffers() {
        log.info("Getting offers", "Request");
        return offerRepository.findAll();
    }

    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }
}
