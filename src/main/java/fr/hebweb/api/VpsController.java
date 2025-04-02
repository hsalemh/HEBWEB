package fr.hebweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hebweb.service.VpsService;
import fr.hebweb.entities.*;


@RestController
@RequestMapping("/api/vps")
public class VpsController {
	@Autowired
	private VpsService vpsService;
	
	@GetMapping
	public List<VpsOffer> getVpsOffers(){
		vpsService.initData();
		return vpsService.getAllOffers();
	}
}
