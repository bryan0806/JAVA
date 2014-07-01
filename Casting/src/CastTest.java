
public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal [] a = {new Animal(),new Dog(),new Animal()};
		for(Animal animal : a){
			animal.makeNoise();
			if(animal instanceof Dog){
				((Dog) animal).playDead();
			}
		}
	}

}
