// default package

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class y5f {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = tpd.b;
            }
        } else {
            if (!(collection instanceof mod)) {
                return false;
            }
            obj = ((mod) collection).s;
        }
        return comparator.equals(obj);
    }
}
