package u3;

import d5.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final z f;
    public final z g;
    public int h;
    public int i;

    public c(z zVar, z zVar2, boolean z10) {
        this.g = zVar;
        this.f = zVar2;
        this.e = z10;
        zVar2.C(12);
        this.a = zVar2.u();
        zVar.C(12);
        this.i = zVar.u();
        h7.q.a("first_chunk must be 1", zVar.e() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == this.a) {
            return false;
        }
        boolean z10 = this.e;
        z zVar = this.f;
        this.d = z10 ? zVar.v() : zVar.s();
        if (this.b == this.h) {
            z zVar2 = this.g;
            this.c = zVar2.u();
            zVar2.D(4);
            int i11 = this.i - 1;
            this.i = i11;
            this.h = i11 > 0 ? zVar2.u() - 1 : -1;
        }
        return true;
    }
}
