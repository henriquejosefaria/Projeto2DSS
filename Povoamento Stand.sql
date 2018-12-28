INSERT INTO componente
	(Nome,Stock,Tipo,Preço,Descricao)
	VALUES
		('Jantes Liga Leve',832,'Obrigatorio',434.32,'Rodam bem'),
        ('Jantes Liga Pesada',454,'Obrigatorio',434.32,434.32,'Rodam bem pesadamente'),
        ('Jantes Liga Media',232,'Obrigatorio',434.32,434.32,'Rodam bem as vezes'),
	    
        ('Motor 4 CILINDROS TURBO',324,'Obrigatorio',4356.32,'Puxa bem'),
        ('Motor 8 CILINDROS TURBO PLUS',34,'Obrigatorio',12344.32,'Puxa que nem é bom'),
        ('Motor 16 CILINDROS TRUBO PLUS PLUS',23,'Obrigatorio',43234.32,434.32,'Já alguma vez foste à lua?'),
		
        ('Pneu 2mm rasga',4354,'Obrigatorio',27.32,'Qualidade michelona'),
        ('Pneu 40cm rasga estrada',3424,'Obrigatorio',98.32,'Qualidade burnout'),
        ('Pneu 3m Via Verde',2343,'Obrigatorio',342.32,434.32,'Parar para quê?'),
		
        ('Tinta Metalica',4343,'Obrigatorio',83.32,'Pintura manual'),
        ('Tinta Gloss',4343,'Obrigatorio',98.32,'Pintura automatica'),
        ('Tinta Pearl',3234,'Obrigatorio',170.32,434.32,'Pintura a jato'),
	   
        ('Suporte para copos',34,'Interior',98.32,'Qualidade burnout'),
        ('Bancos',2343,'Interior',342.32,434.32,'Parar para quê?'),
        
		('Retrovisor',965,'Exterior',96.32,'veja 20km para traz de si.'),
        ('Spoiler',1746,'Obrigatorio',174.32,'Corta tempestades');
        
INSERT INTO configuracao
	(idConfiguracao, NomeCliente, Modelo, Data)
	VALUES
		(1,832,'Toze','Audi','22/12/2012'),
        (2,454,'Quim','Mercedez','22/03/2017'),
        (3,232,'Jorge','Audi','03/05/2015'),
        (4,232,'pedro','Ford','23/07/2013');
        
INSERT INTO configuracao_has_componente
	(Configuracao_idConfiguracao, Componentes_Nome)
	VALUES
		(1,'Jantes Liga Leve'),
        (1,'Motor 4 CILINDROS TURBO'),
        (1,'Pneu 2mm rasga'),
        (1,'Tinta Metalica'),
		(1,'Suporte para copos'),
        (1,'Retrovisor'),
        
		(2,'Jantes Liga Media'),
        (2,'Motor 4 CILINDROS TURBO'),
        (2,'Pneu 40cm rasga estrada'),
        (2,'Tinta Pearl'),
		(2,'Suporte para copus'),
        (2,'Spoiler'),
        
		(3,'Jantes Liga Media'),
        (3,'Motor 16 CILINDROS TRUBO PLUS PLUS'),
        (3,'Pneu 3m Via Verde'),
        (3,'Tinta Gloss'),
		(3,'Bancos'),
        (3,'Retrovisor'),
        
		(4,'Jantes Liga Media'),
        (4,'Motor 8 CILINDROS TURBO PLUS'),
        (4,'Pneu 2mm rasga'),
        (4,'Tinta Metalica'),
		(4,'Suporte para copos'),
        (4,'Retrovisor');
        
        