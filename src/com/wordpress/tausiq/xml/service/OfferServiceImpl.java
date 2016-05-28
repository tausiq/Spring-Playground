package com.wordpress.tausiq.xml.service;

import com.wordpress.tausiq.xml.model.Offer;
import com.wordpress.tausiq.xml.repo.OfferRepo;

import java.util.List;

public class OfferServiceImpl implements OfferService {

    private OfferRepo offerRepo;

    public OfferServiceImpl() {
    }

    public OfferServiceImpl(OfferRepo offerRepo) {
        this.offerRepo = offerRepo;
    }

    @Override
    public List<Offer> getAll() {
        return offerRepo.getAll();
    }

    public void setOfferRepo(OfferRepo offerRepo) {
        this.offerRepo = offerRepo;
    }
}
