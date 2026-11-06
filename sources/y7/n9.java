package y7;

import c8.yd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n9 extends l9 {
    public static final n9 e = new n9(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public n9(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // y7.l9, y7.i9
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        yd.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // y7.i9
    public final int i() {
        return this.d;
    }

    @Override // y7.i9
    public final int j() {
        return 0;
    }

    @Override // y7.i9
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
