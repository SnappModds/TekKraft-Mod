package com.epicmods.tekkraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by SnappGamez on 8/31/2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile)
    (
            Configuration configuration = new Configuration(configFile);

            try
            (
                    configuration.load();

                    boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
                    )
            catch (Exception e)
                            (

                            )
            finally
            (
            configuration.save();
            )
            )
}