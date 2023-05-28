package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.ProductPrice;
import in.ineuron.exception.ProductNotFoundException;
import in.ineuron.repository.ProductRepository;

@Service
public class ProductPriceServiceimpl implements ProductPriceService {

	@Autowired
	private ProductRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {

		ProductPrice stockPrice = repo.findByCompanyName(companyName);
		if (stockPrice == null) {
			throw new ProductNotFoundException("Company not vailable");
		}

		return stockPrice.getProductPrice();
	}

}
