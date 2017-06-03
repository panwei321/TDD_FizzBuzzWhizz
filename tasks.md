# TDD任务

1. git init
2. mvn idea:idea
3. Add as maven project。
4. pom.xml。
5. 测试项目是否配置正确。
6. first git push。
7. 需求分析。

8. 任务分解。
 - 8.1 给出三个不同的个位数字作为特殊数。（多想一下,还有那些限制条件:负数？0？1？>10?）
 - 8.2 从1开始顺序报数到100截止（1，2，3...100）。
 - 8.3 判断报数条件:
   - 8.3.1  如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。
   - 8.3.2  如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
   - 8.3.3  如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。
 - 8.4 根据条件输出对应的结果。
 
    
9. 选择任务。
    * 依赖性。
    * 重要性。
    
10. 判断报数条件。
11. 分析测试样本和驱动对象的职责。
12. 测试样本的选择(实例化需求)
    * 简单。
    * 针对业务进行测试，而不是针对方法进行测试。

** 选择第一个任务 **

13. 选择先从需求8.3.3（包含第一个特殊数）的测试样本。
    * 需求
        * 输入含3的数字，返回Fizz。
    * 意图
        * 最优先的功能，简单实现。
    * 测试名称
        * should_return_Fizz_when_input_contain_first_special_num
        * Student Should Sound Off Fizz When The Number Contain First Special Num
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNums
14. 使用伪实现通过第一个测试。

15. 选择需求8.3.2（一个数同时是三个特殊数的倍数）的测试样本
    * 需求
        * 输入一个数字，是三个特殊数的倍数，返回FizzBuzzWhizz。
    * 意图
        * 进一步添加需求。
    * 测试名称
        * should_return_FizzBuzzWhizz_when_input_is_multiple_of_all_specNum
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNums
16. 同样使用伪实现，因为还未突破重构的底线，现有的代码没有阻碍我们添加新需求。

17. 选择需求8.3.2（一个数同时是任意2个特殊数的倍数）的测试样本
    * 需求
        * 输入一个数字，是前连个特殊数的倍数，返回FizzBuzz。
    * 意图
        * 驱动实现。
    * 测试名称
        * should_return_FizzBuzz_when_input_is_multiple_of_firstSpecNum_and_secondSpecNum
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNums
18. 出现重复代码，处理特殊数倍数判定处理优化，并重构部分坏味道代码，然后从新跑用例，验证优化准确性。 
        