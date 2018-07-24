FROM registry.saas.hand-china.com/tools/mysql:5.6  

ADD  sakila-data.sql sakila-data.sql 

ADD sakila-schema.sql sakila-schema.sql

COPY  setup.sh   /docker-entrypoint-initdb.d/

RUN chmod a+x /docker-entrypoint-initdb.d/setup.sh
