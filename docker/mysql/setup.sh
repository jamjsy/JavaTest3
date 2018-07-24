#!/bin/bash
mysql -uroot -proot  <<EOF
source /sakila-schema.sql;
source /sakila-data.sql ;