package org.example.jwtproject.dto;

import lombok.*;

@AllArgsConstructor@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class JwtRequest {

    private String username;
    private String password;
}
