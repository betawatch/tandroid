package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = dVar.r();
        int b10 = this.a.b(mVar, hVar, i7);
        if (dVar.e != -9223372036854775807L && b10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (b10 != -5) {
            long j3 = dVar.h;
            if (j3 == Long.MIN_VALUE || ((b10 != -4 || hVar.e < j3) && !(b10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
                return b10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j10 = dVar.f;
        long j11 = dVar.h;
        e2.u uVar = (e2.u) mVar.c;
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
            mVar.c = new e2.u(a10);
        }
        return -5;
    }

    @Override // x2.d1
    public final boolean h() {
        return !this.c.a() && this.a.h();
    }

    @Override // x2.d1
    public final int o(long j3) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.o(j3);
    }
}
