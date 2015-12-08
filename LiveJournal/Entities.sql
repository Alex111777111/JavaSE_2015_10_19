create table lj_user
(
    user_id SERIAL,
    user_alias varchar(30) not null,
    user_email varchar(100) not null,
    user_password varchar(30) not null,
    primary key (user_id)
);


create table lj_post
(
    post_id SERIAL,
    user_id integer not null,
    post_title varchar(100) not null,
    post_body varchar(1000) not null,
    post_date timestamp not null,
    primary key(post_id)
);

create table lj_comment
(
    comment_id SERIAL,
    user_id integer not null,
    post_id integer not null,
    target_comment_id integer,
    comment varchar(1000) not null,
    primary key(comment_id)
);
