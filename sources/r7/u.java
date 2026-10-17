package r7;

import w7.a7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class u extends t {
    public static final u e = new u(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public u(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a7.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // r7.t, r7.q
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // r7.q
    public final int m() {
        return this.d;
    }

    @Override // r7.q
    public final int n() {
        return 0;
    }

    @Override // r7.q
    public final boolean o() {
        return false;
    }

    @Override // r7.q
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
