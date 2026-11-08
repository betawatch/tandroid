package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public final void f() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.keySet().iterator();
    }
}
