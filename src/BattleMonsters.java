import java.io.*;
public class BattleMonsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monster ogre = new Monster(60, 25);
		Monster giant = new Monster(100, 15);
		
		
		System.out.println("$ java Battle!");
		System.out.println("Health of Fighters:");
		System.out.println("Round Giant Ogre");
		
		int monitor = 0;
		
		do {
			monitor ++;
		double ogreAttack = ogre.attack();
			double giantAttack = giant.attack();
			
			ogre.takeDamage(giantAttack);
			giant.takeDamage(ogreAttack);
			System.out.println(monitor + " " + giant.getHealth() + " " + ogre.getHealth());
		
	}
		while (giant.isAlive() == true && ogre.isAlive());
		
			
			if(giant.isAlive()) {
		System.out.println( "Giant  wins");
	}else if(ogre.isAlive()) {
		System.out.println("Ogre wins");
	}else {
		System.out.println("Both are dead");
	
	}
}
}
