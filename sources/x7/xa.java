package x7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class xa extends ua {
    public final transient a8.m c;
    public final transient Object[] d;
    public final transient int e = 1;

    public xa(a8.m mVar, Object[] objArr) {
        this.c = mVar;
        this.d = objArr;
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

    @Override // x7.l9
    public final int h(Object[] objArr) {
        ta taVar = this.b;
        if (taVar == null) {
            taVar = new wa(this);
            this.b = taVar;
        }
        return taVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ta taVar = this.b;
        if (taVar == null) {
            taVar = new wa(this);
            this.b = taVar;
        }
        return taVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
