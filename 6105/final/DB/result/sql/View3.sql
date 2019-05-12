CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `finall`.`case3` AS
    SELECT 
        `metr`.`ID` AS `ID`,
        `metr`.`Model_id` AS `Model_id`,
        `mm`.`Model_name` AS `Model_name`,
        `mm`.`Run_time` AS `Run_time`,
        `metr`.`MSE` AS `MSE`
    FROM
        (`finall`.`metrices_model` `metr`
        JOIN `finall`.`model_metadata` `mm` ON ((`metr`.`Model_id` = `mm`.`ID`)))
    WHERE
        (`metr`.`Model_id` LIKE 'DL%')
    ORDER BY `metr`.`MSE`
    LIMIT 20