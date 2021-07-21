package com.connellboyce.blogportfoliobackend.service;

import com.connellboyce.blogportfoliobackend.payload.request.LoginRequest;
import com.connellboyce.blogportfoliobackend.payload.request.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Map;

public interface AuthService {
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);

    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest);

    public Map<String, String> handleValidationException(MethodArgumentNotValidException exception);
}
