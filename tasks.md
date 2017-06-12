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
   - 8.3.4  不符合以上所有条件则报出该数字
 - 8.4 根据条件输出对应的结果。
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 **多想一下**
 <p>
  1. 若是特殊数字的倍数，则要读出几个特殊数字对应的文字合集<br>
  2. 包含第一个特殊数字，直接读出对应的文字<br>
  3. 若不满足1和2，就直接读出数字
 </p>
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
9. 选择任务。
    * 依赖性。
    * 重要性。
    
10. 判断报数条件。


11. 分析测试样本和驱动对象的职责。

12. 测试样本的选择(实例化需求)
    * 简单。
    * 针对业务进行测试，而不是针对方法进行测试。






























 **用例模板**
 
13. 选择需求XXX的测试样本
    * 需求
        * 输入a ，当b，返回c。
    * 意图
        * 。
    * 测试名称
        * should_return_C_when_input_A
    * 类名及行为名
        * 类名1，方法1 
        * 类名2



































** 选择第一个任务:学生判断当前报数是否是特殊数的倍数 **

13. 选择需求8.3.1（当前报数是第一个特殊数的倍数）的测试样本
    * 需求
        * 输入一个数字，是第一个特殊数的倍数，返回Fizz。
    * 意图
        * 最优先的功能，具有公用性和被依赖性，简单实现。
    * 测试名称
        * should_return_Fizz_when_input_is_multiple_of_firstSpecialNum
    * 类名及行为名
        * Student，numberOff 
        * SpecialNumber





































14.选择需求8.3.1（当前报数是第二个特殊数的倍数）的测试样本
       * 需求
           * 输入一个数字，是第二个特殊数的倍数，返回Buzz。
       * 意图
           * 进一步添加同类需求。
       * 测试名称
           * should_return_Buzz_when_input_is_multiple_of_secondSpecialNum
       * 类名及行为名
           * Student，numberOff 
           * SpecialNumber        





































15.选择需求8.3.1（当前报数是第三个特殊数的倍数）的测试样本
       * 需求
           * 输入一个数字，是第三个特殊数的倍数，返回Whizz。
       * 意图
           * 进一步添加同类需求。
       * 测试名称
           * should_return_Whizz_when_input_is_multiple_of_thirdSpecialNum
       * 类名及行为名
           * Student，numberOff 
           * SpecialNumber        













16. 选择需求8.3.2（一个数同时是任意2个特殊数的倍数）的测试样本
    * 需求
        * 输入一个数字，是前连个特殊数的倍数，返回FizzBuzz。
    * 意图
        * 驱动实现。
    * 测试名称
        * should_return_FizzBuzz_when_input_is_multiple_of_firstSpecialNum_and_secondSpecialNum
    * 类名及行为名
        * Student，numberOff
        * SpecialNumber
 
 
 
 
 
 
 
 
17.  重构  出现重复代码，处理逻辑或处理方法优化
     






18. 选择需求8.3.2（一个数同时是三个特殊数的倍数）的测试样本
    * 需求
        * 输入一个数字，是三个特殊数的倍数，返回FizzBuzzWhizz。
    * 意图
        * 进一步添加需求。
    * 测试名称
        * should_return_FizzBuzzWhizz_when_input_is_multiple_of_all_specialNum
    * 类名及行为名
        * Student，numberOff
        * SpecialNumber













      
19. 选择先从需求8.3.3（包含第一个特殊数）的测试样本。
    * 需求
        * 输入含3的数字，返回Fizz。
    * 意图
        * 特殊需求特殊流程特殊处理。
    * 测试名称
        * should_return_Fizz_when_input_contain_first_special_num
        * Student Should Sound Off Fizz When The Number Contain First Special Num
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNumber    
        
        
        
        
        
        
        
        
        
        
20. 选择先从需求8.3.4（不符合任意条件直接报出该数字）的测试样本。
    * 需求
        * 输入含4的数字，返回4。
    * 意图
        * 普通规则。
    * 测试名称
        * should_return_4_when_input_4
        
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNumber
            
            
            
            
            
            
            
            
            
        
21. 选择异常处理的测试样本
    * 需求
        * 输入小于1的数字，返回异常ValidNumberExcetion。
    * 意图
        * 异常处理。
    * 测试名称
        * should_raise_exception_when_input_number_less_then_1
        
    * 类名及行为名
        * NumberSounder，getNumber
        * SpecialNumber         