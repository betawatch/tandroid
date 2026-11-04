package z3;

import b8.zb;
import e3.b0;
import e3.p;
import g2.n0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements g {
    public final f a;
    public final long b;
    public final long c;
    public final i d;
    public int e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        zb.f(j10 >= 0 && j11 > j10);
        this.d = iVar;
        this.b = j10;
        this.c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f = j13;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // z3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long D(p pVar) {
        long j10;
        long j11;
        long j12;
        int i3 = this.e;
        long j13 = this.c;
        f fVar = this.a;
        if (i3 == 0) {
            j10 = 0;
            long position = pVar.getPosition();
            this.h = position;
            this.e = 1;
            long j14 = j13 - 65307;
            if (j14 > position) {
                return j14;
            }
        } else if (i3 != 1) {
            if (i3 == 2) {
                if (this.r == this.s) {
                    j12 = -1;
                } else {
                    long position2 = pVar.getPosition();
                    if (fVar.b(pVar, this.s)) {
                        fVar.a(pVar, false);
                        pVar.o();
                        long j15 = this.n;
                        long j16 = fVar.b;
                        long j17 = j15 - j16;
                        j11 = 2;
                        int i10 = fVar.d + fVar.e;
                        if (0 > j17 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.s = position2;
                                this.x = j16;
                            } else {
                                this.r = pVar.getPosition() + i10;
                                this.w = fVar.b;
                            }
                            long j18 = this.s;
                            long j19 = this.r;
                            if (j18 - j19 < 100000) {
                                this.s = j19;
                                j12 = j19;
                            } else {
                                long position3 = pVar.getPosition() - (i10 * (j17 <= 0 ? 2L : 1L));
                                long j20 = this.s;
                                long j21 = this.r;
                                j12 = n0.j((((j20 - j21) * j17) / (this.x - this.w)) + position3, j21, j20 - 1);
                            }
                        } else {
                            j12 = -1;
                        }
                        if (j12 == -1) {
                            return j12;
                        }
                        this.e = 3;
                    } else {
                        j12 = this.r;
                        if (j12 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j11 = 2;
                if (j12 == -1) {
                }
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = 2;
            }
            while (true) {
                fVar.b(pVar, -1L);
                fVar.a(pVar, false);
                if (fVar.b > this.n) {
                    pVar.o();
                    this.e = 4;
                    return -(this.w + j11);
                }
                pVar.u(fVar.d + fVar.e);
                this.r = pVar.getPosition();
                this.w = fVar.b;
            }
        } else {
            j10 = 0;
        }
        fVar.a = 0;
        fVar.b = j10;
        fVar.c = 0;
        fVar.d = 0;
        fVar.e = 0;
        if (!fVar.b(pVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(pVar, false);
        pVar.u(fVar.d + fVar.e);
        long j22 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(pVar, -1L) && pVar.getPosition() < j13 && fVar.a(pVar, true)) {
            try {
                pVar.u(fVar.d + fVar.e);
                j22 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j22;
        this.e = 4;
        return this.h;
    }

    @Override // z3.g
    public final b0 O() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // z3.g
    public final void u0(long j10) {
        this.n = n0.j(j10, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
