package overloadingAndOverriding;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Bird();
		Fish f = new Karp();
		Bird b1 = new Bird();
		Bird b2 = new Eagle();
		Chicken c = new Chicken();
		Karp k = new Karp();
		Super sup1 = new Super();
		Super sup2 = new Sub();
		sup1.m(c,b2);
		sup2.m(b1, k);
		sup1.m(a1, a2);
		sup1.m(b1, k);
		sup1.m(b2, f);
		sup2.m(b1, f);
	}

}
