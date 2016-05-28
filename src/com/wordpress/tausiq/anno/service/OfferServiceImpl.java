package com.wordpress.tausiq.anno.service;

import com.wordpress.tausiq.anno.repo.OfferRepo;
import com.wordpress.tausiq.xml.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// the value is usually the interface name with lower case first letter
@Service("offerService")
public class OfferServiceImpl implements OfferService {

    @Autowired  // Typically we use Instance level auto wiring
    private OfferRepo offerRepo;

    public OfferServiceImpl() {
    }

    // @Autowired // OR, you can use Constructor level auto wiring
    public OfferServiceImpl(OfferRepo offerRepo) {
        System.out.println("OfferServiceImpl::Constructor() called");
        this.offerRepo = offerRepo;
    }

    @Override
    public List<Offer> getAll() {
        return offerRepo.getAll();
    }

    // @Autowired // OR, Setter level auto wiring
    public void setOfferRepo(OfferRepo offerRepo) {
        System.out.println("OfferServiceImpl::setOfferRepo() called");
        this.offerRepo = offerRepo;
    }
}
