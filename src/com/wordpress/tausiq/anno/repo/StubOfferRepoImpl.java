package com.wordpress.tausiq.anno.repo;

import com.wordpress.tausiq.xml.model.Offer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// the value is usually the interface name with lower case first letter
@Repository("offerRepo")
public class StubOfferRepoImpl implements OfferRepo {

    @Override
    public List<Offer> getAll() {
        List<Offer> ret = new ArrayList<>();
        ret.add(new Offer("Offer 1", "Brand 1", 25));
        return ret;
    }
}
