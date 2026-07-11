package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authentication(@RequestHeader(value = "Authorization", required = false)
                                     String authHeader){

        System.out.println("Authorization Header = " + authHeader);
//        It will remove basic
        String encoded = authHeader.substring(6);
        byte[]decodedByte = Base64.getDecoder().decode(encoded);

        String decoded = new String(decodedByte, StandardCharsets.UTF_8);

        String username = decoded.split(":")[0];

//        return username;

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(SignatureAlgorithm.HS256,"secretkey")
                .compact();



        return token;
//        if (authHeader == null) {
//            return "Header is NULL";
//        }
//        return authHeader;
    }
}
