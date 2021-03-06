package tree;

/**
 * 树的抽象数据类型
 * Created by eric on 17-11-9
 */
public interface Tree<T> {

    /**
     * 清空树
     */
    void clear();

    /**
     * 树是否为空
     *
     * @return 检查结果
     */
    boolean isEmpty();

    /**
     * 返回树的根节点
     *
     * @return 树的根节点
     */
    Node<T> root();

    /**
     * node是树中的一个节点，返回该节点的值
     *
     * @param node
     * @return
     */
    T value(Node<T> node);

    /**
     * 给树的节点node赋值为value
     */
    void assign(Node<T> node, T value);

    /**
     * 若node为树的非根节点，返回该节点的双亲，否则返回空
     */
    Node<T> parent(Node<T> child);

    /**
     * 若node为树的非叶节点，返回该节点的左节点，否则返回空
     */
    Node<T> leftChild(Node<T> node);

    /**
     * 若果该节点在树中有右兄弟节点，返回该右兄弟节点，否则返回空
     */
    Node<T> rightSibling(Node<T> node);

    /**
     * children非空且不与树相交
     * 将children节点插入到parent的子节点最末尾
     */
    void insertChild(Node<T> parent, Node<T> children);

    /**
     * 删除parent节点的第index个子节点
     */
    void deleteChild(Node<T> parent, int index);

    /**
     * 判断节点是否存在树中
     *
     * @param node 节点
     * @return 判断结果
     */
    boolean isExist(Node<T> node);

}
