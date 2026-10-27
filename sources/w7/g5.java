package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g5 {
    public static boolean a(a8.x xVar, Collection collection) {
        collection.getClass();
        if (collection instanceof y7.q) {
            collection = ((y7.q) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= xVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= xVar.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = xVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
