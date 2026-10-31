package sc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements Iterable {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.a.put(split[0], split[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.keySet().iterator();
    }

    public final void l() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw a1.g.h(it);
        }
    }
}
