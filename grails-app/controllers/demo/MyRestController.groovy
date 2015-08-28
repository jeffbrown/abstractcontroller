package demo

import grails.rest.RestfulController

abstract class MyRestController<T> extends RestfulController<T> {
    static responseFormats = ['json', 'xml']

    MyRestController(Class<T> domainClass) {
        this(domainClass, false)
    }
    MyRestController(Class<T> domainClass, boolean readOnly) {
        super(domainClass, readOnly)
    }
}
