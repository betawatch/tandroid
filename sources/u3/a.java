package u3;

import b4.e0;
import b4.x;
import e4.c;
import h5.d0;
import h5.w;
import j3.r1;
import java.util.Arrays;
import k7.u6;
import k7.v6;
import k7.w6;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.s;
import r3.v;
import rh.e;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements k {
    public m e;
    public v f;
    public c h;
    public o i;
    public int j;
    public int k;
    public x l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final w b = new w(new byte[32768], 0);
    public final boolean c = false;
    public final jb d = new jb();
    public int g = 0;

    @Override // r3.k
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.g = 0;
        } else {
            x xVar = this.l;
            if (xVar != null) {
                xVar.d(j11);
            }
        }
        this.n = j11 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.C(0);
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.e = mVar;
        this.f = mVar.c2(0, 1);
        mVar.f1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    @Override // r3.k
    public final int h(l lVar, jb jbVar) {
        o oVar;
        c cVar;
        int i10;
        s nVar;
        long j10;
        long j11;
        long j12;
        boolean z4;
        long j13;
        int i11 = this.g;
        if (i11 == 0) {
            boolean z10 = !this.c;
            ((h) lVar).f = 0;
            h hVar = (h) lVar;
            long i12 = hVar.i();
            c a2 = v6.a(lVar, z10);
            hVar.u((int) (hVar.i() - i12));
            this.h = a2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            ((h) lVar).h(bArr, 0, bArr.length, false);
            ((h) lVar).f = 0;
            this.g = 2;
            return 0;
        }
        int i13 = 3;
        if (i11 == 2) {
            w wVar = new w(4);
            ((h) lVar).d(wVar.a, 0, 4, false);
            if (wVar.v() != 1716281667) {
                throw r1.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        if (i11 == 3) {
            ?? r22 = 0;
            o oVar2 = this.i;
            boolean z11 = false;
            while (!z11) {
                ((h) lVar).f = r22;
                byte[] bArr2 = new byte[4];
                h5.v vVar = new h5.v(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.h(bArr2, r22, 4, r22);
                boolean h = vVar.h();
                int i14 = vVar.i(r10);
                int i15 = vVar.i(24) + 4;
                if (i14 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.d(bArr3, r22, 38, r22);
                    oVar2 = new o(bArr3, 4);
                } else {
                    if (oVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    c cVar2 = oVar2.l;
                    if (i14 == i13) {
                        w wVar2 = new w(i15);
                        hVar2.d(wVar2.a, r22, i15, r22);
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, v6.b(wVar2), oVar2.l);
                    } else if (i14 == 4) {
                        w wVar3 = new w(i15);
                        hVar2.d(wVar3.a, 0, i15, false);
                        wVar3.G(4);
                        c a10 = w6.a(Arrays.asList((String[]) w6.b(wVar3, false, false).b));
                        if (cVar2 == null) {
                            cVar = a10;
                        } else {
                            if (a10 != null) {
                                cVar2 = cVar2.a(a10.a);
                            }
                            cVar = cVar2;
                        }
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, oVar2.k, cVar);
                    } else if (i14 == 6) {
                        w wVar4 = new w(i15);
                        hVar2.d(wVar4.a, 0, i15, false);
                        wVar4.G(4);
                        c cVar3 = new c(s8.v.x(h4.a.a(wVar4)));
                        if (cVar2 != null) {
                            cVar3 = cVar2.a(cVar3.a);
                        }
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, oVar2.k, cVar3);
                    } else {
                        hVar2.u(i15);
                    }
                    oVar2 = oVar;
                }
                int i16 = d0.a;
                this.i = oVar2;
                z11 = h;
                r22 = 0;
                i13 = 3;
                r10 = 7;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            v vVar2 = this.f;
            int i17 = d0.a;
            vVar2.b(this.i.c(bArr, this.h));
            this.g = 4;
            return 0;
        }
        if (i11 == 4) {
            ((h) lVar).f = 0;
            w wVar5 = new w(2);
            h hVar3 = (h) lVar;
            hVar3.h(wVar5.a, 0, 2, false);
            int z12 = wVar5.z();
            if ((z12 >> 2) != 16382) {
                hVar3.f = 0;
                throw r1.a("First frame does not start with sync code.", null);
            }
            hVar3.f = 0;
            this.k = z12;
            m mVar = this.e;
            int i18 = d0.a;
            long j14 = hVar3.d;
            long j15 = hVar3.c;
            this.i.getClass();
            o oVar3 = this.i;
            if (oVar3.k != null) {
                nVar = new n(oVar3, j14, 0);
                i10 = 0;
            } else if (j15 == -1 || oVar3.j <= 0) {
                i10 = 0;
                nVar = new n(oVar3.b());
            } else {
                int i19 = this.k;
                int i20 = oVar3.c;
                e eVar = new e(oVar3, 3);
                e0 e0Var = new e0(oVar3, i19);
                long b10 = oVar3.b();
                long j16 = oVar3.j;
                int i21 = oVar3.d;
                if (i21 > 0) {
                    i10 = 0;
                    j10 = j15;
                    j11 = ((i21 + i20) / 2) + 1;
                } else {
                    j10 = j15;
                    i10 = 0;
                    int i22 = oVar3.a;
                    j11 = (((((i22 != oVar3.b || i22 <= 0) ? 4096L : i22) * oVar3.g) * oVar3.h) / 8) + 64;
                }
                x xVar = new x(eVar, e0Var, b10, j16, j14, j10, j11, Math.max(6, i20));
                this.l = xVar;
                nVar = xVar.a;
            }
            mVar.g2(nVar);
            this.g = 5;
            return i10;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        x xVar2 = this.l;
        if (xVar2 != null && xVar2.c != null) {
            return xVar2.b(lVar, jbVar);
        }
        if (this.n == -1) {
            o oVar4 = this.i;
            ((h) lVar).f = 0;
            h hVar4 = (h) lVar;
            hVar4.a(1, false);
            byte[] bArr4 = new byte[1];
            hVar4.h(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            hVar4.a(2, false);
            r10 = z13 ? 7 : 6;
            w wVar6 = new w(r10);
            byte[] bArr5 = wVar6.a;
            int i23 = 0;
            while (i23 < r10) {
                int f10 = hVar4.f(i23, r10 - i23, bArr5);
                if (f10 == -1) {
                    break;
                }
                i23 += f10;
            }
            wVar6.E(i23);
            hVar4.f = 0;
            try {
                long A = wVar6.A();
                if (!z13) {
                    A *= oVar4.b;
                }
                j13 = A;
            } catch (NumberFormatException unused) {
                r3 = false;
                j13 = 0;
            }
            if (!r3) {
                throw r1.a(null, null);
            }
            this.n = j13;
        } else {
            w wVar7 = this.b;
            int i24 = wVar7.c;
            if (i24 < 32768) {
                int read = ((h) lVar).read(wVar7.a, i24, 32768 - i24);
                r3 = read == -1;
                if (!r3) {
                    wVar7.E(i24 + read);
                } else if (wVar7.a() == 0) {
                    long j17 = this.n * 1000000;
                    o oVar5 = this.i;
                    int i25 = d0.a;
                    this.f.c(j17 / oVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i26 = wVar7.b;
            int i27 = this.m;
            int i28 = this.j;
            if (i27 < i28) {
                wVar7.G(Math.min(i28 - i27, wVar7.a()));
            }
            this.i.getClass();
            int i29 = wVar7.b;
            while (true) {
                int i30 = wVar7.c - 16;
                jb jbVar2 = this.d;
                if (i29 <= i30) {
                    wVar7.F(i29);
                    if (u6.a(wVar7, this.i, this.k, jbVar2)) {
                        wVar7.F(i29);
                        j12 = jbVar2.a;
                        break;
                    }
                    i29++;
                } else {
                    if (r3) {
                        while (true) {
                            int i31 = wVar7.c;
                            if (i29 > i31 - this.j) {
                                wVar7.F(i31);
                                break;
                            }
                            wVar7.F(i29);
                            try {
                                z4 = u6.a(wVar7, this.i, this.k, jbVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z4 = false;
                            }
                            if (wVar7.b > wVar7.c) {
                                z4 = false;
                            }
                            if (z4) {
                                wVar7.F(i29);
                                j12 = jbVar2.a;
                                break;
                            }
                            i29++;
                        }
                    } else {
                        wVar7.F(i29);
                    }
                    j12 = -1;
                }
            }
            int i32 = wVar7.b - i26;
            wVar7.F(i26);
            this.f.d(i32, wVar7);
            int i33 = this.m + i32;
            this.m = i33;
            if (j12 != -1) {
                long j18 = this.n * 1000000;
                o oVar6 = this.i;
                int i34 = d0.a;
                this.f.c(j18 / oVar6.e, 1, i33, 0, null);
                this.m = 0;
                this.n = j12;
            }
            if (wVar7.a() < 16) {
                int a11 = wVar7.a();
                byte[] bArr6 = wVar7.a;
                System.arraycopy(bArr6, wVar7.b, bArr6, 0, a11);
                wVar7.F(0);
                wVar7.E(a11);
            }
        }
        return 0;
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        v6.a(lVar, false);
        w wVar = new w(4);
        ((h) lVar).h(wVar.a, 0, 4, false);
        return wVar.v() == 1716281667;
    }

    @Override // r3.k
    public final void release() {
    }
}
