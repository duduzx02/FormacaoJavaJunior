# Integração via APIs
- A integração de sistemas é uma tarefa muito comum, pois permite que os diferentes serviços e aplicações de uma  
  empresa funcionem em conjunto, reaproveitando soluções existentes. Uma das dio.principais maneiras de realizar essa 
  integração  é por meio de APIs.
-  API (Application Programming Interface) é um conjunto de padrões, protocolos e ferramentas para construir 
   software e aplicativos. Uma API permite que diferentes sistemas e serviços se comuniquem e troquem informações de 
   maneira padronizada. Existem diferentes tipos de APIs, sendo que o mais comum é API Web, que utiliza o protocolo 
   HTTP  para comunicação via internet.
- Um exemplo de uso de API é a integração de um sistema de vendas com um sistema de gestão financeira. Por meio de 
  uma API, os dados de venda podem ser enviados automaticamente para o sistema financeiro, evitando a necessidade de 
  inserção manual  e reduzindo o risco de erros. Outro exemplo é o uso de uma API para integração de um aplicativo 
  mobile com um serviço  Web, para sincronização e armazenamento das informações dos usuários.

# O formato JSON
- O JSON (JavaScript Object Notation) é um formato de dados leve e popular para troca de informações entre sistemas, 
  podendo ser utilizado em várias linguagens de programação.
-O JSON é composto por dois tipos de estruturas de dados: objetos e arrays. Um objeto é uma coleção de pares 
  chave-valor, onde as chaves são strings e os valores podem ser strings, números, booleanos, objetos ou arrays.  
  Por exemplo:
{
  "nome": "João",
  "idade": 30,
  "solteiro": false,
  "endereco": {
  "rua": "Rua 123",
  "cidade": "São Paulo",
  "estado": "SP"
  },
  "telefones": [
  "1111-1111",
  "2222-2222"
  ]
}
- Já um array é uma coleção ordenada de valores, que podem ser strings, números, booleanos, objetos ou outros arrays.
  Por exemplo:
[
  {
  "nome": "João",
  "idade": 30
  },
  {
  "nome": "Maria",
  "idade": 25
  },
  {
  "nome": "Pedro",
  "idade": 40
  }
]
- O JSON é amplamente utilizado em aplicações, independente da linguagem de programação utilizada, para enviar e 
  receber dados de APIs, sendo que para isso é recomendado utilizar alguma biblioteca que permita a serialização 
  (conversão de objetos em JSON) e a desserialização (conversão de JSON em objetos).

# O protocolo HTTP
- O HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação que permite a transferência de informações na 
  internet. Ele é a base para a comunicação entre navegadores e servidores Web, sendo utilizado para a transmissão 
  de conteúdo como textos, imagens e vídeos.
- O HTTP foi desenvolvido na década de 1990 e é baseado em um modelo cliente-servidor, onde um cliente (navegador Web)
  faz requisições a um servidor para obter informações, e o servidor responde com os dados solicitados. O HTTP 
  utiliza o TCP (Transmission Control Protocol) como protocolo de transporte para garantir a entrega confiável dos 
  dados.
- O HTTP utiliza métodos para especificar o tipo de operação que deve ser realizada no servidor. Os dio.principais 
  métodos são GET, POST, PUT e DELETE. O método GET é utilizado para solicitar dados do servidor, enquanto o POST é 
  utilizado para enviar informações para o servidor. O PUT é utilizado para atualizar informações no servidor e o 
  DELETE é utilizado para remover informações.
- Além dos métodos, o HTTP utiliza códigos de status para indicar o resultado da operação realizada. Os códigos de 
  status variam de 100 a 599 e são divididos em cinco classes:
- - 1xx: Informações
- - 2xx: Sucesso
- - 3xx: Redirecionamento
- - 4xx: Erro do cliente
- - 5xx: Erro do servidor
- Caso você queira aprofundar os conhecimentos nesse protocolo, recomendamos o nosso curso HTTP: Entendendo a web 
  por baixo dos panos.