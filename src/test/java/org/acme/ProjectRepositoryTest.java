package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ProjectRepositoryTest {

    @Test
    public void shouldNotBreak() {
        Assertions.assertTrue(true);
    }

}
