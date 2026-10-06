package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public abstract class m8 {
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
