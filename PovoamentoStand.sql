INSERT INTO componente
	(Nome,Stock,Tipo,Preco,Descricao)
	VALUES
		('Jantes Liga Leve',832,'Jante',434.32,'Rodam bem'),
        ('Jantes Liga Pesada',454,'Jante',434.32,'Rodam bem pesadamente'),
        ('Jantes Liga Media',232,'Jante',434.32,'Rodam bem as vezes'),
	    
        ('Motor 4 CILINDROS TURBO',324,'Motor',4356.32,'Puxa bem'),
        ('Motor 8 CILINDROS TURBO PLUS',34,'Motor',12344.32,'Puxa que nem é bom'),
        ('Motor 16 CILINDROS TRUBO PLUS PLUS',23,'Motor',43234.32,'Já alguma vez foste à lua?'),
		
        ('Pneu 2mm rasga',4354,'Pneu',27.32,'Qualidade michelona'),
        ('Pneu 40cm rasga estrada',3424,'Pneu',98.32,'Qualidade burnout'),
        ('Pneu 3m Via Verde',2343,'Pneu',342.32,'Parar para quê?'),
		
        ('Tinta Metalica',4343,'Pintura',83.32,'Pintura manual'),
        ('Tinta Gloss',4343,'Pintura',98.32,'Pintura automatica'),
        ('Tinta Pearl',3234,'Pintura',170.32,'Pintura a jato'),
	   
        ('Suporte para copos',34,'Interior',98.32,'Bêba sem parar!'),
        ('Bancos',2343,'Interior',342.32,'Sente-se no seu Trono!'),
        
		('Retrovisor',965,'Exterior',96.32,'veja 20km para traz de si.'),
        ('Spoiler',1746,'Exterior',174.32,'Corta tempestades');

INSERT INTO Modelo
	(nome)
	VALUES    
    ('Audi'),
    ('Mercedez'),
    ('Ford');
    
INSERT INTO configuracao
	(idConfiguracao,nome, nContribuinte, Modelo, Data)
	VALUES
		(1,'Toze',143432343,'Audi','22/12/2012'),
        (2,'Quim',343234323,'Mercedez','22/03/2017'),
        (3,'Jorge',343234545,'Audi','03/05/2015'),
        (4,'pedro',359659685,'Ford','23/07/2013');
        
INSERT INTO configuracao_has_componentes
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
		(2,'Suporte para copos'),
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
        
INSERT INTO pacote
	(Nome, Configuracao_idConfiguracao)
	VALUES
    ('Sport',1),
    ('Confort',2),
    ('Sport+',3),
    ('Turbo',4);
    
    
Select comp From Pacote as p 
inner join configuracao as c on p.Configuracao_idConfiguracao = c.idConfiguracao 
inner join configuracao_has_componentes as cc on cc.Configuracao_idConfiguracao = c.idConfiguracao 
inner join Componente as comp on cc.Componentes_Nome = comp.Nome
where p.Nome = 'Sport' ;

SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao From
configuracao_has_componentes as cc inner join Componente as comp on cc.Componentes_Nome = comp.Nome 
where cc.Configuracao_idConfiguracao = '1';

SELECT * FROM componente WHERE Tipo = 'Motor';

SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao From
 configuracao_has_componentes as cc inner join Componente as comp on cc.Componentes_Nome = comp.Nome 
 WHERE cc.Configuracao_idConfiguracao = 1;
        