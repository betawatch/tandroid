package v3;

import d5.f0;
import java.io.EOFException;
import java.io.IOException;
import m3.l;
import m3.t;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        d5.a.f(j10 >= 0 && j11 > j10);
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

    @Override // v3.g
    public final t D() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // v3.g
    public final void O(long j10) {
        this.n = f0.i(j10, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.v = 0L;
        this.w = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // v3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(l lVar) {
        long j10;
        long j11;
        long i9;
        int i10 = this.e;
        long j12 = this.c;
        f fVar = this.a;
        if (i10 == 0) {
            j10 = 0;
            long position = lVar.getPosition();
            this.h = position;
            this.e = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.r == this.s) {
                    i9 = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (fVar.b(lVar, this.s)) {
                        fVar.a(lVar, false);
                        lVar.t();
                        long j14 = this.n;
                        long j15 = fVar.b;
                        long j16 = j14 - j15;
                        j11 = 2;
                        int i11 = fVar.d + fVar.e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.s = position2;
                                this.w = j15;
                            } else {
                                this.r = lVar.getPosition() + i11;
                                this.v = fVar.b;
                            }
                            long j17 = this.s;
                            long j18 = this.r;
                            if (j17 - j18 < 100000) {
                                this.s = j18;
                                i9 = j18;
                            } else {
                                long position3 = lVar.getPosition() - (i11 * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.s;
                                long j20 = this.r;
                                i9 = f0.i((((j19 - j20) * j16) / (this.w - this.v)) + position3, j20, j19 - 1);
                            }
                        } else {
                            i9 = -1;
                        }
                        if (i9 == -1) {
                            return i9;
                        }
                        this.e = 3;
                    } else {
                        i9 = this.r;
                        if (i9 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j11 = 2;
                if (i9 == -1) {
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
                fVar.b(lVar, -1L);
                fVar.a(lVar, false);
                if (fVar.b > this.n) {
                    lVar.t();
                    this.e = 4;
                    return -(this.v + j11);
                }
                lVar.u(fVar.d + fVar.e);
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
        lVar.u(fVar.d + fVar.e);
        long j21 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(lVar, -1L) && lVar.getPosition() < j12 && fVar.a(lVar, true)) {
            try {
                lVar.u(fVar.d + fVar.e);
                j21 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j21;
        this.e = 4;
        return this.h;
    }
}
