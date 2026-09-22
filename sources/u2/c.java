package u2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        return !this.c.b() && this.a.e();
    }

    @Override // u2.c1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.c;
        if (dVar.b()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long t10 = dVar.t();
        int f7 = this.a.f(yVar, hVar, i10);
        if (f7 != -5) {
            long j3 = dVar.f;
            if (j3 == Long.MIN_VALUE || ((f7 != -4 || hVar.e < j3) && !(f7 == -3 && t10 == Long.MIN_VALUE && !hVar.d))) {
                return f7;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        b2.s sVar = (b2.s) yVar.b;
        sVar.getClass();
        int i11 = sVar.N;
        int i12 = sVar.M;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar.e != 0) {
            i12 = 0;
        }
        if (dVar.f != Long.MIN_VALUE) {
            i11 = 0;
        }
        b2.r a2 = sVar.a();
        a2.L = i12;
        a2.M = i11;
        yVar.b = new b2.s(a2);
        return -5;
    }

    @Override // u2.c1
    public final int j(long j3) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.j(j3);
    }
}
