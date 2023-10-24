package org.iclass.service;

import java.util.List;

import org.iclass.dto.PageRequestDTO;
import org.iclass.dto.PageResponseDTO;
import org.iclass.dto.TodoDto;

public interface TodoService {
	int register(TodoDto todoDto);
	List<TodoDto> getAll();
	TodoDto getOne(long tno);
	void remove(long tno);
	int modify(TodoDto todoDto);
	long getCount();
	PageResponseDTO<TodoDto> getList(PageRequestDTO pageDTO);
	/* ▲ 이거 PageResponseDTO 가 아니라 List임 */
}
