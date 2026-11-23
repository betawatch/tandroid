package x2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c implements d1 {
    public final d1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, d1 d1Var) {
        this.c = dVar;
        this.a = d1Var;
    }

    @Override // x2.d1
    public final void a() {
        this.a.a();
    }

    @Override // x2.d1
    public final boolean h() {
        return !this.c.a() && this.a.h();
    }

    @Override // x2.d1
    public final int j(long j3) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.j(j3);
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = dVar.r();
        int m10 = this.a.m(aVar, hVar, i7);
        if (dVar.e != -9223372036854775807L && m10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (m10 != -5) {
            long j3 = dVar.h;
            if (j3 == Long.MIN_VALUE || ((m10 != -4 || hVar.e < j3) && !(m10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
                return m10;
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
