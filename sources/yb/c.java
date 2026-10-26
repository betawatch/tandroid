package yb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o6.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
