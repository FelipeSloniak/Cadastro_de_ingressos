# Cadastro_de_ingressos
Código avaliado no curso de ADS sobre cadastro de ingressos de um evento

Regras:

- Armazenar dados de Evento: evento deverá ter como atributos, nome, data, valor único, capacidade máxima e uma lista de ingressos vendidos essas informações são obrigatórias.
- Armazenar dados de Ingresso: todo ingresso deverá ser nominal, portanto deverá ter o nome, CPF e o evento relacionado
- Devem existir 3 categorias de ingresso, Ingresso Pista, Ingresso VIP e Ingresso Camarote
- Nas classes de Ingressos, devem existir um método de calcular valor do ingresso, onde Pista é o valor único do evento, no VIP deve-se adicionar 30% sobre o valor único do evento e no Camarote adicionar 60%
- Para ingresso é preciso também um método mostrar resumo, onde mostrará o nome e o CPF do dono do ingresso e os dados do evento, como nome do evento e a data.
- Para cada tipo de ingresso, crie um método imprimirValor que retorna o tipo do ingresso com o valor calculado.
- Para evento deve existir um método vender ingresso, no qual irá adicionar o ingresso criado na lista, verificando se não excede a capacidade máxima do evento
- Para evento deve existir também um método pra mostrar a quantidade de ingressos vendidos.
