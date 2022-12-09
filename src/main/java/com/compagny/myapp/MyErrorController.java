package com.compagny.myapp;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyErrorController implements ErrorController {
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        // TODO: 2021-09-16 Ajouter une page d'erreur personalisé avec renvoie sur la page d'accueil et suppréssion de la session de la session en cours
        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            if (statusCode == HttpStatus.BAD_REQUEST.value()) {
                return "error-400";
            } else if (statusCode == HttpStatus.UNAUTHORIZED.value()) {
                return "error-401";
            } else if (statusCode == HttpStatus.FORBIDDEN.value()) {
                return "error-403";
            } else if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return "error-404";
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "error-500";
            }
        }

        return "error contatez moi ou openai ;p";
    }

    // @Override
    // public String getErrorPath() {
    // return PATH;
    // }
}
