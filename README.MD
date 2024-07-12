
# Maven 时间插件 - [fu-time-maven-plugin]

## 使用
```xml
<plugin>
    <groupId>io.github.weijunfu</groupId>
    <artifactId>fu-time-maven-plugin</artifactId>
    <version>0.0.1</version>
    <executions>
        <execution>
            <id>set fu.time</id>
            <phase>process-resources</phase>
            <goals>
                <goal>fuTimeMavenPlugin</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

## 使用场景
+ 版本号
```xml
<version>1.0.${fu.time}</version>
```

+ 构建名称
```xml
<finalName>app-${fu.time}</finalName>
```

## 配置
`${fu.time}`默认时间格式为`yyyyMMddHHmm`。
支持自定义日期格式，例如：
```xml
<configuration>
    <pattern>yyyyMMdd</pattern>
</configuration>
```

## 完整配置
```xml
<plugin>
    <groupId>io.github.weijunfu</groupId>
    <artifactId>fu-time-maven-plugin</artifactId>
    <version>0.0.1</version>
    <configuration>
        <pattern>yyyyMMddHHmm</pattern>
    </configuration>
    <executions>
        <execution>
            <id>set fu.time</id>
            <phase>process-resources</phase>
            <goals>
                <goal>fuTimeMavenPlugin</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```