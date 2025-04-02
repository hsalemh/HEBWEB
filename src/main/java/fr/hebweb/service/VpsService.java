package fr.hebweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import fr.hebweb.repository.*;
import fr.hebweb.entities.*;

import fr.hebweb.repository.VpsRepository;

@Service
public class VpsService {
	@Autowired
	private VpsRepository vpsRepository;
	
	public List<VpsOffer> getAllOffers(){
		return (List<VpsOffer>)vpsRepository.findAll();
	}
	
	//Ajout de données de base
	public void initData() {
		if (vpsRepository.count()==0) {
		vpsRepository.save(new VpsOffer("VPS Basique", 1, 2, 20, 5.0));
		vpsRepository.save(new VpsOffer("VPS Standard", 2, 4, 50, 10.0));	
		}
	}

}
