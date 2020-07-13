package hofls.com.github.javahibernateexample.storage.retail;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SpecialShopSpecification implements Specification<Shop> {

    @Override
    public Predicate toPredicate(Root<Shop> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        final List<Predicate> predicatesA = new ArrayList<>();
        predicatesA.add(root.get("name").in("Banana shop"));
        predicatesA.add(root.get("id").in("1"));

        final List<Predicate> predicatesB = new ArrayList<>();
        predicatesB.add(root.get("name").in("Tomato shop"));
        predicatesB.add(root.get("id").in("2"));

        Predicate predicateA = criteriaBuilder.and(predicatesA.get(0), predicatesA.get(1));
        Predicate predicateB = criteriaBuilder.and(predicatesB.get(0), predicatesB.get(1));

        return criteriaBuilder.or(predicateA, predicateB);
    }

}
