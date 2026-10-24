package u2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d implements f1 {
    public final f1 a;
    public boolean b;
    public final /* synthetic */ e c;

    public d(e eVar, f1 f1Var) {
        this.c = eVar;
        this.a = f1Var;
    }

    @Override // u2.f1
    public final void a() {
        this.a.a();
    }

    @Override // u2.f1
    public final boolean f() {
        return !this.c.e() && this.a.f();
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.c;
        if (eVar.e()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int g10 = this.a.g(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && g10 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (g10 != -5) {
            long j10 = eVar.h;
            if (j10 == Long.MIN_VALUE || ((g10 != -4 || hVar.e < j10) && !(g10 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
                return g10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = eVar.f;
        long j12 = eVar.h;
        b2.w wVar = (b2.w) bVar.c;
        wVar.getClass();
        int i11 = wVar.O;
        int i12 = wVar.N;
        if (i12 != 0 || i11 != 0) {
            if (j11 != 0) {
                i12 = 0;
            }
            if (j12 != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.v a2 = wVar.a();
            a2.M = i12;
            a2.N = i11;
            bVar.c = new b2.w(a2);
        }
        return -5;
    }

    @Override // u2.f1
    public final int m(long j10) {
        if (this.c.e()) {
            return -3;
        }
        return this.a.m(j10);
    }
}
