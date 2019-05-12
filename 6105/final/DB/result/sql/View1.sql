CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `finall`.`case1` AS
    SELECT 
        COUNT(0) AS `COUNT(*)`
    FROM
        `finall`.`model` `m`
    WHERE
        (`m`.`Type` = 'DL')