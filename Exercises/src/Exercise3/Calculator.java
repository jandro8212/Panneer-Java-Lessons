package Exercise3;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [] numbers;
		numbers = new float [args.length];
		 for (int i = 0; i < args.length; i++ ){
			 numbers[i] = Float.parseFloat(args[i]);
		 }
		/*System.out.println("Calculadora SAP:");
		System.out.println(numbers [0] + " + " + numbers [1] + " =");
		System.out.println(numbers [0] + numbers [1]);
		*/
		if (numbers[2]<1){
			float solution = numbers [0] + numbers [1];
			System.out.println("Calculadora de SAP está sumando:");
			System.out.println(numbers [0] + " + " + numbers [1] + " =");
			System.out.println(solution);
		}else if (numbers[2]<2){
			float solution = numbers [0] - numbers [1];
			System.out.println("Calculadora de SAP está restando:");
			System.out.println(numbers [0] + " - " + numbers [1] + " =");
			System.out.println(solution);
		}else if (numbers[2]<3){
			float solution = numbers [0] * numbers [1];
			System.out.println("Calculadora de SAP está multiplicando:");
			System.out.println(numbers [0] + " * " + numbers [1] + " =");
			System.out.println(solution);
		}else{
			float solution = numbers [0] / numbers [1];
			System.out.println("Calculadora de SAP está dividiendo:");
			System.out.println(numbers [0] + " / " + numbers [1] + " =");
			System.out.println(solution);
		}
	}

}
