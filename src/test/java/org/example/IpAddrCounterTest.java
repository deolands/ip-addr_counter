package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpAddrCounterTest {
    @Test
    void test() {
        System.out.println("======TEST ONE EXECUTED=======");
        String path = "src/test/resources/testFile";
        Assertions.assertEquals(4, IpAddrCounter.getCountOfUniqIp(path));
    }
}