package s8;

import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k0 extends z {
    public final transient x d;
    public final transient Object[] e;
    public final transient int f;

    public k0(x xVar, Object[] objArr, int i10) {
        this.d = xVar;
        this.e = objArr;
        this.f = i10;
    }

    @Override // s8.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // s8.q
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override // s8.q
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // s8.z
    public final v v() {
        return new j0(this);
    }

    @Override // s8.z
    /* renamed from: w */
    public final u0 iterator() {
        return i().listIterator(0);
    }
}
