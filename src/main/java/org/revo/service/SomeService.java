package org.revo.service;

import org.revo.domain.Subject;

import java.util.Set;

/**
 * Created by revo on 04/12/15.
 */
public interface SomeService {
    void init();

    void joinTerm(String person, String term, Set<Subject> subjects);
}
