package pb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(rb.a.class)) {
                Integer num = (Integer) hashMap.get(rb.a.class);
                l.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(rb.a.class, bVar.a);
            hashMap.put(rb.a.class, 0);
        }
    }
}
