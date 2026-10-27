package s7;

import a8.bg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        bg.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // s7.t, s7.q
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // s7.q
    public final int m() {
        return this.d;
    }

    @Override // s7.q
    public final int n() {
        return 0;
    }

    @Override // s7.q
    public final boolean o() {
        return false;
    }

    @Override // s7.q
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
