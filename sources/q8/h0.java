package q8;

import j7.xa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h0 extends k implements Serializable {
    public transient Map d;
    public transient int e;
    public transient g0 f;

    @Override // q8.k
    public final xa a() {
        xa xaVar = this.c;
        if (xaVar != null) {
            return xaVar;
        }
        Map map = this.d;
        xa dVar = map instanceof NavigableMap ? new d(this, (NavigableMap) map) : map instanceof SortedMap ? new g(this, (SortedMap) map) : new xa(this, map, 2);
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
