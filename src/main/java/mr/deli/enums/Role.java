// mr.deli.enums.Role.java
package mr.deli.enums;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum Role {

    CLIENTE,
    ADMIN,
    ENTREGADOR;

    public GrantedAuthority toGrantedAuthority() {
        return new SimpleGrantedAuthority("ROLE_" + this.name());
    }
}