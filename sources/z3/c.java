package z3;

import android.util.Pair;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p;
import f5.d0;
import i7.v8;
import j3.t1;
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        byte[] bArr;
        int u10;
        f5.a.j(this.b);
        int i10 = d0.a;
        int i11 = this.c;
        if (i11 == 0) {
            f5.a.i(((h) lVar).d == 0);
            int i12 = this.f;
            if (i12 != -1) {
                ((h) lVar).t(i12);
                this.c = 4;
                return 0;
            }
            if (!v8.a(lVar)) {
                throw t1.a("Unsupported or unrecognized wav file type.", null);
            }
            h hVar = (h) lVar;
            hVar.t((int) (hVar.h() - hVar.d));
            this.c = 1;
            return 0;
        }
        long j10 = -1;
        if (i11 == 1) {
            f5.w wVar = new f5.w(8);
            k0 b10 = k0.b(lVar, wVar);
            if (b10.a != 1685272116) {
                ((h) lVar).f = 0;
            } else {
                h hVar2 = (h) lVar;
                hVar2.b(8, false);
                wVar.C(0);
                hVar2.f(wVar.a, 0, 8, false);
                j10 = wVar.h();
                hVar2.t(((int) b10.b) + 8);
            }
            this.d = j10;
            this.c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                f5.a.i(this.g != -1);
                long j11 = this.g - ((h) lVar).d;
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(lVar, j11) ? -1 : 0;
            }
            ((h) lVar).f = 0;
            k0 b11 = v8.b(1684108385, lVar, new f5.w(8));
            h hVar3 = (h) lVar;
            hVar3.t(8);
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
                f5.a.K("WavExtractor", "Data exceeds input length: " + this.g + ", " + j14);
                this.g = j14;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        f5.w wVar2 = new f5.w(16);
        long j15 = v8.b(1718449184, lVar, wVar2).b;
        f5.a.i(j15 >= 16);
        h hVar4 = (h) lVar;
        hVar4.f(wVar2.a, 0, 16, false);
        wVar2.C(0);
        int k9 = wVar2.k();
        int k10 = wVar2.k();
        int j16 = wVar2.j();
        wVar2.j();
        int k11 = wVar2.k();
        int k12 = wVar2.k();
        int i13 = ((int) j15) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            hVar4.f(bArr, 0, i13, false);
        } else {
            bArr = d0.f;
        }
        hVar4.t((int) (hVar4.h() - hVar4.d));
        a4.k kVar = new a4.k();
        kVar.a = k10;
        kVar.b = j16;
        kVar.c = k11;
        kVar.d = k12;
        kVar.e = bArr;
        if (k9 == 17) {
            this.e = new a(this.a, this.b, kVar);
        } else if (k9 == 6) {
            this.e = new p(this.a, this.b, kVar, "audio/g711-alaw", -1);
        } else if (k9 == 7) {
            this.e = new p(this.a, this.b, kVar, "audio/g711-mlaw", -1);
        } else {
            if (k9 != 1) {
                if (k9 == 3) {
                    if (k12 == 32) {
                        u10 = 4;
                        if (u10 == 0) {
                            throw t1.c("Unsupported WAV format type: " + k9);
                        }
                        this.e = new p(this.a, this.b, kVar, "audio/raw", u10);
                    }
                }
                u10 = 0;
                if (u10 == 0) {
                }
            }
            u10 = d0.u(k12);
            if (u10 == 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        return v8.a(lVar);
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        this.c = j10 == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // o3.k
    public final void i(m mVar) {
        this.a = mVar;
        this.b = mVar.Z1(0, 1);
        mVar.e1();
    }

    @Override // o3.k
    public final void release() {
    }
}
