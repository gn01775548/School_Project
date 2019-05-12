CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `finall`.`case4` AS
    SELECT 
        AVG(`mm`.`RMSE`) AS `GLM_AVERAGE_rmse`
    FROM
        `finall`.`metrices_model` `mm`
    WHERE
        (`mm`.`Model_id` LIKE 'DRF%')