package estudos.springinjecaodependencias.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

	public double tax(Double value) {
		return value * 0.1;
	}
}
