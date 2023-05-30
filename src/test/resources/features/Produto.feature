# language: pt
# charset: UTF-8

@regressao
  Funcionalidade: Comprar um produto
    Eu como usuário
    Gostaria de acessar a Swag Labs
    Gostaria de adquirir produtos com sucesso

    @wip
  Cenário: Comprar o produto Sauce Labs Backpack
    Dado que eu esteja logado na swag labs
    Quando eu incluo o produto carrinho
    E eu efetuo o pagamento
    Então eu irei visualizar a mensagem "Thank you for your order!"

    @wip2
  Esquema do Cenario: cenário: Comprar o produto Sauce Labs Backpack
      Dado que eu esteja logado na swag labs
      Quando eu incluo o produto carrinho
      E eu efetuo o pagamento
      Então eu irei visualizar a mensagem "<mensagem>"

    Exemplos:
      | mensagem                    |
      | Thank you for your order!   |