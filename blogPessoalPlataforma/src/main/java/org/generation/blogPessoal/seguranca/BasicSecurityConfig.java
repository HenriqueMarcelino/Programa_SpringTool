package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http ) throws Exception{ 	
	http.authorizeRequests()  										
	.antMatchers("/usuarios/logar").permitAll() // Essa configuração serve para liberar 	alguns caminhos dentro meu controle para que clente não precise passar de uma chave token. 
	.antMatchers("/usuarios/cadastrar").permitAll() // Essa configuração serve para liberar alguns caminhos dentro meu controle para que clente não precise passar de uma chave token.
	.anyRequest().authenticated() // Esta passando que as demais aquisições deveram ser autenticadas.
	.and().httpBasic()
	.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // Não guarda sessão nenhuma
	.and().cors() // Habilita o cors 
	.and().csrf().disable(); // Desabilitando as configurançoes, não vai ser configuração personalizada, vai ser configuração padrão. 

	}
}



