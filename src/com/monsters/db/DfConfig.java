package com.monsters.db;

/**
 * Created by wangxh on 12/23/15.
 */
public class DfConfig {

    private String configFilePath;

    private String cfgConcurrent;

    public DfConfig(String configFilePath) {
        this.configFilePath = configFilePath;
    }

    public void loadConfig() {
        System.out.println("load from config file");
    }

    public void printConfig() {
        System.out.println("print config here.");
    }

    public void initConfigFile() {
    }

    public void printConfigFile(String configFilePath) {
        System.out.println("print config file here.");
    }


}
