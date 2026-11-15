package u7;

import c8.qc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class t extends s {
    public static final t e = new t(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public t(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // u7.s, u7.p
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        qc.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // u7.p
    public final int i() {
        return this.d;
    }

    @Override // u7.p
    public final int j() {
        return 0;
    }

    @Override // u7.p
    public final boolean k() {
        return false;
    }

    @Override // u7.p
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
