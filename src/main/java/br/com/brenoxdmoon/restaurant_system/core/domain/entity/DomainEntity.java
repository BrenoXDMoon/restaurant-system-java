package br.com.brenoxdmoon.restaurant_system.core.domain.entity;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.listener.DomainEntityListener;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@MappedSuperclass
@EntityListeners(DomainEntityListener.class)
public abstract class DomainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected LocalDateTime createdAt;

}
