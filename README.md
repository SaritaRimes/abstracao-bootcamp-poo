## Abstraindo um Bootcamp com Orientação a Objeto

Esse projeto consiste na abstração de um Bootcamp utilizando conceitos importantes de Programação Orientada a Objetos.

### :flashlight: Classes existentes

:small_blue_diamond: **Conteudo**: classe responsável por armazenar nome e descrição dos conteúdos do Bootcamp, além de um XP padrão que é utilizado para avaliar a evolução do aluno. Serve como classe mãe para todos os conteúdos que forem acrescentados.

:small_blue_diamond: **Curso**: classe filha de Conteudo, que contém a carga horária específica de cada curso.

:small_blue_diamond: **Mentoria**: classe filha de Conteudo, que contem a data da mentoria que será realizada.

:small_blue_diamond: **Bootcamp**: classe que contém todas as informações sobre o Bootcamp, inclusive conteúdos e alunos inscritos.

:small_blue_diamond: **Dev**: classe responsável por armazenar as informações sobre o aluno em si. Contém métodos que realizam a inscrição do aluno em um Bootcamp, salvam sua evolução e calculam seu XP.