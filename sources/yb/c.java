package yb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(ac.b.class)) {
                Integer num = (Integer) hashMap.get(ac.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(ac.b.class, bVar.a);
            hashMap.put(ac.b.class, 0);
        }
    }
}
