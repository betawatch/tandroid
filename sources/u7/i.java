package u7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends f {
    public final transient a8.m c;
    public final transient Object[] d;
    public final transient int e;

    public i(a8.m mVar, Object[] objArr, int i10) {
        this.c = mVar;
        this.d = objArr;
        this.e = i10;
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

    @Override // u7.a
    public final int h(Object[] objArr) {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.h(objArr);
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
