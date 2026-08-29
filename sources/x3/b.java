package x3;

import f5.d0;
import java.io.EOFException;
import java.io.IOException;
import o3.l;
import o3.t;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        f5.a.f(j10 >= 0 && j11 > j10);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // x3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(l lVar) {
        long j10;
        long j11;
        long i10;
        int i11 = this.e;
        long j12 = this.c;
        f fVar = this.a;
        if (i11 == 0) {
            j10 = 0;
            long position = lVar.getPosition();
            this.h = position;
            this.e = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (this.r == this.s) {
                    i10 = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (fVar.b(lVar, this.s)) {
                        fVar.a(lVar, false);
                        lVar.s();
                        long j14 = this.n;
                        long j15 = fVar.b;
                        long j16 = j14 - j15;
                        j11 = 2;
                        int i12 = fVar.d + fVar.e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.s = position2;
                                this.w = j15;
                            } else {
                                this.r = lVar.getPosition() + i12;
                                this.v = fVar.b;
                            }
                            long j17 = this.s;
                            long j18 = this.r;
                            if (j17 - j18 < 100000) {
                                this.s = j18;
                                i10 = j18;
                            } else {
                                long position3 = lVar.getPosition() - (i12 * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.s;
                                long j20 = this.r;
                                i10 = d0.i((((j19 - j20) * j16) / (this.w - this.v)) + position3, j20, j19 - 1);
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
                j11 = 2;
                if (i10 == -1) {
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = 2;
            }
            while (true) {
                fVar.b(lVar, -1L);
                fVar.a(lVar, false);
                if (fVar.b > this.n) {
                    lVar.s();
                    this.e = 4;
                    return -(this.v + j11);
                }
                lVar.t(fVar.d + fVar.e);
                this.r = lVar.getPosition();
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
        if (!fVar.b(lVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(lVar, false);
        lVar.t(fVar.d + fVar.e);
        long j21 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(lVar, -1L) && lVar.getPosition() < j12 && fVar.a(lVar, true)) {
            try {
                lVar.t(fVar.d + fVar.e);
                j21 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j21;
        this.e = 4;
        return this.h;
    }

    @Override // x3.g
    public final t v() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // x3.g
    public final void z(long j10) {
        this.n = d0.i(j10, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.v = 0L;
        this.w = this.f;
    }
}
