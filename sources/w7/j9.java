package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class j9 {
    public static boolean a(e9.l1 l1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z7.l) {
            collection = ((z7.l) collection).zza();
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
