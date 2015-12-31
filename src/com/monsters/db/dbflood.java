package com.monsters.db;

import java.io.File;

/**
 * Created by wangxh on 12/23/15.
 */

public class dbflood {

    private static String CONFIG_FILE_PATH = "cfg/dbflood.cfg";

    public static void main(String[] args) {
        printWelcomeMessage();

        // Load config file, if file not exist then create a new one and exit program.
        File fileConfigFile = new File(CONFIG_FILE_PATH);
        if (!fileConfigFile.exists()) {

            // Create a sample config file
            DfConfig globalConfig = new DfConfig(CONFIG_FILE_PATH);
            globalConfig.initConfigFile();

            // Print a message to inform user that a new config file has been created.
            System.out.println("Print a message to inform user that a new config file has been created.");

            // Exist program
            return;
        } else {
            DfConfig globalConfig = new DfConfig(CONFIG_FILE_PATH);
            globalConfig.loadConfig();
        }

    }

    private static void printWelcomeMessage() {
        System.out.println("xxx");
    }

    private static void printUsageMessage() {
        System.out.println("yyy");
    }
}


