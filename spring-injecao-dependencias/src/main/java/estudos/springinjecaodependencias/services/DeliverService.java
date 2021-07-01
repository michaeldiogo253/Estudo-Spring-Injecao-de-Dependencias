package estudos.springinjecaodependencias.services;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {

	public double fee(String state) {
		if (state.equalsIgnoreCase("SP")) {
			return 10.0;
		}
		return 20.0;
	}

}
