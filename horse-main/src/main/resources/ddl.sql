create database horse;
use horse;
create table horse_nft(
                          algebra int,
                          `type` int,
                          speed int,
                          lucky int,
                          breeding_times timestamp,
                          owner varchar(300),
                          equipment varchar(300),
                          PRIMARY KEY ( `algebra` )
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table blind_box(
                          algebra int,
                          transaction_hash varchar(300),
                          transaction_time timestamp,
                          buyer varchar(300),
                          price double,
                          sell_round int,
                          PRIMARY KEY ( `algebra` )
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8;