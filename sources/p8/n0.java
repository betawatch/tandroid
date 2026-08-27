package p8;

import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n0 extends c0 {
    public final transient b0 d;
    public final transient Object[] e;
    public final transient int f;

    public n0(b0 b0Var, Object[] objArr, int i10) {
        this.d = b0Var;
        this.e = objArr;
        this.f = i10;
    }

    @Override // p8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p8.u
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override // p8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // p8.c0
    public final z v() {
        return new m0(this);
    }

    @Override // p8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
