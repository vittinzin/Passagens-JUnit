## **Sistema de Viagem de Trem** 

O sistema feito em Java realiza a compra de passagens de trem, contando com as classes de passageiro, estação, trem, bilhete e viagem, cada uma com seus atributos e métodos.
O Objetivo dos testes unitários e de integração são a realização de uma compra de uma passagem de trem do início ao fim

# **Fluxo de Testes Unitários:**

Criar duas estações (origem e destino).

Criar um trem com capacidade limitada.

Criar uma viagem entre as estações utilizando o trem.

Criar um passageiro.

Comprar um bilhete para o passageiro.

Validar o embarque do passageiro.

Garantir que a ocupação do trem aumentou.

Validar o preço final do bilhete considerando regras de desconto.

# **Casos de Teste de Integração:**

**Fluxo Feliz (Happy Path)**

Passageiro válido compra bilhete.

Embarca corretamente.

Preço calculado corretamente.

# **Casos de Borda (Edge Cases)**

Trem lotado no momento da compra do bilhete (lança exceção).

Estações iguais (origem = destino) ao criar a viagem (lança exceção).

Passageiro menor de 12 ou maior de 60 anos comprando bilhete (desconto aplicado).

Viagem com horário de chegada anterior ao de partida (lança exceção).
