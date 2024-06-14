package org.example.jwtproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class JwtResponse {

    private String jwtToken;
    private String username;
}
