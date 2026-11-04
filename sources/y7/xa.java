package y7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class xa extends ua {
    public final transient b8.m c;
    public final transient Object[] d;
    public final transient int e = 1;

    public xa(b8.m mVar, Object[] objArr) {
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

    @Override // y7.l9
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
