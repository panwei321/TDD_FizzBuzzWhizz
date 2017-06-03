# TDD任务

1. git init
2. mvn idea:idea
3. Add as maven project。
4. 看一下pom.xml。
5. 测试项目是否配置正确。
6. 第一次提交。
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

17. 选择2A2B测试样本，三角测试法
    * 需求
        * 用户输入4个正确的数字，但是其中两个位置错误，返回2A2B。
    * 意图
        * 驱动实现。
    * 测试名称
        * should_return_2A2B_when_has_correct_number_but_wrong_position
    * 类名及行为名
        * Game，guess
        * Answer
18. 测试出现重复代码。
19. guess()方法里面的职责有点问题，使用的属性基本上都是Answer内的，识别出了代码坏味道"Feature Evny"——依赖情结。
20. 重构手法-提取函数，移动函数。  
21. 第二个任务，随机生成答案。
22. 生成4位数的答案
    * 需求
        * 生成四位数的答案。
    * 意图
        * 第二核心的需求。
    * 测试名称
        * should_generator_answer
    * 类名及行为名
        * AnswerGenerator, generator
23. 重构，将GameTest里面的答案改成由AnswerGenerator生成。
24. 第三个任务，输入验证。
    
    * 重复验证
    * 长度验证
    * 数字验证
    
25. 重复验证
    * 需求
       * 重复验证。
    * 意图
       * 重复验证较为简单。
    * 测试名称
       * should_raise_error_when_answer_number_duplicated
    * 类名及行为名
       * AnswerValidator, validator
26. 长度验证
    * 需求
       * 长度验证。
    * 意图
       * 三角实现法则。
    * 测试名称
       * should_raise_error_when_answer_length_not_four
    * 类名及行为名
       * AnswerValidator, validator  
27. 数字验证
    * 需求
       * 数字验证。
    * 意图
       * 三角实现法则。
    * 测试名称
       * should_raise_error_when_answer_not_digit
    * 类名及行为名
       * AnswerValidator, validator   
28. 重构AnswerValidator，简化算法。抽方法，使用正则表达式。 
29. 将AnswerValidator加回到Game的guess()方法。

30. 记录猜测结果失败
    * 需求
       * AS  When 输入猜测结果  Then 记录结果。
    * 意图
       * 
    * 测试名称
       * should_raise_error_when_save_fail
    * 类名及行为名
       * AnswerOperate, save
 
31. 记录猜测结果成功 
    * 需求
       * AS  When 输入猜测结果  Then 记录结果。
    * 意图
       * 
    * 测试名称
       * should_return_void_when_save_success
    * 类名及行为名
       * AnswerOperate, save   
        
     
32. 选择全部猜测不对返回失败的样本 
    * 需求
       * AS game  When 6次猜测全部失败  Then 返回失败。
    * 意图
       * 
    * 测试名称
       * should_return_OVER_when_6_times_fail
    * 类名及行为名
       * Game, display      
               
32. 选择2次猜中返回成功的样本 
    * 需求
       * AS game  When 2次猜中  Then 返回成功。
    * 意图
       * 
    * 测试名称
       * should_return_SUCCESS_when_2_times_got
    * 类名及行为名
       * Game, display                