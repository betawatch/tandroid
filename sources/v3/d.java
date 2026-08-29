package v3;

import f5.d0;
import f5.w;
import g4.i;
import j3.s0;
import j3.t0;
import j3.t1;
import java.io.EOFException;
import l3.p0;
import o3.j;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements k {
    public final int a;
    public final long b;
    public final w c;
    public final p0 d;
    public final q e;
    public final o1.a f;
    public final j g;
    public m h;
    public o3.w i;
    public o3.w j;
    public int k;
    public b4.c l;
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

    public final a a(l lVar, boolean z10) {
        w wVar = this.c;
        lVar.a(0, 4, wVar.a);
        wVar.C(0);
        int e10 = wVar.e();
        p0 p0Var = this.d;
        p0Var.a(e10);
        return new a(lVar.getLength(), p0Var.e, p0Var.b, z10, lVar.getPosition());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.h() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(l lVar) {
        f fVar = this.q;
        if (fVar != null) {
            long a2 = fVar.a();
            if (a2 != -1) {
            }
        }
        try {
            return !lVar.f(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r19 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
    
        r18.t(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        r17.k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        r18.s();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(l lVar, boolean z10) {
        int i10;
        int i11;
        int d;
        int i12 = z10 ? 32768 : 131072;
        lVar.s();
        if (lVar.getPosition() == 0) {
            w wVar = (w) this.f.b;
            b4.c cVar = null;
            int i13 = 0;
            while (true) {
                try {
                    lVar.a(0, 10, wVar.a);
                    wVar.C(0);
                    if (wVar.t() != 4801587) {
                        break;
                    }
                    wVar.D(3);
                    int q6 = wVar.q();
                    int i14 = q6 + 10;
                    if (cVar == null) {
                        byte[] bArr = new byte[i14];
                        System.arraycopy(wVar.a, 0, bArr, 0, 10);
                        lVar.a(10, q6, bArr);
                        cVar = new i(null).c(i14, bArr);
                    } else {
                        lVar.i(q6);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            lVar.s();
            lVar.i(i13);
            this.l = cVar;
            if (cVar != null) {
                this.e.b(cVar);
            }
            i11 = (int) lVar.h();
            if (!z10) {
                lVar.t(i11);
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
                wVar2.C(0);
                int e10 = wVar2.e();
                if ((i10 == 0 || ((-128000) & e10) == (i10 & (-128000))) && (d = l3.b.d(e10)) != -1) {
                    i15++;
                    if (i15 != 1) {
                        if (i15 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(e10);
                        i10 = e10;
                    }
                    lVar.i(d - 4);
                } else {
                    int i17 = i16 + 1;
                    if (i16 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw t1.a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        lVar.s();
                        lVar.i(i11 + i17);
                    } else {
                        lVar.t(1);
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
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        int i10;
        int i11;
        long j10;
        l lVar2;
        Throwable th2;
        long j11;
        int i12;
        q qVar;
        o3.h hVar;
        int e10;
        f fVar;
        q qVar2;
        int i13;
        int i14;
        int u10;
        h hVar2;
        b4.c cVar;
        c cVar2;
        f a2;
        long j12;
        q qVar3;
        int r6;
        d dVar = this;
        f5.a.j(dVar.i);
        int i15 = d0.a;
        int i16 = dVar.k;
        p0 p0Var = dVar.d;
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
            w wVar2 = new w(p0Var.b);
            j10 = 1000000;
            ((o3.h) lVar).f(wVar2.a, 0, p0Var.b, false);
            int i17 = 21;
            if ((p0Var.a & 1) != 0) {
                if (p0Var.d != 1) {
                    i17 = 36;
                }
            } else if (p0Var.d == 1) {
                i17 = 13;
            }
            th2 = null;
            j11 = 0;
            if (wVar2.c >= i17 + 4) {
                wVar2.C(i17);
                i12 = wVar2.e();
                if (i12 != 1483304551) {
                }
                qVar = dVar.e;
                if (i12 != 1483304551 || i12 == 1231971951) {
                    hVar = (o3.h) lVar;
                    long j13 = hVar.c;
                    long j14 = hVar.d;
                    int i18 = p0Var.f;
                    int i19 = p0Var.c;
                    e10 = wVar2.e();
                    if ((e10 & 1) == 1 || (u10 = wVar2.u()) == 0) {
                        fVar = null;
                    } else {
                        long O = d0.O(u10, i18 * 1000000, i19);
                        if ((e10 & 6) != 6) {
                            hVar2 = new h(j14, p0Var.b, O, -1L, null);
                        } else {
                            long s10 = wVar2.s();
                            long[] jArr = new long[100];
                            for (int i20 = 0; i20 < 100; i20++) {
                                jArr[i20] = wVar2.r();
                            }
                            if (j13 != -1) {
                                long j15 = j14 + s10;
                                if (j13 != j15) {
                                    StringBuilder r9 = a4.w.r(j13, "XING data size mismatch: ", ", ");
                                    r9.append(j15);
                                    f5.a.K("XingSeeker", r9.toString());
                                }
                            }
                            hVar2 = new h(j14, p0Var.b, O, s10, jArr);
                        }
                        fVar = hVar2;
                    }
                    qVar2 = qVar;
                    if (fVar != null && (qVar2.a == -1 || qVar2.b == -1)) {
                        hVar.f = 0;
                        hVar.b(i17 + 141, false);
                        hVar.f(wVar.a, 0, 3, false);
                        wVar.C(0);
                        int t10 = wVar.t();
                        i13 = t10 >> 12;
                        i14 = t10 & 4095;
                        if (i13 <= 0 || i14 > 0) {
                            qVar2.a = i13;
                            qVar2.b = i14;
                        }
                    }
                    hVar.t(p0Var.b);
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
                        o3.h hVar3 = (o3.h) lVar;
                        long j16 = hVar3.c;
                        long j17 = hVar3.d;
                        wVar2.D(10);
                        int e11 = wVar2.e();
                        if (e11 <= 0) {
                            fVar = null;
                            qVar3 = qVar;
                        } else {
                            int i21 = p0Var.c;
                            long O2 = d0.O(e11, (i21 >= 32000 ? 1152 : 576) * 1000000, i21);
                            int w10 = wVar2.w();
                            int w11 = wVar2.w();
                            int w12 = wVar2.w();
                            wVar2.D(2);
                            long j18 = j17 + p0Var.b;
                            long[] jArr2 = new long[w10];
                            long[] jArr3 = new long[w10];
                            long j19 = j17;
                            int i22 = 0;
                            while (true) {
                                if (i22 < w10) {
                                    long[] jArr4 = jArr3;
                                    qVar3 = qVar;
                                    jArr2[i22] = (i22 * O2) / w10;
                                    jArr4[i22] = Math.max(j19, j18);
                                    if (w12 == 1) {
                                        r6 = wVar2.r();
                                    } else if (w12 == 2) {
                                        r6 = wVar2.w();
                                    } else if (w12 == 3) {
                                        r6 = wVar2.t();
                                    } else {
                                        if (w12 != 4) {
                                            fVar = null;
                                            break;
                                        }
                                        r6 = wVar2.u();
                                    }
                                    j19 += r6 * w11;
                                    i22++;
                                    qVar = qVar3;
                                    w12 = w12;
                                    jArr3 = jArr4;
                                } else {
                                    long[] jArr5 = jArr3;
                                    qVar3 = qVar;
                                    if (j16 != -1 && j16 != j19) {
                                        StringBuilder r10 = a4.w.r(j16, "VBRI data size mismatch: ", ", ");
                                        r10.append(j19);
                                        f5.a.K("VbriSeeker", r10.toString());
                                    }
                                    fVar = new g(jArr2, jArr5, O2, j19);
                                }
                            }
                        }
                        hVar3.t(p0Var.b);
                        dVar = this;
                        lVar2 = lVar;
                    } else {
                        qVar3 = qVar;
                        ((o3.h) lVar).f = 0;
                        dVar = this;
                        lVar2 = lVar;
                        fVar = null;
                    }
                    qVar2 = qVar3;
                }
                cVar = dVar.l;
                o3.h hVar4 = (o3.h) lVar2;
                long j20 = hVar4.d;
                if (cVar != null) {
                    for (b4.b bVar : cVar.a) {
                        if (bVar instanceof g4.l) {
                            int[] iArr = ((g4.l) bVar).e;
                            if (cVar != null) {
                                for (b4.b bVar2 : cVar.a) {
                                    if (bVar2 instanceof g4.n) {
                                        g4.n nVar2 = (g4.n) bVar2;
                                        if (nVar2.a.equals("TLEN")) {
                                            j12 = d0.H(Long.parseLong((String) nVar2.c.get(0)));
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
                            dVar.h.D1(a2);
                            o3.w wVar3 = dVar.j;
                            s0 s0Var = new s0();
                            s0Var.o = (String) p0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = p0Var.d;
                            s0Var.C = p0Var.c;
                            s0Var.E = qVar2.a;
                            s0Var.F = qVar2.b;
                            s0Var.i = dVar.l;
                            wVar3.b(new t0(s0Var));
                            dVar.o = hVar4.d;
                        }
                    }
                }
                cVar2 = null;
                if (dVar.r) {
                }
                dVar.q = a2;
                dVar.h.D1(a2);
                o3.w wVar32 = dVar.j;
                s0 s0Var2 = new s0();
                s0Var2.o = (String) p0Var.g;
                s0Var2.p = 4096;
                s0Var2.B = p0Var.d;
                s0Var2.C = p0Var.c;
                s0Var2.E = qVar2.a;
                s0Var2.F = qVar2.b;
                s0Var2.i = dVar.l;
                wVar32.b(new t0(s0Var2));
                dVar.o = hVar4.d;
            }
            if (wVar2.c >= 40) {
                wVar2.C(36);
                if (wVar2.e() == 1447187017) {
                    i12 = 1447187017;
                    qVar = dVar.e;
                    if (i12 != 1483304551) {
                    }
                    hVar = (o3.h) lVar;
                    long j132 = hVar.c;
                    long j142 = hVar.d;
                    int i182 = p0Var.f;
                    int i192 = p0Var.c;
                    e10 = wVar2.e();
                    if ((e10 & 1) == 1) {
                    }
                    fVar = null;
                    qVar2 = qVar;
                    if (fVar != null) {
                        hVar.f = 0;
                        hVar.b(i17 + 141, false);
                        hVar.f(wVar.a, 0, 3, false);
                        wVar.C(0);
                        int t102 = wVar.t();
                        i13 = t102 >> 12;
                        i14 = t102 & 4095;
                        if (i13 <= 0) {
                        }
                        qVar2.a = i13;
                        qVar2.b = i14;
                    }
                    hVar.t(p0Var.b);
                    if (fVar == null) {
                    }
                    dVar = this;
                    lVar2 = lVar;
                    cVar = dVar.l;
                    o3.h hVar42 = (o3.h) lVar2;
                    long j202 = hVar42.d;
                    if (cVar != null) {
                    }
                    cVar2 = null;
                    if (dVar.r) {
                    }
                    dVar.q = a2;
                    dVar.h.D1(a2);
                    o3.w wVar322 = dVar.j;
                    s0 s0Var22 = new s0();
                    s0Var22.o = (String) p0Var.g;
                    s0Var22.p = 4096;
                    s0Var22.B = p0Var.d;
                    s0Var22.C = p0Var.c;
                    s0Var22.E = qVar2.a;
                    s0Var22.F = qVar2.b;
                    s0Var22.i = dVar.l;
                    wVar322.b(new t0(s0Var22));
                    dVar.o = hVar42.d;
                }
            }
            i12 = 0;
            qVar = dVar.e;
            if (i12 != 1483304551) {
            }
            hVar = (o3.h) lVar;
            long j1322 = hVar.c;
            long j1422 = hVar.d;
            int i1822 = p0Var.f;
            int i1922 = p0Var.c;
            e10 = wVar2.e();
            if ((e10 & 1) == 1) {
            }
            fVar = null;
            qVar2 = qVar;
            if (fVar != null) {
            }
            hVar.t(p0Var.b);
            if (fVar == null) {
            }
            dVar = this;
            lVar2 = lVar;
            cVar = dVar.l;
            o3.h hVar422 = (o3.h) lVar2;
            long j2022 = hVar422.d;
            if (cVar != null) {
            }
            cVar2 = null;
            if (dVar.r) {
            }
            dVar.q = a2;
            dVar.h.D1(a2);
            o3.w wVar3222 = dVar.j;
            s0 s0Var222 = new s0();
            s0Var222.o = (String) p0Var.g;
            s0Var222.p = 4096;
            s0Var222.B = p0Var.d;
            s0Var222.C = p0Var.c;
            s0Var222.E = qVar2.a;
            s0Var222.F = qVar2.b;
            s0Var222.i = dVar.l;
            wVar3222.b(new t0(s0Var222));
            dVar.o = hVar422.d;
        } else {
            lVar2 = lVar;
            th2 = null;
            j10 = 1000000;
            j11 = 0;
            long j23 = dVar.o;
            if (j23 != 0) {
                long j24 = ((o3.h) lVar2).d;
                if (j24 < j23) {
                    ((o3.h) lVar2).t((int) (j23 - j24));
                }
            }
        }
        if (dVar.p == 0) {
            ((o3.h) lVar2).f = 0;
            if (!b(lVar)) {
                wVar.C(0);
                int e12 = wVar.e();
                if (((-128000) & e12) != (dVar.k & (-128000)) || l3.b.d(e12) == -1) {
                    ((o3.h) lVar2).t(1);
                    dVar.k = 0;
                    i10 = -1;
                    i11 = 0;
                    if (i11 == i10) {
                        f fVar3 = dVar.q;
                        if (fVar3 instanceof b) {
                            if (fVar3.h() != ((dVar.n * j10) / p0Var.c) + dVar.m) {
                                f fVar4 = dVar.q;
                                ((b) fVar4).getClass();
                                dVar.h.D1(fVar4);
                            }
                        }
                    }
                    return i11;
                }
                p0Var.a(e12);
                if (dVar.m == -9223372036854775807L) {
                    dVar.m = dVar.q.b(((o3.h) lVar2).d);
                    long j25 = dVar.b;
                    if (j25 != -9223372036854775807L) {
                        dVar.m = (j25 - dVar.q.b(j11)) + dVar.m;
                    }
                }
                dVar.p = p0Var.b;
                f fVar5 = dVar.q;
                if (fVar5 instanceof b) {
                    b bVar3 = (b) fVar5;
                    long j26 = (((dVar.n + p0Var.f) * j10) / p0Var.c) + dVar.m;
                    long j27 = ((o3.h) lVar2).d;
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
        int a10 = dVar.j.a(lVar2, dVar.p, true);
        if (a10 != -1) {
            int i26 = dVar.p - a10;
            dVar.p = i26;
            if (i26 <= 0) {
                dVar.j.c(((dVar.n * j10) / p0Var.c) + dVar.m, 1, p0Var.b, 0, null);
                dVar.n += p0Var.f;
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

    @Override // o3.k
    public final boolean e(l lVar) {
        return c(lVar, true);
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
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

    @Override // o3.k
    public final void i(m mVar) {
        this.h = mVar;
        o3.w Z1 = mVar.Z1(0, 1);
        this.i = Z1;
        this.j = Z1;
        this.h.e1();
    }

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        this.c = new w(10);
        this.d = new p0();
        this.e = new q();
        this.m = -9223372036854775807L;
        this.f = new o1.a(1);
        j jVar = new j();
        this.g = jVar;
        this.j = jVar;
    }

    @Override // o3.k
    public final void release() {
    }
}
