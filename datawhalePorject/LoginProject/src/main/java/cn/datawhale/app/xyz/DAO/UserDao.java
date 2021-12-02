package cn.datawhale.app.xyz.DAO;

import cn.datawhale.app.xyz.PoJo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor {

}
