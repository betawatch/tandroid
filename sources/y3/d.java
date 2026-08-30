package y3;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import j4.i;
import j4.n;
import java.io.EOFException;
import l3.o0;
import org.telegram.ui.Components.jb;
import ph.j5;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.p;
import r3.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d implements k {
    public final int a;
    public final long b;
    public final w c;
    public final o0 d;
    public final p e;
    public final j5 f;
    public final j g;
    public m h;
    public v i;
    public v j;
    public int k;
    public e4.c l;
    public long m;
    public long n;
    public long o;
    public int p;
    public f q;
    public boolean r;
    public boolean s;
    public long t;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z4) {
        w wVar = this.c;
        lVar.c(0, 4, wVar.a);
        wVar.F(0);
        int g10 = wVar.g();
        o0 o0Var = this.d;
        o0Var.a(g10);
        return new a(lVar.getLength(), o0Var.e, o0Var.b, z4, lVar.getPosition());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.i() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(l lVar) {
        f fVar = this.q;
        if (fVar != null) {
            long b10 = fVar.b();
            if (b10 != -1) {
            }
        }
        try {
            return !lVar.h(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r19 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
    
        r18.u(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        r17.k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        r18.t();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(l lVar, boolean z4) {
        int i10;
        int i11;
        int d;
        int i12 = z4 ? 32768 : 131072;
        lVar.t();
        if (lVar.getPosition() == 0) {
            w wVar = (w) this.f.b;
            e4.c cVar = null;
            int i13 = 0;
            while (true) {
                try {
                    lVar.c(0, 10, wVar.a);
                    wVar.F(0);
                    if (wVar.w() != 4801587) {
                        break;
                    }
                    wVar.G(3);
                    int t6 = wVar.t();
                    int i14 = t6 + 10;
                    if (cVar == null) {
                        byte[] bArr = new byte[i14];
                        System.arraycopy(wVar.a, 0, bArr, 0, 10);
                        lVar.c(10, t6, bArr);
                        cVar = new i(null).c(i14, bArr);
                    } else {
                        lVar.n(t6);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            lVar.t();
            lVar.n(i13);
            this.l = cVar;
            if (cVar != null) {
                this.e.b(cVar);
            }
            i11 = (int) lVar.i();
            if (!z4) {
                lVar.u(i11);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (!b(lVar)) {
                w wVar2 = this.c;
                wVar2.F(0);
                int g10 = wVar2.g();
                if ((i10 == 0 || ((-128000) & g10) == (i10 & (-128000))) && (d = l3.a.d(g10)) != -1) {
                    i15++;
                    if (i15 != 1) {
                        if (i15 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(g10);
                        i10 = g10;
                    }
                    lVar.n(d - 4);
                } else {
                    int i17 = i16 + 1;
                    if (i16 == i12) {
                        if (z4) {
                            return false;
                        }
                        throw r1.a("Searched too many bytes.", null);
                    }
                    if (z4) {
                        lVar.t();
                        lVar.n(i11 + i17);
                    } else {
                        lVar.u(1);
                    }
                    i16 = i17;
                    i10 = 0;
                    i15 = 0;
                }
            } else if (i15 <= 0) {
                throw new EOFException();
            }
        }
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j11;
        f fVar = this.q;
        if (!(fVar instanceof b) || ((b) fVar).d(j11)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.h = mVar;
        v c22 = mVar.c2(0, 1);
        this.i = c22;
        this.j = c22;
        this.h.f1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r3 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ef  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        int i10;
        int i11;
        long j10;
        l lVar2;
        Throwable th2;
        long j11;
        int i12;
        p pVar;
        r3.h hVar;
        int g10;
        f fVar;
        p pVar2;
        int i13;
        int i14;
        int x10;
        h hVar2;
        e4.c cVar;
        c cVar2;
        f a2;
        long j12;
        p pVar3;
        int u10;
        d dVar = this;
        h5.a.j(dVar.i);
        int i15 = d0.a;
        int i16 = dVar.k;
        o0 o0Var = dVar.d;
        if (i16 == 0) {
            try {
                dVar.c(lVar, false);
            } catch (EOFException unused) {
                i10 = -1;
                i11 = -1;
                j10 = 1000000;
            }
        }
        f fVar2 = dVar.q;
        w wVar = dVar.c;
        if (fVar2 == null) {
            w wVar2 = new w(o0Var.b);
            j10 = 1000000;
            ((r3.h) lVar).h(wVar2.a, 0, o0Var.b, false);
            int i17 = 21;
            if ((o0Var.a & 1) != 0) {
                if (o0Var.d != 1) {
                    i17 = 36;
                }
            } else if (o0Var.d == 1) {
                i17 = 13;
            }
            th2 = null;
            j11 = 0;
            if (wVar2.c >= i17 + 4) {
                wVar2.F(i17);
                i12 = wVar2.g();
                if (i12 != 1483304551) {
                }
                pVar = dVar.e;
                if (i12 != 1483304551 || i12 == 1231971951) {
                    hVar = (r3.h) lVar;
                    long j13 = hVar.c;
                    long j14 = hVar.d;
                    int i18 = o0Var.f;
                    int i19 = o0Var.c;
                    g10 = wVar2.g();
                    if ((g10 & 1) == 1 || (x10 = wVar2.x()) == 0) {
                        fVar = null;
                    } else {
                        long N = d0.N(x10, i18 * 1000000, i19);
                        if ((g10 & 6) != 6) {
                            hVar2 = new h(j14, o0Var.b, N, -1L, null);
                        } else {
                            long v = wVar2.v();
                            long[] jArr = new long[100];
                            for (int i20 = 0; i20 < 100; i20++) {
                                jArr[i20] = wVar2.u();
                            }
                            if (j13 != -1) {
                                long j15 = j14 + v;
                                if (j13 != j15) {
                                    StringBuilder s6 = android.support.v4.media.a.s(j13, "XING data size mismatch: ", ", ");
                                    s6.append(j15);
                                    h5.a.K("XingSeeker", s6.toString());
                                }
                            }
                            hVar2 = new h(j14, o0Var.b, N, v, jArr);
                        }
                        fVar = hVar2;
                    }
                    pVar2 = pVar;
                    if (fVar != null && (pVar2.a == -1 || pVar2.b == -1)) {
                        hVar.f = 0;
                        hVar.a(i17 + 141, false);
                        hVar.h(wVar.a, 0, 3, false);
                        wVar.F(0);
                        int w10 = wVar.w();
                        i13 = w10 >> 12;
                        i14 = w10 & 4095;
                        if (i13 <= 0 || i14 > 0) {
                            pVar2.a = i13;
                            pVar2.b = i14;
                        }
                    }
                    hVar.u(o0Var.b);
                    if (fVar == null && !fVar.c() && i12 == 1231971951) {
                        dVar = this;
                        lVar2 = lVar;
                        fVar = dVar.a(lVar2, false);
                    } else {
                        dVar = this;
                        lVar2 = lVar;
                    }
                } else {
                    if (i12 == 1447187017) {
                        r3.h hVar3 = (r3.h) lVar;
                        long j16 = hVar3.c;
                        long j17 = hVar3.d;
                        wVar2.G(10);
                        int g11 = wVar2.g();
                        if (g11 <= 0) {
                            fVar = null;
                            pVar3 = pVar;
                        } else {
                            int i21 = o0Var.c;
                            long N2 = d0.N(g11, (i21 >= 32000 ? 1152 : 576) * 1000000, i21);
                            int z4 = wVar2.z();
                            int z10 = wVar2.z();
                            int z11 = wVar2.z();
                            wVar2.G(2);
                            long j18 = j17 + o0Var.b;
                            long[] jArr2 = new long[z4];
                            long[] jArr3 = new long[z4];
                            long j19 = j17;
                            int i22 = 0;
                            while (true) {
                                if (i22 < z4) {
                                    long[] jArr4 = jArr3;
                                    pVar3 = pVar;
                                    jArr2[i22] = (i22 * N2) / z4;
                                    jArr4[i22] = Math.max(j19, j18);
                                    if (z11 == 1) {
                                        u10 = wVar2.u();
                                    } else if (z11 == 2) {
                                        u10 = wVar2.z();
                                    } else if (z11 == 3) {
                                        u10 = wVar2.w();
                                    } else {
                                        if (z11 != 4) {
                                            fVar = null;
                                            break;
                                        }
                                        u10 = wVar2.x();
                                    }
                                    j19 += u10 * z10;
                                    i22++;
                                    pVar = pVar3;
                                    z11 = z11;
                                    jArr3 = jArr4;
                                } else {
                                    long[] jArr5 = jArr3;
                                    pVar3 = pVar;
                                    if (j16 != -1 && j16 != j19) {
                                        StringBuilder s9 = android.support.v4.media.a.s(j16, "VBRI data size mismatch: ", ", ");
                                        s9.append(j19);
                                        h5.a.K("VbriSeeker", s9.toString());
                                    }
                                    fVar = new g(jArr2, jArr5, N2, j19);
                                }
                            }
                        }
                        hVar3.u(o0Var.b);
                        dVar = this;
                        lVar2 = lVar;
                    } else {
                        pVar3 = pVar;
                        ((r3.h) lVar).f = 0;
                        dVar = this;
                        lVar2 = lVar;
                        fVar = null;
                    }
                    pVar2 = pVar3;
                }
                cVar = dVar.l;
                r3.h hVar4 = (r3.h) lVar2;
                long j20 = hVar4.d;
                if (cVar != null) {
                    for (e4.b bVar : cVar.a) {
                        if (bVar instanceof j4.l) {
                            int[] iArr = ((j4.l) bVar).e;
                            if (cVar != null) {
                                for (e4.b bVar2 : cVar.a) {
                                    if (bVar2 instanceof n) {
                                        n nVar = (n) bVar2;
                                        if (nVar.a.equals("TLEN")) {
                                            j12 = d0.G(Long.parseLong((String) nVar.c.get(0)));
                                            break;
                                        }
                                    }
                                }
                            }
                            j12 = -9223372036854775807L;
                            int length = iArr.length;
                            int i23 = length + 1;
                            long[] jArr6 = new long[i23];
                            long[] jArr7 = new long[i23];
                            jArr6[0] = j20;
                            jArr7[0] = 0;
                            long j21 = 0;
                            int i24 = 1;
                            while (i24 <= length) {
                                int i25 = i24 - 1;
                                long j22 = j20 + r11.c + iArr[i25];
                                j21 += r11.d + r11.f[i25];
                                jArr6[i24] = j22;
                                jArr7[i24] = j21;
                                i24++;
                                length = length;
                                j20 = j22;
                            }
                            cVar2 = new c(j12, jArr6, jArr7);
                            if (dVar.r) {
                                if (cVar2 != null) {
                                    fVar = cVar2;
                                } else if (fVar == null) {
                                    fVar = null;
                                }
                                a2 = (fVar == null || !(fVar.c() || (dVar.a & 1) == 0)) ? dVar.a(lVar2, false) : fVar;
                            } else {
                                a2 = new e(-9223372036854775807L);
                            }
                            dVar.q = a2;
                            dVar.h.g2(a2);
                            v vVar = dVar.j;
                            m0 m0Var = new m0();
                            m0Var.o = (String) o0Var.g;
                            m0Var.p = 4096;
                            m0Var.B = o0Var.d;
                            m0Var.C = o0Var.c;
                            m0Var.E = pVar2.a;
                            m0Var.F = pVar2.b;
                            m0Var.i = dVar.l;
                            vVar.b(new n0(m0Var));
                            dVar.o = hVar4.d;
                        }
                    }
                }
                cVar2 = null;
                if (dVar.r) {
                }
                dVar.q = a2;
                dVar.h.g2(a2);
                v vVar2 = dVar.j;
                m0 m0Var2 = new m0();
                m0Var2.o = (String) o0Var.g;
                m0Var2.p = 4096;
                m0Var2.B = o0Var.d;
                m0Var2.C = o0Var.c;
                m0Var2.E = pVar2.a;
                m0Var2.F = pVar2.b;
                m0Var2.i = dVar.l;
                vVar2.b(new n0(m0Var2));
                dVar.o = hVar4.d;
            }
            if (wVar2.c >= 40) {
                wVar2.F(36);
                if (wVar2.g() == 1447187017) {
                    i12 = 1447187017;
                    pVar = dVar.e;
                    if (i12 != 1483304551) {
                    }
                    hVar = (r3.h) lVar;
                    long j132 = hVar.c;
                    long j142 = hVar.d;
                    int i182 = o0Var.f;
                    int i192 = o0Var.c;
                    g10 = wVar2.g();
                    if ((g10 & 1) == 1) {
                    }
                    fVar = null;
                    pVar2 = pVar;
                    if (fVar != null) {
                        hVar.f = 0;
                        hVar.a(i17 + 141, false);
                        hVar.h(wVar.a, 0, 3, false);
                        wVar.F(0);
                        int w102 = wVar.w();
                        i13 = w102 >> 12;
                        i14 = w102 & 4095;
                        if (i13 <= 0) {
                        }
                        pVar2.a = i13;
                        pVar2.b = i14;
                    }
                    hVar.u(o0Var.b);
                    if (fVar == null) {
                    }
                    dVar = this;
                    lVar2 = lVar;
                    cVar = dVar.l;
                    r3.h hVar42 = (r3.h) lVar2;
                    long j202 = hVar42.d;
                    if (cVar != null) {
                    }
                    cVar2 = null;
                    if (dVar.r) {
                    }
                    dVar.q = a2;
                    dVar.h.g2(a2);
                    v vVar22 = dVar.j;
                    m0 m0Var22 = new m0();
                    m0Var22.o = (String) o0Var.g;
                    m0Var22.p = 4096;
                    m0Var22.B = o0Var.d;
                    m0Var22.C = o0Var.c;
                    m0Var22.E = pVar2.a;
                    m0Var22.F = pVar2.b;
                    m0Var22.i = dVar.l;
                    vVar22.b(new n0(m0Var22));
                    dVar.o = hVar42.d;
                }
            }
            i12 = 0;
            pVar = dVar.e;
            if (i12 != 1483304551) {
            }
            hVar = (r3.h) lVar;
            long j1322 = hVar.c;
            long j1422 = hVar.d;
            int i1822 = o0Var.f;
            int i1922 = o0Var.c;
            g10 = wVar2.g();
            if ((g10 & 1) == 1) {
            }
            fVar = null;
            pVar2 = pVar;
            if (fVar != null) {
            }
            hVar.u(o0Var.b);
            if (fVar == null) {
            }
            dVar = this;
            lVar2 = lVar;
            cVar = dVar.l;
            r3.h hVar422 = (r3.h) lVar2;
            long j2022 = hVar422.d;
            if (cVar != null) {
            }
            cVar2 = null;
            if (dVar.r) {
            }
            dVar.q = a2;
            dVar.h.g2(a2);
            v vVar222 = dVar.j;
            m0 m0Var222 = new m0();
            m0Var222.o = (String) o0Var.g;
            m0Var222.p = 4096;
            m0Var222.B = o0Var.d;
            m0Var222.C = o0Var.c;
            m0Var222.E = pVar2.a;
            m0Var222.F = pVar2.b;
            m0Var222.i = dVar.l;
            vVar222.b(new n0(m0Var222));
            dVar.o = hVar422.d;
        } else {
            lVar2 = lVar;
            th2 = null;
            j10 = 1000000;
            j11 = 0;
            long j23 = dVar.o;
            if (j23 != 0) {
                long j24 = ((r3.h) lVar2).d;
                if (j24 < j23) {
                    ((r3.h) lVar2).u((int) (j23 - j24));
                }
            }
        }
        if (dVar.p == 0) {
            ((r3.h) lVar2).f = 0;
            if (!b(lVar)) {
                wVar.F(0);
                int g12 = wVar.g();
                if (((-128000) & g12) != (dVar.k & (-128000)) || l3.a.d(g12) == -1) {
                    ((r3.h) lVar2).u(1);
                    dVar.k = 0;
                    i10 = -1;
                    i11 = 0;
                    if (i11 == i10) {
                        f fVar3 = dVar.q;
                        if (fVar3 instanceof b) {
                            if (fVar3.g() != ((dVar.n * j10) / o0Var.c) + dVar.m) {
                                f fVar4 = dVar.q;
                                ((b) fVar4).getClass();
                                dVar.h.g2(fVar4);
                            }
                        }
                    }
                    return i11;
                }
                o0Var.a(g12);
                if (dVar.m == -9223372036854775807L) {
                    dVar.m = dVar.q.a(((r3.h) lVar2).d);
                    long j25 = dVar.b;
                    if (j25 != -9223372036854775807L) {
                        dVar.m = (j25 - dVar.q.a(j11)) + dVar.m;
                    }
                }
                dVar.p = o0Var.b;
                f fVar5 = dVar.q;
                if (fVar5 instanceof b) {
                    b bVar3 = (b) fVar5;
                    long j26 = (((dVar.n + o0Var.f) * j10) / o0Var.c) + dVar.m;
                    long j27 = ((r3.h) lVar2).d;
                    if (!bVar3.d(j26)) {
                        throw th2;
                    }
                    if (dVar.s && bVar3.d(dVar.t)) {
                        dVar.s = false;
                        dVar.j = dVar.i;
                    }
                }
            }
            i10 = -1;
            i11 = -1;
            if (i11 == i10) {
            }
            return i11;
        }
        int e = dVar.j.e(lVar2, dVar.p, true);
        if (e != -1) {
            int i26 = dVar.p - e;
            dVar.p = i26;
            if (i26 <= 0) {
                dVar.j.c(((dVar.n * j10) / o0Var.c) + dVar.m, 1, o0Var.b, 0, null);
                dVar.n += o0Var.f;
                dVar.p = 0;
            }
            i10 = -1;
            i11 = 0;
            if (i11 == i10) {
            }
            return i11;
        }
        i10 = -1;
        i11 = -1;
        if (i11 == i10) {
        }
        return i11;
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        return c(lVar, true);
    }

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        this.c = new w(10);
        this.d = new o0();
        this.e = new p();
        this.m = -9223372036854775807L;
        this.f = new j5(2);
        j jVar = new j();
        this.g = jVar;
        this.j = jVar;
    }

    @Override // r3.k
    public final void release() {
    }
}
