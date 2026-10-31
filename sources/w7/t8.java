package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class t8 {
    public static boolean a(e9.j2 j2Var, Collection collection) {
        collection.getClass();
        if (collection instanceof x7.r) {
            collection = ((x7.r) collection).zza();
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
