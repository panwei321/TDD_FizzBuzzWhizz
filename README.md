FizzBuzzWhizz游戏
=====================

题目：

````
    你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有100名学生在上课。游戏的规则是：
    
    你首先说出三个不同的特殊数，要求必须是个位数，比如3、5、7。
    让所有学生拍成一队，然后按顺序报数。
    学生报数时，如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。
    学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
    学生报数时，如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。
````
Example:

    特殊数：3 5 7 

|输入 |   结果  |
|:-------: |:-------: |
| 1    | 1          |
| 2    | 2          |
| 3    | Fizz       |
| 4    | 4          |
| 5    | Buzz       |
| 6    | Fizz       |
| 7    | Whizz      |
| 8    | 8          |
| ...  | ...        |
| 13   | Fizz       |
| 14   | Whizz      |
| 15   | FizzBuzz   |
| 16   | 16         |
| ...  | ...        |
| 21   | FizzWhizz  |
| 22   | 22         |
| 23   | Fizz       |
| 24   | Fizz       |
| ...  | ...        |
| 29   | 29         |
| 30   | Fizz       |
| 31   | Fizz       |
| ...  | ...        |
| 100  | 100        |
