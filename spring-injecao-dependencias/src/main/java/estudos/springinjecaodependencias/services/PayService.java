package estudos.springinjecaodependencias.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

	@Autowired
	TaxService taxService;
	@Autowired
	DeliverService deliverService;

	public Double finalPrice(Double cost, String state) {
		return cost + taxService.tax(cost) + deliverService.fee(state);

	}

}
