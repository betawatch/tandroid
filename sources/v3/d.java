package v3;

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
import q3.i;
import q3.m;
import v7.q7;
import v7.y7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final v c;
    public final z d;
    public final w e;
    public final pb.c f;
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

    public final void a() {
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
            qVar.G(this.r);
            this.i.getClass();
            this.r.l();
        }
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        return e(pVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.h() > (r2 - 4)) goto L12;
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
            return !pVar.g(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r18 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        r17.q(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        r16.k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
    
        r17.p();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(p pVar, boolean z10) {
        int i10;
        int i11;
        int h;
        int i12 = z10 ? 32768 : 131072;
        pVar.p();
        if (pVar.getPosition() == 0) {
            v vVar = (v) this.f.b;
            p0 p0Var = null;
            int i13 = 0;
            while (true) {
                try {
                    pVar.b(0, 10, vVar.a);
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
                        pVar.b(10, w10, bArr);
                        p0Var = new i(null).c(i14, bArr);
                    } else {
                        pVar.j(w10);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            pVar.p();
            pVar.j(i13);
            this.l = p0Var;
            if (p0Var != null) {
                this.e.b(p0Var);
            }
            i11 = (int) pVar.h();
            if (!z10) {
                pVar.q(i11);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (!d(pVar)) {
                v vVar2 = this.c;
                vVar2.J(0);
                int j3 = vVar2.j();
                if ((i10 == 0 || ((-128000) & j3) == (i10 & (-128000))) && (h = c3.b.h(j3)) != -1) {
                    i15++;
                    if (i15 != 1) {
                        if (i15 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(j3);
                        i10 = j3;
                    }
                    pVar.j(h - 4);
                } else {
                    int i17 = i16 + 1;
                    if (i16 == i12) {
                        if (z10) {
                            return false;
                        }
                        a();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.p();
                        pVar.j(i11 + i17);
                    } else {
                        pVar.q(1);
                    }
                    i16 = i17;
                    i10 = 0;
                    i15 = 0;
                }
            } else if (i15 <= 0) {
                a();
                throw new EOFException();
            }
        }
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.h = qVar;
        h0 I = qVar.I(0, 1);
        this.i = I;
        this.j = I;
        this.h.B();
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r3 != 1231971951) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0387  */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6, types: [c3.b0, v3.f] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r36v2 */
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
        ?? r36;
        v vVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j12;
        Object aVar;
        p0 p0Var;
        Object obj;
        f aVar2;
        long j13;
        long j14;
        int i19;
        int x10;
        Object obj2;
        Object obj3;
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
            pVar.b(0, zVar2.b, vVar4.a);
            if ((zVar2.a & 1) != 0) {
                if (zVar2.d != 1) {
                    th2 = null;
                    i12 = 36;
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
                                    obj2 = th2;
                                    zVar = zVar2;
                                } else {
                                    long W = d0.W(zVar2.c, (j17 * zVar2.f) - 1);
                                    int D = vVar4.D();
                                    int D2 = vVar4.D();
                                    int D3 = vVar4.D();
                                    vVar4.K(2);
                                    long j18 = position + zVar2.b;
                                    long[] jArr = new long[D];
                                    long[] jArr2 = new long[D];
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < D) {
                                            long j19 = j18;
                                            long j20 = W;
                                            jArr[i21] = (i21 * W) / D;
                                            jArr2[i21] = j19;
                                            if (D3 != 1) {
                                                i19 = i21;
                                                if (D3 == 2) {
                                                    x10 = vVar4.D();
                                                } else if (D3 == 3) {
                                                    x10 = vVar4.A();
                                                } else {
                                                    if (D3 != 4) {
                                                        obj2 = th2;
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
                                            W = j20;
                                        } else {
                                            long j21 = W;
                                            long j22 = j18;
                                            if (length == -1 || length == j16) {
                                                j14 = j16;
                                            } else {
                                                StringBuilder t10 = a4.a.t(length, "VBRI data size mismatch: ", ", ");
                                                j14 = j16;
                                                t10.append(j14);
                                                e2.a.n("VbriSeeker", t10.toString());
                                            }
                                            if (j14 != j22) {
                                                StringBuilder t11 = a4.a.t(j14, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                                t11.append(j22);
                                                t11.append("\nSeeking will be inaccurate.");
                                                e2.a.n("VbriSeeker", t11.toString());
                                                j14 = Math.max(j14, j22);
                                            }
                                            zVar = zVar2;
                                            obj2 = new g(jArr, jArr2, j21, j15, j14, zVar.e);
                                        }
                                    }
                                }
                                pVar.q(zVar.b);
                                obj3 = obj2;
                            } else if (i13 != 1483304551) {
                                pVar.p();
                                obj3 = th2;
                                zVar = zVar2;
                            }
                            vVar2 = vVar3;
                            aVar = obj3;
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
                                                        j13 = d0.Q(Long.parseLong((String) oVar.c.get(0)));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        j13 = -9223372036854775807L;
                                        int length2 = iArr.length;
                                        int i22 = length2 + 1;
                                        long[] jArr3 = new long[i22];
                                        long[] jArr4 = new long[i22];
                                        jArr3[0] = position2;
                                        jArr4[0] = 0;
                                        long j23 = 0;
                                        int i23 = 1;
                                        while (i23 <= length2) {
                                            int i24 = i23 - 1;
                                            position2 += r10.c + iArr[i24];
                                            j23 += r10.d + r10.f[i24];
                                            jArr3[i23] = position2;
                                            jArr4[i23] = j23;
                                            i23++;
                                            length2 = length2;
                                            iArr = iArr;
                                        }
                                        obj = new c(j13, jArr3, jArr4);
                                        ?? r27 = aVar;
                                        if (this.s) {
                                            if (obj != null) {
                                                r27 = obj;
                                            } else if (aVar == null) {
                                                r27 = th2;
                                            }
                                            int i25 = this.a;
                                            if (r27 != 0 && !r27.f() && (i25 & 1) != 0 && r27.l() != -9223372036854775807L && (r27.d() != -1 || pVar.getLength() != -1)) {
                                                long e = r27.e() != -1 ? r27.e() : 0L;
                                                long d = r27.d() != -1 ? r27.d() : pVar.getLength();
                                                aVar2 = new a(d, y7.e(d0.Y(d - e, 8000000L, r27.l(), RoundingMode.HALF_UP)), -1, false, e);
                                            } else if (r27 == 0 || !(r27.f() || (i25 & 1) == 0)) {
                                                vVar = vVar2;
                                                pVar.b(0, 4, vVar.a);
                                                vVar.J(0);
                                                zVar.a(vVar.j());
                                                aVar2 = new a(pVar.getLength(), zVar.e, zVar.b, false, pVar.getPosition());
                                                h0 h0Var = this.i;
                                                aVar2.l();
                                                h0Var.getClass();
                                            } else {
                                                aVar2 = r27;
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
                                        this.h.G(aVar2);
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
                            obj = th2;
                            ?? r272 = aVar;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.G(aVar2);
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
                            long[] jArr5 = new long[100];
                            int i26 = 0;
                            for (int i27 = 100; i26 < i27; i27 = 100) {
                                jArr5[i26] = vVar4.x();
                                i26++;
                                vVar3 = vVar3;
                            }
                            r36 = jArr5;
                        } else {
                            r36 = th2;
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
                        pVar.q(zVar.b);
                        if (i17 != 1483304551) {
                            long W2 = (j24 == -1 || j24 == 0) ? -9223372036854775807L : d0.W(i29, (j24 * i18) - 1);
                            if (W2 != -9223372036854775807L) {
                                aVar = new h(position3, i28, W2, i30, z10, r36);
                                p0Var = this.l;
                                long position22 = pVar.getPosition();
                                if (p0Var != null) {
                                }
                                obj = th2;
                                ?? r2722 = aVar;
                                if (this.s) {
                                }
                                this.r = aVar2;
                                this.h.G(aVar2);
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
                            aVar = th2;
                            p0Var = this.l;
                            long position222 = pVar.getPosition();
                            if (p0Var != null) {
                            }
                            obj = th2;
                            ?? r27222 = aVar;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.G(aVar2);
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
                            long W3 = (j24 == -1 || j24 == 0) ? -9223372036854775807L : d0.W(i29, (i18 * j24) - 1);
                            if (W3 != -9223372036854775807L) {
                                if (z10 != -1) {
                                    length3 = position3 + z10;
                                    j12 = z10 - i28;
                                } else if (length3 != -1) {
                                    j12 = (length3 - position3) - i28;
                                }
                                long j26 = length3;
                                long j27 = j12;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                aVar = new a(j26, y7.b(d0.Y(j27, 8000000L, W3, roundingMode)), y7.b(q7.b(j27, j24, roundingMode)), false, position3 + i28);
                                p0Var = this.l;
                                long position2222 = pVar.getPosition();
                                if (p0Var != null) {
                                }
                                obj = th2;
                                ?? r272222 = aVar;
                                if (this.s) {
                                }
                                this.r = aVar2;
                                this.h.G(aVar2);
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
                            aVar = th2;
                            p0Var = this.l;
                            long position22222 = pVar.getPosition();
                            if (p0Var != null) {
                            }
                            obj = th2;
                            ?? r2722222 = aVar;
                            if (this.s) {
                            }
                            this.r = aVar2;
                            this.h.G(aVar2);
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
                            pVar.q(zVar.b);
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
                    pVar.q(zVar.b);
                    if (i17 != 1483304551) {
                    }
                }
                th2 = null;
                i12 = 21;
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
                pVar.q(zVar.b);
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
                    pVar.q(zVar.b);
                    if (i17 != 1483304551) {
                    }
                }
                th2 = null;
                i12 = 21;
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
                pVar.q(zVar.b);
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
                    pVar.q((int) (j28 - position4));
                }
            }
        }
        if (this.q == 0) {
            pVar.p();
            if (!d(pVar)) {
                vVar.J(0);
                int j29 = vVar.j();
                if (((-128000) & j29) != (this.k & (-128000)) || c3.b.h(j29) == -1) {
                    pVar.q(1);
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
                    this.m = this.r.a(pVar.getPosition());
                    long j30 = this.b;
                    if (j30 != -9223372036854775807L) {
                        this.m = (j30 - this.r.a(j10)) + this.m;
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
        this.f = new pb.c();
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
