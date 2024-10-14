package com.jokingwill.SimpleUserAuthenticationAPI.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                title = "SimpleUserAuthenticationApi",
                description = "Uma API que permite o registro e a autenticação de usuários, desenvolvida com base em um dos desafios da plataforma Onit",
                version = "1.0",
                contact = @Contact(
                        name = "Joking Will Gabriel Taremba",
                        email = "jokingtaremba@gmail.com",
                        url = "https://github.com/JokingTaremba"
                ),
                license = @License(
                        name = "",
                        url = ""
                )
        ),
        security = {
                @SecurityRequirement(
                        name = "Bearer Authentication"
                )
        }
)
@SecurityScheme(
        name = "Bearer Authentication",
        description = "Para utilizar a api de forma adequada, faça login e insira seu token de autenticação gerado durante o login no campo abaixo. " +
                "Em seguida, clique no botão Authorize. Após isso, você poderá acessar outros endpoints para verificar se está logado, " +
                "como buscar todos os usuários e buscar usuários pelo ID",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
