CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `finall`.`case2` AS
    SELECT 
        `mm`.`ID` AS `ID`,
        `mm`.`Model_name` AS `Model_name`,
        `dl`.`standardize` AS `standardize`
    FROM
        (`finall`.`model_metadata` `mm`
        JOIN `finall`.`glm_model` `dl` ON ((`mm`.`ID` = `dl`.`Model_id`)))
    ORDER BY `mm`.`Model_name` , `mm`.`Run_time` DESC