package src.main.java.com.Repository;



import com.example.studentmanagement.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IsubjectRep extends JpaRepository<Subject, Long> {
}
