import groovy.json.JsonSlurper

def url = 'https://start.spring.io/starter.zip?type=maven-project&language=java&platformVersion=3.0.10&packaging=jar&jvmVersion=11&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo'
def response = new URL(url).text

def json = new JsonSlurper().parseText(response)
def choices = json.dependencies.collect { it.name }

return choices
