package w7;

import a8.v;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i extends f {
    public final transient v c;
    public final transient Object[] d;
    public final transient int e;

    public i(v vVar, Object[] objArr, int i7) {
        this.c = vVar;
        this.d = objArr;
        this.e = i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // w7.a
    public final int f(Object[] objArr) {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
