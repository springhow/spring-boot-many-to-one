insert into branch (id, branch_name, branch_code)
values (1, 'South West branch', '6000000021');
insert into account (id, account_number, branch_id, full_name, balance)
values (1, '1231231231', 1, 'John1 Doe1', 100.23),
       (2, '1231231232', 1, 'John2 Doe2', 201.76),
       (3, '1231231233', 1, 'John3 Doe3', 403200.00),
       (4, '1231231234', 1, 'John4 Doe4', 10120.44),
       (5, '1231231235', 1, 'John5 Doe5', 43540.13);