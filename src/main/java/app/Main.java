package app;

import app.controllers.PageController;
import io.javalin.Javalin;


public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create()
            .enableStaticFiles("/public")
            .port(8888)
            .start();

        app.get("/", PageController::serveIndex);
        app.get("/download.html", PageController::serveDownload);
        app.get("/examples.html", PageController::serveExamples);
        app.get("/news.html", PageController::serveNews);
        app.get("/404.html", PageController::serve404);

    }

}
