import spock.lang.Specification

class TodoControllerSpec extends Specification {
    def "should work"() {
        given:
            def num1 = 1
            def num2 = 2
        when:
            def result = num1 + num2
        then:
            result == 3
    }
}
