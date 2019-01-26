/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.easyMock;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

/**
 * ExampleTest
 *
 * @author huaishi
 * @since 2019-01-22
 */

public class ExampleTest extends EasyMockSupport {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @Mock
    private Collaborator collaborator;

    @TestSubject
    private ClassTested classUnderTested = new ClassTested();

    @Test
    public void addDocument(){
        collaborator.documentAdded("New Document");
        replayAll();
        classUnderTested.addDocument("New Document","content");
        verifyAll();
    }

}