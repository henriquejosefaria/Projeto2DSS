INSERT INTO utilizador
	(idUtilizador,Nome,Password,Tipo)
	VALUES
        (1,'André Peixoto','123','S'),
        (2,'Luis Cunha','123','F'),
		(3,'Admin','123','A');

INSERT INTO componente
	(Nome,Stock,Tipo,preco,Descricao,Imagem)
	VALUES
		('Jantes Liga Leve',832,'Jante',434.32,'Rodam bem','/interfacegrafica/Img/Jantes/Jantes1.jpg'),
        ('Jantes Liga Pesada',454,'Jante',434.32,'Rodam bem pesadamente','/interfacegrafica/Img/Jantes/Jantes2.jpg'),
        ('Jantes Liga Media',232,'Jante',434.32,'Rodam bem as vezes','/interfacegrafica/Img/Jantes/Jantes3.jpg'),
	    
        ('Motor 4 CILINDROS TURBO',324,'Motor',4356.32,'Puxa bem','/interfacegrafica/Img/Motor/motor1.jpg'),
        ('Motor 8 CILINDROS TURBO PLUS',34,'Motor',12344.32,'Puxa que nem é bom','/interfacegrafica/Img/Motor/motor2.jpg'),
        ('Motor 16 CILINDROS TRUBO PLUS PLUS',23,'Motor',43234.32,'Já alguma vez foste à lua?','/interfacegrafica/Img/Motor/motor3.jpg'),
		
        ('Pneu 2mm rasga',4354,'Pneu',27.32,'Qualidade michelona','/interfacegrafica/Img/Pneus/Pneus1.jpg'),
        ('Pneu 40cm rasga estrada',3424,'Pneu',98.32,'Qualidade burnout','/interfacegrafica/Img/Pneus/Pneus2.jpg'),
        ('Pneu 3m Via Verde',2343,'Pneu',342.32,'Parar para quê?','/interfacegrafica/Img/Pneus/Pneus3.png'),
		
        ('Tinta Metalica',4343,'Pintura',83.32,'Pintura manual','/interfacegrafica/Img/Motor/motor3.jpg'),
        ('Tinta Gloss',4343,'Pintura',98.32,'Pintura automatica','/interfacegrafica/Img/Motor/motor3.jpg'),
        ('Tinta Pearl',3234,'Pintura',170.32,'Pintura a jato','/interfacegrafica/Img/Motor/motor3.jpg'),
	   
        ('Suporte para copos',34,'Interior',98.32,'Bêba sem parar!','/interfacegrafica/Img/Interior/SuporteParaCopos.jpg'),
        ('Bancos',2343,'Interior',342.32,'Sente-se no seu Trono!','/interfacegrafica/Img/Interior/Bancos1.png'),
        ('Ar condicionado',2145, 'Interior',132.21,'Aragem fresca','/interfacegrafica/Img/Interior/ArCondicionado1.jpg'),
        
		('Retrovisor',965,'Exterior',96.32,'veja 20km para traz de si.','/interfacegrafica/Img/Exterior/Retrovisor1.jpg'),
        ('Spoiler',1746,'Exterior',174.32,'Corta tempestades','/interfacegrafica/Img/Exterior/Spoiler1.jpg'),
        ('Teto de abrir', 0,'Exterior', 23.45,'Ver o espaço daqui','/interfacegrafica/Img/Exterior/Teto3.jpg'),
        ('LEDs', 152, 'Exterior', 50.23, 'Luzes iluminantes','/interfacegrafica/Img/Exterior/Luzes2.jpg'),
        ('Amortecedor', 12344,'Exterior',213.21,'Para ir com speed nas lombas','/interfacegrafica/Img/Exterior/Amortecedor2.jpg');

INSERT INTO Modelo
	(nome,preco,Img)
	VALUES    

    ('Audi',12000,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
    ('Mercedez',13000,'/interfacegrafica/Img/Modelos/modelo2.jpg'),
    ('Ford',14000,'/interfacegrafica/Img/Modelos/modelo3.jpg');
    
INSERT INTO configuracao
	(idConfiguracao,nome, nContribuinte, Modelo, Data,preco)
	VALUES
		(1,'Toze',143432343,'Audi','22/12/2012',4322),
        (2,'Quim',343234323,'Mercedez','22/03/2017',4323),
        (3,'Jorge',343234545,'Audi','03/05/2015',5343),
        (4,'pedro',359659685,'Ford','23/07/2013',2454);
        
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
	(Nome, Configuracao_idConfiguracao,Imagem)
	VALUES
    ('Sport',1,'/interfacegrafica/Img/Pacotes/comfort.jpg'),
    ('Confort',2,'/interfacegrafica/Img/Pacotes/sport.jpg'),
    ('Sport+',3,'/interfacegrafica/Img/Pacotes/sport+.jpg'),
    ('Turbo',4,'/interfacegrafica/Img/Pacotes/turbo.jpg');

INSERT INTO encomenda
	(idEncomenda,Data,Estado,Configuracao_idConfiguracao,preco,Imagem)
	VALUES
		(1,'20-12-2018 17:40','a fazer',1,5095.92,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
        (2,'15-12-2018 22:05','a fazer',2,5331.92,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
        (3,'30-12-2018 18:37','a fazer',3,44547.92,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
		(4,'10-12-2018 12:20','a fazer',1,5095.92,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
        (5,'12-12-2018 11:45','a fazer',2,5331.92,'/interfacegrafica/Img/Modelos/modelo1.jpg'),
        (6,'17-12-2018 19:27','completo',3,44547.92,'/interfacegrafica/Img/Modelos/modelo1.jpg');
    
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
 
 SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao From configuracao as c 
            inner join configuracao_has_componentes as cc on c.idConfiguracao = cc.Configuracao_idConfiguracao
            inner join Componente as comp on cc.Componentes_Nome = comp.Nome
		WHERE c.nContribuinte = 143432343;
        
