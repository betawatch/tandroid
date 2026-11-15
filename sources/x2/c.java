package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c implements b1 {
    public final b1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, b1 b1Var) {
        this.c = dVar;
        this.a = b1Var;
    }

    @Override // x2.b1
    public final void a() {
        this.a.a();
    }

    @Override // x2.b1
    public final boolean f() {
        return !this.c.a() && this.a.f();
    }

    @Override // x2.b1
    public final int n(long j3) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.n(j3);
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s5 = dVar.s();
        int q10 = this.a.q(aVar, hVar, i7);
        if (dVar.e != -9223372036854775807L && q10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (q10 != -5) {
            long j3 = dVar.h;
            if (j3 == Long.MIN_VALUE || ((q10 != -4 || hVar.e < j3) && !(q10 == -3 && s5 == Long.MIN_VALUE && !hVar.d))) {
                return q10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j10 = dVar.f;
        long j11 = dVar.h;
        e2.u uVar = (e2.u) aVar.c;
        uVar.getClass();
        int i10 = uVar.O;
        int i11 = uVar.N;
        if (i11 != 0 || i10 != 0) {
            if (j10 != 0) {
                i11 = 0;
            }
            if (j11 != Long.MIN_VALUE) {
                i10 = 0;
            }
            e2.t a10 = uVar.a();
            a10.M = i11;
            a10.N = i10;
            aVar.c = new e2.u(a10);
        }
        return -5;
    }
}
