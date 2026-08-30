package r4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        long q10;
        long q11;
        h c3 = this.b.c();
        h c10 = mVar.c();
        if (c3 == null) {
            return new i(j10, mVar, this.c, this.a, this.f, c3);
        }
        if (!c3.w()) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        long U = c3.U(j10);
        if (U == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        long S = c3.S();
        long a2 = c3.a(S);
        long j11 = U + S;
        long j12 = j11 - 1;
        long e = c3.e(j12, j10) + c3.a(j12);
        long S2 = c10.S();
        long a10 = c10.a(S2);
        long j13 = this.f;
        if (e == a10) {
            q10 = j11 - S2;
        } else {
            if (e < a10) {
                throw new o4.b();
            }
            if (a10 < a2) {
                q11 = j13 - (c10.q(a2, j10) - S);
                return new i(j10, mVar, this.c, this.a, q11, c10);
            }
            q10 = c3.q(a10, j10) - S2;
        }
        q11 = q10 + j13;
        return new i(j10, mVar, this.c, this.a, q11, c10);
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.W(j11, j10) + (hVar.j(j11, j10) + this.f)) - 1;
    }

    public final long c(long j10) {
        return this.d.e(j10 - this.f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f);
    }
}
