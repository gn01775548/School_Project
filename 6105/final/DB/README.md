# Hyperparameter Project

### Abstract
Hyperparameters are parameters that are specified prior to running machine learning algorithms that have a large effect on the predictive power of statistical models parameter of a prior distribution, the term which used to distinguish them from parameters of the model for the underlying system under analysis. Knowledge of the relative importance of a hyperparameter to an algorithm and its range of values is crucial to hyperparameter tuning and creating effective models.
The hyperparameter database allows users to visualize and understand how to choose hyperparameters that maximize the predictive power of their models. The hyperparameter database is created by running millions of hyperparameter values, calculating the individual conditional expectation of every hyperparameter on the quality of a model. The data science part need to generating models using H2O to find best hyperparameters.


### Background
The data we collected and stored concerns predicting housing transaction price which contains values of  cities, floors, unit area households counts and parking capacity, rooms, heat fuel, heat type and front door structure. We separated and grouped data into different entities and attributes and build the one-to-many connections between them, which presented the data in more structured and organized way and allows us to query data, sort data, and manipulate data in various ways for the future performance.

### Dataset
The dataset is from the website https://www.kaggle.com/econdata/predciting-price-transaction#trainPrice.csv . Housing price always been a popular item that people expect to predict. Since it is critical for us to find out the factors that affecting transaction price. This data set covers different aspects of factors which influence the housing price, which requires the scientific and specific method to calculate the best result. 

### ERD
![ERD](https://github.com/INFO6105-Spring19/hyperparameter-db-project-ds07/blob/master/DB/report/images/NERD.png)


### Physical Model
![PM](https://github.com/INFO6105-Spring19/hyperparameter-db-project-ds07/blob/master/DB/report/images/PM.png)

### Analytics ＆ Conclusions 
By storing Hyperparameters data set in the database enables us obtain the structural and organized data to call the different functions for analyzing and select the best model for prediction, which make it more visualized to check and use the data and achieve different utilization. By creating the use cases, functions and views, we can select single or combined date set, get the best model, calculate the average or the max data for improving the different performance. 

### Contributions 
- Hsiang-Hua Chen : 20% from the website, 80% created by myself
- Yuan Chai : 25% from the website, 75% created by myself

### Citations
-  https://www.visual-paradigm.com/guide/data-modeling/what-is-entity-relationship-diagram/
-  https://en.wikipedia.org/wiki/Hyperparameter_(machine_learning)
-  https://towardsdatascience.com/what-are-hyperparameters-and-how-to-tune-the-hyperparameters-in-a-deep-neural-network-d0604917584a
-  https://towardsdatascience.com/hyperparameters-in-deep-learning-927f7b2084dd
-  https://www.w3schools.com/sql/sql_create_index.asp
-  https://docs.microsoft.com/en-us/sql/t-sql/statements/create-function-transact-sql?view=sql-server-2017
-  https://www.w3schools.com/sql/sql_view.asp

### License
Copyright (c) 2019 Hsiang-Hua Chen, Yuan Chai <br>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:<br>

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.<br>

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

