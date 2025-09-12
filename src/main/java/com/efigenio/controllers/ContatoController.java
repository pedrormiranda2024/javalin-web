package com.efigenio.controllers;

import java.util.Map;

import io.javalin.http.Handler;

public class ContatoController {

    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
        String nome = ctx.formParam("nome");
        String telefone = ctx.formParam("telefone");
        String email = ctx.formParam("email");

        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        String mensagem = "Contato: "+ nome+ "Cadastrado";

        ctx.render("visualizarContato.ftl",Map.of("mensagem",mensagem));
    };
}
