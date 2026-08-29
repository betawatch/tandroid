package q8;

import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // q8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // q8.u
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override // q8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // q8.c0
    public final z v() {
        return new m0(this);
    }

    @Override // q8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
