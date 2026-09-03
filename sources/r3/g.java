package r3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class g implements s {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public g(long j10, int i10, int i11, boolean z4, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.g = z4;
        if (j10 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.d = j12;
            this.f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }

    @Override // r3.s
    public final boolean c() {
        return this.d != -1 || this.g;
    }

    @Override // r3.s
    public final r f(long j10) {
        long j11 = this.b;
        long j12 = this.d;
        if (j12 == -1 && !this.g) {
            t tVar = new t(0L, j11);
            return new r(tVar, tVar);
        }
        int i10 = this.e;
        long j13 = this.c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i10;
        t tVar2 = new t(max2, max);
        if (j12 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.a) {
                return new r(tVar2, new t((Math.max(0L, j15 - j11) * 8000000) / i10, j15));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override // r3.s
    public final long g() {
        return this.f;
    }
}
