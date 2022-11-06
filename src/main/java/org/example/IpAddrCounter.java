package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.logging.Logger;

public class IpAddrCounter {
    private static final Logger logger = Logger.getLogger(IpAddrCounter.class.getName());

    public static void main(String[] args) {
        String path = args[0];
        int countOfUniqIp = getCountOfUniqIp(path);
        logger.info(String.valueOf(countOfUniqIp));
    }

    public static int getCountOfUniqIp(String path) {
        HashSet<Integer> uniqIp = new HashSet<>();
        logger.info("Start of the counting process...");
        try {
            Files.newBufferedReader(Paths.get(path)).lines().forEach(line -> {
                uniqIp.add(Converter.ipToInt(line));
            });
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        logger.info("End of the counting process");
        return uniqIp.size();
    }
}