package com.example.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

public class VertxHttpServer extends AbstractVerticle {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new VertxHttpServer());
    }

    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.route("/v1/*").handler(BodyHandler.create());
        router.get("/v1/*").handler(ctx -> {
            ctx.response()
                .putHeader("content-type", "text/plain")
                .end("Hello from Vert.x!");
        });

        router.post("/v1/*").handler(ctx -> {
            ctx.response()
                .putHeader("content-type", "application/json")
                .end("{\"message\": \"Hello from Vert.x!\"}");
        });

        vertx.createHttpServer()
             .requestHandler(router)
             .listen(8080, result -> {
                 if (result.succeeded()) {
                     System.out.println("Server started on port 8080");
                 } else {
                     System.out.println("Failed to start server: " + result.cause());
                 }
             });
    }
}
