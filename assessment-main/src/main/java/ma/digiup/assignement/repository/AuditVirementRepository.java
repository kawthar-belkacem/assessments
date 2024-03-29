package ma.digiup.assignement.repository;

import ma.digiup.assignement.domain.AuditTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditVirementRepository extends JpaRepository<AuditTransfer, Long> {
}
