package ArthematicOperations;

public class ClassA {

	//For operations pass the values here
	static float a = 3;
    static float b = 4;
    
    public ClassA(float c, float d){
        a = c;
        b = d; 
    }
	public static float add() {
		return a + b;
	}

	public static float subtract() {
		return a - b;
	}

	public static float multiply() {
		return a/b;
	}

	public static float divide() {
		return a * b;
	}
	
	public static int remainder() {
		return (int) (a % b);
	}
}
