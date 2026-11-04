package x3;

import b8.od;
import b8.xc;
import d2.r0;
import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import e3.b0;
import e3.i0;
import e3.k;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.w;
import e3.z;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.tgnet.TLObject;
import s3.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements o {
    public final int a;
    public final long b;
    public final y c;
    public final z d;
    public final w e;
    public final bb.c f;
    public final n g;
    public q h;
    public i0 i;
    public i0 j;
    public int k;
    public s0 l;
    public s0 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public h s;
    public boolean t;
    public boolean u;
    public long v;

    public d(int i3) {
        this(i3, -9223372036854775807L);
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        return j(pVar, true);
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.h = qVar;
        i0 i02 = qVar.i0(0, 1);
        this.i = i02;
        this.j = i02;
        this.h.L();
    }

    @Override // e3.o
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

    @Override // e3.o
    public final List e() {
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0344, code lost:
    
        if (f9.r.a.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037e, code lost:
    
        if (((s3.n) r10).a.equals("TLEN") != false) goto L170;
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
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        Throwable th2;
        int i3;
        int i10;
        long j10;
        long j11;
        int i11;
        int i12;
        long j12;
        int m10;
        long[] jArr;
        y yVar;
        f fVar;
        int i13;
        int i14;
        w wVar;
        h aVar;
        long j13;
        long j14;
        s0 s0Var;
        r0 r0Var;
        r0 r0Var2;
        int i15;
        long S;
        c cVar;
        h hVar;
        s0 s0Var2;
        w wVar2;
        int A;
        this.i.getClass();
        String str = n0.a;
        int i16 = this.k;
        z zVar = this.d;
        if (i16 == 0) {
            try {
                j(pVar, false);
            } catch (EOFException unused) {
                th2 = null;
                i3 = -1;
                i10 = -1;
                j10 = 1000000;
            }
        }
        if (this.s == null) {
            y yVar2 = new y(zVar.b);
            pVar.c(0, zVar.b, yVar2.a);
            int i17 = 21;
            th2 = null;
            if ((zVar.a & 1) != 0) {
                if (zVar.d != 1) {
                    i17 = 36;
                }
            } else if (zVar.d == 1) {
                i17 = 13;
            }
            j10 = 1000000;
            j11 = 0;
            if (yVar2.c >= i17 + 4) {
                yVar2.N(i17);
                i11 = yVar2.m();
                if (i11 != 1483304551) {
                }
                w wVar3 = this.e;
                if (i11 != 1231971951) {
                    if (i11 == 1447187017) {
                        long length = pVar.getLength();
                        long position = pVar.getPosition();
                        j12 = -9223372036854775807L;
                        yVar2.O(6);
                        i12 = 0;
                        long j15 = position + zVar.b;
                        long m11 = j15 + yVar2.m();
                        int m12 = yVar2.m();
                        if (m12 <= 0) {
                            aVar = null;
                            wVar2 = wVar3;
                        } else {
                            long Y = n0.Y(zVar.c, (m12 * zVar.f) - 1);
                            int H = yVar2.H();
                            int H2 = yVar2.H();
                            int H3 = yVar2.H();
                            yVar2.O(2);
                            long j16 = position + zVar.b;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i18 = 0;
                            while (true) {
                                if (i18 < H) {
                                    y yVar3 = yVar2;
                                    wVar2 = wVar3;
                                    jArr2[i18] = (i18 * Y) / H;
                                    jArr3[i18] = j16;
                                    if (H3 == 1) {
                                        A = yVar3.A();
                                    } else if (H3 == 2) {
                                        A = yVar3.H();
                                    } else if (H3 == 3) {
                                        A = yVar3.D();
                                    } else {
                                        if (H3 != 4) {
                                            aVar = null;
                                            break;
                                        }
                                        A = yVar3.E();
                                    }
                                    j16 += H2 * A;
                                    i18++;
                                    yVar2 = yVar3;
                                    wVar3 = wVar2;
                                } else {
                                    wVar2 = wVar3;
                                    if (length != -1 && length != m11) {
                                        StringBuilder t10 = a1.g.t(length, "VBRI data size mismatch: ", ", ");
                                        t10.append(m11);
                                        g2.a.l("VbriSeeker", t10.toString());
                                    }
                                    if (m11 != j16) {
                                        StringBuilder t11 = a1.g.t(m11, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        t11.append(j16);
                                        t11.append("\nSeeking will be inaccurate.");
                                        g2.a.l("VbriSeeker", t11.toString());
                                        m11 = Math.max(m11, j16);
                                    }
                                    aVar = new i(jArr2, jArr3, Y, j15, m11, zVar.e);
                                }
                            }
                        }
                        pVar.u(zVar.b);
                        wVar = wVar2;
                    } else if (i11 != 1483304551) {
                        pVar.o();
                        aVar = null;
                        wVar = wVar3;
                        i12 = 0;
                        j12 = -9223372036854775807L;
                    }
                    s0Var = this.l;
                    long position2 = pVar.getPosition();
                    if (s0Var != null) {
                        r0[] r0VarArr = s0Var.a;
                        int length2 = r0VarArr.length;
                        int i19 = i12;
                        while (true) {
                            if (i19 >= length2) {
                                r0Var = null;
                                break;
                            }
                            r0 r0Var3 = r0VarArr[i19];
                            if (l.class.isAssignableFrom(r0Var3.getClass())) {
                                r0Var = (r0) l.class.cast(r0Var3);
                            }
                            r0Var = null;
                            if (r0Var != null) {
                                break;
                            }
                            i19++;
                        }
                        l lVar = (l) r0Var;
                        if (lVar != null) {
                            int[] iArr = lVar.e;
                            r0[] r0VarArr2 = s0Var.a;
                            int length3 = r0VarArr2.length;
                            int i20 = i12;
                            while (true) {
                                if (i20 >= length3) {
                                    r0Var2 = null;
                                    break;
                                }
                                r0 r0Var4 = r0VarArr2[i20];
                                if (s3.n.class.isAssignableFrom(r0Var4.getClass())) {
                                    r0Var2 = (r0) s3.n.class.cast(r0Var4);
                                }
                                r0Var2 = null;
                                if (r0Var2 != null) {
                                    break;
                                }
                                i20++;
                            }
                            s3.n nVar = (s3.n) r0Var2;
                            if (nVar == null) {
                                S = j12;
                                i15 = i12;
                            } else {
                                i15 = i12;
                                S = n0.S(Long.parseLong((String) nVar.c.get(i15)));
                            }
                            int length4 = iArr.length;
                            int i21 = length4 + 1;
                            long[] jArr4 = new long[i21];
                            long[] jArr5 = new long[i21];
                            jArr4[i15] = position2;
                            jArr5[i15] = 0;
                            long j17 = 0;
                            int i22 = 1;
                            while (i22 <= length4) {
                                int i23 = length4;
                                int i24 = i22 - 1;
                                long j18 = position2 + lVar.c + iArr[i24];
                                j17 += lVar.d + lVar.f[i24];
                                jArr4[i22] = j18;
                                jArr5[i22] = j17;
                                i22++;
                                length4 = i23;
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
                                int i25 = this.a;
                                if (!d && !(hVar instanceof a) && (i25 & 1) != 0 && hVar.h() != -9223372036854775807L && (hVar.a() != -1 || pVar.getLength() != -1)) {
                                    long c2 = hVar.c() != -1 ? hVar.c() : 0L;
                                    long a10 = hVar.a() != -1 ? hVar.a() : pVar.getLength();
                                    hVar = new a(a10, c2, od.e(n0.a0(a10 - c2, 8000000L, hVar.h(), RoundingMode.HALF_UP)), -1, false, true);
                                } else if (!hVar.d() && !(hVar instanceof a) && (i25 & 1) != 0) {
                                    hVar = g(pVar, false);
                                }
                                this.i.b(hVar.h());
                            } else {
                                hVar = new g(j12);
                            }
                            this.s = hVar;
                            this.h.f(hVar);
                            s0Var2 = this.l;
                            if (s0Var2 == null) {
                                s0 s0Var3 = this.m;
                                if (s0Var3 != null) {
                                    s0Var2 = s0Var2.b(s0Var3);
                                }
                            } else {
                                s0Var2 = this.m;
                            }
                            u uVar = new u();
                            uVar.q = u0.n("audio/mpeg");
                            uVar.r = u0.n((String) zVar.g);
                            uVar.s = TLObject.FLAG_12;
                            uVar.J = zVar.d;
                            uVar.K = zVar.c;
                            uVar.M = wVar.a;
                            uVar.N = wVar.b;
                            uVar.k = s0Var2;
                            if (this.s.g() != -2147483647) {
                                uVar.h = this.s.g();
                            }
                            this.j.g(new v(uVar));
                            this.p = pVar.getPosition();
                        }
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    s0Var2 = this.l;
                    if (s0Var2 == null) {
                    }
                    u uVar2 = new u();
                    uVar2.q = u0.n("audio/mpeg");
                    uVar2.r = u0.n((String) zVar.g);
                    uVar2.s = TLObject.FLAG_12;
                    uVar2.J = zVar.d;
                    uVar2.K = zVar.c;
                    uVar2.M = wVar.a;
                    uVar2.N = wVar.b;
                    uVar2.k = s0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new v(uVar2));
                    this.p = pVar.getPosition();
                }
                i12 = 0;
                j12 = -9223372036854775807L;
                m10 = yVar2.m();
                int E = (m10 & 1) != 0 ? yVar2.E() : -1;
                long C = (m10 & 2) != 0 ? yVar2.C() : -1L;
                if ((m10 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    for (int i26 = 0; i26 < 100; i26++) {
                        jArr6[i26] = yVar2.A();
                    }
                    jArr = jArr6;
                } else {
                    jArr = null;
                }
                if ((m10 & 8) != 0) {
                    yVar = yVar2;
                    yVar.O(4);
                } else {
                    yVar = yVar2;
                }
                if (yVar.a() >= 24) {
                    yVar.O(11);
                    float intBitsToFloat = Float.intBitsToFloat(yVar.m());
                    int H4 = yVar.H();
                    int H5 = yVar.H();
                    e a11 = e.a(H4);
                    e a12 = e.a(H5);
                    fVar = (intBitsToFloat <= 0.0f && a11 == null && a12 == null) ? null : new f(intBitsToFloat, a11, a12);
                    yVar.O(2);
                    int D = yVar.D();
                    i14 = (16773120 & D) >> 12;
                    i13 = D & 4095;
                } else {
                    fVar = null;
                    i13 = -1;
                    i14 = -1;
                }
                long j19 = E;
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
                this.m = fVar2 != null ? new s0(fVar2) : null;
                long position3 = pVar.getPosition();
                pVar.u(zVar.b);
                if (i11 == 1483304551) {
                    long length5 = pVar.getLength();
                    if (j19 == -1 || j19 == 0) {
                        j13 = length5;
                        j14 = -9223372036854775807L;
                    } else {
                        j13 = length5;
                        j14 = n0.Y(i28, (j19 * i30) - 1);
                    }
                    if (j14 != -9223372036854775807L) {
                        if (C != -1 && j13 != -1 && position3 + C != j13) {
                            long j20 = j13 - position3;
                            StringBuilder t12 = a1.g.t(j20, "Data size mismatch between stream (", ") and Xing frame (");
                            t12.append(C);
                            t12.append("), using smaller value.");
                            g2.a.g("XingSeeker", t12.toString());
                            C = Math.min(C, j20);
                        }
                        aVar = new j(position3, i27, j14, i29, C, jArr);
                        s0Var = this.l;
                        long position22 = pVar.getPosition();
                        if (s0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.f(hVar);
                        s0Var2 = this.l;
                        if (s0Var2 == null) {
                        }
                        u uVar22 = new u();
                        uVar22.q = u0.n("audio/mpeg");
                        uVar22.r = u0.n((String) zVar.g);
                        uVar22.s = TLObject.FLAG_12;
                        uVar22.J = zVar.d;
                        uVar22.K = zVar.c;
                        uVar22.M = wVar.a;
                        uVar22.N = wVar.b;
                        uVar22.k = s0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.g(new v(uVar22));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    s0Var = this.l;
                    long position222 = pVar.getPosition();
                    if (s0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    s0Var2 = this.l;
                    if (s0Var2 == null) {
                    }
                    u uVar222 = new u();
                    uVar222.q = u0.n("audio/mpeg");
                    uVar222.r = u0.n((String) zVar.g);
                    uVar222.s = TLObject.FLAG_12;
                    uVar222.J = zVar.d;
                    uVar222.K = zVar.c;
                    uVar222.M = wVar.a;
                    uVar222.N = wVar.b;
                    uVar222.k = s0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new v(uVar222));
                    this.p = pVar.getPosition();
                } else {
                    long length6 = pVar.getLength();
                    long Y2 = (j19 == -1 || j19 == 0) ? -9223372036854775807L : n0.Y(i28, (i30 * j19) - 1);
                    if (Y2 != -9223372036854775807L) {
                        if (C != -1) {
                            length6 = position3 + C;
                        } else if (length6 != -1) {
                            C = length6 - position3;
                        }
                        long j21 = C - i27;
                        long j22 = length6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        aVar = new a(j22, position3 + i27, od.b(n0.a0(j21, 8000000L, Y2, roundingMode)), od.b(xc.b(j21, j19, roundingMode)), false, true);
                        s0Var = this.l;
                        long position2222 = pVar.getPosition();
                        if (s0Var != null) {
                        }
                        cVar = null;
                        if (this.t) {
                        }
                        this.s = hVar;
                        this.h.f(hVar);
                        s0Var2 = this.l;
                        if (s0Var2 == null) {
                        }
                        u uVar2222 = new u();
                        uVar2222.q = u0.n("audio/mpeg");
                        uVar2222.r = u0.n((String) zVar.g);
                        uVar2222.s = TLObject.FLAG_12;
                        uVar2222.J = zVar.d;
                        uVar2222.K = zVar.c;
                        uVar2222.M = wVar.a;
                        uVar2222.N = wVar.b;
                        uVar2222.k = s0Var2;
                        if (this.s.g() != -2147483647) {
                        }
                        this.j.g(new v(uVar2222));
                        this.p = pVar.getPosition();
                    }
                    aVar = null;
                    s0Var = this.l;
                    long position22222 = pVar.getPosition();
                    if (s0Var != null) {
                    }
                    cVar = null;
                    if (this.t) {
                    }
                    this.s = hVar;
                    this.h.f(hVar);
                    s0Var2 = this.l;
                    if (s0Var2 == null) {
                    }
                    u uVar22222 = new u();
                    uVar22222.q = u0.n("audio/mpeg");
                    uVar22222.r = u0.n((String) zVar.g);
                    uVar22222.s = TLObject.FLAG_12;
                    uVar22222.J = zVar.d;
                    uVar22222.K = zVar.c;
                    uVar22222.M = wVar.a;
                    uVar22222.N = wVar.b;
                    uVar22222.k = s0Var2;
                    if (this.s.g() != -2147483647) {
                    }
                    this.j.g(new v(uVar22222));
                    this.p = pVar.getPosition();
                }
            }
            if (yVar2.c >= 40) {
                yVar2.N(36);
                if (yVar2.m() == 1447187017) {
                    i11 = 1447187017;
                    w wVar32 = this.e;
                    if (i11 != 1231971951) {
                    }
                    i12 = 0;
                    j12 = -9223372036854775807L;
                    m10 = yVar2.m();
                    if ((m10 & 1) != 0) {
                    }
                    if ((m10 & 2) != 0) {
                    }
                    if ((m10 & 4) == 4) {
                    }
                    if ((m10 & 8) != 0) {
                    }
                    if (yVar.a() >= 24) {
                    }
                    long j192 = E;
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
                    this.m = fVar22 != null ? new s0(fVar22) : null;
                    long position32 = pVar.getPosition();
                    pVar.u(zVar.b);
                    if (i11 == 1483304551) {
                    }
                }
            }
            i11 = 0;
            w wVar322 = this.e;
            if (i11 != 1231971951) {
            }
            i12 = 0;
            j12 = -9223372036854775807L;
            m10 = yVar2.m();
            if ((m10 & 1) != 0) {
            }
            if ((m10 & 2) != 0) {
            }
            if ((m10 & 4) == 4) {
            }
            if ((m10 & 8) != 0) {
            }
            if (yVar.a() >= 24) {
            }
            long j1922 = E;
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
            this.m = fVar222 != null ? new s0(fVar222) : null;
            long position322 = pVar.getPosition();
            pVar.u(zVar.b);
            if (i11 == 1483304551) {
            }
        } else {
            th2 = null;
            j10 = 1000000;
            j11 = 0;
            if (this.p != 0) {
                long position4 = pVar.getPosition();
                long j23 = this.p;
                if (position4 < j23) {
                    pVar.u((int) (j23 - position4));
                }
            }
        }
        if (this.r == 0) {
            pVar.o();
            if (!i(pVar)) {
                y yVar4 = this.c;
                yVar4.N(0);
                int m13 = yVar4.m();
                if (((-128000) & m13) != (this.k & (-128000)) || e3.b.h(m13) == -1) {
                    pVar.u(1);
                    this.k = 0;
                    i3 = 0;
                    i10 = -1;
                    if (i3 == i10) {
                        h hVar2 = this.s;
                        if (hVar2 instanceof b) {
                            if (hVar2.h() != ((this.o * j10) / zVar.c) + this.n) {
                                ((b) this.s).getClass();
                                throw th2;
                            }
                        }
                    }
                    return i3;
                }
                zVar.a(m13);
                if (this.n == -9223372036854775807L) {
                    this.n = this.s.b(pVar.getPosition());
                    long j24 = this.b;
                    if (j24 != -9223372036854775807L) {
                        this.n = (j24 - this.s.b(j11)) + this.n;
                    }
                }
                this.r = zVar.b;
                this.q = pVar.getPosition() + zVar.b;
                if (this.s instanceof b) {
                    long j25 = ((this.o + zVar.f) * j10) / zVar.c;
                    throw th2;
                }
            }
            i3 = -1;
            i10 = -1;
            if (i3 == i10) {
            }
            return i3;
        }
        int a13 = this.j.a(pVar, this.r, true);
        if (a13 != -1) {
            int i31 = this.r - a13;
            this.r = i31;
            if (i31 <= 0) {
                this.j.d(((this.o * j10) / zVar.c) + this.n, 1, zVar.b, 0, null);
                this.o += zVar.f;
                this.r = 0;
                i3 = 0;
                i10 = -1;
                if (i3 == i10) {
                }
                return i3;
            }
            i3 = 0;
            i10 = -1;
            if (i3 == i10) {
            }
            return i3;
        }
        i3 = -1;
        i10 = -1;
        if (i3 == i10) {
        }
        return i3;
    }

    public final a g(p pVar, boolean z10) {
        y yVar = this.c;
        pVar.c(0, 4, yVar.a);
        yVar.N(0);
        int m10 = yVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.e, zVar.b, z10, true);
    }

    public final void h() {
        b0 b0Var = this.s;
        if ((b0Var instanceof a) && ((k) b0Var).d()) {
            long j10 = this.q;
            if (j10 == -1 || j10 == this.s.a()) {
                return;
            }
            a aVar = (a) this.s;
            this.s = new a(this.q, aVar.i, aVar.j, aVar.k, aVar.l, false);
            q qVar = this.h;
            qVar.getClass();
            qVar.f(this.s);
            i0 i0Var = this.i;
            i0Var.getClass();
            i0Var.b(this.s.h());
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
        int i3;
        int i10;
        int h;
        pVar.o();
        if (pVar.getPosition() == 0) {
            s0 h7 = this.f.h(pVar, null, 131072);
            this.l = h7;
            if (h7 != null) {
                this.e.b(h7);
            }
            i3 = (int) pVar.k();
            if (!z10) {
                pVar.u(i3);
            }
            i10 = 0;
        } else {
            i3 = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (!i(pVar)) {
                y yVar = this.c;
                yVar.N(0);
                int m10 = yVar.m();
                if ((i10 == 0 || ((-128000) & m10) == (i10 & (-128000))) && (h = e3.b.h(m10)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m10);
                        i10 = m10;
                    }
                    pVar.n(h - 4);
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
                        pVar.o();
                        pVar.n(i3 + i13);
                    } else {
                        pVar.u(1);
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
            pVar.u(i3 + i12);
        } else {
            pVar.o();
        }
        this.k = i10;
        return true;
    }

    public d(int i3, long j10) {
        this.a = i3;
        this.b = j10;
        this.c = new y(10);
        this.d = new z();
        this.e = new w();
        this.n = -9223372036854775807L;
        this.f = new bb.c(19);
        n nVar = new n();
        this.g = nVar;
        this.j = nVar;
        this.q = -1L;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
