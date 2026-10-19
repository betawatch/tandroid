package xb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(zb.a.class)) {
                Integer num = (Integer) hashMap.get(zb.a.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(zb.a.class, bVar.a);
            hashMap.put(zb.a.class, 0);
        }
    }
}
