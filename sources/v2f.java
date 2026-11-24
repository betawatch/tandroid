// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class v2f {
    public static boolean a(p9a p9aVar, Collection collection) {
        collection.getClass();
        if (collection instanceof zgd) {
            collection = ((zgd) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= p9aVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= p9aVar.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = p9aVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
