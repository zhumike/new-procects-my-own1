#!/bin/bash

:<< EOF
多行注释的写法
EOF
#shell只支持一维数组，数组元素用"空格"符号分割开
array_name=(
value0
value1
value2
value3
)

echo ${array_name[@]} #输出所有的数组元素

length=array_name[@]
echo ${length} #输出数组元素的个数

echo ${array_name[0]}

#提取字符串第二个开始到第四个
string "abcdef"
echo ${string:1:4} #输出bcde


#shell传参应用

echo "Shell 传递参数实例！";
echo "第一个参数为：$1";

#$#与$*的区别
echo "参数个数为：$#";
echo "传递的参数作为一个字符串显示：$*";


#shell运算符
a=10
b=20

val=`expr $a + $b`
echo "a + b : $val"

val=`expr $a - $b`
echo "a - b : $val"

val=`expr $a \* $b`
echo "a * b : $val"

val=`expr $b / $a`
echo "b / a : $val"

val=`expr $b % $a`
echo "b % a : $val"

if [ $a == $b ]
then
   echo "a 等于 b"
fi
if [ $a != $b ]
then
   echo "a 不等于 b"
fi


echo -e "OK! \n" # -e 开启转义
echo "It is a test"

echo -e "OK! \c" # -e 开启转义 \c 不换行
echo "It is a test"


#printf的用法
printf "%-10s %-8s %-4s\n" 姓名 性别 体重kg  
printf "%-10s %-8s %-4.2f\n" 郭靖 男 66.1234 
printf "%-10s %-8s %-4.2f\n" 杨过 男 48.6543 
printf "%-10s %-8s %-4.2f\n" 郭芙 女 47.9876 

#for循环
for loop in 1 2 3 4 5
do
    echo "The value is: $loop"
done

#while循环
int=1
while(( $int<=5 ))
do
    echo $int
    let "int++"
done