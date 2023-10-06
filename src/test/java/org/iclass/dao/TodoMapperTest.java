package org.iclass.dao;

import lombok.extern.log4j.Log4j2;
import org.iclass.dto.TodoDto;
import org.iclass.service.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class TodoMapperTest {

    @Autowired
    TodoMapper dao;

    @Autowired
    TodoService service;

    @Test
    void getTime() {
        log.info("━━━━━[1] getTime() : {}",dao.getTime());
    }

    @Test
    void insert() {
        TodoDto dto = TodoDto.builder()
                .tno(111)
                .title("테스트 제목")
                .dueDate(LocalDate.of(1111,11,11))
                .writer("테스트")
                .finished(true)
                .build();

        int result = dao.insert(dto);
        log.info("━━━━━[2] insert() : {}",result);
    }

    @Test
    void selectAll() {
    }

    @Test
    void selectOne() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void selectList() {
    }

    @Test
    void getCount() {
    }
}