package z3;

import h5.w;
import k7.t6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final w f;
    public final w g;
    public int h;
    public int i;

    public c(w wVar, w wVar2, boolean z4) {
        this.g = wVar;
        this.f = wVar2;
        this.e = z4;
        wVar2.F(12);
        this.a = wVar2.x();
        wVar.F(12);
        this.i = wVar.x();
        t6.a("first_chunk must be 1", wVar.g() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == this.a) {
            return false;
        }
        boolean z4 = this.e;
        w wVar = this.f;
        this.d = z4 ? wVar.y() : wVar.v();
        if (this.b == this.h) {
            w wVar2 = this.g;
            this.c = wVar2.x();
            wVar2.G(4);
            int i11 = this.i - 1;
            this.i = i11;
            this.h = i11 > 0 ? wVar2.x() - 1 : -1;
        }
        return true;
    }
}
