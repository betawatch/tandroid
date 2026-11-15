package y3;

import c8.g1;
import c8.t0;
import e2.p0;
import e2.q0;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.w;
import f3.z;
import h2.l0;
import h2.x;
import h9.g0;
import h9.s1;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.tgnet.TLObject;
import t3.l;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final x c;
    public final z d;
    public final w e;
    public final d6.i f;
    public final n g;
    public q h;
    public i0 i;
    public i0 j;
    public int k;
    public q0 l;
    public q0 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public h s;
    public boolean t;
    public boolean u;
    public long v;

    public d(int i7) {
        this(i7, -9223372036854775807L);
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        return j(pVar, true);
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.h = qVar;
        i0 d2 = qVar.d2(0, 1);
        this.i = d2;
        this.j = d2;
        this.h.d1();
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j10;
        if (this.s instanceof b) {
            throw null;
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = h9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0344, code lost:
    
        if (g9.r.a.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037e, code lost:
    
        if (((t3.n) r10).a.equals("TLEN") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (r4 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ed  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        Throwable th2;
        int i7;
        int i10;
        long j3;
        long j10;
        int i11;
        int i12;
        long j11;
        int m10;
        long[] jArr;
        x xVar;
        f fVar;
        int i13;
        int i14;
        w wVar;
        h aVar;
        long j12;
        long j13;
        q0 q0Var;
        p0 p0Var;
        p0 p0Var2;
        int i15;
        long S;
        c cVar;
        h hVar;
        q0 q0Var2;
        w wVar2;
        int A;
        this.i.getClass();
        String str = l0.a;
        int i16 = this.k;
        z zVar = this.d;
        if (i16 == 0) {
            try {
                j(pVar, false);
            } catch (EOFException unused) {
                th2 = null;
                i7 = -1;
                i10 = -1;
                j3 = 1000000;
            }
        }
        if (this.s == null) {
            x xVar2 = new x(zVar.b);
            pVar.c(0, zVar.b, xVar2.a);
            int i17 = 21;
            th2 = null;
            if ((zVar.a & 1) != 0) {
                if (zVar.d != 1) {
                    i17 = 36;
                }
            } else if (zVar.d == 1) {
                i17 = 13;
            }
            j3 = 1000000;
            j10 = 0;
            if (xVar2.c >= i17 + 4) {
                xVar2.N(i17);
                i11 = xVar2.m();
                if (i11 != 1483304551) {
                }
                w wVar3 = this.e;
                if (i11 != 1231971951) {
                    if (i11 == 1447187017) {
                        long length = pVar.getLength();
                        long position = pVar.getPosition();
                        j11 = -9223372036854775807L;
                        xVar2.O(6);
                        i12 = 0;
                        long j14 = position + zVar.b;
                        long m11 = j14 + xVar2.m();
                        int m12 = xVar2.m();
                        if (m12 <= 0) {
                            aVar = null;
                            wVar2 = wVar3;
                        } else {
                            long Y = l0.Y(zVar.c, (m12 * zVar.f) - 1);
                            int H = xVar2.H();
                            int H2 = xVar2.H();
                            int H3 = xVar2.H();
                            xVar2.O(2);
                            long j15 = position + zVar.b;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i18 = 0;
                            while (true) {
                                if (i18 < H) {
                                    x xVar3 = xVar2;
                                    wVar2 = wVar3;
                                    jArr2[i18] = (i18 * Y) / H;
                                    jArr3[i18] = j15;
                                    if (H3 == 1) {
                                        A = xVar3.A();
                                    } else if (H3 == 2) {
                                        A = xVar3.H();
                                    } else if (H3 == 3) {
                                        A = xVar3.D();
                                    } else {
                                        if (H3 != 4) {
                                            aVar = null;
                                            break;
                                        }
                                        A = xVar3.E();
                                    }
                                    j15 += H2 * A;
                                    i18++;
                                    xVar2 = xVar3;
                                    wVar3 = wVar2;
                                } else {
                                    wVar2 = wVar3;
                                    if (length != -1 && length != m11) {
                                        StringBuilder t6 = a8.p0.t(length, "VBRI data size mismatch: ", ", ");
                                        t6.append(m11);
                                        h2.a.l("VbriSeeker", t6.toString());
                                    }
                                    if (m11 != j15) {
                                        StringBuilder t10 = a8.p0.t(m11, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        t10.append(j15);
                                        t10.append("\nSeeking will be inaccurate.");
                                        h2.a.l("VbriSeeker", t10.toString());
                                        m11 = Math.max(m11, j15);
                                    }
                                    aVar = new i(jArr2, jArr3, Y, j14, m11, zVar.e);
                                }
                            }
                        }
                        pVar.m(zVar.b);
                        wVar = wVar2;
                    } else if (i11 != 1483304551) {
                        pVar.l();
                        aVar = null;
                        wVar = wVar3;
                        i12 = 0;
                        j11 = -9223372036854775807L;
                    }
                    q0Var = this.l;
                    long position2 = pVar.getPosition();
                    if (q0Var != null) {
                        p0[] p0VarArr = q0Var.a;
                        int length2 = p0VarArr.length;
                        int i19 = i12;
                        while (true) {
                            if (i19 >= length2) {
                                p0Var = null;
                                break;
                            }
                            p0 p0Var3 = p0VarArr[i19];
                            if (l.class.isAssignableFrom(p0Var3.getClass())) {
                                p0Var = (p0) l.class.cast(p0Var3);
                            }
                            p0Var = null;
                            if (p0Var != null) {
                                break;
                            }
                            i19++;
                        }
                        l lVar = (l) p0Var;
                        if (lVar != null) {
                            int[] iArr = lVar.e;
                            p0[] p0VarArr2 = q0Var.a;
                            int length3 = p0VarArr2.length;
                            int i20 = i12;
                            while (true) {
                                if (i20 >= length3) {
                                    p0Var2 = null;
                                    break;
                                }
                                p0 p0Var4 = p0VarArr2[i20];
                                if (t3.n.class.isAssignableFrom(p0Var4.getClass())) {
                                    p0Var2 = (p0) t3.n.class.cast(p0Var4);
                                }
                                p0Var2 = null;
                                if (p0Var2 != null) {
                                    break;
                                }
                                i20++;
                            }
                            t3.n nVar = (t3.n) p0Var2;
                            if (nVar == null) {
                                S = j11;
                                i15 = i12;
                            } else {
                                i15 = i12;
                                S = l0.S(Long.parseLong((String) nVar.c.get(i15)));
                            }
                            int length4 = iArr.length;
                            int i21 = length4 + 1;
                            long[] jArr4 = new long[i21];
                            long[] jArr5 = new long[i21];
                            jArr4[i15] = position2;
                            jArr5[i15] = 0;
                            long j16 = 0;
                            int i22 = 1;
                            while (i22 <= length4) {
                                int i23 = length4;
                                int i24 = i22 - 1;
                                long j17 = position2 + lVar.c + iArr[i24];
                                j16 += lVar.d + lVar.f[i24];
                                jArr4[i22] = j17;
                                jArr5[i22] = j16;
                                i22++;
                                length4 = i23;
                                position2 = j17;
                            }
                            cVar = new c(S, jArr4, jArr5);
                            if (this.t) {
                                if (cVar != null) {
                                    aVar = cVar;
                                } else if (aVar == null) {
                                    aVar = null;
                                }
                                if (aVar == null) {
                                    aVar = g(pVar, false);
                                }
                                hVar = aVar;
                                boolean d = hVar.d();
                                int i25 = this.a;
                                if (!d && !(hVar instanceof a) && (i25 & 1) != 0 && hVar.h() != -9223372036854775807L && (hVar.a() != -1 || pVar.getLength() != -1)) {
                                    long c10 = hVar.c() != -1 ? hVar.c() : 0L;
                                    long a10 = hVar.a() != -1 ? hVar.a() : pVar.getLength();
                                    hVar = new a(a10, c10, g1.e(l0.a0(a10 - c10, 8000000L, hVar.h(), RoundingMode.HALF_UP)), -1, false, true);
                                } else if (!hVar.d() && !(hVar instanceof a) && (i25 & 1) != 0) {
                                    hVar = g(pVar, false);
                                }
                                this.i.d(hVar.h());
                            } else {
                                hVar = new g(j11);
                            }
                            this.s = hVar;
                            this.h.f(hVar);
                            q0Var2 = this.l;
                            if (q0Var2 == null) {
                                q0 q0Var3 = this.m;
                                if (q0Var3 != null) {
                                    q0Var2 = q0Var2.b(q0Var3);
                                }
                            } else {
                                q0Var2 = this.m;
                            }
                            t tVar = new t();
                            tVar.q = s0.n("audio/mpeg");
                            tVar.r = s0.n((String) zVar.g);
                            tVar.s = TLObject.FLAG_12;
                            tVar.J = zVar.d;
                            tVar.K = zVar.c;
                            tVar.M = wVar.a;
                            tVar.N = wVar.b;
                            tVar.k = q0Var2;
                            if (this.s.g() != -2147483647) {
                                tVar.h = this.s.g();
                            }
                            this.j.g(new u(tVar));
                            this.p = pVar.getPosition();
                        }
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    q0Var2 = this.l;
                    if (q0Var2 == null) {
                    }
                    t tVar2 = new t();
                    tVar2.q = s0.n("audio/mpeg");
                    tVar2.r = s0.n((String) zVar.g);
                    tVar2.s = TLObject.FLAG_12;
                    tVar2.J = zVar.d;
                    tVar2.K = zVar.c;
                    tVar2.M = wVar.a;
                    tVar2.N = wVar.b;
                    tVar2.k = q0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new u(tVar2));
                    this.p = pVar.getPosition();
                }
                i12 = 0;
                j11 = -9223372036854775807L;
                m10 = xVar2.m();
                int E = (m10 & 1) != 0 ? xVar2.E() : -1;
                long C = (m10 & 2) != 0 ? xVar2.C() : -1L;
                if ((m10 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    for (int i26 = 0; i26 < 100; i26++) {
                        jArr6[i26] = xVar2.A();
                    }
                    jArr = jArr6;
                } else {
                    jArr = null;
                }
                if ((m10 & 8) != 0) {
                    xVar = xVar2;
                    xVar.O(4);
                } else {
                    xVar = xVar2;
                }
                if (xVar.a() >= 24) {
                    xVar.O(11);
                    float intBitsToFloat = Float.intBitsToFloat(xVar.m());
                    int H4 = xVar.H();
                    int H5 = xVar.H();
                    e a11 = e.a(H4);
                    e a12 = e.a(H5);
                    fVar = (intBitsToFloat <= 0.0f && a11 == null && a12 == null) ? null : new f(intBitsToFloat, a11, a12);
                    xVar.O(2);
                    int D = xVar.D();
                    i14 = (16773120 & D) >> 12;
                    i13 = D & 4095;
                } else {
                    fVar = null;
                    i13 = -1;
                    i14 = -1;
                }
                long j18 = E;
                int i27 = zVar.b;
                int i28 = zVar.c;
                int i29 = zVar.e;
                int i30 = zVar.f;
                wVar = wVar3;
                f fVar2 = fVar;
                if ((wVar.a != -1 || wVar.b == -1) && i14 != -1 && i13 != -1) {
                    wVar.a = i14;
                    wVar.b = i13;
                }
                this.m = fVar2 != null ? new q0(fVar2) : null;
                long position3 = pVar.getPosition();
                pVar.m(zVar.b);
                if (i11 == 1483304551) {
                    long length5 = pVar.getLength();
                    if (j18 == -1 || j18 == 0) {
                        j12 = length5;
                        j13 = -9223372036854775807L;
                    } else {
                        j12 = length5;
                        j13 = l0.Y(i28, (j18 * i30) - 1);
                    }
                    if (j13 != -9223372036854775807L) {
                        if (C != -1 && j12 != -1 && position3 + C != j12) {
                            long j19 = j12 - position3;
                            StringBuilder t11 = a8.p0.t(j19, "Data size mismatch between stream (", ") and Xing frame (");
                            t11.append(C);
                            t11.append("), using smaller value.");
                            h2.a.g("XingSeeker", t11.toString());
                            C = Math.min(C, j19);
                        }
                        aVar = new j(position3, i27, j13, i29, C, jArr);
                        q0Var = this.l;
                        long position22 = pVar.getPosition();
                        if (q0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.f(hVar);
                        q0Var2 = this.l;
                        if (q0Var2 == null) {
                        }
                        t tVar22 = new t();
                        tVar22.q = s0.n("audio/mpeg");
                        tVar22.r = s0.n((String) zVar.g);
                        tVar22.s = TLObject.FLAG_12;
                        tVar22.J = zVar.d;
                        tVar22.K = zVar.c;
                        tVar22.M = wVar.a;
                        tVar22.N = wVar.b;
                        tVar22.k = q0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.g(new u(tVar22));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    q0Var = this.l;
                    long position222 = pVar.getPosition();
                    if (q0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    q0Var2 = this.l;
                    if (q0Var2 == null) {
                    }
                    t tVar222 = new t();
                    tVar222.q = s0.n("audio/mpeg");
                    tVar222.r = s0.n((String) zVar.g);
                    tVar222.s = TLObject.FLAG_12;
                    tVar222.J = zVar.d;
                    tVar222.K = zVar.c;
                    tVar222.M = wVar.a;
                    tVar222.N = wVar.b;
                    tVar222.k = q0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new u(tVar222));
                    this.p = pVar.getPosition();
                } else {
                    long length6 = pVar.getLength();
                    long Y2 = (j18 == -1 || j18 == 0) ? -9223372036854775807L : l0.Y(i28, (i30 * j18) - 1);
                    if (Y2 != -9223372036854775807L) {
                        if (C != -1) {
                            length6 = position3 + C;
                        } else if (length6 != -1) {
                            C = length6 - position3;
                        }
                        long j20 = C - i27;
                        long j21 = length6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        aVar = new a(j21, position3 + i27, g1.b(l0.a0(j20, 8000000L, Y2, roundingMode)), g1.b(t0.b(j20, j18, roundingMode)), false, true);
                        q0Var = this.l;
                        long position2222 = pVar.getPosition();
                        if (q0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.f(hVar);
                        q0Var2 = this.l;
                        if (q0Var2 == null) {
                        }
                        t tVar2222 = new t();
                        tVar2222.q = s0.n("audio/mpeg");
                        tVar2222.r = s0.n((String) zVar.g);
                        tVar2222.s = TLObject.FLAG_12;
                        tVar2222.J = zVar.d;
                        tVar2222.K = zVar.c;
                        tVar2222.M = wVar.a;
                        tVar2222.N = wVar.b;
                        tVar2222.k = q0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.g(new u(tVar2222));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    q0Var = this.l;
                    long position22222 = pVar.getPosition();
                    if (q0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    q0Var2 = this.l;
                    if (q0Var2 == null) {
                    }
                    t tVar22222 = new t();
                    tVar22222.q = s0.n("audio/mpeg");
                    tVar22222.r = s0.n((String) zVar.g);
                    tVar22222.s = TLObject.FLAG_12;
                    tVar22222.J = zVar.d;
                    tVar22222.K = zVar.c;
                    tVar22222.M = wVar.a;
                    tVar22222.N = wVar.b;
                    tVar22222.k = q0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new u(tVar22222));
                    this.p = pVar.getPosition();
                }
            }
            if (xVar2.c >= 40) {
                xVar2.N(36);
                if (xVar2.m() == 1447187017) {
                    i11 = 1447187017;
                    w wVar32 = this.e;
                    if (i11 != 1231971951) {
                    }
                    i12 = 0;
                    j11 = -9223372036854775807L;
                    m10 = xVar2.m();
                    if ((m10 & 1) != 0) {
                    }
                    if ((m10 & 2) != 0) {
                    }
                    if ((m10 & 4) == 4) {
                    }
                    if ((m10 & 8) != 0) {
                    }
                    if (xVar.a() >= 24) {
                    }
                    long j182 = E;
                    int i272 = zVar.b;
                    int i282 = zVar.c;
                    int i292 = zVar.e;
                    int i302 = zVar.f;
                    wVar = wVar32;
                    f fVar22 = fVar;
                    if (wVar.a != -1) {
                    }
                    wVar.a = i14;
                    wVar.b = i13;
                    this.m = fVar22 != null ? new q0(fVar22) : null;
                    long position32 = pVar.getPosition();
                    pVar.m(zVar.b);
                    if (i11 == 1483304551) {
                    }
                }
            }
            i11 = 0;
            w wVar322 = this.e;
            if (i11 != 1231971951) {
            }
            i12 = 0;
            j11 = -9223372036854775807L;
            m10 = xVar2.m();
            if ((m10 & 1) != 0) {
            }
            if ((m10 & 2) != 0) {
            }
            if ((m10 & 4) == 4) {
            }
            if ((m10 & 8) != 0) {
            }
            if (xVar.a() >= 24) {
            }
            long j1822 = E;
            int i2722 = zVar.b;
            int i2822 = zVar.c;
            int i2922 = zVar.e;
            int i3022 = zVar.f;
            wVar = wVar322;
            f fVar222 = fVar;
            if (wVar.a != -1) {
            }
            wVar.a = i14;
            wVar.b = i13;
            this.m = fVar222 != null ? new q0(fVar222) : null;
            long position322 = pVar.getPosition();
            pVar.m(zVar.b);
            if (i11 == 1483304551) {
            }
        } else {
            th2 = null;
            j3 = 1000000;
            j10 = 0;
            if (this.p != 0) {
                long position4 = pVar.getPosition();
                long j22 = this.p;
                if (position4 < j22) {
                    pVar.m((int) (j22 - position4));
                }
            }
        }
        if (this.r == 0) {
            pVar.l();
            if (!i(pVar)) {
                x xVar4 = this.c;
                xVar4.N(0);
                int m13 = xVar4.m();
                if (((-128000) & m13) != (this.k & (-128000)) || f3.b.h(m13) == -1) {
                    pVar.m(1);
                    this.k = 0;
                    i7 = 0;
                    i10 = -1;
                    if (i7 == i10) {
                        h hVar2 = this.s;
                        if (hVar2 instanceof b) {
                            if (hVar2.h() != ((this.o * j3) / zVar.c) + this.n) {
                                ((b) this.s).getClass();
                                throw th2;
                            }
                        }
                    }
                    return i7;
                }
                zVar.a(m13);
                if (this.n == -9223372036854775807L) {
                    this.n = this.s.b(pVar.getPosition());
                    long j23 = this.b;
                    if (j23 != -9223372036854775807L) {
                        this.n = (j23 - this.s.b(j10)) + this.n;
                    }
                }
                this.r = zVar.b;
                this.q = pVar.getPosition() + zVar.b;
                if (this.s instanceof b) {
                    long j24 = ((this.o + zVar.f) * j3) / zVar.c;
                    throw th2;
                }
            }
            i7 = -1;
            i10 = -1;
            if (i7 == i10) {
            }
            return i7;
        }
        int e10 = this.j.e(pVar, this.r, true);
        if (e10 != -1) {
            int i31 = this.r - e10;
            this.r = i31;
            if (i31 <= 0) {
                this.j.c(((this.o * j3) / zVar.c) + this.n, 1, zVar.b, 0, null);
                this.o += zVar.f;
                this.r = 0;
                i7 = 0;
                i10 = -1;
                if (i7 == i10) {
                }
                return i7;
            }
            i7 = 0;
            i10 = -1;
            if (i7 == i10) {
            }
            return i7;
        }
        i7 = -1;
        i10 = -1;
        if (i7 == i10) {
        }
        return i7;
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.c;
        pVar.c(0, 4, xVar.a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.e, zVar.b, z10, true);
    }

    public final void h() {
        Object obj = this.s;
        if ((obj instanceof a) && ((k) obj).d()) {
            long j3 = this.q;
            if (j3 == -1 || j3 == this.s.a()) {
                return;
            }
            a aVar = (a) this.s;
            this.s = new a(this.q, aVar.i, aVar.j, aVar.k, aVar.l, false);
            q qVar = this.h;
            qVar.getClass();
            qVar.f(this.s);
            i0 i0Var = this.i;
            i0Var.getClass();
            i0Var.d(this.s.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.j() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(p pVar) {
        h hVar = this.s;
        if (hVar != null) {
            long a10 = hVar.a();
            if (a10 != -1) {
            }
        }
        try {
            return !pVar.h(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean j(p pVar, boolean z10) {
        int i7;
        int i10;
        int h;
        pVar.l();
        if (pVar.getPosition() == 0) {
            q0 U = this.f.U(pVar, null, 131072);
            this.l = U;
            if (U != null) {
                this.e.b(U);
            }
            i7 = (int) pVar.j();
            if (!z10) {
                pVar.m(i7);
            }
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (!i(pVar)) {
                x xVar = this.c;
                xVar.N(0);
                int m10 = xVar.m();
                if ((i10 == 0 || ((-128000) & m10) == (i10 & (-128000))) && (h = f3.b.h(m10)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m10);
                        i10 = m10;
                    }
                    pVar.k(h - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z10) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.l();
                        pVar.k(i7 + i13);
                    } else {
                        pVar.m(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                }
            } else if (i11 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z10) {
            pVar.m(i7 + i12);
        } else {
            pVar.l();
        }
        this.k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.a = i7;
        this.b = j3;
        this.c = new x(10);
        this.d = new z();
        this.e = new w();
        this.n = -9223372036854775807L;
        this.f = new d6.i();
        n nVar = new n();
        this.g = nVar;
        this.j = nVar;
        this.q = -1L;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
