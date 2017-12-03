package io.github.aplotnikov.java.modules.impl.two

import org.junit.Rule
import org.junit.contrib.java.lang.system.SystemOutRule
import spock.lang.Specification
import spock.lang.Subject

class SecondProcessorSpec extends Specification {

    @Rule
    SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests()

    @Subject
    SecondProcessor processor = new SecondProcessor()

    void 'processor should print a message on the console'() {
        when:
            processor.process()
        then:
            systemOutRule.log == 'Second processor does something\n'
    }
}
