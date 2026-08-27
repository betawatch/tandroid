package p8;

import i7.wa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 extends k implements Serializable {
    public transient Map d;
    public transient int e;
    public transient g0 f;

    @Override // p8.k
    public final wa a() {
        wa waVar = this.c;
        if (waVar != null) {
            return waVar;
        }
        Map map = this.d;
        wa dVar = map instanceof NavigableMap ? new d(this, (NavigableMap) map) : map instanceof SortedMap ? new g(this, (SortedMap) map) : new wa(this, map, 2);
        this.c = dVar;
        return dVar;
    }

    public final void b() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }
}
