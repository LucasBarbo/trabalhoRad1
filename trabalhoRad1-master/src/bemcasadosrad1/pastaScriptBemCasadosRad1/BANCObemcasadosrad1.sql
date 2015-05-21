
CREATE TABLE public.Produto (
                idProduto INTEGER NOT NULL,
                descricao VARCHAR NOT NULL,
                valor VARCHAR NOT NULL,
                CONSTRAINT produto_pk PRIMARY KEY (idProduto)
);


CREATE TABLE public.TipoEvendo (
                idTipoEvento INTEGER NOT NULL,
                descricao VARCHAR NOT NULL,
                CONSTRAINT tipoevendo_pk PRIMARY KEY (idTipoEvento)
);


CREATE TABLE public.Cliente (
                idCliente INTEGER NOT NULL,
                nome VARCHAR NOT NULL,
                telefone VARCHAR NOT NULL,
                email VARCHAR NOT NULL,
                CONSTRAINT cliente_pk PRIMARY KEY (idCliente)
);


CREATE TABLE public.Pedido (
                id INTEGER NOT NULL,
                origemPedido VARCHAR NOT NULL,
                dataPedido DATE NOT NULL,
                cerimonial VARCHAR NOT NULL,
                dataEvento DATE NOT NULL,
                horaEvento VARCHAR NOT NULL,
                indicacao VARCHAR NOT NULL,
                endereco VARCHAR NOT NULL,
                observacao VARCHAR NOT NULL,
                localEvento VARCHAR NOT NULL,
                idTipoEvento INTEGER NOT NULL,
                idCliente INTEGER NOT NULL,
                CONSTRAINT pedido_pk PRIMARY KEY (id)
);


CREATE TABLE public.ItemPedido (
                idItemPedido INTEGER NOT NULL,
                idProduto INTEGER NOT NULL,
                quantidade INTEGER NOT NULL,
                valor DOUBLE PRECISION NOT NULL,
                id INTEGER NOT NULL,
                CONSTRAINT itempedido_pk PRIMARY KEY (idItemPedido)
);


ALTER TABLE public.ItemPedido ADD CONSTRAINT produto_itempedido_fk
FOREIGN KEY (idProduto)
REFERENCES public.Produto (idProduto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Pedido ADD CONSTRAINT tipoevendo_pedido_fk
FOREIGN KEY (idTipoEvento)
REFERENCES public.TipoEvendo (idTipoEvento)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Pedido ADD CONSTRAINT cliente_pedido_fk
FOREIGN KEY (idCliente)
REFERENCES public.Cliente (idCliente)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ItemPedido ADD CONSTRAINT pedido_itempedido_fk
FOREIGN KEY (id)
REFERENCES public.Pedido (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

