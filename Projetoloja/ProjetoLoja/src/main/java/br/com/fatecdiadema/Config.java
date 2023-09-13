package br.com.fatecdiadema;

@Configuration
public class Config {

    @Bean(name = "appName")
    public String appName() {
        return "Loja FATEC Diadema";
    }
}
