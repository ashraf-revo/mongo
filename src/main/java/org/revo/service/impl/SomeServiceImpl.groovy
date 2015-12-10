package org.revo.service.impl

import org.revo.domain.*
import org.revo.repository.*
import org.revo.service.SomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by revo on 04/12/15.
 */
@Service
@Transactional
class SomeServiceImpl implements SomeService {
    @Autowired
    SubjectRepository subjectRepository
    @Autowired
    PersonRepository personRepository
    @Autowired
    TermRepository termRepository
    @Autowired
    PTRepository ptRepository
    @Autowired
    PSRepository psRepository
    @Autowired
    AdminRepository adminRepository

    @Override
    void init() {
        adminRepository.deleteAll()
        psRepository.deleteAll()
        ptRepository.deleteAll()
        termRepository.deleteAll()
        subjectRepository.deleteAll()
        personRepository.deleteAll()
        Subject computer_language = subjectRepository.save(new Subject(name: "computer language", hour: 3))
        Subject algorethim = subjectRepository.save(new Subject(name: "algorethim", hour: 3, required: [subjectRepository.findOne(computer_language.id)]))
        Subject datasturctre = subjectRepository.save(new Subject(name: "data sturctre", hour: 3, required: [subjectRepository.findOne(computer_language.id)]))
        Subject filesturctre = subjectRepository.save(new Subject(name: "file sturctre", hour: 3, required: [subjectRepository.findOne(datasturctre.id)]))
        Subject database1 = subjectRepository.save(new Subject(name: "database1", hour: 3, required: [subjectRepository.findOne(filesturctre.id)]))
        Subject arbic = subjectRepository.save(new Subject(name: "arbic", hour: 3))
        Subject english = subjectRepository.save(new Subject(name: "english", hour: 3))
        Subject math1 = subjectRepository.save(new Subject(name: "math1", hour: 3))
        Subject math2 = subjectRepository.save(new Subject(name: "math2", hour: 3, required: [subjectRepository.findOne(math1.id)]))
        Subject static1 = subjectRepository.save(new Subject(name: "static1", hour: 3, required: [subjectRepository.findOne(math1.id)]))
        Subject static2 = subjectRepository.save(new Subject(name: "static2", hour: 3, required: [subjectRepository.findOne(static1.id)]))
        Subject physics = subjectRepository.save(new Subject(name: "physics", hour: 3))
        Subject prefrals = subjectRepository.save(new Subject(name: "prefrals", hour: 3, required: [subjectRepository.findOne(computer_language.id)]))
        Subject java = subjectRepository.save(new Subject(name: "java", hour: 3, required: [subjectRepository.findOne(algorethim.id)]))
        Subject ai = subjectRepository.save(new Subject(name: "ai", hour: 3, required: [subjectRepository.findOne(datasturctre.id), subjectRepository.findOne(java.id)]))
        Subject python = subjectRepository.save(new Subject(name: "python", hour: 3, required: [subjectRepository.findOne(computer_language.id), subjectRepository.findOne(ai.id)]))
        Subject os1 = subjectRepository.save(new Subject(name: "os1", hour: 3))
        Subject software1 = subjectRepository.save(new Subject(name: "software1", hour: 3))
        Subject software2 = subjectRepository.save(new Subject(name: "software2", hour: 3, required: [subjectRepository.findOne(software1.id), subjectRepository.findOne(java.id)]))
        Subject descreat = subjectRepository.save(new Subject(name: "descreat", hour: 3))
        Subject logic1 = subjectRepository.save(new Subject(name: "logic1", hour: 3, required: [subjectRepository.findOne(descreat.id)]))
        Subject logic2 = subjectRepository.save(new Subject(name: "logic2", hour: 3, required: [subjectRepository.findOne(logic1.id)]))
        Subject assamply = subjectRepository.save(new Subject(name: "assamply", hour: 3, required: [subjectRepository.findOne(logic2.id), subjectRepository.findOne(computer_language.id)]))
        Subject os2 = subjectRepository.save(new Subject(name: "os2", hour: 3, required: [subjectRepository.findOne(os1.id), subjectRepository.findOne(assamply.id)]))
        Subject security = subjectRepository.save(new Subject(name: "security", hour: 3, required: [subjectRepository.findOne(java.id)]))
        Subject graphic = subjectRepository.save(new Subject(name: "graphic", hour: 3))
        Subject multimedia = subjectRepository.save(new Subject(name: "multimedia", hour: 3, required: [subjectRepository.findOne(graphic.id)]))
        Subject compiler = subjectRepository.save(new Subject(name: "compiler", hour: 3, required: [subjectRepository.findOne(os2.id)]))
        def save = personRepository.save(new Person(name: "revo", email: "revo", password: "revo"))
        adminRepository.save(new Admin(name: "ashraf", email: "ashraf", password: "revo", role: "ROLE_ADMIN"))
        def save1 = termRepository.save(new Term(name: "term1", enabled: true))
        termRepository.save(new Term(name: "term2", enabled: true))
        Set<Subject> join = [
                subjectRepository.findOne(computer_language.id), subjectRepository.findOne(arbic.id),
                subjectRepository.findOne(english.id), subjectRepository.findOne(math1.id),
                subjectRepository.findOne(physics.id), subjectRepository.findOne(os1.id),
                subjectRepository.findOne(software1.id), subjectRepository.findOne(descreat.id),
                subjectRepository.findOne(graphic.id)
        ]
        joinTerm(save.id, save1.id, join)

    }


    @Override
    void joinTerm(String person, String term, Set<Subject> subjects) {
        Term one = termRepository.findOne(term)
        if (one.enabled) {
            Person p = personRepository.findOne(person)
            PT pt = ptRepository.save(new PT(term: one,
                    person: p))
            p.pt.add(pt)
            personRepository.save(p)
            one.pt.add(pt)
            termRepository.save(one)
            subjects.each {
                def ps = new PS(subject: it, pt: pt)
                psRepository.save(ps)
                pt.ps.add(ps)
                ptRepository.save(pt)
            }
        }
    }

}
