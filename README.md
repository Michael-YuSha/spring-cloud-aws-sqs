# spring cloud AWS SQS Sample implementation

its code sample to demostrate how to use SQS. in high concurrency enviornment its always better to use queue to handle db operations like update and save. This is known as eventually consistant. most transactional system with high per second transactons employe this concept. Credit card processing system where using this method from longtime before it became mainstream implementation consideration

This sample use AWS SQS as queue. As name sugessted its not feature rich as RabbitMQ but it does do the job and its relatively cheaper depending on the number of transaction. Spring Cloud make it easire to use it by encoperating most of the boiler plate code to the framework. 

As best practise please think of using one of the configurationb servers to manage the confioguration cenrally and having diffrent spring profiles depending on the environment will give you added flexibility.

Like everyone else, At the begging I was pretty uncomfatable with this concept. Then I was in one of the YOW! workshop conducted bt  [Michael T. Nygard](https://twitter.com/mtnygard) . I think everyone should own his book, [Release It!](http://www.amazon.com/Release-It-Production-Ready-Pragmatic-Programmers/dp/0978739213)




Eventual Consistency :
some reading :)

http://highscalability.com/blog/2013/5/1/myth-eric-brewer-on-why-banks-are-base-not-acid-availability.html

https://msdn.microsoft.com/en-au/library/dn589800.aspx
