# Chellenge Developer VirteX
Teste prático de desenvolvimento. Sistema que lê um arquivo estático e cadastra os dados no bd e mostra os dados cadastrados. 
Esta Api faz foi feita para o chellenge developer da virtex.
A Api consiste em duas rotas: uma que lê um arquivo estático localizado no caminho :testeVirtex\src\main\resources\static, e cadastra asinformações do arquivo(sn(pk),
slot, port, ont_id e state) em um banco de dados em memoria (h2Database), e outra que lista os dados cadastrados.

# Configuração
Esta é uma api Spring java, que utiliza o Spring boot 3.1.5 maven e Java 17. 
Ela esta documentada usando o Swagger UI, assim você poderá vizualiza-la usando a url http://localhost:8080/swagger-ui/index.html#/onu-controller no seu navegador.
Foram utilizadas as seguintes dependências: h2 database, Spring Data JPA, Lombocke e Spring Web. 
Para iniciar o projeto acesse o spring initializr e adicione essas dependências ao seu projeto.
Link do spring initializr: https://start.spring.io.
Ao usar o inteliJ lembre-se de abrir o projeto entrando no arquivo pom.xml para instalar as dependências.

