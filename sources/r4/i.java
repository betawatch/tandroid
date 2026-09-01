package r4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i {
    public final q4.d a;
    public final s4.m b;
    public final s4.b c;
    public final h d;
    public final long e;
    public final long f;

    public i(long j10, s4.m mVar, s4.b bVar, q4.d dVar, long j11, h hVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, s4.m mVar) {
        long t6;
        long t9;
        h c3 = this.b.c();
        h c10 = mVar.c();
        if (c3 == null) {
            return new i(j10, mVar, this.c, this.a, this.f, c3);
        }
        if (!c3.A()) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        long F = c3.F(j10);
        if (F == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        long C = c3.C();
        long a2 = c3.a(C);
        long j11 = F + C;
        long j12 = j11 - 1;
        long h = c3.h(j12, j10) + c3.a(j12);
        long C2 = c10.C();
        long a10 = c10.a(C2);
        long j13 = this.f;
        if (h == a10) {
            t6 = j11 - C2;
        } else {
            if (h < a10) {
                throw new o4.b();
            }
            if (a10 < a2) {
                t9 = j13 - (c10.t(a2, j10) - C);
                return new i(j10, mVar, this.c, this.a, t9, c10);
            }
            t6 = c3.t(a10, j10) - C2;
        }
        t9 = t6 + j13;
        return new i(j10, mVar, this.c, this.a, t9, c10);
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.I(j11, j10) + (hVar.m(j11, j10) + this.f)) - 1;
    }

    public final long c(long j10) {
        return this.d.h(j10 - this.f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f);
    }
}
