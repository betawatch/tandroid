package u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final void d() {
        this.a.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long q5 = dVar.q();
        int f7 = this.a.f(sVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && f7 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (f7 != -5) {
            long j10 = dVar.h;
            if (j10 == Long.MIN_VALUE || ((f7 != -4 || hVar.e < j10) && !(f7 == -3 && q5 == Long.MIN_VALUE && !hVar.d))) {
                return f7;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = dVar.f;
        long j12 = dVar.h;
        b2.x xVar = (b2.x) sVar.c;
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
            sVar.c = new b2.x(a2);
        }
        return -5;
    }

    @Override // u2.d1
    public final int j(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.j(j10);
    }
}
