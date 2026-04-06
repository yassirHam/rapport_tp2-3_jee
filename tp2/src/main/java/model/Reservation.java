package model;

public class Reservation {

	private Client client;
	private String type;
	private String prix;
	private String vue;
	public Reservation(Client client, String type, String prix, String vue) {
		super();
		this.client = client;
		this.type = type;
		this.prix = prix;
		this.vue = vue;
	}
	public Client getClient() {
		return client;
	}
	public String getType() {
		return type;
	}
	public String getPrix() {
		return prix;
	}
	public String getVue() {
		return vue;
	}
}
