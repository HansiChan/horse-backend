create database horse;
use horse;
create table horse_nft
(
    algebra        int,
    `type`         int,
    speed          int,
    lucky          int,
    breeding_times bigint,
    owner          varchar(300),
    equipment      varchar(300),
    PRIMARY KEY (`algebra`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

create table blind_box
(
    algebra          int,
    transaction_hash varchar(300),
    transaction_time bigint,
    buyer            varchar(300),
    price            double,
    sell_round       int,
    PRIMARY KEY (`algebra`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

set @@explicit_defaults_for_bigint = 1;
create table blind_box_round
(
    id             INT UNSIGNED AUTO_INCREMENT,
    name           varchar(300),
    amount         int,
    limit_per_user int,
    price          double,
    currency       varchar(300),
    start_time     bigint,
    end_time       bigint,
    legendary_rate varchar(300),
    epic_rate      varchar(300),
    rare_rate      varchar(300),
    normal_rate    varchar(300),
    primary key (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;