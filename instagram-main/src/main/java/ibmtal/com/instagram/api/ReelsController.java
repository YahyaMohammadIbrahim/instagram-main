package ibmtal.com.instagram.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import business.services.ReelsService;
import entity.Reels;

@RestController
@RequestMapping("/api/Reels")
public class ReelsController {
	private ReelsService reelsService;

	public ReelsController(ReelsService reelsService) {
		super();
		this.reelsService = reelsService;
	}
	@GetMapping("/getall")
	public ArrayList<Reels> allReels(){
		return new ArrayList<Reels>(reelsService.getAll());
	}
}

