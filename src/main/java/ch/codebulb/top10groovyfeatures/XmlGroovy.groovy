package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

@CompileStatic
class XmlGroovy {
    // Using an excerpt from the project pom.xml as an example XML input
    protected static final String XML_INPUT = """
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>ch.codebulb</groupId>
    <artifactId>Top10GroovyFeatures</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.10</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.codehaus.groovy</groupId>
            <artifactId>groovy-all</artifactId>
            <version>2.4.0</version>
        </dependency>
    </dependencies>
    <name>Top10GroovyFeatures</name>
</project>
    """.trim() // Me must apparently trim because http://stackoverflow.com/a/13091190
    
    @CompileDynamic
    public static String parseJunitScope() {
        def project = new XmlSlurper().parseText(XML_INPUT)
        return project.dependencies.dependency.find {it.groupId == "junit"}.scope
    }
}
