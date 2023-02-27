package mendoza.acosta.empresarestspringboot.config.security

import mendoza.acosta.empresarestspringboot.config.security.jwt.JwtAuthenticationFilter
import mendoza.acosta.empresarestspringboot.config.security.jwt.JwtAuthorizationFilter
import mendoza.acosta.empresarestspringboot.config.security.jwt.JwtToken
import mendoza.acosta.empresarestspringboot.service.usuario.UsuarioService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

private val logger = KotlinLogging.logger { }


























