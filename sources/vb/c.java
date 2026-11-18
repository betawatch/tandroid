package vb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q6.m;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
