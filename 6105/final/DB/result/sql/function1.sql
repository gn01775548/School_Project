CREATE DEFINER=`root`@`localhost` FUNCTION `Type_Max_Get_Max_MAE_In_Metrices_Model`(Enter VARCHAR(50)) RETURNS varchar(500) CHARSET utf8
BEGIN

  DECLARE namemodel VARCHAR(500);

  SELECT max(MAE) INTO namemodel FROM Metrices_Model
  where Enter = "max";

  RETURN namemodel;
END