package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c implements c1 {
    public final c1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, c1 c1Var) {
        this.c = dVar;
        this.a = c1Var;
    }

    @Override // u2.c1
    public final void a() {
        this.a.a();
    }

    @Override // u2.c1
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // u2.c1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.a.f(bVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && f7 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (f7 != -5) {
            long j10 = dVar.h;
            if (j10 == Long.MIN_VALUE || ((f7 != -4 || hVar.e < j10) && !(f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
                return f7;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = dVar.f;
        long j12 = dVar.h;
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

    @Override // u2.c1
    public final int h(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.h(j10);
    }
}
