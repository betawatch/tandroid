package x3;

import android.util.Pair;
import c2.b1;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p;
import d5.f0;
import d5.y;
import g7.c8;
import h3.t1;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements k {
    public m a;
    public w b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r9 != 65534) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        byte[] bArr;
        int u10;
        d5.a.j(this.b);
        int i9 = f0.a;
        int i10 = this.c;
        if (i10 == 0) {
            d5.a.i(((h) lVar).d == 0);
            int i11 = this.f;
            if (i11 != -1) {
                ((h) lVar).u(i11);
                this.c = 4;
                return 0;
            }
            if (!c8.a(lVar)) {
                throw t1.a("Unsupported or unrecognized wav file type.", null);
            }
            h hVar = (h) lVar;
            hVar.u((int) (hVar.k() - hVar.d));
            this.c = 1;
            return 0;
        }
        long j10 = -1;
        if (i10 == 1) {
            y yVar = new y(8);
            k0 b10 = k0.b(lVar, yVar);
            if (b10.a != 1685272116) {
                ((h) lVar).f = 0;
            } else {
                h hVar2 = (h) lVar;
                hVar2.a(8, false);
                yVar.C(0);
                hVar2.g(yVar.a, 0, 8, false);
                j10 = yVar.h();
                hVar2.u(((int) b10.b) + 8);
            }
            this.d = j10;
            this.c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                d5.a.i(this.g != -1);
                long j11 = this.g - ((h) lVar).d;
                b bVar = this.e;
                bVar.getClass();
                return bVar.a(lVar, j11) ? -1 : 0;
            }
            ((h) lVar).f = 0;
            k0 b11 = c8.b(1684108385, lVar, new y(8));
            h hVar3 = (h) lVar;
            hVar3.u(8);
            Pair create = Pair.create(Long.valueOf(hVar3.d), Long.valueOf(b11.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j12 = this.d;
            if (j12 != -1 && longValue == 4294967295L) {
                longValue = j12;
            }
            long j13 = this.f + longValue;
            this.g = j13;
            long j14 = hVar3.c;
            if (j14 != -1 && j13 > j14) {
                d5.a.K("WavExtractor", "Data exceeds input length: " + this.g + ", " + j14);
                this.g = j14;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        y yVar2 = new y(16);
        long j15 = c8.b(1718449184, lVar, yVar2).b;
        d5.a.i(j15 >= 16);
        h hVar4 = (h) lVar;
        hVar4.g(yVar2.a, 0, 16, false);
        yVar2.C(0);
        int k10 = yVar2.k();
        int k11 = yVar2.k();
        int j16 = yVar2.j();
        yVar2.j();
        int k12 = yVar2.k();
        int k13 = yVar2.k();
        int i12 = ((int) j15) - 16;
        if (i12 > 0) {
            bArr = new byte[i12];
            hVar4.g(bArr, 0, i12, false);
        } else {
            bArr = f0.f;
        }
        hVar4.u((int) (hVar4.k() - hVar4.d));
        b1 b1Var = new b1();
        b1Var.a = k11;
        b1Var.b = j16;
        b1Var.c = k12;
        b1Var.d = k13;
        b1Var.e = bArr;
        if (k10 == 17) {
            this.e = new a(this.a, this.b, b1Var);
        } else if (k10 == 6) {
            this.e = new p(this.a, this.b, b1Var, "audio/g711-alaw", -1);
        } else if (k10 == 7) {
            this.e = new p(this.a, this.b, b1Var, "audio/g711-mlaw", -1);
        } else {
            if (k10 != 1) {
                if (k10 == 3) {
                    if (k13 == 32) {
                        u10 = 4;
                        if (u10 == 0) {
                            throw t1.c("Unsupported WAV format type: " + k10);
                        }
                        this.e = new p(this.a, this.b, b1Var, "audio/raw", u10);
                    }
                }
                u10 = 0;
                if (u10 == 0) {
                }
            }
            u10 = f0.u(k13);
            if (u10 == 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.a = mVar;
        this.b = mVar.I(0, 1);
        mVar.B();
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        return c8.a(lVar);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.c = j10 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
