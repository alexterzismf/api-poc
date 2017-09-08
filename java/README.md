# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String moniker = "KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA"; // String | 
        try {
            apiInstance.3b0c08c566d34d1bBe802051668924f0(moniker);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#3b0c08c566d34d1bBe802051668924f0");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://hostname2/ajax*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**3b0c08c566d34d1bBe802051668924f0**](docs/DefaultApi.md#3b0c08c566d34d1bBe802051668924f0) | **GET** /edq-getaddress | Hybris Get Address
*DefaultApi* | [**94ab679a473e48e985e863c9dc0c3c31**](docs/DefaultApi.md#94ab679a473e48e985e863c9dc0c3c31) | **GET** /edq-search | Hybris Address Search


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



