package v3;

import b2.t0;
import b2.u0;
import b2.v0;
import c3.b0;
import c3.k;
import c3.k0;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.w;
import c3.z;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.tgnet.TLObject;
import q3.m;
import v7.c8;
import v7.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final x c;
    public final z d;
    public final w e;
    public final a6.i f;
    public final n g;
    public q h;
    public k0 i;
    public k0 j;
    public int k;
    public u0 l;
    public u0 m;
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
        k0 I1 = qVar.I1(0, 1);
        this.i = I1;
        this.j = I1;
        this.h.Q0();
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
    
        if (d9.r.a.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037e, code lost:
    
        if (((q3.o) r10).a.equals("TLEN") != false) goto L170;
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
        u0 u0Var;
        t0 t0Var;
        t0 t0Var2;
        int i16;
        long S;
        c cVar;
        h hVar;
        u0 u0Var2;
        w wVar2;
        int A;
        this.i.getClass();
        String str = e2.l0.a;
        int i17 = this.k;
        z zVar = this.d;
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
            x xVar2 = new x(zVar.b);
            pVar.b(0, zVar.b, xVar2.a);
            int i18 = 21;
            th2 = null;
            if ((zVar.a & 1) != 0) {
                if (zVar.d != 1) {
                    i18 = 36;
                }
            } else if (zVar.d == 1) {
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
                        long j15 = position + zVar.b;
                        long m11 = j15 + xVar2.m();
                        int m12 = xVar2.m();
                        if (m12 <= 0) {
                            aVar = null;
                            wVar2 = wVar3;
                        } else {
                            long Y = e2.l0.Y(zVar.c, (m12 * zVar.f) - 1);
                            int H = xVar2.H();
                            int H2 = xVar2.H();
                            int H3 = xVar2.H();
                            xVar2.O(2);
                            long j16 = position + zVar.b;
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
                                        StringBuilder s10 = a1.g.s(length, "VBRI data size mismatch: ", ", ");
                                        s10.append(m11);
                                        e2.a.l("VbriSeeker", s10.toString());
                                    }
                                    if (m11 != j16) {
                                        StringBuilder s11 = a1.g.s(m11, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        s11.append(j16);
                                        s11.append("\nSeeking will be inaccurate.");
                                        e2.a.l("VbriSeeker", s11.toString());
                                        m11 = Math.max(m11, j16);
                                    }
                                    aVar = new i(jArr2, jArr3, Y, j15, m11, zVar.e);
                                }
                            }
                        }
                        pVar.q(zVar.b);
                        wVar = wVar2;
                    } else if (i12 != 1483304551) {
                        pVar.m();
                        aVar = null;
                        wVar = wVar3;
                        i13 = 0;
                        j12 = -9223372036854775807L;
                    }
                    u0Var = this.l;
                    long position2 = pVar.getPosition();
                    if (u0Var != null) {
                        t0[] t0VarArr = u0Var.a;
                        int length2 = t0VarArr.length;
                        int i20 = i13;
                        while (true) {
                            if (i20 >= length2) {
                                t0Var = null;
                                break;
                            }
                            t0 t0Var3 = t0VarArr[i20];
                            if (m.class.isAssignableFrom(t0Var3.getClass())) {
                                t0Var = (t0) m.class.cast(t0Var3);
                            }
                            t0Var = null;
                            if (t0Var != null) {
                                break;
                            }
                            i20++;
                        }
                        m mVar = (m) t0Var;
                        if (mVar != null) {
                            int[] iArr = mVar.e;
                            t0[] t0VarArr2 = u0Var.a;
                            int length3 = t0VarArr2.length;
                            int i21 = i13;
                            while (true) {
                                if (i21 >= length3) {
                                    t0Var2 = null;
                                    break;
                                }
                                t0 t0Var4 = t0VarArr2[i21];
                                if (q3.o.class.isAssignableFrom(t0Var4.getClass())) {
                                    t0Var2 = (t0) q3.o.class.cast(t0Var4);
                                }
                                t0Var2 = null;
                                if (t0Var2 != null) {
                                    break;
                                }
                                i21++;
                            }
                            q3.o oVar = (q3.o) t0Var2;
                            if (oVar == null) {
                                S = j12;
                                i16 = i13;
                            } else {
                                i16 = i13;
                                S = e2.l0.S(Long.parseLong((String) oVar.c.get(i16)));
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
                                long j18 = position2 + mVar.c + iArr[i25];
                                j17 += mVar.d + mVar.f[i25];
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
                                    hVar = new a(b10, c10, c8.e(e2.l0.a0(b10 - c10, 8000000L, hVar.h(), RoundingMode.HALF_UP)), -1, false, true);
                                } else if (!hVar.d() && !(hVar instanceof a) && (i26 & 1) != 0) {
                                    hVar = g(pVar, false);
                                }
                                this.i.e(hVar.h());
                            } else {
                                hVar = new g(j12);
                            }
                            this.s = hVar;
                            this.h.G1(hVar);
                            u0Var2 = this.l;
                            if (u0Var2 == null) {
                                u0 u0Var3 = this.m;
                                if (u0Var3 != null) {
                                    u0Var2 = u0Var2.b(u0Var3);
                                }
                            } else {
                                u0Var2 = this.m;
                            }
                            b2.w wVar4 = new b2.w();
                            wVar4.q = v0.n("audio/mpeg");
                            wVar4.r = v0.n((String) zVar.g);
                            wVar4.s = TLObject.FLAG_12;
                            wVar4.J = zVar.d;
                            wVar4.K = zVar.c;
                            wVar4.M = wVar.a;
                            wVar4.N = wVar.b;
                            wVar4.k = u0Var2;
                            if (this.s.g() != -2147483647) {
                                wVar4.h = this.s.g();
                            }
                            this.j.b(new b2.x(wVar4));
                            this.p = pVar.getPosition();
                        }
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.G1(hVar);
                    u0Var2 = this.l;
                    if (u0Var2 == null) {
                    }
                    b2.w wVar42 = new b2.w();
                    wVar42.q = v0.n("audio/mpeg");
                    wVar42.r = v0.n((String) zVar.g);
                    wVar42.s = TLObject.FLAG_12;
                    wVar42.J = zVar.d;
                    wVar42.K = zVar.c;
                    wVar42.M = wVar.a;
                    wVar42.N = wVar.b;
                    wVar42.k = u0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.x(wVar42));
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
                int i28 = zVar.b;
                int i29 = zVar.c;
                int i30 = zVar.e;
                int i31 = zVar.f;
                wVar = wVar3;
                f fVar2 = fVar;
                if ((wVar.a != -1 || wVar.b == -1) && i15 != -1 && i14 != -1) {
                    wVar.a = i15;
                    wVar.b = i14;
                }
                this.m = fVar2 != null ? new u0(fVar2) : null;
                long position3 = pVar.getPosition();
                pVar.q(zVar.b);
                if (i12 == 1483304551) {
                    long length5 = pVar.getLength();
                    if (j19 == -1 || j19 == 0) {
                        j13 = length5;
                        j14 = -9223372036854775807L;
                    } else {
                        j13 = length5;
                        j14 = e2.l0.Y(i29, (j19 * i31) - 1);
                    }
                    if (j14 != -9223372036854775807L) {
                        if (C != -1 && j13 != -1 && position3 + C != j13) {
                            long j20 = j13 - position3;
                            StringBuilder s12 = a1.g.s(j20, "Data size mismatch between stream (", ") and Xing frame (");
                            s12.append(C);
                            s12.append("), using smaller value.");
                            e2.a.g("XingSeeker", s12.toString());
                            C = Math.min(C, j20);
                        }
                        aVar = new j(position3, i28, j14, i30, C, jArr);
                        u0Var = this.l;
                        long position22 = pVar.getPosition();
                        if (u0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.G1(hVar);
                        u0Var2 = this.l;
                        if (u0Var2 == null) {
                        }
                        b2.w wVar422 = new b2.w();
                        wVar422.q = v0.n("audio/mpeg");
                        wVar422.r = v0.n((String) zVar.g);
                        wVar422.s = TLObject.FLAG_12;
                        wVar422.J = zVar.d;
                        wVar422.K = zVar.c;
                        wVar422.M = wVar.a;
                        wVar422.N = wVar.b;
                        wVar422.k = u0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.b(new b2.x(wVar422));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    u0Var = this.l;
                    long position222 = pVar.getPosition();
                    if (u0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.G1(hVar);
                    u0Var2 = this.l;
                    if (u0Var2 == null) {
                    }
                    b2.w wVar4222 = new b2.w();
                    wVar4222.q = v0.n("audio/mpeg");
                    wVar4222.r = v0.n((String) zVar.g);
                    wVar4222.s = TLObject.FLAG_12;
                    wVar4222.J = zVar.d;
                    wVar4222.K = zVar.c;
                    wVar4222.M = wVar.a;
                    wVar4222.N = wVar.b;
                    wVar4222.k = u0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.x(wVar4222));
                    this.p = pVar.getPosition();
                } else {
                    long length6 = pVar.getLength();
                    long Y2 = (j19 == -1 || j19 == 0) ? -9223372036854775807L : e2.l0.Y(i29, (i31 * j19) - 1);
                    if (Y2 != -9223372036854775807L) {
                        if (C != -1) {
                            length6 = position3 + C;
                        } else if (length6 != -1) {
                            C = length6 - position3;
                        }
                        long j21 = C - i28;
                        long j22 = length6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        aVar = new a(j22, position3 + i28, c8.b(e2.l0.a0(j21, 8000000L, Y2, roundingMode)), c8.b(o7.b(j21, j19, roundingMode)), false, true);
                        u0Var = this.l;
                        long position2222 = pVar.getPosition();
                        if (u0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.G1(hVar);
                        u0Var2 = this.l;
                        if (u0Var2 == null) {
                        }
                        b2.w wVar42222 = new b2.w();
                        wVar42222.q = v0.n("audio/mpeg");
                        wVar42222.r = v0.n((String) zVar.g);
                        wVar42222.s = TLObject.FLAG_12;
                        wVar42222.J = zVar.d;
                        wVar42222.K = zVar.c;
                        wVar42222.M = wVar.a;
                        wVar42222.N = wVar.b;
                        wVar42222.k = u0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.b(new b2.x(wVar42222));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    u0Var = this.l;
                    long position22222 = pVar.getPosition();
                    if (u0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.G1(hVar);
                    u0Var2 = this.l;
                    if (u0Var2 == null) {
                    }
                    b2.w wVar422222 = new b2.w();
                    wVar422222.q = v0.n("audio/mpeg");
                    wVar422222.r = v0.n((String) zVar.g);
                    wVar422222.s = TLObject.FLAG_12;
                    wVar422222.J = zVar.d;
                    wVar422222.K = zVar.c;
                    wVar422222.M = wVar.a;
                    wVar422222.N = wVar.b;
                    wVar422222.k = u0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.b(new b2.x(wVar422222));
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
                    int i282 = zVar.b;
                    int i292 = zVar.c;
                    int i302 = zVar.e;
                    int i312 = zVar.f;
                    wVar = wVar32;
                    f fVar22 = fVar;
                    if (wVar.a != -1) {
                    }
                    wVar.a = i15;
                    wVar.b = i14;
                    this.m = fVar22 != null ? new u0(fVar22) : null;
                    long position32 = pVar.getPosition();
                    pVar.q(zVar.b);
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
            int i2822 = zVar.b;
            int i2922 = zVar.c;
            int i3022 = zVar.e;
            int i3122 = zVar.f;
            wVar = wVar322;
            f fVar222 = fVar;
            if (wVar.a != -1) {
            }
            wVar.a = i15;
            wVar.b = i14;
            this.m = fVar222 != null ? new u0(fVar222) : null;
            long position322 = pVar.getPosition();
            pVar.q(zVar.b);
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
                    pVar.q((int) (j23 - position4));
                }
            }
        }
        if (this.r == 0) {
            pVar.m();
            if (!i(pVar)) {
                x xVar4 = this.c;
                xVar4.N(0);
                int m13 = xVar4.m();
                if (((-128000) & m13) != (this.k & (-128000)) || c3.b.h(m13) == -1) {
                    pVar.q(1);
                    this.k = 0;
                    i10 = 0;
                    i11 = -1;
                    if (i10 == i11) {
                        h hVar2 = this.s;
                        if (hVar2 instanceof b) {
                            if (hVar2.h() != ((this.o * j10) / zVar.c) + this.n) {
                                ((b) this.s).getClass();
                                throw th2;
                            }
                        }
                    }
                    return i10;
                }
                zVar.a(m13);
                if (this.n == -9223372036854775807L) {
                    this.n = this.s.a(pVar.getPosition());
                    long j24 = this.b;
                    if (j24 != -9223372036854775807L) {
                        this.n = (j24 - this.s.a(j11)) + this.n;
                    }
                }
                this.r = zVar.b;
                this.q = pVar.getPosition() + zVar.b;
                if (this.s instanceof b) {
                    long j25 = ((this.o + zVar.f) * j10) / zVar.c;
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
                this.j.c(((this.o * j10) / zVar.c) + this.n, 1, zVar.b, 0, null);
                this.o += zVar.f;
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
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.e, zVar.b, z10, true);
    }

    public final void h() {
        b0 b0Var = this.s;
        if ((b0Var instanceof a) && ((k) b0Var).d()) {
            long j10 = this.q;
            if (j10 == -1 || j10 == this.s.b()) {
                return;
            }
            a aVar = (a) this.s;
            this.s = new a(this.q, aVar.i, aVar.j, aVar.k, aVar.l, false);
            q qVar = this.h;
            qVar.getClass();
            qVar.G1(this.s);
            k0 k0Var = this.i;
            k0Var.getClass();
            k0Var.e(this.s.h());
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
        pVar.m();
        if (pVar.getPosition() == 0) {
            u0 m0 = this.f.m0(pVar, null, 131072);
            this.l = m0;
            if (m0 != null) {
                this.e.b(m0);
            }
            i10 = (int) pVar.k();
            if (!z10) {
                pVar.q(i10);
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
                        pVar.m();
                        pVar.l(i10 + i14);
                    } else {
                        pVar.q(1);
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
            pVar.q(i10 + i13);
        } else {
            pVar.m();
        }
        this.k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        this.c = new x(10);
        this.d = new z();
        this.e = new w();
        this.n = -9223372036854775807L;
        this.f = new a6.i(12);
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
