package Mapping;

import java.util.Collection;

/**
 * Created by pablo on 19/08/14.
 */
public interface IGenericMapper<T1,T2> {
    public T1 Transform(T2 param);
    public T2 TransformReverse(T1 param);
    public Collection<T1> TransformColection(Collection<T2> paramsArray);
}
