create database horse;
use horse;
create table horse_nft(
                          algebra int,
                          `type` int,
                          speed int,
                          lucky int,
                          breeding_times timestamp,
                          owner varchar(40),
                          equipment varchar(40),
                          PRIMARY KEY ( `algebra` )
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table blind_box(
                          algebra int,
                          transaction_hash varchar(40),
                          transaction_time timestamp,
                          buyer varchar(40),
                          price DECIMAL,
                          sell_round int,
                          PRIMARY KEY ( `algebra` )
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8;