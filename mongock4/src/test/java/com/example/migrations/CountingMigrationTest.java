package com.example.migrations;

import com.example.mongock.BaseCountingMigrationTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {"spring.data.mongodb.database=mongock4-springboot"})
public class CountingMigrationTest extends BaseCountingMigrationTest {
}
