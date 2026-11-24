// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rfd extends add {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public rfd(f7d f7dVar, Object[] objArr) {
        super((byte) 1);
        this.h = f7dVar;
        this.n = objArr;
        this.r = true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // x8d
    public final int h(Object[] objArr) {
        ncd ncdVar = this.f;
        if (ncdVar == null) {
            ncdVar = new mfd(this);
            this.f = ncdVar;
        }
        return ncdVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ncd ncdVar = this.f;
        if (ncdVar == null) {
            ncdVar = new mfd(this);
            this.f = ncdVar;
        }
        return ncdVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
