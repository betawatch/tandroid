package t3;

import a9.i;
import a9.p;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.o0;
import java.io.EOFException;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.q;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements k {
    public final int a;
    public final long b;
    public final z c;
    public final o0 d;
    public final q e;
    public final i f;
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

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        z zVar = this.c;
        lVar.b(0, 4, zVar.a);
        zVar.C(0);
        int e9 = zVar.e();
        o0 o0Var = this.d;
        o0Var.a(e9);
        return new a(lVar.getLength(), o0Var.e, o0Var.b, z10, lVar.getPosition());
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
        int i10;
        int i11;
        long j10;
        l lVar2;
        Throwable th;
        long j11;
        int i12;
        q qVar;
        m3.h hVar;
        int e9;
        f fVar;
        q qVar2;
        int i13;
        int i14;
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
        int i15 = g0.a;
        int i16 = dVar.k;
        o0 o0Var = dVar.d;
        if (i16 == 0) {
            try {
                dVar.e(lVar, false);
            } catch (EOFException unused) {
                i10 = -1;
                i11 = -1;
                j10 = 1000000;
            }
        }
        f fVar2 = dVar.q;
        z zVar = dVar.c;
        if (fVar2 == null) {
            z zVar2 = new z(o0Var.b);
            j10 = 1000000;
            ((m3.h) lVar).g(zVar2.a, 0, o0Var.b, false);
            int i17 = 21;
            if ((o0Var.a & 1) != 0) {
                if (o0Var.d != 1) {
                    i17 = 36;
                }
            } else if (o0Var.d == 1) {
                i17 = 13;
            }
            th = null;
            j11 = 0;
            if (zVar2.c >= i17 + 4) {
                zVar2.C(i17);
                i12 = zVar2.e();
                if (i12 != 1483304551) {
                }
                qVar = dVar.e;
                if (i12 != 1483304551 || i12 == 1231971951) {
                    hVar = (m3.h) lVar;
                    long j13 = hVar.c;
                    long j14 = hVar.d;
                    int i18 = o0Var.f;
                    int i19 = o0Var.c;
                    e9 = zVar2.e();
                    if ((e9 & 1) == 1 || (u10 = zVar2.u()) == 0) {
                        fVar = null;
                    } else {
                        long O = g0.O(u10, i18 * 1000000, i19);
                        if ((e9 & 6) != 6) {
                            hVar2 = new h(j14, o0Var.b, O, -1L, null);
                        } else {
                            long s10 = zVar2.s();
                            long[] jArr = new long[100];
                            for (int i20 = 0; i20 < 100; i20++) {
                                jArr[i20] = zVar2.r();
                            }
                            if (j13 != -1) {
                                long j15 = j14 + s10;
                                if (j13 != j15) {
                                    StringBuilder q6 = p.q(j13, "XING data size mismatch: ", ", ");
                                    q6.append(j15);
                                    d5.a.K("XingSeeker", q6.toString());
                                }
                            }
                            hVar2 = new h(j14, o0Var.b, O, s10, jArr);
                        }
                        fVar = hVar2;
                    }
                    qVar2 = qVar;
                    if (fVar != null && (qVar2.a == -1 || qVar2.b == -1)) {
                        hVar.f = 0;
                        hVar.a(i17 + 141, false);
                        hVar.g(zVar.a, 0, 3, false);
                        zVar.C(0);
                        int t10 = zVar.t();
                        i13 = t10 >> 12;
                        i14 = t10 & 4095;
                        if (i13 <= 0 || i14 > 0) {
                            qVar2.a = i13;
                            qVar2.b = i14;
                        }
                    }
                    hVar.t(o0Var.b);
                    if (fVar == null && !fVar.e() && i12 == 1231971951) {
                        dVar = this;
                        lVar2 = lVar;
                        fVar = dVar.a(lVar2, false);
                    } else {
                        dVar = this;
                        lVar2 = lVar;
                    }
                } else {
                    if (i12 == 1447187017) {
                        m3.h hVar3 = (m3.h) lVar;
                        long j16 = hVar3.c;
                        long j17 = hVar3.d;
                        zVar2.D(10);
                        int e10 = zVar2.e();
                        if (e10 <= 0) {
                            fVar = null;
                            qVar3 = qVar;
                        } else {
                            int i21 = o0Var.c;
                            long O2 = g0.O(e10, (i21 >= 32000 ? 1152 : 576) * 1000000, i21);
                            int w10 = zVar2.w();
                            int w11 = zVar2.w();
                            int w12 = zVar2.w();
                            zVar2.D(2);
                            long j18 = j17 + o0Var.b;
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
                                        r10 = zVar2.r();
                                    } else if (w12 == 2) {
                                        r10 = zVar2.w();
                                    } else if (w12 == 3) {
                                        r10 = zVar2.t();
                                    } else {
                                        if (w12 != 4) {
                                            fVar = null;
                                            break;
                                        }
                                        r10 = zVar2.u();
                                    }
                                    j19 += r10 * w11;
                                    i22++;
                                    qVar = qVar3;
                                    w12 = w12;
                                    jArr3 = jArr4;
                                } else {
                                    long[] jArr5 = jArr3;
                                    qVar3 = qVar;
                                    if (j16 != -1 && j16 != j19) {
                                        StringBuilder q9 = p.q(j16, "VBRI data size mismatch: ", ", ");
                                        q9.append(j19);
                                        d5.a.K("VbriSeeker", q9.toString());
                                    }
                                    fVar = new g(jArr2, jArr5, O2, j19);
                                }
                            }
                        }
                        hVar3.t(o0Var.b);
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
                                            j12 = g0.H(Long.parseLong((String) nVar2.c.get(0)));
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
                                a2 = (fVar == null || !(fVar.e() || (dVar.a & 1) == 0)) ? dVar.a(lVar2, false) : fVar;
                            } else {
                                a2 = new e(-9223372036854775807L);
                            }
                            dVar.q = a2;
                            dVar.h.n(a2);
                            w wVar = dVar.j;
                            s0 s0Var = new s0();
                            s0Var.o = (String) o0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = o0Var.d;
                            s0Var.C = o0Var.c;
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
                dVar.h.n(a2);
                w wVar2 = dVar.j;
                s0 s0Var2 = new s0();
                s0Var2.o = (String) o0Var.g;
                s0Var2.p = 4096;
                s0Var2.B = o0Var.d;
                s0Var2.C = o0Var.c;
                s0Var2.E = qVar2.a;
                s0Var2.F = qVar2.b;
                s0Var2.i = dVar.l;
                wVar2.c(new t0(s0Var2));
                dVar.o = hVar4.d;
            }
            if (zVar2.c >= 40) {
                zVar2.C(36);
                if (zVar2.e() == 1447187017) {
                    i12 = 1447187017;
                    qVar = dVar.e;
                    if (i12 != 1483304551) {
                    }
                    hVar = (m3.h) lVar;
                    long j132 = hVar.c;
                    long j142 = hVar.d;
                    int i182 = o0Var.f;
                    int i192 = o0Var.c;
                    e9 = zVar2.e();
                    if ((e9 & 1) == 1) {
                    }
                    fVar = null;
                    qVar2 = qVar;
                    if (fVar != null) {
                        hVar.f = 0;
                        hVar.a(i17 + 141, false);
                        hVar.g(zVar.a, 0, 3, false);
                        zVar.C(0);
                        int t102 = zVar.t();
                        i13 = t102 >> 12;
                        i14 = t102 & 4095;
                        if (i13 <= 0) {
                        }
                        qVar2.a = i13;
                        qVar2.b = i14;
                    }
                    hVar.t(o0Var.b);
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
                    dVar.h.n(a2);
                    w wVar22 = dVar.j;
                    s0 s0Var22 = new s0();
                    s0Var22.o = (String) o0Var.g;
                    s0Var22.p = 4096;
                    s0Var22.B = o0Var.d;
                    s0Var22.C = o0Var.c;
                    s0Var22.E = qVar2.a;
                    s0Var22.F = qVar2.b;
                    s0Var22.i = dVar.l;
                    wVar22.c(new t0(s0Var22));
                    dVar.o = hVar42.d;
                }
            }
            i12 = 0;
            qVar = dVar.e;
            if (i12 != 1483304551) {
            }
            hVar = (m3.h) lVar;
            long j1322 = hVar.c;
            long j1422 = hVar.d;
            int i1822 = o0Var.f;
            int i1922 = o0Var.c;
            e9 = zVar2.e();
            if ((e9 & 1) == 1) {
            }
            fVar = null;
            qVar2 = qVar;
            if (fVar != null) {
            }
            hVar.t(o0Var.b);
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
            dVar.h.n(a2);
            w wVar222 = dVar.j;
            s0 s0Var222 = new s0();
            s0Var222.o = (String) o0Var.g;
            s0Var222.p = 4096;
            s0Var222.B = o0Var.d;
            s0Var222.C = o0Var.c;
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
                    ((m3.h) lVar2).t((int) (j23 - j24));
                }
            }
        }
        if (dVar.p == 0) {
            ((m3.h) lVar2).f = 0;
            if (!d(lVar)) {
                zVar.C(0);
                int e11 = zVar.e();
                if (((-128000) & e11) != (dVar.k & (-128000)) || j3.b.d(e11) == -1) {
                    ((m3.h) lVar2).t(1);
                    dVar.k = 0;
                    i10 = -1;
                    i11 = 0;
                    if (i11 == i10) {
                        f fVar3 = dVar.q;
                        if (fVar3 instanceof b) {
                            if (fVar3.i() != ((dVar.n * j10) / o0Var.c) + dVar.m) {
                                f fVar4 = dVar.q;
                                ((b) fVar4).getClass();
                                dVar.h.n(fVar4);
                            }
                        }
                    }
                    return i11;
                }
                o0Var.a(e11);
                if (dVar.m == -9223372036854775807L) {
                    dVar.m = dVar.q.a(((m3.h) lVar2).d);
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
            i10 = -1;
            i11 = -1;
            if (i11 == i10) {
            }
            return i11;
        }
        int b10 = dVar.j.b(lVar2, dVar.p, true);
        if (b10 != -1) {
            int i26 = dVar.p - b10;
            dVar.p = i26;
            if (i26 <= 0) {
                dVar.j.e(((dVar.n * j10) / o0Var.c) + dVar.m, 1, o0Var.b, 0, null);
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

    @Override // m3.k
    public final void c(m mVar) {
        this.h = mVar;
        w C = mVar.C(0, 1);
        this.i = C;
        this.j = C;
        this.h.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.i() > (r2 - 4)) goto L12;
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
    
        r18.t(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        r17.k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        r18.q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(l lVar, boolean z10) {
        int i10;
        int i11;
        int d;
        int i12 = z10 ? 32768 : 131072;
        lVar.q();
        if (lVar.getPosition() == 0) {
            z zVar = (z) this.f.b;
            z3.c cVar = null;
            int i13 = 0;
            while (true) {
                try {
                    lVar.b(0, 10, zVar.a);
                    zVar.C(0);
                    if (zVar.t() != 4801587) {
                        break;
                    }
                    zVar.D(3);
                    int q6 = zVar.q();
                    int i14 = q6 + 10;
                    if (cVar == null) {
                        byte[] bArr = new byte[i14];
                        System.arraycopy(zVar.a, 0, bArr, 0, 10);
                        lVar.b(10, q6, bArr);
                        cVar = new e4.i(null).c(i14, bArr);
                    } else {
                        lVar.j(q6);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            lVar.q();
            lVar.j(i13);
            this.l = cVar;
            if (cVar != null) {
                this.e.b(cVar);
            }
            i11 = (int) lVar.i();
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
            if (!d(lVar)) {
                z zVar2 = this.c;
                zVar2.C(0);
                int e9 = zVar2.e();
                if ((i10 == 0 || ((-128000) & e9) == (i10 & (-128000))) && (d = j3.b.d(e9)) != -1) {
                    i15++;
                    if (i15 != 1) {
                        if (i15 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(e9);
                        i10 = e9;
                    }
                    lVar.j(d - 4);
                } else {
                    int i17 = i16 + 1;
                    if (i16 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw t1.a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        lVar.q();
                        lVar.j(i11 + i17);
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

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        this.c = new z(10);
        this.d = new o0();
        this.e = new q();
        this.m = -9223372036854775807L;
        this.f = new i(28);
        j jVar = new j();
        this.g = jVar;
        this.j = jVar;
    }

    @Override // m3.k
    public final void release() {
    }
}
