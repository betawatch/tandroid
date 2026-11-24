// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y79 extends mo5 {
    public static final y79 e = new y79(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public y79(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jte.j(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // mo5, go5
    public final int i(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // go5
    public final Object[] j() {
        return this.c;
    }

    @Override // go5
    public final int k() {
        return this.d;
    }

    @Override // go5
    public final int l() {
        return 0;
    }

    @Override // go5
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
