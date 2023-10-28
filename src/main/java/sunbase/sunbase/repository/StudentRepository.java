package sunbase.sunbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sunbase.sunbase.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
