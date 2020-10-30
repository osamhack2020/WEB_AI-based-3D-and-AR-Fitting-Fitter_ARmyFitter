# -*- coding: utf-8 -*-
"""
Created on Wed Feb 26 13:18:37 2020

@author: User
"""
"""
전투복 상의 추천
"""
print('hello spyder')
import pandas as pd
from sklearn import svm, metrics
from sklearn.model_selection import train_test_split

"""
***********입력값**********************************************************
"""
tall=173     #키
arm=55       #팔길이
heart=105    #가슴둘레
shoulder=60  #어깨넓이
waist=80     #허리둘레
butt=100     #엉덩이둘레
leg=85       #다리길이
head=580     #머리둘레
foot=250     #발길이
"""
**************************************************************************
"""
csv= pd.read_csv("recomend1.csv")

data=csv[["ARM","HEART","SHOULDER"]]
label=csv["RESULT"]
train_data,test_data,train_label,test_label =train_test_split(data,label)
clf=svm.SVC(C=1000,gamma=100)
clf.fit(train_data,train_label)
results=clf.predict(test_data)

result=clf.predict([[heart,heart,shoulder]])
#print(result)
csv1= pd.read_csv("recomend1.csv")
data1=csv1[["KEY","ARM","HEART","SHOULDER"]]
label1=csv1["RESULT1"]
train_data1,test_data1,train_label1,test_label1 =train_test_split(data1,label1)
clf1=svm.SVC()
clf1.fit(train_data1,train_label1)
results1=clf1.predict(test_data1)
score1=metrics.accuracy_score(results1,test_label1)

#print("정확률:",score1)
result1=clf1.predict([[tall,heart,heart,shoulder]])
#print(result1)

print("전투복 상의 :",result,"-",result1,"- M")
"""
전투복 하의 추천
"""

csv2= pd.read_csv("recomend1.csv")

data2=csv2[["WAIST","BUTT","LEG"]]
label2=csv2["RESULT2"]
train_data2,test_data2,train_label2,test_label2 =train_test_split(data2,label2)
clf2=svm.SVC()
clf2.fit(train_data2,train_label2)
results2=clf2.predict(test_data2)



result2=clf2.predict([[waist,butt,leg]])
#print(result2)
csv3= pd.read_csv("recomend1.csv")
data3=csv3[["KEY","WAIST","BUTT","LEG"]]
label3=csv3["RESULT3"]
train_data3,test_data3,train_label3,test_label3 =train_test_split(data3,label3)
clf3=svm.SVC()
clf3.fit(train_data3,train_label3)
results3=clf3.predict(test_data3)
score3=metrics.accuracy_score(results3,test_label3)

#print("정확률:",score1)
result3=clf3.predict([[tall,waist,butt,leg]])
#print(result1)
print("전투복 하의 :",result2,"-",result3,"- M")
"""
베레모 / 전투화 추천
"""
csv4= pd.read_csv("recomend1.csv")
data4=csv4[["HEAD"]]
label4=csv4["RESULT4"]
train_data4,test_data4,train_label4,test_label4 =train_test_split(data4,label4)
clf4=svm.SVC()
clf4.fit(train_data4,train_label4)
results4=clf4.predict(test_data4)

result4=clf4.predict([[head]])
print("베레모 :",result4,"호")
#전투화
csv= pd.read_csv("recomend1.csv")
data5=csv[["FOOT"]]
label5=csv["RESULT5"]
train_data5,test_data5,train_label5,test_label5 =train_test_split(data5,label5)
clf5=svm.SVC()
clf5.fit(train_data5,train_label5)
results5=clf5.predict(test_data5)

result5=clf5.predict([[foot]])
print("전투화 :",result5,"mm")
"""
정확률
"""
score1=metrics.accuracy_score(results1,test_label1)


score2=metrics.accuracy_score(results2,test_label2)


score3=metrics.accuracy_score(results4,test_label4)


score4=metrics.accuracy_score(results5,test_label5)


print("정확률:",(score1+score2+score3+score4)/4)

"""
import matplotlib.pyplot as plt
import seaborn as sns
data= pd.read_csv('iris.csv')
data.corr()
plt.figure(figsize=(8,8))
sns.heatmap(data = data.corr(),annot=True,fmt='.2f',linewidths=.5,cmap='Greens')
"""