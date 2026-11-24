// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xo5 extends eo5 {
    @Override // fo5
    public final /* bridge */ /* synthetic */ fo5 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final yo5 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = yo5.c;
            return f89.s;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            yo5 p = yo5.p(i, objArr);
            this.b = p.size();
            this.c = true;
            return p;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = yo5.c;
        return new vka(obj);
    }
}
