CREATE TABLE IF NOT EXISTS public.subscriber
(
    id_mensalista integer NOT NULL DEFAULT nextval('subscribers_id_mensalista_seq'::regclass),
    str_name character varying(300) COLLATE pg_catalog."default" NOT NULL,
    str_carmodel character varying(300) COLLATE pg_catalog."default",
    str_initdate character varying(20) COLLATE pg_catalog."default",
    str_enddate character varying(20) COLLATE pg_catalog."default",
    str_license character varying(20) COLLATE pg_catalog."default",
    str_weekdays character varying(500) COLLATE pg_catalog."default",
    bool_ismensalist boolean,
    bool_ismotorbike boolean,
    str_contact character varying COLLATE pg_catalog."default",
    CONSTRAINT subscribers_pkey PRIMARY KEY (id_mensalista)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.subscriber
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.veicule
(
    id_veiculo integer NOT NULL DEFAULT nextval('veicule_id_veiculo_seq'::regclass),
    str_license character varying COLLATE pg_catalog."default",
    str_timein character varying COLLATE pg_catalog."default",
    str_timeout character varying COLLATE pg_catalog."default",
    bool_issubscriber boolean,
    bool_haskey boolean,
    bool_ismotorbike boolean,
    str_date character varying COLLATE pg_catalog."default",
    CONSTRAINT veicule_pkey PRIMARY KEY (id_veiculo)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.veicule
    OWNER to postgres;


    
        