package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class f9 {
    public static boolean a(e9.j2 j2Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z7.l) {
            collection = ((z7.l) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= j2Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= j2Var.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = j2Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
