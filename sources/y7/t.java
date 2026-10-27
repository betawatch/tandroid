package y7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t extends o {
    public final transient a8.m c;
    public final transient Object[] d;
    public final transient int e = 1;

    public t(a8.m mVar, Object[] objArr) {
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

    @Override // y7.j
    public final int h(Object[] objArr) {
        n nVar = this.b;
        if (nVar == null) {
            nVar = new s(this);
            this.b = nVar;
        }
        return nVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        n nVar = this.b;
        if (nVar == null) {
            nVar = new s(this);
            this.b = nVar;
        }
        return nVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
