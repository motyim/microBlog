package me.motyim.learn.microblog.spark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

/**
 * @author MA MotYim <mohamed.motyim@gmail.com>
 * @since 18-Oct-17
 */

public class Main {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Project Start");
        get("/hello", (req, res) -> "Hello World..");




    }
}
