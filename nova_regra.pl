novo_facto(Regra) :-
	open('Base de Conhecimento.pl', append, Stream),
	write(Stream, Regra), nl(Stream),
	close(Stream).










