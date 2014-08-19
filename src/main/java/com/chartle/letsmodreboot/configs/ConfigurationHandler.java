package com.chartle.letsmodreboot.configs;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Hilko on 8/19/2014.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file

        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get("ForgeCraft", "configValue", true, "test config value").getBoolean(true);
        }
        catch(Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
