FROM RUN .cn-hangzhou.aliyuncs.com/joint-union/java8
RUN ls /tmp
COPY maven-use.tgz /tmp
RUN ls /tmp
RUN tar -zxvf /tmp/maven-use.tgz -C /tmp
RUN ls /tmp
RUN cp /tmp/maven-use-1.0-SNAPSHOT.jar /
EXPOSE 8094
RUN sh -c 'touch /maven-use-1.0-SNAPSHOT.jar'
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Duser.timezone=Asia/Shanghai","/maven-use-1.0-SNAPSHOT.jar"]