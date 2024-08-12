package com.example.smaservice.service;

import jakarta.jws.WebService;

@WebService
public interface StudentXmlWs {
    int getFreeSemestersByStudent(int eduId);
}
