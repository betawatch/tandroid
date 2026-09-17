package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class k8 {
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
