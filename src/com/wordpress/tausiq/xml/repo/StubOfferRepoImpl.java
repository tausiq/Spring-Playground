package com.wordpress.tausiq.xml.repo;

import com.wordpress.tausiq.xml.model.Offer;

import java.util.ArrayList;
import java.util.List;

public class StubOfferRepoImpl implements OfferRepo {

    @Override
    public List<Offer> getAll() {
        List<Offer> ret = new ArrayList<>();
        ret.add(new Offer("Offer 1", "Brand 1", 25));
        return ret;
    }
}
