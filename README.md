# aws-sqs sample

its code sample to demostrate how to use SQS. in high concurrency enviornment its always better to use queue to handle db operations like update and save. This is known as eventually consistant. most transactional system with high per second transactons employe this concept. Credit card processing system where using this method from longtime before it became mainstream implementation consideration

This sample use AWS SQS as queue. As name sugessted its not feature rich as RabbitMQ but it does do the job and its relatively cheaper depending on the number of transaction. Spring Cloud make it easire to use it by encoperating most of the boiler plate code to the framework. 

As best practise please think of using one of the configurationb servers to manage the confioguration cenrally and having diffrent spring profiles depending on the environment will give you added flexibility


