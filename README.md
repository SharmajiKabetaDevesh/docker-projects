We think that containers are only solving the issue of "this code runs in my pc only, Huh!!". But that's not the single use case,
I have delved into docker, understanding it's architecture, volumes, networking, compose and even multistage docker builds. 

 Here I have put some key factors and shared some notes I have created by completing the Docker playlist of Abhishek Veeramalla Sir. 


1. Faster Deployment
Containers are much faster to deploy than traditional virtual machines (VMs). Unlike VMs, which need a full OS to boot up,
 containers only require the application and its dependencies, leading to quicker startup times.
Eg. Imagine a large-scale e-commerce site where multiple services (payment gateway, user profile, product catalog) need to be updated.


With containers, developers can quickly deploy new versions of each service, reducing downtime and improving customer experience.

3. Resource Efficiency
Containers are more lightweight than virtual machines because they share the host operating system's kernel.
 This makes them more efficient in terms of resource usage (memory, CPU, storage). 


5. Simplified Scaling and Load Balancing
Containers make scaling applications easier. Since containers are lightweight, it's simple to scale them up or down based on demand.
Load balancers can be used to distribute traffic among multiple containers running the same service, providing high availability and better performance.

7. Improved Security and Isolation
Containers provide a high level of isolation.
 Each container runs in its own environment, so if one container is compromised, the others are not affected. 

9. Size reduction by multistage builds
Multi-stage builds feature enables us to create smaller container images with better caching and a higher security.
It involves picking only the essential components of code and a runtime for our code after building or compiling it into bytecode.
