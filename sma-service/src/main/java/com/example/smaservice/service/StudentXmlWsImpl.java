package com.example.smaservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class StudentXmlWsImpl implements StudentXmlWs {

    private Random random = new Random();

    @Override
    public int getFreeSemestersByStudent(int eduId) {
        return random.nextInt(0, 10);
    }
}
