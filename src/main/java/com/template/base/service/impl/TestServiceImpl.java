package com.template.base.service.impl;

import com.template.base.entity.TestEntity;
import com.template.base.repository.TestRepository;
import com.template.base.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestEntity> getAll() {
        return testRepository.findAll();
    }

    @Override
    public TestEntity save() {
        TestEntity testEntity = new TestEntity();
        return testRepository.save(testEntity);
    }
}
