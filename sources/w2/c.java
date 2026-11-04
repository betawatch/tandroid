package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements d1 {
    public final d1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, d1 d1Var) {
        this.c = dVar;
        this.a = d1Var;
    }

    @Override // w2.d1
    public final void a() {
        this.a.a();
    }

    @Override // w2.d1
    public final boolean f() {
        return !this.c.a() && this.a.f();
    }

    @Override // w2.d1
    public final int m(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.m(j10);
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            hVar.setFlags(4);
            return -4;
        }
        long q10 = dVar.q();
        int o10 = this.a.o(bVar, hVar, i3);
        if (dVar.e != -9223372036854775807L && o10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (o10 != -5) {
            long j10 = dVar.h;
            if (j10 == Long.MIN_VALUE || ((o10 != -4 || hVar.e < j10) && !(o10 == -3 && q10 == Long.MIN_VALUE && !hVar.d))) {
                return o10;
            }
            hVar.clear();
            hVar.setFlags(4);
            this.b = true;
            return -4;
        }
        long j11 = dVar.f;
        long j12 = dVar.h;
        d2.v vVar = (d2.v) bVar.b;
        vVar.getClass();
        int i10 = vVar.O;
        int i11 = vVar.N;
        if (i11 != 0 || i10 != 0) {
            if (j11 != 0) {
                i11 = 0;
            }
            if (j12 != Long.MIN_VALUE) {
                i10 = 0;
            }
            d2.u a10 = vVar.a();
            a10.M = i11;
            a10.N = i10;
            bVar.b = new d2.v(a10);
        }
        return -5;
    }
}
