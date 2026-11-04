package y3;

import g2.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final y f;
    public final y g;
    public int h;
    public int i;

    public a(y yVar, y yVar2, boolean z10) {
        this.g = yVar;
        this.f = yVar2;
        this.e = z10;
        yVar2.N(12);
        this.a = yVar2.E();
        yVar.N(12);
        this.i = yVar.E();
        e3.b.b("first_chunk must be 1", yVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 == this.a) {
            return false;
        }
        boolean z10 = this.e;
        y yVar = this.f;
        this.d = z10 ? yVar.G() : yVar.C();
        if (this.b == this.h) {
            y yVar2 = this.g;
            this.c = yVar2.E();
            yVar2.O(4);
            int i10 = this.i - 1;
            this.i = i10;
            this.h = i10 > 0 ? yVar2.E() - 1 : -1;
        }
        return true;
    }
}
