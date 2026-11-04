package sb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(ub.a.class)) {
                Integer num = (Integer) hashMap.get(ub.a.class);
                m.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(ub.a.class, bVar.a);
            hashMap.put(ub.a.class, 0);
        }
    }
}
