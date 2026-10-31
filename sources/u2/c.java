package u2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements d1 {
    public final d1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, d1 d1Var) {
        this.c = dVar;
        this.a = d1Var;
    }

    @Override // u2.d1
    public final void a() {
        this.a.a();
    }

    @Override // u2.d1
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // u2.d1
    public final int i(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.i(j10);
    }

    @Override // u2.d1
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int r10 = this.a.r(bVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && r10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (r10 != -5) {
            long j10 = dVar.h;
            if (j10 == Long.MIN_VALUE || ((r10 != -4 || hVar.e < j10) && !(r10 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
                return r10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = dVar.f;
        long j12 = dVar.h;
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
}
