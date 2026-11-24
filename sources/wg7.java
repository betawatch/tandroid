// default package

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wg7 extends q3 implements Serializable {
    public final transient Map e;
    public transient int f;
    public transient vg7 h;

    public wg7(Map map) {
        gre.f(map.isEmpty());
        this.e = map;
    }

    @Override // q3
    public final void b() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // q3
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new f3(this, (NavigableMap) map) : map instanceof SortedMap ? new i3(this, (SortedMap) map) : new d3(this, map, (byte) 0);
    }

    @Override // q3
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new g3(this, (NavigableMap) map) : map instanceof SortedMap ? new j3(this, (SortedMap) map) : new e3(this, map);
    }

    @Override // q3
    public final Collection g() {
        return super.g();
    }

    @Override // q3
    public final Iterator h() {
        return new a3(this, (byte) 1);
    }

    @Override // q3
    public final Collection i(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = m();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new h3(this, obj, list, null) : new l3(this, obj, list, (l3) null);
    }

    @Override // q3
    public final int l() {
        return this.f;
    }

    public final Collection m() {
        return (List) this.h.get();
    }
}
