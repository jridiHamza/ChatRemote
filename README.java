plugins {
	id 'java'
	id 'org.springframework.boot' version '2.7.16'
	id 'io.spring.dependency-management' version '1.0.15.RELEASE'
}

group = 'com.exampleTSP'
version = '0.0.1-SNAPSHOT'

java {
	sourceCompatibility = '1.8'
}

configurations {
	compileOnly {
		extendsFrom annotationProcessor
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-batch'
	implementation 'org.springframework.boot:spring-boot-starter-data-cassandra'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.batch:spring-batch-test'
	implementation 'org.springdoc:springdoc-openapi-ui:1.7.0'
}

tasks.named('test') {
	useJUnitPlatform()
}
