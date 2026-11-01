package pb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
