package lk.ijse.dep.pos.dao.custom;

import lk.ijse.dep.dao.SuperDAO;
import lk.ijse.dep.entity.CustomEntity;

import java.util.List;

public interface QueryDAO extends SuperDAO {

    List<CustomEntity> getOrderDetail() throws Exception;
}
