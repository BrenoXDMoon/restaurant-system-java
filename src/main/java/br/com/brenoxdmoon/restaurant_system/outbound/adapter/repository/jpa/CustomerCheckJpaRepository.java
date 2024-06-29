package br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository.jpa;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.CustomerCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCheckJpaRepository extends JpaRepository<CustomerCheck, Long> {
}
