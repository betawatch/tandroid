package u3;

import b4.e0;
import b4.x;
import e4.c;
import h5.d0;
import h5.w;
import j3.r1;
import java.util.Arrays;
import k7.v6;
import k7.w6;
import k7.x6;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.s;
import r3.v;
import sf.g;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        this.f = mVar.i2(0, 1);
        mVar.i1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    @Override // r3.k
    public final int h(l lVar, jb jbVar) {
        o oVar;
        c cVar;
        int i10;
        s nVar;
        g gVar;
        long j10;
        long j11;
        boolean z4;
        int i11 = this.g;
        if (i11 == 0) {
            boolean z10 = !this.c;
            ((h) lVar).f = 0;
            h hVar = (h) lVar;
            long g10 = hVar.g();
            c a2 = w6.a(lVar, z10);
            hVar.s((int) (hVar.g() - g10));
            this.h = a2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            ((h) lVar).f(bArr, 0, bArr.length, false);
            ((h) lVar).f = 0;
            this.g = 2;
            return 0;
        }
        int i12 = 3;
        if (i11 == 2) {
            w wVar = new w(4);
            ((h) lVar).c(wVar.a, 0, 4, false);
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
                hVar2.f(bArr2, r22, 4, r22);
                boolean h = vVar.h();
                int i13 = vVar.i(r10);
                int i14 = vVar.i(24) + 4;
                if (i13 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.c(bArr3, r22, 38, r22);
                    oVar2 = new o(bArr3, 4);
                } else {
                    if (oVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    c cVar2 = oVar2.l;
                    if (i13 == i12) {
                        w wVar2 = new w(i14);
                        hVar2.c(wVar2.a, r22, i14, r22);
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, w6.b(wVar2), oVar2.l);
                    } else if (i13 == 4) {
                        w wVar3 = new w(i14);
                        hVar2.c(wVar3.a, 0, i14, false);
                        wVar3.G(4);
                        c a10 = x6.a(Arrays.asList(x6.b(wVar3, false, false).a));
                        if (cVar2 == null) {
                            cVar = a10;
                        } else {
                            if (a10 != null) {
                                cVar2 = cVar2.a(a10.a);
                            }
                            cVar = cVar2;
                        }
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, oVar2.k, cVar);
                    } else if (i13 == 6) {
                        w wVar4 = new w(i14);
                        hVar2.c(wVar4.a, 0, i14, false);
                        wVar4.G(4);
                        c cVar3 = new c(s8.v.x(h4.a.a(wVar4)));
                        if (cVar2 != null) {
                            cVar3 = cVar2.a(cVar3.a);
                        }
                        oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.d, oVar2.e, oVar2.g, oVar2.h, oVar2.j, oVar2.k, cVar3);
                    } else {
                        hVar2.s(i14);
                    }
                    oVar2 = oVar;
                }
                int i15 = d0.a;
                this.i = oVar2;
                z11 = h;
                r22 = 0;
                i12 = 3;
                r10 = 7;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            v vVar2 = this.f;
            int i16 = d0.a;
            vVar2.b(this.i.c(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j12 = 0;
        if (i11 == 4) {
            ((h) lVar).f = 0;
            w wVar5 = new w(2);
            h hVar3 = (h) lVar;
            hVar3.f(wVar5.a, 0, 2, false);
            int z12 = wVar5.z();
            if ((z12 >> 2) != 16382) {
                hVar3.f = 0;
                throw r1.a("First frame does not start with sync code.", null);
            }
            hVar3.f = 0;
            this.k = z12;
            m mVar = this.e;
            int i17 = d0.a;
            long j13 = hVar3.d;
            long j14 = hVar3.c;
            this.i.getClass();
            o oVar3 = this.i;
            if (oVar3.k != null) {
                nVar = new n(oVar3, j13, 0);
                i10 = 0;
            } else if (j14 == -1 || oVar3.j <= 0) {
                i10 = 0;
                nVar = new n(oVar3.b());
            } else {
                int i18 = this.k;
                int i19 = oVar3.c;
                g gVar2 = new g(oVar3, 5);
                e0 e0Var = new e0(oVar3, i18);
                long b10 = oVar3.b();
                long j15 = oVar3.j;
                int i20 = oVar3.d;
                if (i20 > 0) {
                    i10 = 0;
                    gVar = gVar2;
                    j10 = ((i20 + i19) / 2) + 1;
                } else {
                    gVar = gVar2;
                    i10 = 0;
                    int i21 = oVar3.a;
                    j10 = (((((i21 != oVar3.b || i21 <= 0) ? 4096L : i21) * oVar3.g) * oVar3.h) / 8) + 64;
                }
                x xVar = new x(gVar, e0Var, b10, j15, j13, j14, j10, Math.max(6, i19));
                this.l = xVar;
                nVar = xVar.a;
            }
            mVar.m2(nVar);
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
            hVar4.f(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            hVar4.a(2, false);
            r10 = z13 ? 7 : 6;
            w wVar6 = new w(r10);
            byte[] bArr5 = wVar6.a;
            int i22 = 0;
            while (i22 < r10) {
                int e6 = hVar4.e(i22, r10 - i22, bArr5);
                if (e6 == -1) {
                    break;
                }
                i22 += e6;
            }
            wVar6.E(i22);
            hVar4.f = 0;
            try {
                long A = wVar6.A();
                if (!z13) {
                    A *= oVar4.b;
                }
                j12 = A;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw r1.a(null, null);
            }
            this.n = j12;
        } else {
            w wVar7 = this.b;
            int i23 = wVar7.c;
            if (i23 < 32768) {
                int read = ((h) lVar).read(wVar7.a, i23, 32768 - i23);
                r3 = read == -1;
                if (!r3) {
                    wVar7.E(i23 + read);
                } else if (wVar7.a() == 0) {
                    long j16 = this.n * 1000000;
                    o oVar5 = this.i;
                    int i24 = d0.a;
                    this.f.c(j16 / oVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i25 = wVar7.b;
            int i26 = this.m;
            int i27 = this.j;
            if (i26 < i27) {
                wVar7.G(Math.min(i27 - i26, wVar7.a()));
            }
            this.i.getClass();
            int i28 = wVar7.b;
            while (true) {
                int i29 = wVar7.c - 16;
                jb jbVar2 = this.d;
                if (i28 <= i29) {
                    wVar7.F(i28);
                    if (v6.a(wVar7, this.i, this.k, jbVar2)) {
                        wVar7.F(i28);
                        j11 = jbVar2.a;
                        break;
                    }
                    i28++;
                } else {
                    if (r3) {
                        while (true) {
                            int i30 = wVar7.c;
                            if (i28 > i30 - this.j) {
                                wVar7.F(i30);
                                break;
                            }
                            wVar7.F(i28);
                            try {
                                z4 = v6.a(wVar7, this.i, this.k, jbVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z4 = false;
                            }
                            if (wVar7.b > wVar7.c) {
                                z4 = false;
                            }
                            if (z4) {
                                wVar7.F(i28);
                                j11 = jbVar2.a;
                                break;
                            }
                            i28++;
                        }
                    } else {
                        wVar7.F(i28);
                    }
                    j11 = -1;
                }
            }
            int i31 = wVar7.b - i25;
            wVar7.F(i25);
            this.f.d(i31, wVar7);
            int i32 = this.m + i31;
            this.m = i32;
            if (j11 != -1) {
                long j17 = this.n * 1000000;
                o oVar6 = this.i;
                int i33 = d0.a;
                this.f.c(j17 / oVar6.e, 1, i32, 0, null);
                this.m = 0;
                this.n = j11;
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
        w6.a(lVar, false);
        w wVar = new w(4);
        ((h) lVar).f(wVar.a, 0, 4, false);
        return wVar.v() == 1716281667;
    }

    @Override // r3.k
    public final void release() {
    }
}
