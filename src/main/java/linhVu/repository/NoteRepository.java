package linhVu.repository;

import linhVu.model.Note;
import linhVu.model.NoteType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note,Long> {
    Iterable<Note> findAllByNoteType(NoteType noteType);
    Page<Note> findAllByTitleContaining(String name, Pageable pageable);
}
