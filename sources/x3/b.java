package x3;

import c3.c0;
import c3.p;
import e2.m0;
import java.io.EOFException;
import java.io.IOException;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
    public long v;
    public long w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        u6.g(j10 >= 0 && j11 > j10);
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

    @Override // x3.g
    public final void X(long j10) {
        this.n = m0.j(j10, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.v = 0L;
        this.w = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // x3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(p pVar) {
        long j10;
        long j11;
        long j12;
        int i10 = this.e;
        long j13 = this.c;
        f fVar = this.a;
        if (i10 == 0) {
            j10 = 0;
            long position = pVar.getPosition();
            this.h = position;
            this.e = 1;
            long j14 = j13 - 65307;
            if (j14 > position) {
                return j14;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.r == this.s) {
                    j12 = -1;
                } else {
                    long position2 = pVar.getPosition();
                    if (fVar.b(pVar, this.s)) {
                        fVar.a(pVar, false);
                        pVar.q();
                        long j15 = this.n;
                        long j16 = fVar.b;
                        long j17 = j15 - j16;
                        j11 = 2;
                        int i11 = fVar.d + fVar.e;
                        if (0 > j17 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.s = position2;
                                this.w = j16;
                            } else {
                                this.r = pVar.getPosition() + i11;
                                this.v = fVar.b;
                            }
                            long j18 = this.s;
                            long j19 = this.r;
                            if (j18 - j19 < 100000) {
                                this.s = j19;
                                j12 = j19;
                            } else {
                                long position3 = pVar.getPosition() - (i11 * (j17 <= 0 ? 2L : 1L));
                                long j20 = this.s;
                                long j21 = this.r;
                                j12 = m0.j((((j20 - j21) * j17) / (this.w - this.v)) + position3, j21, j20 - 1);
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
                if (i10 != 3) {
                    if (i10 == 4) {
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
                    pVar.q();
                    this.e = 4;
                    return -(this.v + j11);
                }
                pVar.r(fVar.d + fVar.e);
                this.r = pVar.getPosition();
                this.v = fVar.b;
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
        pVar.r(fVar.d + fVar.e);
        long j22 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(pVar, -1L) && pVar.getPosition() < j13 && fVar.a(pVar, true)) {
            try {
                pVar.r(fVar.d + fVar.e);
                j22 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j22;
        this.e = 4;
        return this.h;
    }

    @Override // x3.g
    public final c0 x() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }
}
