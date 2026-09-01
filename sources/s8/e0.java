package s8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import l7.xa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e0 extends k implements Serializable {
    public transient Map d;
    public transient int e;
    public transient d0 f;

    @Override // s8.k
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
