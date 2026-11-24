// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x7e extends t6e {
    public final transient h9d s;
    public final transient Object[] w;
    public final transient int x;

    public x7e(h9d h9dVar, Object[] objArr, int i) {
        super((byte) 5);
        this.s = h9dVar;
        this.w = objArr;
        this.x = i;
    }

    public final x5e A() {
        return new r7e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        x5e x5eVar = this.n;
        if (x5eVar == null) {
            x5eVar = A();
            this.n = x5eVar;
        }
        return x5eVar.listIterator(0);
    }

    @Override // l1d
    public final int p(Object[] objArr) {
        x5e x5eVar = this.n;
        if (x5eVar == null) {
            x5eVar = A();
            this.n = x5eVar;
        }
        return x5eVar.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
