// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x79 extends co5 {
    public static final x79 r = new x79();
    public final transient Object d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;
    public final transient x79 n;

    public x79(int i, Object[] objArr) {
        this.e = objArr;
        this.h = i;
        this.f = false;
        int o = i >= 2 ? yo5.o(i) : 0;
        Object h = d89.h(objArr, i, o, 0);
        if (h instanceof Object[]) {
            throw ((po5) ((Object[]) h)[2]).a();
        }
        this.d = h;
        Object h2 = d89.h(objArr, i, o, 1);
        if (h2 instanceof Object[]) {
            throw ((po5) ((Object[]) h2)[2]).a();
        }
        this.n = new x79(h2, objArr, i, this);
    }

    @Override // qo5
    public final a89 c() {
        boolean z = this.f;
        return new a89(this, this.e, z ? 1 : 0, this.h);
    }

    @Override // qo5
    public final b89 d() {
        boolean z = this.f;
        return new b89(this, new c89(z ? 1 : 0, this.h, this.e));
    }

    @Override // qo5, java.util.Map
    public final Object get(Object obj) {
        Object i = d89.i(this.d, this.e, this.h, this.f ? 1 : 0, obj);
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public x79() {
        this.d = null;
        this.e = new Object[0];
        this.f = false;
        this.h = 0;
        this.n = this;
    }

    public x79(Object obj, Object[] objArr, int i, x79 x79Var) {
        this.d = obj;
        this.e = objArr;
        this.f = true;
        this.h = i;
        this.n = x79Var;
    }
}
