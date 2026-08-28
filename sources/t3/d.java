package t3;

import d5.f0;
import d5.y;
import e4.i;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.n0;
import java.io.EOFException;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.q;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements k {
    public final int a;
    public final long b;
    public final y c;
    public final n0 d;
    public final q e;
    public final xa.c f;
    public final j g;
    public m h;
    public w i;
    public w j;
    public int k;
    public z3.c l;
    public long m;
    public long n;
    public long o;
    public int p;
    public f q;
    public boolean r;
    public boolean s;
    public long t;

    public d(int i9) {
        this(i9, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        y yVar = this.c;
        lVar.c(0, 4, yVar.a);
        yVar.C(0);
        int e10 = yVar.e();
        n0 n0Var = this.d;
        n0Var.a(e10);
        return new a(lVar.getLength(), n0Var.e, n0Var.b, z10, lVar.getPosition());
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
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        int i9;
        int i10;
        long j10;
        l lVar2;
        Throwable th;
        long j11;
        int i11;
        q qVar;
        m3.h hVar;
        int e10;
        f fVar;
        q qVar2;
        int i12;
        int i13;
        int u10;
        h hVar2;
        z3.c cVar;
        c cVar2;
        f a2;
        long j12;
        q qVar3;
        int r10;
        d dVar = this;
        d5.a.j(dVar.i);
        int i14 = f0.a;
        int i15 = dVar.k;
        n0 n0Var = dVar.d;
        if (i15 == 0) {
            try {
                dVar.e(lVar, false);
            } catch (EOFException unused) {
                i9 = -1;
                i10 = -1;
                j10 = 1000000;
            }
        }
        f fVar2 = dVar.q;
        y yVar = dVar.c;
        if (fVar2 == null) {
            y yVar2 = new y(n0Var.b);
            j10 = 1000000;
            ((m3.h) lVar).g(yVar2.a, 0, n0Var.b, false);
            int i16 = 21;
            if ((n0Var.a & 1) != 0) {
                if (n0Var.d != 1) {
                    i16 = 36;
                }
            } else if (n0Var.d == 1) {
                i16 = 13;
            }
            th = null;
            j11 = 0;
            if (yVar2.c >= i16 + 4) {
                yVar2.C(i16);
                i11 = yVar2.e();
                if (i11 != 1483304551) {
                }
                qVar = dVar.e;
                if (i11 != 1483304551 || i11 == 1231971951) {
                    hVar = (m3.h) lVar;
                    long j13 = hVar.c;
                    long j14 = hVar.d;
                    int i17 = n0Var.f;
                    int i18 = n0Var.c;
                    e10 = yVar2.e();
                    if ((e10 & 1) == 1 || (u10 = yVar2.u()) == 0) {
                        fVar = null;
                    } else {
                        long O = f0.O(u10, i17 * 1000000, i18);
                        if ((e10 & 6) != 6) {
                            hVar2 = new h(j14, n0Var.b, O, -1L, null);
                        } else {
                            long s10 = yVar2.s();
                            long[] jArr = new long[100];
                            for (int i19 = 0; i19 < 100; i19++) {
                                jArr[i19] = yVar2.r();
                            }
                            if (j13 != -1) {
                                long j15 = j14 + s10;
                                if (j13 != j15) {
                                    StringBuilder s11 = aa.d.s(j13, "XING data size mismatch: ", ", ");
                                    s11.append(j15);
                                    d5.a.K("XingSeeker", s11.toString());
                                }
                            }
                            hVar2 = new h(j14, n0Var.b, O, s10, jArr);
                        }
                        fVar = hVar2;
                    }
                    qVar2 = qVar;
                    if (fVar != null && (qVar2.a == -1 || qVar2.b == -1)) {
                        hVar.f = 0;
                        hVar.a(i16 + 141, false);
                        hVar.g(yVar.a, 0, 3, false);
                        yVar.C(0);
                        int t10 = yVar.t();
                        i12 = t10 >> 12;
                        i13 = t10 & 4095;
                        if (i12 <= 0 || i13 > 0) {
                            qVar2.a = i12;
                            qVar2.b = i13;
                        }
                    }
                    hVar.u(n0Var.b);
                    if (fVar == null && !fVar.e() && i11 == 1231971951) {
                        dVar = this;
                        lVar2 = lVar;
                        fVar = dVar.a(lVar2, false);
                    } else {
                        dVar = this;
                        lVar2 = lVar;
                    }
                } else {
                    if (i11 == 1447187017) {
                        m3.h hVar3 = (m3.h) lVar;
                        long j16 = hVar3.c;
                        long j17 = hVar3.d;
                        yVar2.D(10);
                        int e11 = yVar2.e();
                        if (e11 <= 0) {
                            fVar = null;
                            qVar3 = qVar;
                        } else {
                            int i20 = n0Var.c;
                            long O2 = f0.O(e11, (i20 >= 32000 ? 1152 : 576) * 1000000, i20);
                            int w8 = yVar2.w();
                            int w10 = yVar2.w();
                            int w11 = yVar2.w();
                            yVar2.D(2);
                            long j18 = j17 + n0Var.b;
                            long[] jArr2 = new long[w8];
                            long[] jArr3 = new long[w8];
                            long j19 = j17;
                            int i21 = 0;
                            while (true) {
                                if (i21 < w8) {
                                    long[] jArr4 = jArr3;
                                    qVar3 = qVar;
                                    jArr2[i21] = (i21 * O2) / w8;
                                    jArr4[i21] = Math.max(j19, j18);
                                    if (w11 == 1) {
                                        r10 = yVar2.r();
                                    } else if (w11 == 2) {
                                        r10 = yVar2.w();
                                    } else if (w11 == 3) {
                                        r10 = yVar2.t();
                                    } else {
                                        if (w11 != 4) {
                                            fVar = null;
                                            break;
                                        }
                                        r10 = yVar2.u();
                                    }
                                    j19 += r10 * w10;
                                    i21++;
                                    qVar = qVar3;
                                    w11 = w11;
                                    jArr3 = jArr4;
                                } else {
                                    long[] jArr5 = jArr3;
                                    qVar3 = qVar;
                                    if (j16 != -1 && j16 != j19) {
                                        StringBuilder s12 = aa.d.s(j16, "VBRI data size mismatch: ", ", ");
                                        s12.append(j19);
                                        d5.a.K("VbriSeeker", s12.toString());
                                    }
                                    fVar = new g(jArr2, jArr5, O2, j19);
                                }
                            }
                        }
                        hVar3.u(n0Var.b);
                        dVar = this;
                        lVar2 = lVar;
                    } else {
                        qVar3 = qVar;
                        ((m3.h) lVar).f = 0;
                        dVar = this;
                        lVar2 = lVar;
                        fVar = null;
                    }
                    qVar2 = qVar3;
                }
                cVar = dVar.l;
                m3.h hVar4 = (m3.h) lVar2;
                long j20 = hVar4.d;
                if (cVar != null) {
                    for (z3.b bVar : cVar.a) {
                        if (bVar instanceof e4.l) {
                            int[] iArr = ((e4.l) bVar).e;
                            if (cVar != null) {
                                for (z3.b bVar2 : cVar.a) {
                                    if (bVar2 instanceof e4.n) {
                                        e4.n nVar2 = (e4.n) bVar2;
                                        if (nVar2.a.equals("TLEN")) {
                                            j12 = f0.H(Long.parseLong((String) nVar2.c.get(0)));
                                            break;
                                        }
                                    }
                                }
                            }
                            j12 = -9223372036854775807L;
                            int length = iArr.length;
                            int i22 = length + 1;
                            long[] jArr6 = new long[i22];
                            long[] jArr7 = new long[i22];
                            jArr6[0] = j20;
                            jArr7[0] = 0;
                            long j21 = 0;
                            int i23 = 1;
                            while (i23 <= length) {
                                int i24 = i23 - 1;
                                long j22 = j20 + r11.c + iArr[i24];
                                j21 += r11.d + r11.f[i24];
                                jArr6[i23] = j22;
                                jArr7[i23] = j21;
                                i23++;
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
                                a2 = (fVar == null || !(fVar.e() || (dVar.a & 1) == 0)) ? dVar.a(lVar2, false) : fVar;
                            } else {
                                a2 = new e(-9223372036854775807L);
                            }
                            dVar.q = a2;
                            dVar.h.y(a2);
                            w wVar = dVar.j;
                            s0 s0Var = new s0();
                            s0Var.o = (String) n0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = n0Var.d;
                            s0Var.C = n0Var.c;
                            s0Var.E = qVar2.a;
                            s0Var.F = qVar2.b;
                            s0Var.i = dVar.l;
                            wVar.c(new t0(s0Var));
                            dVar.o = hVar4.d;
                        }
                    }
                }
                cVar2 = null;
                if (dVar.r) {
                }
                dVar.q = a2;
                dVar.h.y(a2);
                w wVar2 = dVar.j;
                s0 s0Var2 = new s0();
                s0Var2.o = (String) n0Var.g;
                s0Var2.p = 4096;
                s0Var2.B = n0Var.d;
                s0Var2.C = n0Var.c;
                s0Var2.E = qVar2.a;
                s0Var2.F = qVar2.b;
                s0Var2.i = dVar.l;
                wVar2.c(new t0(s0Var2));
                dVar.o = hVar4.d;
            }
            if (yVar2.c >= 40) {
                yVar2.C(36);
                if (yVar2.e() == 1447187017) {
                    i11 = 1447187017;
                    qVar = dVar.e;
                    if (i11 != 1483304551) {
                    }
                    hVar = (m3.h) lVar;
                    long j132 = hVar.c;
                    long j142 = hVar.d;
                    int i172 = n0Var.f;
                    int i182 = n0Var.c;
                    e10 = yVar2.e();
                    if ((e10 & 1) == 1) {
                    }
                    fVar = null;
                    qVar2 = qVar;
                    if (fVar != null) {
                        hVar.f = 0;
                        hVar.a(i16 + 141, false);
                        hVar.g(yVar.a, 0, 3, false);
                        yVar.C(0);
                        int t102 = yVar.t();
                        i12 = t102 >> 12;
                        i13 = t102 & 4095;
                        if (i12 <= 0) {
                        }
                        qVar2.a = i12;
                        qVar2.b = i13;
                    }
                    hVar.u(n0Var.b);
                    if (fVar == null) {
                    }
                    dVar = this;
                    lVar2 = lVar;
                    cVar = dVar.l;
                    m3.h hVar42 = (m3.h) lVar2;
                    long j202 = hVar42.d;
                    if (cVar != null) {
                    }
                    cVar2 = null;
                    if (dVar.r) {
                    }
                    dVar.q = a2;
                    dVar.h.y(a2);
                    w wVar22 = dVar.j;
                    s0 s0Var22 = new s0();
                    s0Var22.o = (String) n0Var.g;
                    s0Var22.p = 4096;
                    s0Var22.B = n0Var.d;
                    s0Var22.C = n0Var.c;
                    s0Var22.E = qVar2.a;
                    s0Var22.F = qVar2.b;
                    s0Var22.i = dVar.l;
                    wVar22.c(new t0(s0Var22));
                    dVar.o = hVar42.d;
                }
            }
            i11 = 0;
            qVar = dVar.e;
            if (i11 != 1483304551) {
            }
            hVar = (m3.h) lVar;
            long j1322 = hVar.c;
            long j1422 = hVar.d;
            int i1722 = n0Var.f;
            int i1822 = n0Var.c;
            e10 = yVar2.e();
            if ((e10 & 1) == 1) {
            }
            fVar = null;
            qVar2 = qVar;
            if (fVar != null) {
            }
            hVar.u(n0Var.b);
            if (fVar == null) {
            }
            dVar = this;
            lVar2 = lVar;
            cVar = dVar.l;
            m3.h hVar422 = (m3.h) lVar2;
            long j2022 = hVar422.d;
            if (cVar != null) {
            }
            cVar2 = null;
            if (dVar.r) {
            }
            dVar.q = a2;
            dVar.h.y(a2);
            w wVar222 = dVar.j;
            s0 s0Var222 = new s0();
            s0Var222.o = (String) n0Var.g;
            s0Var222.p = 4096;
            s0Var222.B = n0Var.d;
            s0Var222.C = n0Var.c;
            s0Var222.E = qVar2.a;
            s0Var222.F = qVar2.b;
            s0Var222.i = dVar.l;
            wVar222.c(new t0(s0Var222));
            dVar.o = hVar422.d;
        } else {
            lVar2 = lVar;
            th = null;
            j10 = 1000000;
            j11 = 0;
            long j23 = dVar.o;
            if (j23 != 0) {
                long j24 = ((m3.h) lVar2).d;
                if (j24 < j23) {
                    ((m3.h) lVar2).u((int) (j23 - j24));
                }
            }
        }
        if (dVar.p == 0) {
            ((m3.h) lVar2).f = 0;
            if (!d(lVar)) {
                yVar.C(0);
                int e12 = yVar.e();
                if (((-128000) & e12) != (dVar.k & (-128000)) || j3.b.d(e12) == -1) {
                    ((m3.h) lVar2).u(1);
                    dVar.k = 0;
                    i9 = -1;
                    i10 = 0;
                    if (i10 == i9) {
                        f fVar3 = dVar.q;
                        if (fVar3 instanceof b) {
                            if (fVar3.i() != ((dVar.n * j10) / n0Var.c) + dVar.m) {
                                f fVar4 = dVar.q;
                                ((b) fVar4).getClass();
                                dVar.h.y(fVar4);
                            }
                        }
                    }
                    return i10;
                }
                n0Var.a(e12);
                if (dVar.m == -9223372036854775807L) {
                    dVar.m = dVar.q.a(((m3.h) lVar2).d);
                    long j25 = dVar.b;
                    if (j25 != -9223372036854775807L) {
                        dVar.m = (j25 - dVar.q.a(j11)) + dVar.m;
                    }
                }
                dVar.p = n0Var.b;
                f fVar5 = dVar.q;
                if (fVar5 instanceof b) {
                    b bVar3 = (b) fVar5;
                    long j26 = (((dVar.n + n0Var.f) * j10) / n0Var.c) + dVar.m;
                    long j27 = ((m3.h) lVar2).d;
                    if (!bVar3.b(j26)) {
                        throw th;
                    }
                    if (dVar.s && bVar3.b(dVar.t)) {
                        dVar.s = false;
                        dVar.j = dVar.i;
                    }
                }
            }
            i9 = -1;
            i10 = -1;
            if (i10 == i9) {
            }
            return i10;
        }
        int b10 = dVar.j.b(lVar2, dVar.p, true);
        if (b10 != -1) {
            int i25 = dVar.p - b10;
            dVar.p = i25;
            if (i25 <= 0) {
                dVar.j.e(((dVar.n * j10) / n0Var.c) + dVar.m, 1, n0Var.b, 0, null);
                dVar.n += n0Var.f;
                dVar.p = 0;
            }
            i9 = -1;
            i10 = 0;
            if (i10 == i9) {
            }
            return i10;
        }
        i9 = -1;
        i10 = -1;
        if (i10 == i9) {
        }
        return i10;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.h = mVar;
        w I = mVar.I(0, 1);
        this.i = I;
        this.j = I;
        this.h.B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.k() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(l lVar) {
        f fVar = this.q;
        if (fVar != null) {
            long d = fVar.d();
            if (d != -1) {
            }
        }
        try {
            return !lVar.g(this.c.a, 0, 4, true);
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
    public final boolean e(l lVar, boolean z10) {
        int i9;
        int i10;
        int d;
        int i11 = z10 ? 32768 : 131072;
        lVar.t();
        if (lVar.getPosition() == 0) {
            y yVar = (y) this.f.b;
            z3.c cVar = null;
            int i12 = 0;
            while (true) {
                try {
                    lVar.c(0, 10, yVar.a);
                    yVar.C(0);
                    if (yVar.t() != 4801587) {
                        break;
                    }
                    yVar.D(3);
                    int q10 = yVar.q();
                    int i13 = q10 + 10;
                    if (cVar == null) {
                        byte[] bArr = new byte[i13];
                        System.arraycopy(yVar.a, 0, bArr, 0, 10);
                        lVar.c(10, q10, bArr);
                        cVar = new i(null).c(i13, bArr);
                    } else {
                        lVar.n(q10);
                    }
                    i12 += i13;
                } catch (EOFException unused) {
                }
            }
            lVar.t();
            lVar.n(i12);
            this.l = cVar;
            if (cVar != null) {
                this.e.b(cVar);
            }
            i10 = (int) lVar.k();
            if (!z10) {
                lVar.u(i10);
            }
            i9 = 0;
        } else {
            i9 = 0;
            i10 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (!d(lVar)) {
                y yVar2 = this.c;
                yVar2.C(0);
                int e10 = yVar2.e();
                if ((i9 == 0 || ((-128000) & e10) == (i9 & (-128000))) && (d = j3.b.d(e10)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(e10);
                        i9 = e10;
                    }
                    lVar.n(d - 4);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw t1.a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        lVar.t();
                        lVar.n(i10 + i16);
                    } else {
                        lVar.u(1);
                    }
                    i15 = i16;
                    i9 = 0;
                    i14 = 0;
                }
            } else if (i14 <= 0) {
                throw new EOFException();
            }
        }
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        return e(lVar, true);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j11;
        f fVar = this.q;
        if (!(fVar instanceof b) || ((b) fVar).b(j11)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    public d(int i9, long j10) {
        this.a = i9;
        this.b = j10;
        this.c = new y(10);
        this.d = new n0();
        this.e = new q();
        this.m = -9223372036854775807L;
        this.f = new xa.c(26);
        j jVar = new j();
        this.g = jVar;
        this.j = jVar;
    }

    @Override // m3.k
    public final void release() {
    }
}
