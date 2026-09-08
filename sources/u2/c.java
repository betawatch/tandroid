package u2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements b1 {
    public final b1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, b1 b1Var) {
        this.c = dVar;
        this.a = b1Var;
    }

    @Override // u2.b1
    public final void b() {
        this.a.b();
    }

    @Override // u2.b1
    public final boolean e() {
        return !this.c.e() && this.a.e();
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.c;
        if (dVar.e()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.a.f(yVar, hVar, i10);
        if (f7 != -5) {
            long j3 = dVar.f;
            if (j3 == Long.MIN_VALUE || ((f7 != -4 || hVar.e < j3) && !(f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
                return f7;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        b2.s sVar = (b2.s) yVar.c;
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
        yVar.c = new b2.s(a2);
        return -5;
    }

    @Override // u2.b1
    public final int m(long j3) {
        if (this.c.e()) {
            return -3;
        }
        return this.a.m(j3);
    }
}
