package vb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q6.m;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
