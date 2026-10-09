package v3;

import a6.i;
import b2.o0;
import b2.p0;
import b2.r;
import b2.r0;
import c3.b0;
import c3.h0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.w;
import c3.z;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import q3.m;
import v7.n7;
import v7.v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final v c;
    public final z d;
    public final w e;
    public final i f;
    public final n g;
    public q h;
    public h0 i;
    public h0 j;
    public int k;
    public p0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public f r;
    public boolean s;
    public boolean t;
    public long u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        b0 b0Var = this.r;
        if ((b0Var instanceof a) && ((k) b0Var).f()) {
            long j3 = this.p;
            if (j3 == -1 || j3 == this.r.d()) {
                return;
            }
            a aVar = (a) this.r;
            this.r = new a(this.p, aVar.i, aVar.j, aVar.k, aVar.h);
            q qVar = this.h;
            qVar.getClass();
            qVar.d2(this.r);
            this.i.getClass();
            this.r.l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.j() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(p pVar) {
        f fVar = this.r;
        if (fVar != null) {
            long d = fVar.d();
            if (d != -1) {
            }
        }
        try {
            return !pVar.h(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (r18 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        r17.r(r3 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        r16.k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e6, code lost:
    
        r17.q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(p pVar, boolean z10) {
        int i10;
        int i11;
        int h;
        int i12 = z10 ? 32768 : 131072;
        pVar.q();
        if (pVar.getPosition() == 0) {
            v vVar = (v) this.f.b;
            int i13 = 0;
            p0 p0Var = null;
            while (true) {
                try {
                    pVar.a(0, 10, vVar.a);
                    vVar.J(0);
                    if (vVar.A() != 4801587) {
                        break;
                    }
                    vVar.K(3);
                    int w10 = vVar.w();
                    int i14 = w10 + 10;
                    if (p0Var == null) {
                        byte[] bArr = new byte[i14];
                        System.arraycopy(vVar.a, 0, bArr, 0, 10);
                        pVar.a(10, w10, bArr);
                        p0Var = new q3.i(null).c(i14, bArr);
                    } else {
                        pVar.l(w10);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            pVar.q();
            pVar.l(i13);
            this.l = p0Var;
            if (p0Var != null) {
                this.e.b(p0Var);
            }
            i10 = (int) pVar.j();
            if (!z10) {
                pVar.r(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i15 = i11;
        int i16 = i15;
        while (true) {
            if (!d(pVar)) {
                v vVar2 = this.c;
                vVar2.J(0);
                int j3 = vVar2.j();
                if ((i11 == 0 || ((-128000) & j3) == (i11 & (-128000))) && (h = c3.b.h(j3)) != -1) {
                    i15++;
                    if (i15 != 1) {
                        if (i15 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(j3);
                        i11 = j3;
                    }
                    pVar.l(h - 4);
                } else {
                    int i17 = i16 + 1;
                    if (i16 == i12) {
                        if (z10) {
                            return false;
                        }
                        b();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.q();
                        pVar.l(i10 + i17);
                    } else {
                        pVar.r(1);
                    }
                    i15 = 0;
                    i16 = i17;
                    i11 = 0;
                }
            } else if (i15 <= 0) {
                b();
                throw new EOFException();
            }
        }
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.h = qVar;
        h0 f22 = qVar.f2(0, 1);
        this.i = f22;
        this.j = f22;
        this.h.k1();
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.u = j10;
        if (this.r instanceof b) {
            throw null;
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r3 != 1231971951) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037a  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        z zVar;
        Throwable th2;
        int i10;
        int i11;
        long j3;
        v vVar;
        long j10;
        int i12;
        int i13;
        w wVar;
        int j11;
        long[] jArr;
        v vVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j12;
        f aVar;
        p0 p0Var;
        c cVar;
        f aVar2;
        long j13;
        long j14;
        int i19;
        int x10;
        e2.d.h(this.i);
        String str = d0.a;
        int i20 = this.k;
        z zVar2 = this.d;
        if (i20 == 0) {
            try {
                e(pVar, false);
            } catch (EOFException unused) {
                zVar = zVar2;
                th2 = null;
                i10 = -1;
                i11 = -1;
                j3 = 1000000;
            }
        }
        f fVar = this.r;
        v vVar3 = this.c;
        if (fVar == null) {
            v vVar4 = new v(zVar2.b);
            j3 = 1000000;
            pVar.a(0, zVar2.b, vVar4.a);
            if ((zVar2.a & 1) != 0) {
                if (zVar2.d != 1) {
                    i12 = 36;
                    th2 = null;
                    j10 = 0;
                    if (vVar4.c >= i12 + 4) {
                        vVar4.J(i12);
                        i13 = vVar4.j();
                        if (i13 != 1483304551) {
                        }
                        wVar = this.e;
                        if (i13 != 1231971951) {
                            if (i13 == 1447187017) {
                                long length = pVar.getLength();
                                long position = pVar.getPosition();
                                vVar4.K(6);
                                long j15 = position + zVar2.b;
                                long j16 = j15 + vVar4.j();
                                int j17 = vVar4.j();
                                if (j17 <= 0) {
                                    aVar = null;
                                    zVar = zVar2;
                                } else {
                                    long V = d0.V(zVar2.c, (j17 * zVar2.f) - 1);
                                    int D = vVar4.D();
                                    int D2 = vVar4.D();
                                    int D3 = vVar4.D();
                                    vVar4.K(2);
                                    long j18 = position + zVar2.b;
                                    long[] jArr2 = new long[D];
                                    long[] jArr3 = new long[D];
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < D) {
                                            long j19 = j18;
                                            long j20 = V;
                                            jArr2[i21] = (i21 * V) / D;
                                            jArr3[i21] = j19;
                                            if (D3 != 1) {
                                                i19 = i21;
                                                if (D3 == 2) {
                                                    x10 = vVar4.D();
                                                } else if (D3 == 3) {
                                                    x10 = vVar4.A();
                                                } else {
                                                    if (D3 != 4) {
                                                        aVar = null;
                                                        zVar = zVar2;
                                                        break;
                                                    }
                                                    x10 = vVar4.B();
                                                }
                                            } else {
                                                i19 = i21;
                                                x10 = vVar4.x();
                                            }
                                            j18 = (x10 * D2) + j19;
                                            i21 = i19 + 1;
                                            V = j20;
                                        } else {
                                            long j21 = V;
                                            long j22 = j18;
                                            if (length == -1 || length == j16) {
                                                j14 = j16;
                                            } else {
                                                StringBuilder u10 = a1.g.u(length, "VBRI data size mismatch: ", ", ");
                                                j14 = j16;
                                                u10.append(j14);
                                                e2.a.n("VbriSeeker", u10.toString());
                                            }
                                            if (j14 != j22) {
                                                StringBuilder u11 = a1.g.u(j14, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                                u11.append(j22);
                                                u11.append("\nSeeking will be inaccurate.");
                                                e2.a.n("VbriSeeker", u11.toString());
                                                j14 = Math.max(j14, j22);
                                            }
                                            zVar = zVar2;
                                            aVar = new g(jArr2, jArr3, j21, j15, j14, zVar.e);
                                        }
                                    }
                                }
                                pVar.r(zVar.b);
                            } else if (i13 != 1483304551) {
                                pVar.q();
                                aVar = null;
                                zVar = zVar2;
                            }
                            vVar2 = vVar3;
                            p0Var = this.l;
                            long position2 = pVar.getPosition();
                            if (p0Var != null) {
                                for (o0 o0Var : p0Var.a) {
                                    if (o0Var instanceof m) {
                                        int[] iArr = ((m) o0Var).e;
                                        if (p0Var != null) {
                                            for (o0 o0Var2 : p0Var.a) {
                                                if (o0Var2 instanceof q3.o) {
                                                    q3.o oVar = (q3.o) o0Var2;
                                                    if (oVar.a.equals("TLEN")) {
                                                        j13 = d0.P(Long.parseLong((String) oVar.c.get(0)));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        j13 = -9223372036854775807L;
                                        int length2 = iArr.length;
                                        int i22 = length2 + 1;
                                        long[] jArr4 = new long[i22];
                                        long[] jArr5 = new long[i22];
                                        jArr4[0] = position2;
                                        jArr5[0] = 0;
                                        long j23 = 0;
                                        int i23 = 1;
                                        while (i23 <= length2) {
                                            int i24 = i23 - 1;
                                            position2 += r10.c + iArr[i24];
                                            j23 += r10.d + r10.f[i24];
                                            jArr4[i23] = position2;
                                            jArr5[i23] = j23;
                                            i23++;
                                            length2 = length2;
                                            iArr = iArr;
                                        }
                                        cVar = new c(j13, jArr4, jArr5);
                                        if (this.s) {
                                            if (cVar != null) {
                                                aVar = cVar;
                                            } else if (aVar == null) {
                                                aVar = null;
                                            }
                                            int i25 = this.a;
                                            if (aVar != null && !aVar.f() && (i25 & 1) != 0 && aVar.l() != -9223372036854775807L && (aVar.d() != -1 || pVar.getLength() != -1)) {
                                                long e7 = aVar.e() != -1 ? aVar.e() : 0L;
                                                long d = aVar.d() != -1 ? aVar.d() : pVar.getLength();
                                                aVar2 = new a(d, v7.e(d0.X(d - e7, 8000000L, aVar.l(), RoundingMode.HALF_UP)), -1, false, e7);
                                            } else if (aVar == null || !(aVar.f() || (i25 & 1) == 0)) {
                                                vVar = vVar2;
                                                pVar.a(0, 4, vVar.a);
                                                vVar.J(0);
                                                zVar.a(vVar.j());
                                                aVar2 = new a(pVar.getLength(), zVar.e, zVar.b, false, pVar.getPosition());
                                                h0 h0Var = this.i;
                                                aVar2.l();
                                                h0Var.getClass();
                                            } else {
                                                aVar2 = aVar;
                                            }
                                            vVar = vVar2;
                                            h0 h0Var2 = this.i;
                                            aVar2.l();
                                            h0Var2.getClass();
                                        } else {
                                            aVar2 = new e(-9223372036854775807L);
                                            vVar = vVar2;
                                        }
                                        this.r = aVar2;
                                        this.h.d2(aVar2);
                                        r rVar = new r();
                                        rVar.p = r0.n("audio/mpeg");
                                        rVar.q = r0.n((String) zVar.g);
                                        rVar.r = 4096;
                                        rVar.I = zVar.d;
                                        rVar.J = zVar.c;
                                        rVar.L = wVar.a;
                                        rVar.M = wVar.b;
                                        rVar.k = this.l;
                                        if (this.r.k() != -2147483647) {
                                            rVar.h = this.r.k();
                                        }
                                        this.j.b(new b2.s(rVar));
                                        this.o = pVar.getPosition();
                                    }
                                }
                            }
                            cVar = null;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.d2(aVar2);
                            r rVar2 = new r();
                            rVar2.p = r0.n("audio/mpeg");
                            rVar2.q = r0.n((String) zVar.g);
                            rVar2.r = 4096;
                            rVar2.I = zVar.d;
                            rVar2.J = zVar.c;
                            rVar2.L = wVar.a;
                            rVar2.M = wVar.b;
                            rVar2.k = this.l;
                            if (this.r.k() != -2147483647) {
                            }
                            this.j.b(new b2.s(rVar2));
                            this.o = pVar.getPosition();
                        }
                        zVar = zVar2;
                        j11 = vVar4.j();
                        int B = (j11 & 1) == 0 ? vVar4.B() : -1;
                        long z10 = (j11 & 2) == 0 ? vVar4.z() : -1L;
                        if ((j11 & 4) != 4) {
                            long[] jArr6 = new long[100];
                            int i26 = 0;
                            for (int i27 = 100; i26 < i27; i27 = 100) {
                                jArr6[i26] = vVar4.x();
                                i26++;
                                vVar3 = vVar3;
                            }
                            jArr = jArr6;
                        } else {
                            jArr = null;
                        }
                        vVar2 = vVar3;
                        if ((j11 & 8) != 0) {
                            vVar4.K(4);
                        }
                        if (vVar4.a() < 24) {
                            vVar4.K(21);
                            int A = vVar4.A();
                            i15 = (16773120 & A) >> 12;
                            i14 = A & 4095;
                        } else {
                            i14 = -1;
                            i15 = -1;
                        }
                        long j24 = B;
                        int i28 = zVar.b;
                        int i29 = zVar.c;
                        int i30 = zVar.e;
                        i16 = zVar.f;
                        if ((wVar.a != -1 || wVar.b == -1) && i15 != -1 && i14 != -1) {
                            wVar.a = i15;
                            wVar.b = i14;
                        }
                        long position3 = pVar.getPosition();
                        if (pVar.getLength() != -1 || z10 == -1) {
                            i17 = i13;
                            i18 = i16;
                        } else {
                            i18 = i16;
                            long j25 = position3 + z10;
                            if (pVar.getLength() != j25) {
                                StringBuilder sb2 = new StringBuilder("Data size mismatch between stream (");
                                i17 = i13;
                                sb2.append(pVar.getLength());
                                sb2.append(") and Xing frame (");
                                sb2.append(j25);
                                sb2.append("), using Xing value.");
                                e2.a.i("Mp3Extractor", sb2.toString());
                            } else {
                                i17 = i13;
                            }
                        }
                        pVar.r(zVar.b);
                        if (i17 != 1483304551) {
                            long V2 = (j24 == -1 || j24 == 0) ? -9223372036854775807L : d0.V(i29, (j24 * i18) - 1);
                            if (V2 != -9223372036854775807L) {
                                aVar = new h(position3, i28, V2, i30, z10, jArr);
                                p0Var = this.l;
                                long position22 = pVar.getPosition();
                                if (p0Var != null) {
                                }
                                cVar = null;
                                if (this.s) {
                                }
                                this.r = aVar2;
                                this.h.d2(aVar2);
                                r rVar22 = new r();
                                rVar22.p = r0.n("audio/mpeg");
                                rVar22.q = r0.n((String) zVar.g);
                                rVar22.r = 4096;
                                rVar22.I = zVar.d;
                                rVar22.J = zVar.c;
                                rVar22.L = wVar.a;
                                rVar22.M = wVar.b;
                                rVar22.k = this.l;
                                if (this.r.k() != -2147483647) {
                                }
                                this.j.b(new b2.s(rVar22));
                                this.o = pVar.getPosition();
                            }
                            aVar = null;
                            p0Var = this.l;
                            long position222 = pVar.getPosition();
                            if (p0Var != null) {
                            }
                            cVar = null;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.d2(aVar2);
                            r rVar222 = new r();
                            rVar222.p = r0.n("audio/mpeg");
                            rVar222.q = r0.n((String) zVar.g);
                            rVar222.r = 4096;
                            rVar222.I = zVar.d;
                            rVar222.J = zVar.c;
                            rVar222.L = wVar.a;
                            rVar222.M = wVar.b;
                            rVar222.k = this.l;
                            if (this.r.k() != -2147483647) {
                            }
                            this.j.b(new b2.s(rVar222));
                            this.o = pVar.getPosition();
                        } else {
                            long length3 = pVar.getLength();
                            long V3 = (j24 == -1 || j24 == 0) ? -9223372036854775807L : d0.V(i29, (i18 * j24) - 1);
                            if (V3 != -9223372036854775807L) {
                                if (z10 != -1) {
                                    length3 = position3 + z10;
                                    j12 = z10 - i28;
                                } else if (length3 != -1) {
                                    j12 = (length3 - position3) - i28;
                                }
                                long j26 = length3;
                                long j27 = j12;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                aVar = new a(j26, v7.b(d0.X(j27, 8000000L, V3, roundingMode)), v7.b(n7.b(j27, j24, roundingMode)), false, position3 + i28);
                                p0Var = this.l;
                                long position2222 = pVar.getPosition();
                                if (p0Var != null) {
                                }
                                cVar = null;
                                if (this.s) {
                                }
                                this.r = aVar2;
                                this.h.d2(aVar2);
                                r rVar2222 = new r();
                                rVar2222.p = r0.n("audio/mpeg");
                                rVar2222.q = r0.n((String) zVar.g);
                                rVar2222.r = 4096;
                                rVar2222.I = zVar.d;
                                rVar2222.J = zVar.c;
                                rVar2222.L = wVar.a;
                                rVar2222.M = wVar.b;
                                rVar2222.k = this.l;
                                if (this.r.k() != -2147483647) {
                                }
                                this.j.b(new b2.s(rVar2222));
                                this.o = pVar.getPosition();
                            }
                            aVar = null;
                            p0Var = this.l;
                            long position22222 = pVar.getPosition();
                            if (p0Var != null) {
                            }
                            cVar = null;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.d2(aVar2);
                            r rVar22222 = new r();
                            rVar22222.p = r0.n("audio/mpeg");
                            rVar22222.q = r0.n((String) zVar.g);
                            rVar22222.r = 4096;
                            rVar22222.I = zVar.d;
                            rVar22222.J = zVar.c;
                            rVar22222.L = wVar.a;
                            rVar22222.M = wVar.b;
                            rVar22222.k = this.l;
                            if (this.r.k() != -2147483647) {
                            }
                            this.j.b(new b2.s(rVar22222));
                            this.o = pVar.getPosition();
                        }
                    }
                    if (vVar4.c >= 40) {
                        vVar4.J(36);
                        if (vVar4.j() == 1447187017) {
                            i13 = 1447187017;
                            wVar = this.e;
                            if (i13 != 1231971951) {
                            }
                            zVar = zVar2;
                            j11 = vVar4.j();
                            if ((j11 & 1) == 0) {
                            }
                            if ((j11 & 2) == 0) {
                            }
                            if ((j11 & 4) != 4) {
                            }
                            vVar2 = vVar3;
                            if ((j11 & 8) != 0) {
                            }
                            if (vVar4.a() < 24) {
                            }
                            long j242 = B;
                            int i282 = zVar.b;
                            int i292 = zVar.c;
                            int i302 = zVar.e;
                            i16 = zVar.f;
                            if (wVar.a != -1) {
                            }
                            wVar.a = i15;
                            wVar.b = i14;
                            long position32 = pVar.getPosition();
                            if (pVar.getLength() != -1) {
                            }
                            i17 = i13;
                            i18 = i16;
                            pVar.r(zVar.b);
                            if (i17 != 1483304551) {
                            }
                        }
                    }
                    i13 = 0;
                    wVar = this.e;
                    if (i13 != 1231971951) {
                    }
                    zVar = zVar2;
                    j11 = vVar4.j();
                    if ((j11 & 1) == 0) {
                    }
                    if ((j11 & 2) == 0) {
                    }
                    if ((j11 & 4) != 4) {
                    }
                    vVar2 = vVar3;
                    if ((j11 & 8) != 0) {
                    }
                    if (vVar4.a() < 24) {
                    }
                    long j2422 = B;
                    int i2822 = zVar.b;
                    int i2922 = zVar.c;
                    int i3022 = zVar.e;
                    i16 = zVar.f;
                    if (wVar.a != -1) {
                    }
                    wVar.a = i15;
                    wVar.b = i14;
                    long position322 = pVar.getPosition();
                    if (pVar.getLength() != -1) {
                    }
                    i17 = i13;
                    i18 = i16;
                    pVar.r(zVar.b);
                    if (i17 != 1483304551) {
                    }
                }
                i12 = 21;
                th2 = null;
                j10 = 0;
                if (vVar4.c >= i12 + 4) {
                }
                if (vVar4.c >= 40) {
                }
                i13 = 0;
                wVar = this.e;
                if (i13 != 1231971951) {
                }
                zVar = zVar2;
                j11 = vVar4.j();
                if ((j11 & 1) == 0) {
                }
                if ((j11 & 2) == 0) {
                }
                if ((j11 & 4) != 4) {
                }
                vVar2 = vVar3;
                if ((j11 & 8) != 0) {
                }
                if (vVar4.a() < 24) {
                }
                long j24222 = B;
                int i28222 = zVar.b;
                int i29222 = zVar.c;
                int i30222 = zVar.e;
                i16 = zVar.f;
                if (wVar.a != -1) {
                }
                wVar.a = i15;
                wVar.b = i14;
                long position3222 = pVar.getPosition();
                if (pVar.getLength() != -1) {
                }
                i17 = i13;
                i18 = i16;
                pVar.r(zVar.b);
                if (i17 != 1483304551) {
                }
            } else {
                if (zVar2.d == 1) {
                    i12 = 13;
                    th2 = null;
                    j10 = 0;
                    if (vVar4.c >= i12 + 4) {
                    }
                    if (vVar4.c >= 40) {
                    }
                    i13 = 0;
                    wVar = this.e;
                    if (i13 != 1231971951) {
                    }
                    zVar = zVar2;
                    j11 = vVar4.j();
                    if ((j11 & 1) == 0) {
                    }
                    if ((j11 & 2) == 0) {
                    }
                    if ((j11 & 4) != 4) {
                    }
                    vVar2 = vVar3;
                    if ((j11 & 8) != 0) {
                    }
                    if (vVar4.a() < 24) {
                    }
                    long j242222 = B;
                    int i282222 = zVar.b;
                    int i292222 = zVar.c;
                    int i302222 = zVar.e;
                    i16 = zVar.f;
                    if (wVar.a != -1) {
                    }
                    wVar.a = i15;
                    wVar.b = i14;
                    long position32222 = pVar.getPosition();
                    if (pVar.getLength() != -1) {
                    }
                    i17 = i13;
                    i18 = i16;
                    pVar.r(zVar.b);
                    if (i17 != 1483304551) {
                    }
                }
                i12 = 21;
                th2 = null;
                j10 = 0;
                if (vVar4.c >= i12 + 4) {
                }
                if (vVar4.c >= 40) {
                }
                i13 = 0;
                wVar = this.e;
                if (i13 != 1231971951) {
                }
                zVar = zVar2;
                j11 = vVar4.j();
                if ((j11 & 1) == 0) {
                }
                if ((j11 & 2) == 0) {
                }
                if ((j11 & 4) != 4) {
                }
                vVar2 = vVar3;
                if ((j11 & 8) != 0) {
                }
                if (vVar4.a() < 24) {
                }
                long j2422222 = B;
                int i2822222 = zVar.b;
                int i2922222 = zVar.c;
                int i3022222 = zVar.e;
                i16 = zVar.f;
                if (wVar.a != -1) {
                }
                wVar.a = i15;
                wVar.b = i14;
                long position322222 = pVar.getPosition();
                if (pVar.getLength() != -1) {
                }
                i17 = i13;
                i18 = i16;
                pVar.r(zVar.b);
                if (i17 != 1483304551) {
                }
            }
        } else {
            zVar = zVar2;
            vVar = vVar3;
            th2 = null;
            j3 = 1000000;
            j10 = 0;
            if (this.o != 0) {
                long position4 = pVar.getPosition();
                long j28 = this.o;
                if (position4 < j28) {
                    pVar.r((int) (j28 - position4));
                }
            }
        }
        if (this.q == 0) {
            pVar.q();
            if (!d(pVar)) {
                vVar.J(0);
                int j29 = vVar.j();
                if (((-128000) & j29) != (this.k & (-128000)) || c3.b.h(j29) == -1) {
                    pVar.r(1);
                    this.k = 0;
                    i10 = 0;
                    i11 = -1;
                    if (i10 == i11) {
                        f fVar2 = this.r;
                        if (fVar2 instanceof b) {
                            if (fVar2.l() != ((this.n * j3) / zVar.c) + this.m) {
                                ((b) this.r).getClass();
                                throw th2;
                            }
                        }
                    }
                    return i10;
                }
                zVar.a(j29);
                if (this.m == -9223372036854775807L) {
                    this.m = this.r.b(pVar.getPosition());
                    long j30 = this.b;
                    if (j30 != -9223372036854775807L) {
                        this.m = (j30 - this.r.b(j10)) + this.m;
                    }
                }
                this.q = zVar.b;
                this.p = pVar.getPosition() + zVar.b;
                if (this.r instanceof b) {
                    long j31 = ((this.n + zVar.f) * j3) / zVar.c;
                    throw th2;
                }
            }
            i10 = -1;
            i11 = -1;
            if (i10 == i11) {
            }
            return i10;
        }
        int a2 = this.j.a(pVar, this.q, true);
        if (a2 != -1) {
            int i31 = this.q - a2;
            this.q = i31;
            if (i31 <= 0) {
                this.j.c(((this.n * j3) / zVar.c) + this.m, 1, zVar.b, 0, null);
                this.n += zVar.f;
                this.q = 0;
                i10 = 0;
                i11 = -1;
                if (i10 == i11) {
                }
                return i10;
            }
            i10 = 0;
            i11 = -1;
            if (i10 == i11) {
            }
            return i10;
        }
        i10 = -1;
        i11 = -1;
        if (i10 == i11) {
        }
        return i10;
    }

    public d(int i10, long j3) {
        this.a = i10;
        this.b = j3;
        this.c = new v(10);
        this.d = new z();
        this.e = new w();
        this.m = -9223372036854775807L;
        this.f = new i(8);
        n nVar = new n();
        this.g = nVar;
        this.j = nVar;
        this.p = -1L;
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
