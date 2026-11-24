// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y59 extends ym5 {
    public final transient qm5 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;

    /* JADX WARN: Multi-variable type inference failed */
    public y59(qm5 qm5Var, Object[] objArr, int i, int i2) {
        this.d = qm5Var;
        this.e = objArr;
        this.f = i;
        this.h = i2;
    }

    @Override // gm5, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // gm5
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override // gm5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v5c iterator() {
        return h().listIterator(0);
    }

    @Override // ym5
    public final mm5 r() {
        return new x59(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
