package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class l8 {
    public static boolean a(e9.l1 l1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof x7.r) {
            collection = ((x7.r) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= l1Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= l1Var.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = l1Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
