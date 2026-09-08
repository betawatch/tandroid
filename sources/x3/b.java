package x3;

import c3.b0;
import c3.p;
import e2.d0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        e2.d.b(j3 >= 0 && j10 > j3);
        this.d = iVar;
        this.b = j3;
        this.c = j10;
        if (j11 == j10 - j3 || z10) {
            this.f = j12;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // x3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(p pVar) {
        long j3;
        long j10;
        long i10;
        int i11 = this.e;
        long j11 = this.c;
        f fVar = this.a;
        if (i11 == 0) {
            j3 = 0;
            long position = pVar.getPosition();
            this.h = position;
            this.e = 1;
            long j12 = j11 - 65307;
            if (j12 > position) {
                return j12;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (this.r == this.s) {
                    i10 = -1;
                } else {
                    long position2 = pVar.getPosition();
                    if (fVar.b(pVar, this.s)) {
                        fVar.a(pVar, false);
                        pVar.q();
                        long j13 = this.n;
                        long j14 = fVar.b;
                        long j15 = j13 - j14;
                        j10 = 2;
                        int i12 = fVar.d + fVar.e;
                        if (0 > j15 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.s = position2;
                                this.w = j14;
                            } else {
                                this.r = pVar.getPosition() + i12;
                                this.v = fVar.b;
                            }
                            long j16 = this.s;
                            long j17 = this.r;
                            if (j16 - j17 < 100000) {
                                this.s = j17;
                                i10 = j17;
                            } else {
                                long position3 = pVar.getPosition() - (i12 * (j15 <= 0 ? 2L : 1L));
                                long j18 = this.s;
                                long j19 = this.r;
                                i10 = d0.i((((j18 - j19) * j15) / (this.w - this.v)) + position3, j19, j18 - 1);
                            }
                        } else {
                            i10 = -1;
                        }
                        if (i10 == -1) {
                            return i10;
                        }
                        this.e = 3;
                    } else {
                        i10 = this.r;
                        if (i10 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j10 = 2;
                if (i10 == -1) {
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = 2;
            }
            while (true) {
                fVar.b(pVar, -1L);
                fVar.a(pVar, false);
                if (fVar.b > this.n) {
                    pVar.q();
                    this.e = 4;
                    return -(this.v + j10);
                }
                pVar.r(fVar.d + fVar.e);
                this.r = pVar.getPosition();
                this.v = fVar.b;
            }
        } else {
            j3 = 0;
        }
        fVar.a = 0;
        fVar.b = j3;
        fVar.c = 0;
        fVar.d = 0;
        fVar.e = 0;
        if (!fVar.b(pVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(pVar, false);
        pVar.r(fVar.d + fVar.e);
        long j20 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(pVar, -1L) && pVar.getPosition() < j11 && fVar.a(pVar, true)) {
            try {
                pVar.r(fVar.d + fVar.e);
                j20 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j20;
        this.e = 4;
        return this.h;
    }

    @Override // x3.g
    public final b0 d() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // x3.g
    public final void h(long j3) {
        this.n = d0.i(j3, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.v = 0L;
        this.w = this.f;
    }
}
