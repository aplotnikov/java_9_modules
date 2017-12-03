package io.github.aplotnikov.java.modules.impl.one

import org.junit.Rule
import org.junit.contrib.java.lang.system.SystemOutRule
import spock.lang.Specification
import spock.lang.Subject

class FirstProcessorSpec extends Specification {

    @Rule
    SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests()

    @Subject
    FirstProcessor processor = new FirstProcessor()

    void 'processor should print a message on the console'() {
        when:
            processor.process()
        then:
            systemOutRule.log == 'First processor does something\n'
    }
}
