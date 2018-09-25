package org.learnspring.hotel.data.repository;

import org.learnspring.hotel.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {
}
