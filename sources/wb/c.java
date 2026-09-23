package wb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
