package org.sid.customerservice;

import jakarta.persistence.Entity;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "full Customer",types = Entity.class)
public interface CustomerProjection {

        public Long getId();
        public String getName()  ;

}
