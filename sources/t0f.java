// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class t0f {
    public static boolean a(o7a o7aVar, Collection collection) {
        collection.getClass();
        if (collection instanceof yed) {
            collection = ((yed) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= o7aVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= o7aVar.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = o7aVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
