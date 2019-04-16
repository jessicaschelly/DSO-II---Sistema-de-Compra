# Sistema de Compra

Requisitos da Aplicação
A aplicação a ser desenvolvida deve permitir a execução das seguintes ações através de sua interface gráfica:

Iniciar uma compra;
Adicionar um produto à lista de produtos adquiridos;
Cancelar um produto (requer a digitação da senha de um funcionário);
Cancelar uma compra em andamento (requer a digitação da senha de um funcionário);
Concluir a compra;
Efetuar pagamento;
Imprimir cupom fiscal. 
O código da aplicação deve ser organizado de acordo com o padrão MVC (Model-View-Controller), no qual o Modelo é composto pelas entidades manipuladas pela aplicação, a Visão corresponde à interface gráfica e o Controlador implementa a lógica da aplicação.

Sua aplicação deve conter os seguintes componentes:

um gerenciador de produtos, responsável por manter uma lista com todos os produtos à venda, seus respectivos códigos e preços;
um gerenciador de compras, que manterá um registro com todas as compras concluídas, para que no final do dia seja feita a totalização das vendas;
um componente de pagamento, que simulará a leitura do cartão do cliente e a comunicação com a operadora do cartão de crédito. 
e outros componentes que você considerar adequados. Estes componentes serão invocados pelo controlador da aplicação sempre que necessário.

A persistência dos dados da aplicação pode ser feita em memória, arquivo ou banco de dados. Os componentes desenvolvidos devem estar em pacotes ou projetos separados do código da interface gráfica da aplicação.


Trabalho avaliado: 9.

Melhorias: Tornar a janela responsiva e melhorar estrutura de componenetes.
