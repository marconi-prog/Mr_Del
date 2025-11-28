// mr.deli.dto.AuthResponse.java
package mr.deli.dto;

import java.util.Objects;

public class AuthResponse {

    private String token;

    public AuthResponse() {}


    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthResponse that = (AuthResponse) o;
        return Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    // toString
    @Override
    public String toString() {
        return "AuthResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}