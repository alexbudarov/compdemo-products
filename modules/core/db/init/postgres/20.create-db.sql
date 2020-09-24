-- begin PRODS_PRODUCT
alter table PRODS_PRODUCT add constraint FK_PRODS_PRODUCT_ON_CATEGORY foreign key (CATEGORY_ID) references PRODS_PRODUCT_CATEGORY(ID)^
create unique index IDX_PRODS_PRODUCT_UK_NAME on PRODS_PRODUCT (NAME) where DELETE_TS is null ^
create index IDX_PRODS_PRODUCT_ON_CATEGORY on PRODS_PRODUCT (CATEGORY_ID)^
-- end PRODS_PRODUCT