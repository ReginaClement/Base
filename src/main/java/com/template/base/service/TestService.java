package com.template.base.service;

import com.template.base.entity.TestEntity;

import java.util.List;

public interface TestService {
    List<TestEntity> getAll();

    TestEntity save();
}
