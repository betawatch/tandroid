// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vtd extends qtd {
    public static final vtd e = new vtd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public vtd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k3f.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // qtd, dtd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // dtd
    public final int i() {
        return this.d;
    }

    @Override // dtd
    public final boolean k() {
        return false;
    }

    @Override // dtd
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
