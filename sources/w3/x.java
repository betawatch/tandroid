package w3;

import android.util.SparseArray;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x implements m3.k {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public p3.a i;
    public m3.m j;
    public boolean k;
    public final d5.f0 a = new d5.f0(0);
    public final d5.z c = new d5.z(4096);
    public final SparseArray b = new SparseArray();
    public final v d = new v(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(m3.l lVar, m3.n nVar) {
        ?? r32;
        h jVar;
        long j10;
        long j11;
        d5.a.j(this.j);
        long j12 = ((m3.h) lVar).c;
        v vVar = this.d;
        if (j12 != -1 && !vVar.d) {
            d5.f0 f0Var = vVar.b;
            d5.z zVar = vVar.c;
            if (!vVar.f) {
                m3.h hVar = (m3.h) lVar;
                long j13 = hVar.c;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (hVar.d != j14) {
                    nVar.a = j14;
                    return 1;
                }
                zVar.z(min);
                hVar.f = 0;
                hVar.g(zVar.a, 0, min, false);
                int i10 = zVar.b;
                int i11 = zVar.c - 4;
                while (true) {
                    if (i11 < i10) {
                        j11 = -9223372036854775807L;
                        break;
                    }
                    if (v.b(i11, zVar.a) == 442) {
                        zVar.C(i11 + 4);
                        long c10 = v.c(zVar);
                        if (c10 != -9223372036854775807L) {
                            j11 = c10;
                            break;
                        }
                    }
                    i11--;
                }
                vVar.h = j11;
                vVar.f = true;
                return 0;
            }
            if (vVar.h == -9223372036854775807L) {
                vVar.a(lVar);
                return 0;
            }
            if (vVar.e) {
                long j15 = vVar.g;
                if (j15 == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                }
                long b10 = f0Var.b(vVar.h) - f0Var.b(j15);
                vVar.i = b10;
                if (b10 < 0) {
                    d5.a.K("PsDurationReader", "Invalid duration: " + vVar.i + ". Using TIME_UNSET instead.");
                    vVar.i = -9223372036854775807L;
                }
                vVar.a(lVar);
                return 0;
            }
            m3.h hVar2 = (m3.h) lVar;
            int min2 = (int) Math.min(20000L, hVar2.c);
            long j16 = 0;
            if (hVar2.d != j16) {
                nVar.a = j16;
                return 1;
            }
            zVar.z(min2);
            hVar2.f = 0;
            hVar2.g(zVar.a, 0, min2, false);
            int i12 = zVar.b;
            int i13 = zVar.c;
            while (true) {
                if (i12 >= i13 - 3) {
                    j10 = -9223372036854775807L;
                    break;
                }
                if (v.b(i12, zVar.a) == 442) {
                    zVar.C(i12 + 4);
                    long c11 = v.c(zVar);
                    if (c11 != -9223372036854775807L) {
                        j10 = c11;
                        break;
                    }
                }
                i12++;
            }
            vVar.g = j10;
            vVar.e = true;
            return 0;
        }
        if (this.k) {
            r32 = 0;
        } else {
            this.k = true;
            long j17 = vVar.i;
            if (j17 != -9223372036854775807L) {
                r32 = 0;
                p3.a aVar = new p3.a(new e7.v(14), new i6(vVar.b), j17, j17 + 1, 0L, j12, 188L, MediaDataController.MAX_STYLE_RUNS_COUNT);
                this.i = aVar;
                this.j.n(aVar.a);
            } else {
                r32 = 0;
                this.j.n(new m3.o(j17));
            }
        }
        p3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(lVar, nVar);
        }
        m3.h hVar3 = (m3.h) lVar;
        hVar3.f = r32;
        long i14 = j12 != -1 ? j12 - hVar3.i() : -1L;
        if (i14 != -1 && i14 < 4) {
            return -1;
        }
        d5.z zVar2 = this.c;
        if (!hVar3.g(zVar2.a, r32, 4, true)) {
            return -1;
        }
        zVar2.C(r32);
        int e9 = zVar2.e();
        if (e9 == 441) {
            return -1;
        }
        if (e9 == 442) {
            hVar3.g(zVar2.a, r32, 10, r32);
            zVar2.C(9);
            hVar3.t((zVar2.r() & 7) + 14);
            return r32;
        }
        if (e9 == 443) {
            hVar3.g(zVar2.a, r32, 2, r32);
            zVar2.C(r32);
            hVar3.t(zVar2.w() + 6);
            return r32;
        }
        if (((e9 & (-256)) >> 8) != 1) {
            hVar3.t(1);
            return r32;
        }
        int i15 = e9 & 255;
        SparseArray sparseArray = this.b;
        w wVar = (w) sparseArray.get(i15);
        if (!this.e) {
            if (wVar == null) {
                h hVar4 = null;
                if (i15 == 189) {
                    jVar = new b(null, 0);
                    this.f = true;
                    this.h = hVar3.d;
                } else if ((e9 & 224) == 192) {
                    jVar = new t(null);
                    this.f = true;
                    this.h = hVar3.d;
                } else {
                    if ((e9 & 240) == 224) {
                        jVar = new j(null);
                        this.g = true;
                        this.h = hVar3.d;
                    }
                    if (hVar4 != null) {
                        hVar4.e(this.j, new e0(i15, 256));
                        wVar = new w(hVar4, this.a);
                        sparseArray.put(i15, wVar);
                    }
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                }
            }
            if (hVar3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.A();
            }
        }
        hVar3.g(zVar2.a, r32, 2, r32);
        zVar2.C(r32);
        int w10 = zVar2.w() + 6;
        if (wVar == null) {
            hVar3.t(w10);
            return r32;
        }
        zVar2.z(w10);
        hVar3.d(zVar2.a, r32, w10, r32);
        zVar2.C(6);
        h hVar5 = wVar.a;
        d5.y yVar = wVar.c;
        zVar2.c(r32, 3, yVar.b);
        yVar.p(r32);
        yVar.s(8);
        wVar.d = yVar.h();
        wVar.e = yVar.h();
        yVar.s(6);
        zVar2.c(r32, yVar.i(8), yVar.b);
        yVar.p(r32);
        d5.f0 f0Var2 = wVar.b;
        wVar.g = 0L;
        if (wVar.d) {
            yVar.s(4);
            yVar.s(1);
            yVar.s(1);
            long i16 = (yVar.i(3) << 30) | (yVar.i(15) << 15) | yVar.i(15);
            yVar.s(1);
            if (!wVar.f && wVar.e) {
                yVar.s(4);
                yVar.s(1);
                yVar.s(1);
                yVar.s(1);
                f0Var2.b(yVar.i(15) | (yVar.i(3) << 30) | (yVar.i(15) << 15));
                wVar.f = true;
            }
            wVar.g = f0Var2.b(i16);
        }
        hVar5.f(4, wVar.g);
        hVar5.b(zVar2);
        hVar5.d();
        zVar2.B(zVar2.a.length);
        return r32;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.j = mVar;
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        byte[] bArr = new byte[14];
        m3.h hVar = (m3.h) lVar;
        hVar.g(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.g(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        d5.f0 f0Var = this.a;
        boolean z10 = f0Var.d() == -9223372036854775807L;
        if (!z10) {
            long c10 = f0Var.c();
            z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
        }
        if (z10) {
            f0Var.e(j11);
        }
        p3.a aVar = this.i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            w wVar = (w) sparseArray.valueAt(i10);
            wVar.f = false;
            wVar.a.c();
            i10++;
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
