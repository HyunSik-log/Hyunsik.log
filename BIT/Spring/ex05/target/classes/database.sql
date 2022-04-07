create table tbl_attach ( 
  uuid varchar2(100) not null,
  uploadPath varchar2(200) not null,
  fileName varchar2(100) not null, 
  filetype char(1) default 'I',
  bno number(10,0)
);

alter table tbl_attach add constraint pk_attach primary key (uuid); 

alter table tbl_attach add constraint fk_board_attach foreign key (bno) references tbl_board(bno);


select * from tbl_board;
select * from tbl_attach;

alter table tbl_board add (replycnt number default 0);

update tbl_board set replycnt = (select count(rno) from tbl_reply where tbl_reply.bno = tbl_board.bno);