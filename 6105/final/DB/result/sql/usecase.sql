#1. ------找到最好的model
SELECT me.Model_id, me.RMSE, mm.Model_name, mm.Run_time
FROM Metrices_Model me inner join Model_Metadata mm
ON me.Model_id  = mm.ID
order by RMSE desc 
LIMIT 1
;

# 2. ------同一個model， 不同runtime 的hyper parameter
SELECT mm.ID, mm.Model_name, mm.Run_time, 
me.RMSE,
dl. hidden1, hidden2,hidden3,epochs
FROM Model_Metadata mm left join Deep_learning_model dl
ON mm.ID = dl.model_id
JOIN Metrices_Model me 
ON  dl.model_id = me.Model_id
WHERE mm.ID LIKE "DL%" 
ORDER BY mm.Model_name, me.RMSE, mm.Run_time desc
;

#3. ------同一個 類型 model的average rmse
SELECT avg(mm.RMSE) as GLM_AVERAGE_rmse
FROM Metrices_Model mm 
WHERE mm.Model_id LIKE "G%" 
;

# 4. ------高於同一個xg的 avg  rmse 的模型name和runtime
SELECT metr.ID, metr.Model_id,mm.Model_name, mm.Run_time, metr.RMSE
FROM Metrices_Model metr INNER JOIN Model_Metadata mm
ON metr.Model_id = mm.ID
WHERE metr.Model_id LIKE "XG%"  
HAVING metr.RMSE > (
SELECT avg(metr.RMSE) 
FROM Metrices_Model metr 
WHERE metr.Model_id LIKE "XG%" 
)
ORDER BY metr.RMSE DESC;

#5. ---- 2000 秒的model 有幾個
SELECT COUNT(*)
FROM Model_Metadata mm
WHERE mm.Run_time = 2000
order BY mm.Run_time
;


# 6. ---- dl 模型的top 10 rmse
SELECT metr.ID, metr.Model_id,mm.Model_name, mm.Run_time, metr.RMSE
FROM Metrices_Model metr INNER JOIN Model_Metadata mm
ON metr.Model_id = mm.ID
WHERE metr.Model_id LIKE "XRT%"
ORDER BY metr.RMSE
LIMIT 10;

#7. ------Whats the range of the learning rate of all the model in the database,

SELECT 
MIN(gm.ntrees) AS min_ntrees,  
MAX(gm.ntrees) AS max_ntrees,
MIN(gm.max_depth) AS min_max_depth,  
MAX(gm.max_depth) AS max_max_depth
FROM GBM_Model gm;


#8 ------ city variable > 0.08 的
SELECT *
FROM percentage pp
having pp.city > 0.08
order by pp.city desc;

# 9 -------- To find all the runtime of a Dataset
SELECT distinct mm.Run_time
from Model_Metadata mm
order by mm.Run_time;


# 10 ---------  有那幾種model type， 每一個model type 的數量和最佳 rmse
SELECT mo.TYPE AS MODEL_TYPE, COUNT(*) AS AMOUNT, MAX(me.RMSE) AS BEST_RMSE
FROM Model_Metadata mm,  Model mo, Metrices_Model me
WHERE mm.Model_name = mo.Model_name AND  mm.ID = me.Model_id
GROUP BY mo.type
ORDER BY max(me.RMSE) desc 
;






