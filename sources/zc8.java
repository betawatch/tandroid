// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zc8 extends aob {
    public static final Object j = new Object();
    public final br6 e;
    public final boolean f;
    public final boolean g;
    public final wq6 h;
    public final long i;

    public zc8(ad8 ad8Var) {
        this.e = ad8Var.u();
        this.f = ad8Var.c0();
        this.g = ad8Var.u0();
        this.h = ad8Var.P0() ? wq6.f : null;
        this.i = g8c.T(ad8Var.z());
    }

    @Override // aob
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        da daVar = da.c;
        Object obj = j;
        xnbVar.h(obj, obj, 0, this.i, 0L, false);
        return xnbVar;
    }

    @Override // aob
    public final int h() {
        return 1;
    }

    @Override // aob
    public final Object l(int i) {
        return j;
    }

    @Override // aob
    public final znb m(int i, znb znbVar, long j2) {
        znbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        znbVar.j = false;
        return znbVar;
    }

    @Override // aob
    public final int o() {
        return 1;
    }
}
