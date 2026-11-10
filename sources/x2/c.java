package x2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        return !this.c.f() && this.a.f();
    }

    @Override // x2.b1
    public final int l(long j3) {
        if (this.c.f()) {
            return -3;
        }
        return this.a.l(j3);
    }

    @Override // x2.b1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        d dVar = this.c;
        if (dVar.f()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long p10 = dVar.p();
        int m10 = this.a.m(bVar, hVar, i7);
        if (dVar.e != -9223372036854775807L && m10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (m10 != -5) {
            long j3 = dVar.h;
            if (j3 == Long.MIN_VALUE || ((m10 != -4 || hVar.e < j3) && !(m10 == -3 && p10 == Long.MIN_VALUE && !hVar.d))) {
                return m10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j10 = dVar.f;
        long j11 = dVar.h;
        e2.u uVar = (e2.u) bVar.c;
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
            bVar.c = new e2.u(a10);
        }
        return -5;
    }
}
