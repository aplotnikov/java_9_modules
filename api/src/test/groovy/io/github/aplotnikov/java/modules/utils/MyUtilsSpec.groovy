package io.github.aplotnikov.java.modules.utils

import org.junit.Rule
import org.junit.contrib.java.lang.system.SystemOutRule
import spock.lang.Specification
import spock.lang.Subject

class MyUtilsSpec extends Specification {

    @Rule
    SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests()

    @Subject
    MyUtils utils = new MyUtils()

    void 'utils should print a message on the console'() {
        when:
            utils.doesSomething()
        then:
            systemOutRule.log == 'My utility class does something\n'
    }
}
