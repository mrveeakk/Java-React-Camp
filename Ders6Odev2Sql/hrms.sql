-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."user"
(
    id integer NOT NULL,
    email character varying(50) NOT NULL,
    password character varying(12) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employees
(
    employeeid integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    PRIMARY KEY (employeeid)
);

CREATE TABLE public.employers
(
    employersid integer NOT NULL,
    company_name character varying(50) NOT NULL,
    web_site character varying(50) NOT NULL,
    phone_number character varying(12) NOT NULL,
    PRIMARY KEY (employersid)
);

CREATE TABLE public.candidates
(
    id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    national_id character varying(11) NOT NULL,
    birth_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.jobs_position
(
    id integer NOT NULL,
    position_name character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.activation_code
(
    id integer NOT NULL,
    activation_code text NOT NULL,
    is_confirmed boolean NOT NULL,
    confirm_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.activation_code_candidates
(
    activation_code_id integer NOT NULL,
    candidates_id integer NOT NULL
);

CREATE TABLE public.activation_code_employers
(
    activation_code_id integer NOT NULL,
    employers_employersid integer NOT NULL
);

CREATE TABLE public.activation_code_employees
(
    activation_code_id integer NOT NULL,
    employees_employeeid integer NOT NULL
);

ALTER TABLE public.employees
    ADD FOREIGN KEY (employeeid)
    REFERENCES public."user" (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (employersid)
    REFERENCES public."user" (id)
    NOT VALID;


ALTER TABLE public.candidates
    ADD FOREIGN KEY (id)
    REFERENCES public."user" (id)
    NOT VALID;


ALTER TABLE public.activation_code_candidates
    ADD FOREIGN KEY (activation_code_id)
    REFERENCES public.activation_code (id)
    NOT VALID;


ALTER TABLE public.activation_code_candidates
    ADD FOREIGN KEY (candidates_id)
    REFERENCES public.candidates (id)
    NOT VALID;


ALTER TABLE public.activation_code_employers
    ADD FOREIGN KEY (activation_code_id)
    REFERENCES public.activation_code (id)
    NOT VALID;


ALTER TABLE public.activation_code_employers
    ADD FOREIGN KEY (employers_employersid)
    REFERENCES public.employers (employersid)
    NOT VALID;


ALTER TABLE public.activation_code_employees
    ADD FOREIGN KEY (activation_code_id)
    REFERENCES public.activation_code (id)
    NOT VALID;


ALTER TABLE public.activation_code_employees
    ADD FOREIGN KEY (employees_employeeid)
    REFERENCES public.employees (employeeid)
    NOT VALID;

END;