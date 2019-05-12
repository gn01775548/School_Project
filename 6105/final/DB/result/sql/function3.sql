CREATE DEFINER=`root`@`localhost` FUNCTION `Max_depth_Bigger_Than_Enter_In_XGBoost_Model`(EnteredNum int) RETURNS varchar(50) CHARSET utf8
BEGIN
 DECLARE b BIGINT;
 SELECT count(max_depth) INTO b FROM XGBoost_Model
 WHERE max_depth > EnteredNum;
 
RETURN (b);
END