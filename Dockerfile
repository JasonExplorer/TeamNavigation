FROM openjdk:8u201-alpine
#维护者
MAINTAINER liu_yichun@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

# 拷贝程序
ADD team-nav.jar app.jar

# 暴露端口
EXPOSE 8080

# 存储卷
VOLUME ["/logs","/database","/ext-resources"]

# 设置环境变量
ENV PARAMS="-Xms1024m -Xmx1024m"

#镜像入口
ENTRYPOINT ["sh", "-c", "java $PARAMS -jar app.jar"]
