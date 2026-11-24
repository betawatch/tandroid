// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q7d extends a7d {
    public static final q7d w = new q7d(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public q7d(int i, Object[] objArr) {
        super((byte) 3);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u3f.a(i, this.s);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // kzc
    public final Object[] r() {
        return this.r;
    }

    @Override // kzc
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // kzc
    public final int t() {
        return this.s;
    }

    @Override // a7d, kzc
    public final int w(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
