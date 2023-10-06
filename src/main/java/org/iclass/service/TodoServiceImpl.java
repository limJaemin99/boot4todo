package org.iclass.service;

import java.util.List;

import org.iclass.dao.TodoMapper;
import org.iclass.dto.PageRequestDTO;
import org.iclass.dto.PageResponseDTO;
import org.iclass.dto.TodoDto;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
	private final TodoMapper todoMapper;

	@Override
	public int register(TodoDto todoDto) {
		log.info(">>>>>>>>>> todoDto : {}", todoDto);

		return todoMapper.insert(todoDto);
	}

	@Override
	public List<TodoDto> getAll() {
		return todoMapper.selectAll();
	}

	@Override
	public TodoDto getOne(long tno) {
		return todoMapper.selectOne(tno);
	}

	@Override
	public void remove(long tno) {
		todoMapper.delete(tno);

	}

	@Override
	public int modify(TodoDto todoDto) {
		// TODO Auto-generated method stub
		return todoMapper.update(todoDto);
	}
	
	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return todoMapper.getCount();
	}
	
	@Override
	public PageResponseDTO<TodoDto> getList(PageRequestDTO pageDTO) {

		List<TodoDto> list = todoMapper.selectList(pageDTO);
		long total = todoMapper.getCount();
		
		PageResponseDTO<TodoDto> pageResponseDTO = PageResponseDTO.<TodoDto>withAll()
				.pageRequestDTO(pageDTO)
				.list(list)
				.total(total)
				.build();
		
		return pageResponseDTO;
	}
}
