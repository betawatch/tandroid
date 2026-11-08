package vb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(xb.a.class)) {
                Integer num = (Integer) hashMap.get(xb.a.class);
                m.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(xb.a.class, bVar.a);
            hashMap.put(xb.a.class, 0);
        }
    }
}
