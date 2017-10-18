package me.motyim.learn.microblog.spark;

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

        
        get("/hello", (req, res) -> "Hello World..");




    }
}
