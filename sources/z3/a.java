package z3;

import h2.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final x f;
    public final x g;
    public int h;
    public int i;

    public a(x xVar, x xVar2, boolean z9) {
        this.g = xVar;
        this.f = xVar2;
        this.e = z9;
        xVar2.N(12);
        this.a = xVar2.E();
        xVar.N(12);
        this.i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i7 = this.b + 1;
        this.b = i7;
        if (i7 == this.a) {
            return false;
        }
        boolean z9 = this.e;
        x xVar = this.f;
        this.d = z9 ? xVar.G() : xVar.C();
        if (this.b == this.h) {
            x xVar2 = this.g;
            this.c = xVar2.E();
            xVar2.O(4);
            int i10 = this.i - 1;
            this.i = i10;
            this.h = i10 > 0 ? xVar2.E() - 1 : -1;
        }
        return true;
    }
}
