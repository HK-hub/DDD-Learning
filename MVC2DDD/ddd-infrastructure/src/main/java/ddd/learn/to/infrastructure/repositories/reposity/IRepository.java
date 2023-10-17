package ddd.learn.to.infrastructure.repositories.reposity;

/**
 * @author : HK意境
 * @ClassName : IRepository
 * @date : 2023/10/17 20:16
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface IRepository<T, ID> {

    /**
     * 根据id获取实体
     *
     * @param id
     *
     * @return
     */
    public T byId(ID id);

    /**
     * 保存实体对象
     *
     * @param t
     */
    public void save(T t);

}
