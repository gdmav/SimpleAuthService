package mav.goode.goodeauthservice.controller;

import lombok.RequiredArgsConstructor;
import mav.goode.goodeauthservice.service.JwtService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final JwtService jwtService;

    @PostMapping(path = "/token", consumes = APPLICATION_JSON_VALUE)
    public String getToken(@RequestBody Map<String, Object> claims) {
        return jwtService.generateJWT(claims);
    }

}