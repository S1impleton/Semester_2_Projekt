USE [dmab0916_202650]

while(exists(select 1 from INFORMATION_SCHEMA.TABLE_CONSTRAINTS where CONSTRAINT_TYPE='FOREIGN KEY'))
begin
	declare @sql nvarchar(2000)
	SELECT TOP 1 @sql=('ALTER TABLE ' + TABLE_SCHEMA + '.[' + TABLE_NAME
	+ '] DROP CONSTRAINT [' + CONSTRAINT_NAME + ']')
	FROM information_schema.table_constraints
	WHERE CONSTRAINT_TYPE = 'FOREIGN KEY'
	exec (@sql)
end

DROP TABLE [dbo].[ZipCity]
DROP TABLE [dbo].[Password]
DROP TABLE [dbo].[SupplyOrderLine]
DROP TABLE [dbo].[SupplyOrder]
DROP TABLE [dbo].[Supplier]
DROP TABLE [dbo].[Property]
DROP TABLE [dbo].[ProductType]
DROP TABLE [dbo].[ProductPrice]
DROP TABLE [dbo].[Product]
DROP TABLE [dbo].[Phone]
DROP TABLE [dbo].[Person]
DROP TABLE [dbo].[PartOfProduct]
DROP TABLE [dbo].[OrderType]
DROP TABLE [dbo].[SalesOrder]
DROP TABLE [dbo].[SalesOrderLine]
DROP TABLE [dbo].[OrderCondition]
DROP TABLE [dbo].[OfferType]
DROP TABLE [dbo].[Employee]
DROP TABLE [dbo].[DeliveredType]
DROP TABLE [dbo].[Customer]
