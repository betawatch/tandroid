package w3;

import f5.w;
import i7.h0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public c(w wVar, w wVar2, boolean z10) {
        this.g = wVar;
        this.f = wVar2;
        this.e = z10;
        wVar2.C(12);
        this.a = wVar2.u();
        wVar.C(12);
        this.i = wVar.u();
        h0.a("first_chunk must be 1", wVar.e() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == this.a) {
            return false;
        }
        boolean z10 = this.e;
        w wVar = this.f;
        this.d = z10 ? wVar.v() : wVar.s();
        if (this.b == this.h) {
            w wVar2 = this.g;
            this.c = wVar2.u();
            wVar2.D(4);
            int i11 = this.i - 1;
            this.i = i11;
            this.h = i11 > 0 ? wVar2.u() - 1 : -1;
        }
        return true;
    }
}
