package fr.hebweb.repository;

import org.springframework.data.repository.CrudRepository;

import fr.hebweb.entities.VpsOffer;

public interface VpsRepository extends CrudRepository<VpsOffer, Long> {

}
