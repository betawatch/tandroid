// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vq9 extends wq9 implements Iterator {
    public uq9 a;
    public boolean b = true;
    public final /* synthetic */ xq9 c;

    public vq9(xq9 xq9Var) {
        this.c = xq9Var;
    }

    @Override // wq9
    public final void a(uq9 uq9Var) {
        uq9 uq9Var2 = this.a;
        if (uq9Var == uq9Var2) {
            uq9 uq9Var3 = uq9Var2.d;
            this.a = uq9Var3;
            this.b = uq9Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        uq9 uq9Var = this.a;
        return (uq9Var == null || uq9Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            uq9 uq9Var = this.c.a;
            this.a = uq9Var;
            return uq9Var;
        }
        uq9 uq9Var2 = this.a;
        uq9 uq9Var3 = uq9Var2 != null ? uq9Var2.c : null;
        this.a = uq9Var3;
        return uq9Var3;
    }
}
