# Relatório
# 1. Objetivo

O objetivo da atividade foi criar e testar uma funcionalidade para calcular o valor de uma locação de veículos, utilizando JUnit 5. Foram considerados diferentes cenários, como descontos, seguro, quilometragem, idade do motorista e entradas inválidas.

# 2. Entendimento do problema

Primeiro, analisei as regras do sistema para entender como o valor da locação deveria ser calculado.

As principais regras consideradas foram:

O valor das diárias é calculado pela quantidade de dias × valor da diária.
A franquia é de 100 km por dia.
Cada quilômetro que ultrapassar a franquia custa R$ 0,50.
O seguro custa R$ 35 por dia.
De 7 a 14 dias existe desconto de 5% sobre as diárias.
Acima de 14 dias, o desconto é de 10% sobre as diárias.
O desconto não é aplicado ao seguro nem à quilometragem excedente.
Motoristas com menos de 21 anos pagam uma taxa adicional de R$ 150.
Alguns valores de entrada são inválidos e devem gerar uma exceção.

Também utilizei o exemplo fornecido na atividade para conferir se o cálculo final estava correto.

# 3. Interação com a Inteligência Artificial

Durante a atividade, utilizei a Inteligência Artificial como apoio para criar os casos de teste e para ajudar na implementação dos testes com JUnit 5.

Primeiro, pedi sugestões de casos de teste com base nas regras do sistema. Depois, analisei os casos sugeridos para verificar se estavam completos, se existiam casos repetidos e se as principais situações estavam sendo testadas.

# 4. Alteração dos casos de teste

A primeira sugestão de casos de teste tinha algumas situações repetidas e não explorava tanto os limites das regras.

Por isso, reorganizei os testes e cheguei a 18 casos de teste, buscando testar melhor as regras do sistema.

Incluí casos de fronteira, como:

6 e 7 dias;
14 e 15 dias;
20 e 21 anos;
299, 300 e 301 km.

Também foram incluídos casos de entradas inválidas, como dias iguais a zero, dias negativos, diária igual a zero, idade igual a 17 anos e quilometragem negativa.

A mudança foi feita para que os testes fossem mais completos e verificassem não apenas situações comuns, mas também os limites das regras.

# 5. Cobertura dos testes

Após executar os testes, foi utilizada a opção Run with Coverage do IntelliJ IDEA para verificar a cobertura do código.

Foram analisados os seguintes resultados:

Statement Coverage: 100%
Branch Coverage: 100%
Condition Coverage: 100%

A cobertura foi utilizada para verificar quais partes do código foram executadas pelos testes e se havia algum trecho que ainda precisava ser melhor testado.
