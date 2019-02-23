package davidpadillaservice

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class SomeResourceServiceSpec extends Specification implements ServiceUnitTest<SomeResourceService>{

    void "test interacting with the service"() {
        expect:
        service.firstLine == 'line number one'
        service.secondLine == 'line number two'
    }
}
