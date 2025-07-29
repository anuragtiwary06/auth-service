package com.tmobile.authservice.service;


import com.tmobile.authservice.dao.request.SignUpRequest;
import com.tmobile.authservice.dao.request.SigninRequest;
import com.tmobile.authservice.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
