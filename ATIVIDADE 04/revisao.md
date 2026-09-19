
# EXERCICIO 1 

## 1 - BLOCOS BÁSICO

Bloco 1:
Início; desconto = 0
Sequência

Bloco 2:
valor >= 500?
Decisão

Bloco 3:
desconto = 10
Sequência

Bloco 4: 
clienteVip?
Decisão

Bloco 5:
desconto += 5
Sequência

Bloco 6:
!pagamentoAprovado?
Decisão

Bloco 7:
return "PAGAMENTO RECUSADO"
Saída antecipada

Bloco 8:
Calcula valorFinal
Sequência

Bloco 9:
return "PEDIDO APROVADO: " + valorFinal
Saída

Bloco 10:
Fim
Encerramento

## 2 - GRAFO - pdf 

## 3 - Nós: 10
Arestas: 12
Complexidade pela primeira fórmula: V(G) = E - N + 2 = 12 - 10 + 2 = 4
Complexidade pela segunda fórmula: há 3 decisões, então V(G) = 3 + 1 = 4


## 4 - Base de caminhos independentes e testes

Caminho 1: 1–2F–4F–6V–7–10
Entrada: (100, false, false)
Resultado esperado: PAGAMENTO RECUSADO

Caminho 2: 1–2V–3–4F–6V–7–10
Entrada: (600, false, false)
Resultado esperado: PAGAMENTO RECUSADO

Caminho 3: 1–2F–4V–5–6F–8–9–10
Entrada: (100, true, true)
Resultado esperado: PEDIDO APROVADO: 95.0

Caminho 4: 1–2V–3–4V–5–6F–8–9–10
Entrada: (600, true, true)
Resultado esperado: PEDIDO APROVADO: 510.0

## 5. Questões 

1. Quantas combinações existem? Existem 2³ = 8 combinações, pois são três condições booleanas.

2. Combinações e complexidade são iguais? Não. As 8 combinações mostram possibilidades de entradas, enquanto a complexidade ciclomática 4 indica a quantidade de caminhos independentes necessários para cobrir a estrutura do código.

3. Como o return altera o grafo? Ele cria uma saída antecipada. O fluxo não segue para o cálculo de valorFinal.

4. É possível calcular valorFinal se o pagamento não foi aprovado? Não. O return acontece antes desse cálculo.



# EXERCICIO 2

## 1 - BLOCOS BÁSICOS

BLOCO 1:
Início; alertas = 0; i = 0
Sequência

BLOCO 2:
i < temperaturas.length?
Decisão do while

BLOCO 3:
temperaturas[i] < 0?
Decisão do primeiro if

BLOCO 4:
alertas += 2
Sequência

BLOCO 5:
temperaturas[i] > 35?
Decisão do else if

BLOCO 6:
alertas++
Sequência

BLOCO 7:
Nenhum alerta para a temperatura
Sequência

BLOCO 8:
return alertas
Saída

BLOCO 9:
i++
Incremento

BLOCO 10:
Fim
Encerramento

## 2 - GRAFO pdf

## 3 
Nós: 10
Arestas: 12
Complexidade pela primeira fórmula: V(G) = E - N + 2 = 12 - 10 + 2 = 4
Complexidade pela segunda fórmula: há 3 decisões, então V(G) = 3 + 1 = 4


## 4 - Base de caminhos independentes e testes
Caminho 1: 1–2F–8–10
Entrada : []
Resultado esperado: 0

Caminho 2: 1–2V–3V–4–9–2F–8–10
Entrada: [-1]
Resultado esperado: 2

Caminho 3: 1–2V–3F–5V–6–9–2F–8–10
Entrada: [40]
Resultado esperado: 1

Caminho 4: 1–2V–3F–5F–7–9–2F–8–10
Entrada: [20]
Resultado esperado: 0


## 5 - Questões
1. Um vetor com várias temperaturas percorre um único caminho? Não. Ele pode repetir o trecho do laço e escolher caminhos diferentes para cada temperatura.

2.Qual entrada sai sem acessar o vetor? O vetor vazio, []. A condição do while já é falsa.

3.O que os valores 0 e 35 testam? Testam as fronteiras. O valor 0 não é negativo e o valor 35 não é maior que 35; ambos seguem para o caso sem alerta.

4.Por que o else if é outra decisão? Porque, quando a primeira condição é falsa, o programa ainda precisa decidir se a temperatura é maior que 35.

5.Por que o retorno do laço aparece no CFG? Porque, depois que i deixa de ser menor que o tamanho do vetor, o fluxo sai do laço e retorna alertas.



