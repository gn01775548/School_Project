# Hyperparameter Project

### Abstract

Hyperparameters are parameters that are specified prior to running machine learning algorithms that have a large effect on the predictive power of statistical models parameter of a prior distribution, the term which used to distinguish them from parameters of the model for the underlying system under analysis. Knowledge of the relative importance of a hyperparameter to an algorithm and its range of values is crucial to hyperparameter tuning and creating effective models.

The hyperparameter database allows users to visualize and understand how to choose hyperparameters that maximize the predictive power of their models. The hyperparameter database is created by running millions of hyperparameter values, calculating the individual conditional expectation of every hyperparameter on the quality of a model. The data science part need to generating models using H2O to find best hyperparameters.

### Introducton

The project is divided in 2 teams: one is data science team which is responsible for generating models using H2O software to find the best hyperparameters, the other one is database team whch needs to create a conceputal model and storing all the data into a physical datbase. From data science end, we are using a module called H2O Auto Machine Learning which will automatically generate the diffenent kinds of the model by adjusting its hyperparameters and rank the models accounting to its metrics.

### Dataset
The dataset is from the website https://www.kaggle.com/econdata/predciting-price-transaction#trainPrice.csv . Housing price always been a popular item that people expect to predict. Since it is critical for us to find out the factors that affecting transaction price. This data set covers different aspects of factors which influence the housing price, which requires the scientific and specific method to calculate the best result. 

### Contributions 
- Hsiang-Hua Chen : 20% from the website, 80% created by myself

### Citations
-  https://www.w3schools.com/python/
-  https://h2o-release.s3.amazonaws.com/h2o/rel-vajda/1/docs-website/h2o-docs/grid-search.html
-  https://github.com/nikbearbrown/INFO_6105
-  https://github.com/nikbearbrown/H2O_Workshop 
-  https://towardsdatascience.com/what-are-hyperparameters-and-how-to-tune-the-hyperparameters-in-a-deep-neural-network-d0604917584a

### License
Copyright (c) 2019 Hsiang-Hua Chen <br>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:<br>

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.<br>

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


