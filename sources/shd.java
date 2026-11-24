// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class shd extends cfd {
    public final transient h9d h;
    public final transient Object[] n;
    public final transient boolean r;

    public shd(h9d h9dVar, Object[] objArr) {
        super((byte) 1);
        this.h = h9dVar;
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

    @Override // zad
    public final int h(Object[] objArr) {
        ped pedVar = this.f;
        if (pedVar == null) {
            pedVar = new nhd(this);
            this.f = pedVar;
        }
        return pedVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ped pedVar = this.f;
        if (pedVar == null) {
            pedVar = new nhd(this);
            this.f = pedVar;
        }
        return pedVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
