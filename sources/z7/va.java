package z7;

import c8.ie;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class va extends ta {
    public static final va e = new va(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public va(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // z7.ta, z7.l9
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ie.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // z7.l9
    public final int i() {
        return this.d;
    }

    @Override // z7.l9
    public final int j() {
        return 0;
    }

    @Override // z7.l9
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
