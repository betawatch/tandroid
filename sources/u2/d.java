package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d implements d1 {
    public final d1 a;
    public boolean b;
    public final /* synthetic */ e c;

    public d(e eVar, d1 d1Var) {
        this.c = eVar;
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
    public final int g(long j3) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.g(j3);
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        e eVar = this.c;
        if (eVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = eVar.r();
        int t10 = this.a.t(bVar, hVar, i10);
        if (t10 != -5) {
            long j3 = eVar.f;
            if (j3 == Long.MIN_VALUE || ((t10 != -4 || hVar.e < j3) && !(t10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
                return t10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        b2.s sVar = (b2.s) bVar.c;
        sVar.getClass();
        int i11 = sVar.N;
        int i12 = sVar.M;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (eVar.e != 0) {
            i12 = 0;
        }
        if (eVar.f != Long.MIN_VALUE) {
            i11 = 0;
        }
        b2.r a2 = sVar.a();
        a2.L = i12;
        a2.M = i11;
        bVar.c = new b2.s(a2);
        return -5;
    }
}
