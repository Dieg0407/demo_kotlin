FROM postgres

ENV POSTGRES_USER = postgres
ENV POSTGRES_PASSWORD = 1234

WORKDIR /data
COPY dvdrental.tar /data/rental.tar

EXPOSE 5432

RUN service postgresql start

RUN pg_restore --dbname=dvdrental --username=postgres --no-password --verbose /data/rental.tar

