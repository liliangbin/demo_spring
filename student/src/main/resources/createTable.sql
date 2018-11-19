
CREATE  TABLE  zing_student(
  sno char(8),
  sname char(10),
  ssex char(2),
  sage smallint,
  major char(20),
  primary key (sno),
  constraint c1 check (ssex in ("男","女")),
  constraint c2 check (sage between 0 and 100)
);
  create table zing_award(
    sno char(8),
    details varchar(20000),
    primary key (sno),
    foreign key (sno) references  zing_student(sno)
  )