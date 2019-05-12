CREATE DEFINER=`root`@`localhost` FUNCTION `get_Deep_learning_model_Epochs`(id int) RETURNS varchar(500) CHARSET utf8
BEGIN
  DECLARE a varchar(500);
 -- DECLARE b BIGINT;
 SELECT epochs INTO a FROM Deep_learning_model 
 WHERE ID = id limit 1;
 
RETURN (a);
END