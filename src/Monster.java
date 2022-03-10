import java.util.Random;
import java.io.*;

public class Monster {

	private double health;
	private double strength;
	
	public Monster (double health, double strength) {
		this.health = health;
		this.strength = strength;	
	}
	
	//
	public double getHealth() {
		return health;
	}
	public void sethealth(double health) {
		this.health = health;
	}
	
	
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	// This will initiate amount of damage that is dealt
	public double attack() {
		Random random = new Random();
		double Random = random.nextDouble();
		
		double contact = Random * strength;
			return contact;
	}
	//this will initiate the amount of damage that is received
	public void takeDamage (double damage) {
		health = health - damage;
	}
	public boolean isAlive() {
		if (health > 0) {
			return true; 
		}
		else {
			return false;
		}
	}		

}
