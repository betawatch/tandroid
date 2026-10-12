package u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d implements d1 {
    public final d1 a;
    public boolean b;
    public final /* synthetic */ e c;

    public d(e eVar, d1 d1Var) {
        this.c = eVar;
        this.a = d1Var;
    }

    @Override // u2.d1
    public final void d() {
        this.a.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // u2.d1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.c;
        if (eVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int f7 = this.a.f(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && f7 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (f7 != -5) {
            long j10 = eVar.h;
            if (j10 == Long.MIN_VALUE || ((f7 != -4 || hVar.e < j10) && !(f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
                return f7;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = eVar.f;
        long j12 = eVar.h;
        b2.x xVar = (b2.x) bVar.c;
        xVar.getClass();
        int i11 = xVar.O;
        int i12 = xVar.N;
        if (i12 != 0 || i11 != 0) {
            if (j11 != 0) {
                i12 = 0;
            }
            if (j12 != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.w a2 = xVar.a();
            a2.M = i12;
            a2.N = i11;
            bVar.c = new b2.x(a2);
        }
        return -5;
    }

    @Override // u2.d1
    public final int m(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.m(j10);
    }
}
