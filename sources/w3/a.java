package w3;

import e2.v;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final v f;
    public final v g;
    public int h;
    public int i;

    public a(v vVar, v vVar2, boolean z10) {
        this.g = vVar;
        this.f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.a = vVar2.B();
        vVar.J(12);
        this.i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == this.a) {
            return false;
        }
        boolean z10 = this.e;
        v vVar = this.f;
        this.d = z10 ? vVar.C() : vVar.z();
        if (this.b == this.h) {
            v vVar2 = this.g;
            this.c = vVar2.B();
            vVar2.K(4);
            int i11 = this.i - 1;
            this.i = i11;
            this.h = i11 > 0 ? vVar2.B() - 1 : -1;
        }
        return true;
    }
}
