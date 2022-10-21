FROM registry.cn-shanghai.aliyuncs.com/c7n/javabase:0.9.0
RUN mkdir /apps
RUN mkdir /apps/tmp
RUN mkdir /apps/files
WORKDIR /apps
COPY target/communication-situation.jar /apps
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/apps/communication-situation.jar"]