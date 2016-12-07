package com.ononeleg.services;

import com.ononeleg.dao.OfferRepository;
import com.ononeleg.dao.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ilya on 07/12/2016.
 */
public class MainService {

    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private RequestRepository requestRepository;


}
