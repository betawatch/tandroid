package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    public final void i() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw a4.a.k(it);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.keySet().iterator();
    }
}
