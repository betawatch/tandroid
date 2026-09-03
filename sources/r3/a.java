package r3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements s {
    public final c a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.a = cVar;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = j14;
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        t tVar = new t(j10, b.a(this.a.k(j10), 0L, this.c, this.d, this.e, this.f));
        return new r(tVar, tVar);
    }

    @Override // r3.s
    public final long g() {
        return this.b;
    }
}
