# Java Spring Vehicle

A Vehicle implementation in java using a Spring Concepts such as Beans, Autowiring and Dependency Injection

![Screenshot 2025-01-01 at 5 16 30 p m](https://github.com/user-attachments/assets/a4184d3f-289a-44f9-baf2-8e0624be420f)



The default vehicle is Lamborghini Urus for Lucy, the vehicle has Michelin and Bridgestone, Micheline is marked as @Primary hence those are the tyre beans used, the speakers don't have a primary bean for Speaker, but we use @Qualifier to use bose speakers in the dependency injection.

```
The person name is: Lucy
The person's vehicle name is: Lamborghini Urus
Playing sound from Bose speakers
Rotating Michelin tyres

Process finished with exit code 0
```

![Screenshot 2025-01-01 at 6 27 05 p m](https://github.com/user-attachments/assets/ebc65018-95ec-4cb7-967d-94418eef3c1c)
