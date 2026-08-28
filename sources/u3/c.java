package u3;

import d5.y;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final y f;
    public final y g;
    public int h;
    public int i;

    public c(y yVar, y yVar2, boolean z10) {
        this.g = yVar;
        this.f = yVar2;
        this.e = z10;
        yVar2.C(12);
        this.a = yVar2.u();
        yVar.C(12);
        this.i = yVar.u();
        g7.q.a("first_chunk must be 1", yVar.e() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i9 = this.b + 1;
        this.b = i9;
        if (i9 == this.a) {
            return false;
        }
        boolean z10 = this.e;
        y yVar = this.f;
        this.d = z10 ? yVar.v() : yVar.s();
        if (this.b == this.h) {
            y yVar2 = this.g;
            this.c = yVar2.u();
            yVar2.D(4);
            int i10 = this.i - 1;
            this.i = i10;
            this.h = i10 > 0 ? yVar2.u() - 1 : -1;
        }
        return true;
    }
}
