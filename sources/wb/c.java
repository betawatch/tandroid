package wb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(yb.a.class)) {
                Integer num = (Integer) hashMap.get(yb.a.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(yb.a.class, bVar.a);
            hashMap.put(yb.a.class, 0);
        }
    }
}
