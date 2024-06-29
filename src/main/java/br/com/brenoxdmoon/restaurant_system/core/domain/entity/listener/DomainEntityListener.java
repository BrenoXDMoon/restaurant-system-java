package br.com.brenoxdmoon.restaurant_system.core.domain.entity.listener;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.DomainEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class DomainEntityListener {

    @PrePersist
    public void prePersist(DomainEntity entity) {
        entity.setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate(DomainEntity entity) {
        prePersist(entity);
    }

}
