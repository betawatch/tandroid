package v3;

import b2.s0;
import b2.t0;
import b2.v;
import b2.v0;
import c3.a0;
import c3.c0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.w;
import c3.y;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import q3.l;
import v7.b8;
import v7.n7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final x c;
    public final a0 d;
    public final w e;
    public final y f;
    public final n g;
    public q h;
    public j0 i;
    public j0 j;
    public int k;
    public t0 l;
    public t0 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public h s;
    public boolean t;
    public boolean u;
    public long v;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        return j(pVar, true);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.h = qVar;
        j0 j02 = qVar.j0(0, 1);
        this.i = j02;
        this.j = j02;
        this.h.H();
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j11;
        if (this.s instanceof b) {
            throw null;
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0344, code lost:
    
        if (d9.s.a.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037e, code lost:
    
        if (((q3.n) r10).a.equals("TLEN") != false) goto L170;
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
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        Throwable th2;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        int i13;
        long j12;
        int m10;
        long[] jArr;
        x xVar;
        f fVar;
        int i14;
        int i15;
        w wVar;
        h aVar;
        long j13;
        long j14;
        t0 t0Var;
        s0 s0Var;
        s0 s0Var2;
        int i16;
        long S;
        c cVar;
        h hVar;
        t0 t0Var2;
        w wVar2;
        int A;
        this.i.getClass();
        String str = m0.a;
        int i17 = this.k;
        a0 a0Var = this.d;
        if (i17 == 0) {
            try {
                j(pVar, false);
            } catch (EOFException unused) {
                th2 = null;
                i10 = -1;
                i11 = -1;
                j10 = 1000000;
            }
        }
        if (this.s == null) {
            x xVar2 = new x(a0Var.b);
            pVar.b(0, a0Var.b, xVar2.a);
            int i18 = 21;
            th2 = null;
            if ((a0Var.a & 1) != 0) {
                if (a0Var.d != 1) {
                    i18 = 36;
                }
            } else if (a0Var.d == 1) {
                i18 = 13;
            }
            j10 = 1000000;
            j11 = 0;
            if (xVar2.c >= i18 + 4) {
                xVar2.N(i18);
                i12 = xVar2.m();
                if (i12 != 1483304551) {
                }
                w wVar3 = this.e;
                if (i12 != 1231971951) {
                    if (i12 == 1447187017) {
                        long length = pVar.getLength();
                        long position = pVar.getPosition();
                        j12 = -9223372036854775807L;
                        xVar2.O(6);
                        i13 = 0;
                        long j15 = position + a0Var.b;
                        long m11 = j15 + xVar2.m();
                        int m12 = xVar2.m();
                        if (m12 <= 0) {
                            aVar = null;
                            wVar2 = wVar3;
                        } else {
                            long Y = m0.Y(a0Var.c, (m12 * a0Var.f) - 1);
                            int H = xVar2.H();
                            int H2 = xVar2.H();
                            int H3 = xVar2.H();
                            xVar2.O(2);
                            long j16 = position + a0Var.b;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i19 = 0;
                            while (true) {
                                if (i19 < H) {
                                    x xVar3 = xVar2;
                                    wVar2 = wVar3;
                                    jArr2[i19] = (i19 * Y) / H;
                                    jArr3[i19] = j16;
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
                                    j16 += H2 * A;
                                    i19++;
                                    xVar2 = xVar3;
                                    wVar3 = wVar2;
                                } else {
                                    wVar2 = wVar3;
                                    if (length != -1 && length != m11) {
                                        StringBuilder t10 = a1.g.t(length, "VBRI data size mismatch: ", ", ");
                                        t10.append(m11);
                                        e2.a.l("VbriSeeker", t10.toString());
                                    }
                                    if (m11 != j16) {
                                        StringBuilder t11 = a1.g.t(m11, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        t11.append(j16);
                                        t11.append("\nSeeking will be inaccurate.");
                                        e2.a.l("VbriSeeker", t11.toString());
                                        m11 = Math.max(m11, j16);
                                    }
                                    aVar = new i(jArr2, jArr3, Y, j15, m11, a0Var.e);
                                }
                            }
                        }
                        pVar.r(a0Var.b);
                        wVar = wVar2;
                    } else if (i12 != 1483304551) {
                        pVar.q();
                        aVar = null;
                        wVar = wVar3;
                        i13 = 0;
                        j12 = -9223372036854775807L;
                    }
                    t0Var = this.l;
                    long position2 = pVar.getPosition();
                    if (t0Var != null) {
                        s0[] s0VarArr = t0Var.a;
                        int length2 = s0VarArr.length;
                        int i20 = i13;
                        while (true) {
                            if (i20 >= length2) {
                                s0Var = null;
                                break;
                            }
                            s0 s0Var3 = s0VarArr[i20];
                            if (l.class.isAssignableFrom(s0Var3.getClass())) {
                                s0Var = (s0) l.class.cast(s0Var3);
                            }
                            s0Var = null;
                            if (s0Var != null) {
                                break;
                            }
                            i20++;
                        }
                        l lVar = (l) s0Var;
                        if (lVar != null) {
                            int[] iArr = lVar.e;
                            s0[] s0VarArr2 = t0Var.a;
                            int length3 = s0VarArr2.length;
                            int i21 = i13;
                            while (true) {
                                if (i21 >= length3) {
                                    s0Var2 = null;
                                    break;
                                }
                                s0 s0Var4 = s0VarArr2[i21];
                                if (q3.n.class.isAssignableFrom(s0Var4.getClass())) {
                                    s0Var2 = (s0) q3.n.class.cast(s0Var4);
                                }
                                s0Var2 = null;
                                if (s0Var2 != null) {
                                    break;
                                }
                                i21++;
                            }
                            q3.n nVar = (q3.n) s0Var2;
                            if (nVar == null) {
                                S = j12;
                                i16 = i13;
                            } else {
                                i16 = i13;
                                S = m0.S(Long.parseLong((String) nVar.c.get(i16)));
                            }
                            int length4 = iArr.length;
                            int i22 = length4 + 1;
                            long[] jArr4 = new long[i22];
                            long[] jArr5 = new long[i22];
                            jArr4[i16] = position2;
                            jArr5[i16] = 0;
                            long j17 = 0;
                            int i23 = 1;
                            while (i23 <= length4) {
                                int i24 = length4;
                                int i25 = i23 - 1;
                                long j18 = position2 + lVar.c + iArr[i25];
                                j17 += lVar.d + lVar.f[i25];
                                jArr4[i23] = j18;
                                jArr5[i23] = j17;
                                i23++;
                                length4 = i24;
                                position2 = j18;
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
                                int i26 = this.a;
                                if (!d && !(hVar instanceof a) && (i26 & 1) != 0 && hVar.h() != -9223372036854775807L && (hVar.b() != -1 || pVar.getLength() != -1)) {
                                    long c10 = hVar.c() != -1 ? hVar.c() : 0L;
                                    long b10 = hVar.b() != -1 ? hVar.b() : pVar.getLength();
                                    hVar = new a(b10, c10, b8.e(m0.a0(b10 - c10, 8000000L, hVar.h(), RoundingMode.HALF_UP)), -1, false, true);
                                } else if (!hVar.d() && !(hVar instanceof a) && (i26 & 1) != 0) {
                                    hVar = g(pVar, false);
                                }
                                this.i.e(hVar.h());
                            } else {
                                hVar = new g(j12);
                            }
                            this.s = hVar;
                            this.h.g0(hVar);
                            t0Var2 = this.l;
                            if (t0Var2 == null) {
                                t0 t0Var3 = this.m;
                                if (t0Var3 != null) {
                                    t0Var2 = t0Var2.b(t0Var3);
                                }
                            } else {
                                t0Var2 = this.m;
                            }
                            v vVar = new v();
                            vVar.q = v0.n("audio/mpeg");
                            vVar.r = v0.n((String) a0Var.g);
                            vVar.s = 4096;
                            vVar.J = a0Var.d;
                            vVar.K = a0Var.c;
                            vVar.M = wVar.a;
                            vVar.N = wVar.b;
                            vVar.k = t0Var2;
                            if (this.s.g() != -2147483647) {
                                vVar.h = this.s.g();
                            }
                            this.j.b(new b2.w(vVar));
                            this.p = pVar.getPosition();
                        }
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.g0(hVar);
                    t0Var2 = this.l;
                    if (t0Var2 == null) {
                    }
                    v vVar2 = new v();
                    vVar2.q = v0.n("audio/mpeg");
                    vVar2.r = v0.n((String) a0Var.g);
                    vVar2.s = 4096;
                    vVar2.J = a0Var.d;
                    vVar2.K = a0Var.c;
                    vVar2.M = wVar.a;
                    vVar2.N = wVar.b;
                    vVar2.k = t0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.w(vVar2));
                    this.p = pVar.getPosition();
                }
                i13 = 0;
                j12 = -9223372036854775807L;
                m10 = xVar2.m();
                int E = (m10 & 1) != 0 ? xVar2.E() : -1;
                long C = (m10 & 2) != 0 ? xVar2.C() : -1L;
                if ((m10 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    for (int i27 = 0; i27 < 100; i27++) {
                        jArr6[i27] = xVar2.A();
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
                    e a2 = e.a(H4);
                    e a10 = e.a(H5);
                    fVar = (intBitsToFloat <= 0.0f && a2 == null && a10 == null) ? null : new f(intBitsToFloat, a2, a10);
                    xVar.O(2);
                    int D = xVar.D();
                    i15 = (16773120 & D) >> 12;
                    i14 = D & 4095;
                } else {
                    fVar = null;
                    i14 = -1;
                    i15 = -1;
                }
                long j19 = E;
                int i28 = a0Var.b;
                int i29 = a0Var.c;
                int i30 = a0Var.e;
                int i31 = a0Var.f;
                wVar = wVar3;
                f fVar2 = fVar;
                if ((wVar.a != -1 || wVar.b == -1) && i15 != -1 && i14 != -1) {
                    wVar.a = i15;
                    wVar.b = i14;
                }
                this.m = fVar2 != null ? new t0(fVar2) : null;
                long position3 = pVar.getPosition();
                pVar.r(a0Var.b);
                if (i12 == 1483304551) {
                    long length5 = pVar.getLength();
                    if (j19 == -1 || j19 == 0) {
                        j13 = length5;
                        j14 = -9223372036854775807L;
                    } else {
                        j13 = length5;
                        j14 = m0.Y(i29, (j19 * i31) - 1);
                    }
                    if (j14 != -9223372036854775807L) {
                        if (C != -1 && j13 != -1 && position3 + C != j13) {
                            long j20 = j13 - position3;
                            StringBuilder t12 = a1.g.t(j20, "Data size mismatch between stream (", ") and Xing frame (");
                            t12.append(C);
                            t12.append("), using smaller value.");
                            e2.a.g("XingSeeker", t12.toString());
                            C = Math.min(C, j20);
                        }
                        aVar = new j(position3, i28, j14, i30, C, jArr);
                        t0Var = this.l;
                        long position22 = pVar.getPosition();
                        if (t0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.g0(hVar);
                        t0Var2 = this.l;
                        if (t0Var2 == null) {
                        }
                        v vVar22 = new v();
                        vVar22.q = v0.n("audio/mpeg");
                        vVar22.r = v0.n((String) a0Var.g);
                        vVar22.s = 4096;
                        vVar22.J = a0Var.d;
                        vVar22.K = a0Var.c;
                        vVar22.M = wVar.a;
                        vVar22.N = wVar.b;
                        vVar22.k = t0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.b(new b2.w(vVar22));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    t0Var = this.l;
                    long position222 = pVar.getPosition();
                    if (t0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.g0(hVar);
                    t0Var2 = this.l;
                    if (t0Var2 == null) {
                    }
                    v vVar222 = new v();
                    vVar222.q = v0.n("audio/mpeg");
                    vVar222.r = v0.n((String) a0Var.g);
                    vVar222.s = 4096;
                    vVar222.J = a0Var.d;
                    vVar222.K = a0Var.c;
                    vVar222.M = wVar.a;
                    vVar222.N = wVar.b;
                    vVar222.k = t0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.w(vVar222));
                    this.p = pVar.getPosition();
                } else {
                    long length6 = pVar.getLength();
                    long Y2 = (j19 == -1 || j19 == 0) ? -9223372036854775807L : m0.Y(i29, (i31 * j19) - 1);
                    if (Y2 != -9223372036854775807L) {
                        if (C != -1) {
                            length6 = position3 + C;
                        } else if (length6 != -1) {
                            C = length6 - position3;
                        }
                        long j21 = C - i28;
                        long j22 = length6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        aVar = new a(j22, position3 + i28, b8.b(m0.a0(j21, 8000000L, Y2, roundingMode)), b8.b(n7.b(j21, j19, roundingMode)), false, true);
                        t0Var = this.l;
                        long position2222 = pVar.getPosition();
                        if (t0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.g0(hVar);
                        t0Var2 = this.l;
                        if (t0Var2 == null) {
                        }
                        v vVar2222 = new v();
                        vVar2222.q = v0.n("audio/mpeg");
                        vVar2222.r = v0.n((String) a0Var.g);
                        vVar2222.s = 4096;
                        vVar2222.J = a0Var.d;
                        vVar2222.K = a0Var.c;
                        vVar2222.M = wVar.a;
                        vVar2222.N = wVar.b;
                        vVar2222.k = t0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.b(new b2.w(vVar2222));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    t0Var = this.l;
                    long position22222 = pVar.getPosition();
                    if (t0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.g0(hVar);
                    t0Var2 = this.l;
                    if (t0Var2 == null) {
                    }
                    v vVar22222 = new v();
                    vVar22222.q = v0.n("audio/mpeg");
                    vVar22222.r = v0.n((String) a0Var.g);
                    vVar22222.s = 4096;
                    vVar22222.J = a0Var.d;
                    vVar22222.K = a0Var.c;
                    vVar22222.M = wVar.a;
                    vVar22222.N = wVar.b;
                    vVar22222.k = t0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.w(vVar22222));
                    this.p = pVar.getPosition();
                }
            }
            if (xVar2.c >= 40) {
                xVar2.N(36);
                if (xVar2.m() == 1447187017) {
                    i12 = 1447187017;
                    w wVar32 = this.e;
                    if (i12 != 1231971951) {
                    }
                    i13 = 0;
                    j12 = -9223372036854775807L;
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
                    long j192 = E;
                    int i282 = a0Var.b;
                    int i292 = a0Var.c;
                    int i302 = a0Var.e;
                    int i312 = a0Var.f;
                    wVar = wVar32;
                    f fVar22 = fVar;
                    if (wVar.a != -1) {
                    }
                    wVar.a = i15;
                    wVar.b = i14;
                    this.m = fVar22 != null ? new t0(fVar22) : null;
                    long position32 = pVar.getPosition();
                    pVar.r(a0Var.b);
                    if (i12 == 1483304551) {
                    }
                }
            }
            i12 = 0;
            w wVar322 = this.e;
            if (i12 != 1231971951) {
            }
            i13 = 0;
            j12 = -9223372036854775807L;
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
            long j1922 = E;
            int i2822 = a0Var.b;
            int i2922 = a0Var.c;
            int i3022 = a0Var.e;
            int i3122 = a0Var.f;
            wVar = wVar322;
            f fVar222 = fVar;
            if (wVar.a != -1) {
            }
            wVar.a = i15;
            wVar.b = i14;
            this.m = fVar222 != null ? new t0(fVar222) : null;
            long position322 = pVar.getPosition();
            pVar.r(a0Var.b);
            if (i12 == 1483304551) {
            }
        } else {
            th2 = null;
            j10 = 1000000;
            j11 = 0;
            if (this.p != 0) {
                long position4 = pVar.getPosition();
                long j23 = this.p;
                if (position4 < j23) {
                    pVar.r((int) (j23 - position4));
                }
            }
        }
        if (this.r == 0) {
            pVar.q();
            if (!i(pVar)) {
                x xVar4 = this.c;
                xVar4.N(0);
                int m13 = xVar4.m();
                if (((-128000) & m13) != (this.k & (-128000)) || c3.b.h(m13) == -1) {
                    pVar.r(1);
                    this.k = 0;
                    i10 = 0;
                    i11 = -1;
                    if (i10 == i11) {
                        h hVar2 = this.s;
                        if (hVar2 instanceof b) {
                            if (hVar2.h() != ((this.o * j10) / a0Var.c) + this.n) {
                                ((b) this.s).getClass();
                                throw th2;
                            }
                        }
                    }
                    return i10;
                }
                a0Var.a(m13);
                if (this.n == -9223372036854775807L) {
                    this.n = this.s.a(pVar.getPosition());
                    long j24 = this.b;
                    if (j24 != -9223372036854775807L) {
                        this.n = (j24 - this.s.a(j11)) + this.n;
                    }
                }
                this.r = a0Var.b;
                this.q = pVar.getPosition() + a0Var.b;
                if (this.s instanceof b) {
                    long j25 = ((this.o + a0Var.f) * j10) / a0Var.c;
                    throw th2;
                }
            }
            i10 = -1;
            i11 = -1;
            if (i10 == i11) {
            }
            return i10;
        }
        int a11 = this.j.a(pVar, this.r, true);
        if (a11 != -1) {
            int i32 = this.r - a11;
            this.r = i32;
            if (i32 <= 0) {
                this.j.c(((this.o * j10) / a0Var.c) + this.n, 1, a0Var.b, 0, null);
                this.o += a0Var.f;
                this.r = 0;
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

    public final a g(p pVar, boolean z10) {
        x xVar = this.c;
        pVar.b(0, 4, xVar.a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.e, a0Var.b, z10, true);
    }

    public final void h() {
        c0 c0Var = this.s;
        if ((c0Var instanceof a) && ((k) c0Var).d()) {
            long j10 = this.q;
            if (j10 == -1 || j10 == this.s.b()) {
                return;
            }
            a aVar = (a) this.s;
            this.s = new a(this.q, aVar.i, aVar.j, aVar.k, aVar.l, false);
            q qVar = this.h;
            qVar.getClass();
            qVar.g0(this.s);
            j0 j0Var = this.i;
            j0Var.getClass();
            j0Var.e(this.s.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.k() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(p pVar) {
        h hVar = this.s;
        if (hVar != null) {
            long b10 = hVar.b();
            if (b10 != -1) {
            }
        }
        try {
            return !pVar.j(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean j(p pVar, boolean z10) {
        int i10;
        int i11;
        int h;
        pVar.q();
        if (pVar.getPosition() == 0) {
            t0 b10 = this.f.b(pVar, null, 131072);
            this.l = b10;
            if (b10 != null) {
                this.e.b(b10);
            }
            i10 = (int) pVar.k();
            if (!z10) {
                pVar.r(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (!i(pVar)) {
                x xVar = this.c;
                xVar.N(0);
                int m10 = xVar.m();
                if ((i11 == 0 || ((-128000) & m10) == (i11 & (-128000))) && (h = c3.b.h(m10)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m10);
                        i11 = m10;
                    }
                    pVar.l(h - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == 131072) {
                        if (z10) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.q();
                        pVar.l(i10 + i14);
                    } else {
                        pVar.r(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i11 = 0;
                }
            } else if (i12 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z10) {
            pVar.r(i10 + i13);
        } else {
            pVar.q();
        }
        this.k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        this.c = new x(10);
        this.d = new a0();
        this.e = new w();
        this.n = -9223372036854775807L;
        this.f = new y(0);
        n nVar = new n();
        this.g = nVar;
        this.j = nVar;
        this.q = -1L;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
