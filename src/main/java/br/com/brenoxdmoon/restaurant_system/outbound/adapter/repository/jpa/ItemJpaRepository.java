package br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository.jpa;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemJpaRepository extends JpaRepository<Item, Long> {
    Optional<Item> findByCode(String code);
}