// default package

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class va3 extends cie implements Map {
    public final Map b;

    public va3(Map map) {
        this.b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        mi6 mi6Var = new mi6(entrySet().iterator());
        if (obj == null) {
            while (mi6Var.hasNext()) {
                if (mi6Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (mi6Var.hasNext()) {
            if (obj.equals(mi6Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // cie
    public final Object d() {
        return this.b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return yte.b(this.b.entrySet(), new ua3((byte) 0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && coe.b(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return yte.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return yte.b(this.b.keySet(), new ua3((byte) 1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.b.values();
    }
}
