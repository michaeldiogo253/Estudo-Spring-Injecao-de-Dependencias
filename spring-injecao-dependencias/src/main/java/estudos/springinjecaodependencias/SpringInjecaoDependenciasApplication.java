package estudos.springinjecaodependencias;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import estudos.springinjecaodependencias.services.PayService;

@SpringBootApplication
public class SpringInjecaoDependenciasApplication implements CommandLineRunner {

	@Autowired
	PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(SpringInjecaoDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Double cost;
		String state;
		String op = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------- Costing Program ----------");
		while (!op.equalsIgnoreCase("0")) {
			System.out.println("inform the total value of the sale: ");
			cost = scanner.nextDouble();
			scanner.nextLine(); // clean buffer
			System.out.println("inform the state for delivery: ");
			state = scanner.nextLine();

			System.out.println("Final price: $ " + payService.finalPrice(cost, state));

			System.out.println("Do you want to perform the calculation again?");
			System.out.println("Enter 0 (zero) if you want to EXIT");
			op = scanner.nextLine();
		}
		System.out.println("Finishing up... See you later.");
	}

}
