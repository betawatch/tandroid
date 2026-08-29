package y3;

import android.util.SparseArray;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x implements o3.k {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public r3.a i;
    public o3.m j;
    public boolean k;
    public final f5.c0 a = new f5.c0(0);
    public final f5.w c = new f5.w(4096);
    public final SparseArray b = new SparseArray();
    public final v d = new v(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(o3.l lVar, o3.n nVar) {
        ?? r32;
        h jVar;
        long j10;
        long j11;
        f5.a.j(this.j);
        long j12 = ((o3.h) lVar).c;
        v vVar = this.d;
        if (j12 != -1 && !vVar.d) {
            f5.c0 c0Var = vVar.b;
            f5.w wVar = vVar.c;
            if (!vVar.f) {
                o3.h hVar = (o3.h) lVar;
                long j13 = hVar.c;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (hVar.d != j14) {
                    nVar.a = j14;
                    return 1;
                }
                wVar.z(min);
                hVar.f = 0;
                hVar.f(wVar.a, 0, min, false);
                int i10 = wVar.b;
                int i11 = wVar.c - 4;
                while (true) {
                    if (i11 < i10) {
                        j11 = -9223372036854775807L;
                        break;
                    }
                    if (v.b(i11, wVar.a) == 442) {
                        wVar.C(i11 + 4);
                        long c3 = v.c(wVar);
                        if (c3 != -9223372036854775807L) {
                            j11 = c3;
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
                long b10 = c0Var.b(vVar.h) - c0Var.b(j15);
                vVar.i = b10;
                if (b10 < 0) {
                    f5.a.K("PsDurationReader", "Invalid duration: " + vVar.i + ". Using TIME_UNSET instead.");
                    vVar.i = -9223372036854775807L;
                }
                vVar.a(lVar);
                return 0;
            }
            o3.h hVar2 = (o3.h) lVar;
            int min2 = (int) Math.min(20000L, hVar2.c);
            long j16 = 0;
            if (hVar2.d != j16) {
                nVar.a = j16;
                return 1;
            }
            wVar.z(min2);
            hVar2.f = 0;
            hVar2.f(wVar.a, 0, min2, false);
            int i12 = wVar.b;
            int i13 = wVar.c;
            while (true) {
                if (i12 >= i13 - 3) {
                    j10 = -9223372036854775807L;
                    break;
                }
                if (v.b(i12, wVar.a) == 442) {
                    wVar.C(i12 + 4);
                    long c6 = v.c(wVar);
                    if (c6 != -9223372036854775807L) {
                        j10 = c6;
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
                r3.a aVar = new r3.a(new x9.d(15), new v5.n(vVar.b), j17, j17 + 1, 0L, j12, 188L, MediaDataController.MAX_STYLE_RUNS_COUNT);
                this.i = aVar;
                this.j.D1(aVar.a);
            } else {
                r32 = 0;
                this.j.D1(new o3.o(j17));
            }
        }
        r3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(lVar, nVar);
        }
        o3.h hVar3 = (o3.h) lVar;
        hVar3.f = r32;
        long h = j12 != -1 ? j12 - hVar3.h() : -1L;
        if (h != -1 && h < 4) {
            return -1;
        }
        f5.w wVar2 = this.c;
        if (!hVar3.f(wVar2.a, r32, 4, true)) {
            return -1;
        }
        wVar2.C(r32);
        int e10 = wVar2.e();
        if (e10 == 441) {
            return -1;
        }
        if (e10 == 442) {
            hVar3.f(wVar2.a, r32, 10, r32);
            wVar2.C(9);
            hVar3.t((wVar2.r() & 7) + 14);
            return r32;
        }
        if (e10 == 443) {
            hVar3.f(wVar2.a, r32, 2, r32);
            wVar2.C(r32);
            hVar3.t(wVar2.w() + 6);
            return r32;
        }
        if (((e10 & (-256)) >> 8) != 1) {
            hVar3.t(1);
            return r32;
        }
        int i14 = e10 & 255;
        SparseArray sparseArray = this.b;
        w wVar3 = (w) sparseArray.get(i14);
        if (!this.e) {
            if (wVar3 == null) {
                h hVar4 = null;
                if (i14 == 189) {
                    jVar = new b(null, 0);
                    this.f = true;
                    this.h = hVar3.d;
                } else if ((e10 & 224) == 192) {
                    jVar = new t(null);
                    this.f = true;
                    this.h = hVar3.d;
                } else {
                    if ((e10 & 240) == 224) {
                        jVar = new j(null);
                        this.g = true;
                        this.h = hVar3.d;
                    }
                    if (hVar4 != null) {
                        hVar4.e(this.j, new d0(i14, 256));
                        wVar3 = new w(hVar4, this.a);
                        sparseArray.put(i14, wVar3);
                    }
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                }
            }
            if (hVar3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.e1();
            }
        }
        hVar3.f(wVar2.a, r32, 2, r32);
        wVar2.C(r32);
        int w10 = wVar2.w() + 6;
        if (wVar3 == null) {
            hVar3.t(w10);
            return r32;
        }
        wVar2.z(w10);
        hVar3.c(wVar2.a, r32, w10, r32);
        wVar2.C(6);
        h hVar5 = wVar3.a;
        f5.v vVar2 = wVar3.c;
        wVar2.c(r32, 3, vVar2.b);
        vVar2.p(r32);
        vVar2.s(8);
        wVar3.d = vVar2.h();
        wVar3.e = vVar2.h();
        vVar2.s(6);
        wVar2.c(r32, vVar2.i(8), vVar2.b);
        vVar2.p(r32);
        f5.c0 c0Var2 = wVar3.b;
        wVar3.g = 0L;
        if (wVar3.d) {
            vVar2.s(4);
            vVar2.s(1);
            vVar2.s(1);
            long i15 = (vVar2.i(3) << 30) | (vVar2.i(15) << 15) | vVar2.i(15);
            vVar2.s(1);
            if (!wVar3.f && wVar3.e) {
                vVar2.s(4);
                vVar2.s(1);
                vVar2.s(1);
                vVar2.s(1);
                c0Var2.b(vVar2.i(15) | (vVar2.i(3) << 30) | (vVar2.i(15) << 15));
                wVar3.f = true;
            }
            wVar3.g = c0Var2.b(i15);
        }
        hVar5.f(4, wVar3.g);
        hVar5.c(wVar2);
        hVar5.d();
        wVar2.B(wVar2.a.length);
        return r32;
    }

    @Override // o3.k
    public final boolean e(o3.l lVar) {
        byte[] bArr = new byte[14];
        o3.h hVar = (o3.h) lVar;
        hVar.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.b(bArr[13] & 7, false);
            hVar.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        f5.c0 c0Var = this.a;
        boolean z10 = c0Var.d() == -9223372036854775807L;
        if (!z10) {
            long c3 = c0Var.c();
            z10 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : true;
        }
        if (z10) {
            c0Var.e(j11);
        }
        r3.a aVar = this.i;
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
            wVar.a.a();
            i10++;
        }
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.j = mVar;
    }

    @Override // o3.k
    public final void release() {
    }
}
