package com.dust.springbootinitial.service.Imp;

import com.dust.springbootinitial.mapper.TestMapper;
import com.dust.springbootinitial.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestServiceImp implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public String test(String path, String value) {
        return testMapper.getTestValue(path, value, UUID.randomUUID().toString());
    }
}
