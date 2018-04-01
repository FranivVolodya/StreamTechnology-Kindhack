package com.streamtechnology.repository;

import com.streamtechnology.entity.RoomDetails;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class RoomDetailsDaoImpl implements RoomDetailsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<RoomDetails> searchRooms(Double bottomPrice, Double topPrice, Boolean domesticHelpRequired) {
        TypedQuery<RoomDetails> query = entityManager.createQuery("SELECT r FROM RoomDetails r WHERE r.rentPrice > :bottomPrice" +
                " AND r.rentPrice < :topPrice AND r.domesticHelp is :domesticHelpRequired", RoomDetails.class);
        if (bottomPrice == null || bottomPrice < 0) {
            bottomPrice = Double.MIN_VALUE;
        }
        if (topPrice == null || topPrice < 0) {
            topPrice = Double.MAX_VALUE;
        }
        if (domesticHelpRequired == null) {
            domesticHelpRequired = false;
        }
        query.setParameter("bottomPrice", bottomPrice);
        query.setParameter("topPrice", topPrice);
        query.setParameter("domesticHelpRequired", domesticHelpRequired);
        return query.getResultList();
    }

}
