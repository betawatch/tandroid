package vb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q6.m;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                m.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(xb.a.class, bVar.a);
            hashMap.put(xb.a.class, 0);
        }
    }
}
