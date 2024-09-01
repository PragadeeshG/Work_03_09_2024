create table if not exists lineage_data_management(
system_code bigint not null,
graph_database varchar(255) null,
graph_schema varchar(255) null,
grpah_query_language varchar(255) null,
resolver varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint lineage_data_management_pk primary key(system_code));