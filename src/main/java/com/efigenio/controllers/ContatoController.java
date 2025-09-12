package com.efigenio.controllers;

import io.javalin.http.Handler;

public class ContatoController {

    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
        
        ctx.render("visualizarContato.ftl");
    };
}
