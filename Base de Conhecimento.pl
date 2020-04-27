/*
	Autor: Grupo III
	Data: 02/11/2019
	Hora: 06:35 PM
	Objectivo: Base de Conhecimento para processamento da DCGs.
*/

/*-----------------------------------------------------------------------
Metodo que estabelece a certeza de todos os factos estarem num mesmo arquivo
-----------------------------------------------------------------------*/
:- discontiguous classe/2.
:- discontiguous artigo/3.
:- discontiguous substantivo/3.
:- discontiguous verbo/3.
:- discontiguous pergunta/3.


/*-----------------------------------------------------------------------
					Nos nao terminais / Estados nao Terminais
-----------------------------------------------------------------------*/
frase(frase(S,P)) --> sujeito(S), predicado(P).
sujeito(sujeito(A,S)) --> artigo(A), substantivo(S).
predicado(predicado(V,A,S)) --> verbo(V), artigo(A), substantivo(S).
/*-----------------------------------------------------------------------
					Classes Gramatical [Artigo, Substantivo, Verbo]
-----------------------------------------------------------------------*/
classe --> [artigo].
classe --> [substantivo].
classe --> [verbo].
/*-----------------------------------------------------------------------
					nos terminais / Estados Terminais
-----------------------------------------------------------------------*/
substantivo(substantivo(gato)) --> [gato].
substantivo(substantivo(rato)) --> [rato].
artigo(artigo(o)) --> [o].
verbo(verbo(ca�ou)) --> [ca�ou].
pergunta('f�bio') -->['de quem a jurema gosta?'].
pergunta('jurema') -->['de quem o f�bio gosta?'].
substantivo(substantivo(ana)) --> [ana].
verbo(verbo(come)) --> [come].
substantivo(substantivo(feij�o)) --> [feij�o].
substantivo(substantivo(julio)) --> [julio].
verbo(verbo(ama)) --> [ama].
substantivo(substantivo(luanda)) --> [luanda].
pergunta('f�bio') --> ['de quem a emma gosta?'].
artigo(artigo(a)) --> [a].
substantivo(substantivo(emma)) --> [emma].
artigo(artigo(�)) --> [�].
substantivo(substantivo(linda)) --> [linda].
artigo(artigo(os)) --> [os].
substantivo(substantivo(somos)) --> [somos].
artigo(artigo(uma)) --> [uma].
artigo(artigo(s�)) --> [s�].
substantivo(substantivo(na��o)) --> [na��o].
pergunta('sim') --> ['sou americano?'].
pergunta('sim') --> ['voc� gosta de assistir anime?'].
pergunta('messi') --> ['quem � o melhor jogador do mundo?'].
substantivo(substantivo(familia)) --> [familia].
pergunta('cientista f�sico') --> ['quem foi albert einstein?'].
substantivo(substantivo(�gua)) --> [�gua].
substantivo(substantivo(eu)) --> [eu].
verbo(verbo(gosto)) --> [gosto].
artigo(artigo(do)) --> [do].
artigo(artigo(meu)) --> [meu].
substantivo(substantivo(pai)) --> [pai].
artigo(artigo(as)) --> [as].
artigo(artigo(um)) --> [um].
artigo(artigo(ao)) --> [ao].
substantivo(substantivo(mardoqueu)) --> [mardoqueu].
substantivo(substantivo(solander)) --> [solander].
substantivo(substantivo(agostinho)) --> [agostinho].
substantivo(substantivo(felix)) --> [felix].
substantivo(substantivo(julho)) --> [julho].
substantivo(substantivo(marisa)) --> [marisa].
substantivo(substantivo(adi)) --> [adi].
substantivo(substantivo(vemba)) --> [vemba].
substantivo(substantivo(imperador)) --> [imperador].
substantivo(substantivo(emanuel)) --> [emanuel].
substantivo(substantivo(moura)) --> [moura].
substantivo(substantivo(patricia)) --> [patricia].
substantivo(substantivo(kissongo)) --> [kissongo].
substantivo(substantivo(chefe)) --> [chefe].
substantivo(substantivo(f�bio)) --> [f�bio].
substantivo(substantivo(jo�o)) --> [jo�o].
substantivo(substantivo(miguel)) --> [miguel].
substantivo(substantivo(pina)) --> [pina].
substantivo(substantivo(leo)) --> [leo].
substantivo(substantivo(francisco)) --> [gilberto].
substantivo(substantivo(eduardo)) --> [eduardo].
substantivo(substantivo(fernando)) --> [fernando].
substantivo(substantivo(carlos)) --> [carlos].
substantivo(substantivo(analtina)) --> [analtina].
substantivo(substantivo(lise)) --> [lise].
substantivo(substantivo(nathan)) --> [nathan].
substantivo(substantivo(lucas)) --> [lucas].
substantivo(substantivo(mira)) --> [mira].
substantivo(substantivo(david)) --> [david].
substantivo(substantivo(alice)) --> [alice].
substantivo(substantivo(anael)) --> [anael].

substantivo(substantivo(angola)) --> [angola].
verbo(verbo(amo)) --> [amo].
substantivo(substantivo(rap)) --> [rap].
verbo(verbo(bebo)) --> [bebo].
substantivo(substantivo(pessoa)) --> [pessoa].
pergunta('um ser') --> ['o que e uma pessoa?'].
verbo(verbo(rir)) --> [rir].
substantivo(substantivo(deus)) --> [deus].
substantivo(substantivo(bom)) --> [bom].
substantivo(substantivo(belo)) --> [belo].
substantivo(substantivo(inteligente)) --> [inteligente].
pergunta('messi') --> ['quem � o melhor jogador do universo?'].
