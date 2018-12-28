package Application.jedi;

import java.util.List;
import Application.jedi.Jedi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class JediController {
	JediOrder oldRepublic = new JediOrder();
	
	public JediController() {}
	
	@RequestMapping ("/jedi")
	public List<Jedi> getCouncil() {
		return this.oldRepublic.getRepublic();
	}
	
	@RequestMapping("/jedi/{name}")
	public Jedi getJedi(@PathVariable String name) {
		return this.oldRepublic.getJedi(name);
	}
	
	@RequestMapping("/jedi/race/{race}")
	public List <Jedi> getRaces(@PathVariable String race) {
		return this.oldRepublic.findRace(race);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/jedi")
	public void addJediToOrder(@RequestBody Jedi addedJedi) {
		this.oldRepublic.addJedi(addedJedi);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/jedi/{name}")
	public void updateJediOrder(@RequestBody Jedi addedJedi, @PathVariable String name) {
		this.oldRepublic.updateJedi(addedJedi, name);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/jedi/{name}")
	public void DeleteJediFromOrder(@PathVariable String name) {
		this.oldRepublic.deleteJedi(name);
	}
}
