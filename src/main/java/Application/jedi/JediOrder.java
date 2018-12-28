package Application.jedi;

import java.util.ArrayList;

public class JediOrder {
	private ArrayList<Jedi> oldRepublic;

	public JediOrder() {
		this.oldRepublic = new ArrayList<Jedi>();
		this.addMembersToTheOldRepublic();
	}

	private void addMembersToTheOldRepublic() {
		Jedi obi = new Jedi("Obi-Won", "Human", 30, "Green", "Jedi Master");
		Jedi anakin = new Jedi("Anakin Skywalker", "Human", 18, "Blue",
				"Had a seat on the council but not given the rank of master");
		Jedi yoda = new Jedi("Yoda", "Unknown", 900, "Green", "Grand Master");
		Jedi plo = new Jedi("Plo Koon", "Kel Dor", 100, "Blue", "Master");
		Jedi ahsoka = new Jedi("Ahsoka Tano", "Togruta", 16, "Blue and Green", "She is No Jedi");
		this.oldRepublic.add(obi);
		this.oldRepublic.add(anakin);
		this.oldRepublic.add(yoda);
		this.oldRepublic.add(plo);
		this.oldRepublic.add(ahsoka);
	}

	public void addJedi(Jedi addedJedi) {
		this.oldRepublic.add(addedJedi);
	}

	public ArrayList<Jedi> getRepublic() {
		return this.oldRepublic;
	}

	public Jedi getJedi(String name) {
		return this.oldRepublic.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public ArrayList<Jedi> findRace(String race) {
		ArrayList<Jedi> listOfJediRaces = new ArrayList<Jedi>();
		for (int count = 0; count < this.oldRepublic.size(); count++) {
			if (this.oldRepublic.get(count).getRace().equals(race)) {
				listOfJediRaces.add(this.oldRepublic.get(count));
			}
		}
		return listOfJediRaces;
	}

	public void updateJedi(Jedi addedJedi, String name) {
		for (int count = 0; count < this.oldRepublic.size(); count++) {
			Jedi jedi = this.oldRepublic.get(count);
			if (jedi.getName().equals(name)) {
				this.oldRepublic.set(count, addedJedi);
				break;
			}
		}
	}

	public void deleteJedi(String name) {
		this.oldRepublic.removeIf(jedi -> jedi.getName().equals(name));
	}

}
