create table if not exists lineage_graph_systems(
data_lineage_id bigint not null,
cost_centre_code bigint null,
source_system varchar(255) null,
counter_party_name varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint lineage_graph_systems_pk primary key(data_lineage_id));