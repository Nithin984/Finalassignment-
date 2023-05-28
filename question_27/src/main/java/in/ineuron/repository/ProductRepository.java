package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.ProductPrice;

public interface ProductRepository extends JpaRepository<ProductPrice, Integer> {
	public ProductPrice findByCompanyName(String companyName);
}
