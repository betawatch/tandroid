// default package

import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rh7 implements e84 {
    public static final hz6 w = new hz6((byte) 17);
    public final int a;
    public final long b;
    public final ey7 c;
    public final di7 d;
    public final du4 e;
    public final aj3 f;
    public final po3 g;
    public g84 h;
    public x1c i;
    public x1c j;
    public int k;
    public vf7 l;
    public vf7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public ez9 s;
    public boolean t;
    public boolean u;
    public long v;

    public rh7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new ey7(10);
        this.d = new di7();
        this.e = new du4();
        this.n = -9223372036854775807L;
        this.f = new aj3((byte) 12);
        po3 po3Var = new po3();
        this.g = po3Var;
        this.j = po3Var;
        this.q = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r3 != 1231971951) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x034d, code lost:
    
        if (vj8.a.apply(r9) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0384, code lost:
    
        if (((jlb) r10).a.equals("TLEN") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0663  */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        du4 du4Var;
        di7 di7Var;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        long j5;
        int i4;
        boolean z;
        int f;
        ?? r4;
        int i5;
        int i6;
        int m;
        long[] jArr;
        int i7;
        int i8;
        th7 th7Var;
        boolean z2;
        vf7 vf7Var;
        int i9;
        ez9 kt2Var;
        vf7 vf7Var2;
        ez9 ez9Var;
        boolean z3;
        ez9 ez9Var2;
        ez9 kt2Var2;
        vf7 vf7Var3;
        tf7 tf7Var;
        tf7 tf7Var2;
        char c;
        long T;
        du4 du4Var2;
        int A;
        this.i.getClass();
        String str = gcc.a;
        int i10 = this.k;
        du4 du4Var3 = this.e;
        di7 di7Var2 = this.d;
        if (i10 == 0) {
            try {
                j((cb3) f84Var, false);
            } catch (EOFException unused) {
                du4Var = du4Var3;
                di7Var = di7Var2;
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = -9223372036854775807L;
            }
        }
        if (this.s == null) {
            j = 1000000;
            ey7 ey7Var = new ey7(di7Var2.c);
            j2 = 1;
            ((cb3) f84Var).d(ey7Var.a, 0, di7Var2.c, false);
            int i11 = di7Var2.a & 1;
            byte b = di7Var2.e;
            int i12 = 21;
            if (i11 != 0) {
                if (b != 1) {
                    i12 = 36;
                }
            } else if (b == 1) {
                i12 = 13;
            }
            j5 = 0;
            if (ey7Var.c >= i12 + 4) {
                ey7Var.N(i12);
                i6 = ey7Var.m();
                if (i6 != 1483304551) {
                }
                if (i6 != 1231971951) {
                    if (i6 == 1447187017) {
                        cb3 cb3Var = (cb3) f84Var;
                        long j6 = cb3Var.c;
                        long j7 = cb3Var.d;
                        ey7Var.O(6);
                        long j8 = j7 + di7Var2.c;
                        long m2 = j8 + ey7Var.m();
                        int m3 = ey7Var.m();
                        if (m3 <= 0) {
                            du4Var2 = du4Var3;
                            di7Var = di7Var2;
                        } else {
                            du4 du4Var4 = du4Var3;
                            long Z = gcc.Z(di7Var2.d, (m3 * di7Var2.g) - 1);
                            int H = ey7Var.H();
                            int H2 = ey7Var.H();
                            int H3 = ey7Var.H();
                            ey7Var.O(2);
                            di7Var = di7Var2;
                            long j9 = j7 + di7Var.c;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i13 = 0;
                            while (true) {
                                du4Var2 = du4Var4;
                                long[] jArr4 = jArr2;
                                if (i13 < H) {
                                    jArr4[i13] = (i13 * Z) / H;
                                    jArr3[i13] = j9;
                                    if (H3 == 1) {
                                        A = ey7Var.A();
                                    } else if (H3 == 2) {
                                        A = ey7Var.H();
                                    } else if (H3 == 3) {
                                        A = ey7Var.D();
                                    } else {
                                        if (H3 != 4) {
                                            break;
                                        }
                                        A = ey7Var.E();
                                    }
                                    j9 += H2 * A;
                                    i13++;
                                    jArr2 = jArr4;
                                    du4Var4 = du4Var2;
                                } else {
                                    if (j6 != -1 && j6 != m2) {
                                        StringBuilder o = ik8.o(j6, "VBRI data size mismatch: ", ", ");
                                        o.append(m2);
                                        efd.f("VbriSeeker", o.toString());
                                    }
                                    if (m2 != j9) {
                                        StringBuilder o2 = ik8.o(m2, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        o2.append(j9);
                                        o2.append("\nSeeking will be inaccurate.");
                                        efd.f("VbriSeeker", o2.toString());
                                        m2 = Math.max(m2, j9);
                                    }
                                    kt2Var = new edc(jArr4, jArr3, Z, j8, m2);
                                }
                            }
                            cb3Var.l(di7Var.c, false);
                            du4Var = du4Var2;
                            vf7Var2 = this.l;
                            cb3 cb3Var2 = (cb3) f84Var;
                            long j10 = cb3Var2.d;
                            if (vf7Var2 != null) {
                            }
                            ez9Var = null;
                            z3 = this.t;
                            int i14 = this.a;
                            if (z3) {
                            }
                            this.s = ez9Var2;
                            this.i.d(ez9Var2.h());
                            this.h.m0(this.s);
                            vf7Var3 = this.l;
                            if (vf7Var3 == null) {
                            }
                            vf7Var3 = this.m;
                            jo4 jo4Var = new jo4();
                            jo4Var.r = eg7.n("audio/mpeg");
                            jo4Var.s = eg7.n(di7Var.b);
                            jo4Var.t = TLObject.FLAG_12;
                            jo4Var.M = di7Var.e;
                            jo4Var.O = di7Var.d;
                            jo4Var.Q = du4Var.a;
                            jo4Var.R = du4Var.b;
                            jo4Var.l = vf7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            xnb.v(jo4Var, this.j);
                            this.p = cb3Var2.d;
                        }
                        kt2Var = null;
                        cb3Var.l(di7Var.c, false);
                        du4Var = du4Var2;
                        vf7Var2 = this.l;
                        cb3 cb3Var22 = (cb3) f84Var;
                        long j102 = cb3Var22.d;
                        if (vf7Var2 != null) {
                        }
                        ez9Var = null;
                        z3 = this.t;
                        int i142 = this.a;
                        if (z3) {
                        }
                        this.s = ez9Var2;
                        this.i.d(ez9Var2.h());
                        this.h.m0(this.s);
                        vf7Var3 = this.l;
                        if (vf7Var3 == null) {
                        }
                        vf7Var3 = this.m;
                        jo4 jo4Var2 = new jo4();
                        jo4Var2.r = eg7.n("audio/mpeg");
                        jo4Var2.s = eg7.n(di7Var.b);
                        jo4Var2.t = TLObject.FLAG_12;
                        jo4Var2.M = di7Var.e;
                        jo4Var2.O = di7Var.d;
                        jo4Var2.Q = du4Var.a;
                        jo4Var2.R = du4Var.b;
                        jo4Var2.l = vf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        xnb.v(jo4Var2, this.j);
                        this.p = cb3Var22.d;
                    } else if (i6 != 1483304551) {
                        ((cb3) f84Var).f = 0;
                        du4Var = du4Var3;
                        di7Var = di7Var2;
                        kt2Var = null;
                        vf7Var2 = this.l;
                        cb3 cb3Var222 = (cb3) f84Var;
                        long j1022 = cb3Var222.d;
                        if (vf7Var2 != null) {
                            tf7[] tf7VarArr = vf7Var2.a;
                            int length = tf7VarArr.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    tf7Var = null;
                                    break;
                                }
                                tf7 tf7Var3 = tf7VarArr[i15];
                                if (ng7.class.isAssignableFrom(tf7Var3.getClass())) {
                                    tf7Var = (tf7) ng7.class.cast(tf7Var3);
                                }
                                tf7Var = null;
                                if (tf7Var != null) {
                                    break;
                                }
                                i15++;
                            }
                            ng7 ng7Var = (ng7) tf7Var;
                            if (ng7Var != null) {
                                int[] iArr = ng7Var.e;
                                tf7[] tf7VarArr2 = vf7Var2.a;
                                int length2 = tf7VarArr2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        tf7Var2 = null;
                                        break;
                                    }
                                    tf7 tf7Var4 = tf7VarArr2[i16];
                                    if (jlb.class.isAssignableFrom(tf7Var4.getClass())) {
                                        tf7Var2 = (tf7) jlb.class.cast(tf7Var4);
                                    }
                                    tf7Var2 = null;
                                    if (tf7Var2 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                jlb jlbVar = (jlb) tf7Var2;
                                if (jlbVar == null) {
                                    T = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    T = gcc.T(Long.parseLong((String) jlbVar.c.get(0)));
                                }
                                int length3 = iArr.length;
                                int i17 = length3 + 1;
                                long[] jArr5 = new long[i17];
                                long[] jArr6 = new long[i17];
                                jArr5[c] = j1022;
                                jArr6[c] = 0;
                                long j11 = 0;
                                int i18 = 1;
                                while (i18 <= length3) {
                                    int i19 = i18 - 1;
                                    long j12 = j1022 + ng7Var.c + iArr[i19];
                                    j11 += ng7Var.d + ng7Var.f[i19];
                                    jArr5[i18] = j12;
                                    jArr6[i18] = j11;
                                    i18++;
                                    length3 = length3;
                                    j1022 = j12;
                                }
                                ez9Var = new og7(T, jArr5, jArr6);
                                z3 = this.t;
                                int i1422 = this.a;
                                if (z3) {
                                    if (ez9Var == null) {
                                        if (kt2Var == null) {
                                            kt2Var = g(cb3Var222);
                                        }
                                        ez9Var = kt2Var;
                                    }
                                    if ((i1422 & 4) != 0 && !ez9Var.c()) {
                                        kt2Var2 = new mp5(ez9Var.h(), cb3Var222.d, ez9Var.a());
                                    } else if ((ez9Var instanceof kt2) || ez9Var.c() || (i1422 & 1) == 0) {
                                        ez9Var2 = ez9Var;
                                    } else {
                                        long h = ez9Var.h();
                                        long a = ez9Var.a() != -1 ? ez9Var.a() : cb3Var222.c;
                                        if (h == -9223372036854775807L || a == -1) {
                                            ez9Var2 = g(cb3Var222);
                                        } else {
                                            long b2 = ez9Var.b() != -1 ? ez9Var.b() : 0L;
                                            int a2 = cue.a(a - b2, h);
                                            if (a2 == -2147483647) {
                                                ez9Var2 = g(cb3Var222);
                                            } else {
                                                kt2Var2 = new kt2(a, b2, a2, -1, false, true, h);
                                            }
                                        }
                                    }
                                    ez9Var2 = kt2Var2;
                                } else {
                                    ez9Var2 = new dz9(-9223372036854775807L);
                                }
                                this.s = ez9Var2;
                                this.i.d(ez9Var2.h());
                                this.h.m0(this.s);
                                vf7Var3 = this.l;
                                if (vf7Var3 == null && (i1422 & 8) == 0) {
                                    vf7 vf7Var4 = this.m;
                                    if (vf7Var4 != null) {
                                        vf7Var3 = vf7Var3.b(vf7Var4);
                                    }
                                } else {
                                    vf7Var3 = this.m;
                                }
                                jo4 jo4Var22 = new jo4();
                                jo4Var22.r = eg7.n("audio/mpeg");
                                jo4Var22.s = eg7.n(di7Var.b);
                                jo4Var22.t = TLObject.FLAG_12;
                                jo4Var22.M = di7Var.e;
                                jo4Var22.O = di7Var.d;
                                jo4Var22.Q = du4Var.a;
                                jo4Var22.R = du4Var.b;
                                jo4Var22.l = vf7Var3;
                                if (this.s.g() != -2147483647) {
                                    jo4Var22.i = this.s.g();
                                }
                                xnb.v(jo4Var22, this.j);
                                this.p = cb3Var222.d;
                            }
                        }
                        ez9Var = null;
                        z3 = this.t;
                        int i14222 = this.a;
                        if (z3) {
                        }
                        this.s = ez9Var2;
                        this.i.d(ez9Var2.h());
                        this.h.m0(this.s);
                        vf7Var3 = this.l;
                        if (vf7Var3 == null) {
                        }
                        vf7Var3 = this.m;
                        jo4 jo4Var222 = new jo4();
                        jo4Var222.r = eg7.n("audio/mpeg");
                        jo4Var222.s = eg7.n(di7Var.b);
                        jo4Var222.t = TLObject.FLAG_12;
                        jo4Var222.M = di7Var.e;
                        jo4Var222.O = di7Var.d;
                        jo4Var222.Q = du4Var.a;
                        jo4Var222.R = du4Var.b;
                        jo4Var222.l = vf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        xnb.v(jo4Var222, this.j);
                        this.p = cb3Var222.d;
                    }
                }
                di7Var = di7Var2;
                m = ey7Var.m();
                int E = (m & 1) != 0 ? ey7Var.E() : -1;
                long C = (m & 2) != 0 ? ey7Var.C() : -1L;
                if ((m & 4) == 4) {
                    long[] jArr7 = new long[100];
                    for (int i20 = 0; i20 < 100; i20++) {
                        jArr7[i20] = ey7Var.A();
                    }
                    jArr = jArr7;
                } else {
                    jArr = null;
                }
                if ((m & 8) != 0) {
                    ey7Var.O(4);
                }
                if (ey7Var.a() >= 24) {
                    String y = ey7Var.y(9, StandardCharsets.UTF_8);
                    ey7Var.O(2);
                    float intBitsToFloat = Float.intBitsToFloat(ey7Var.m());
                    int H4 = ey7Var.H();
                    int H5 = ey7Var.H();
                    sh7 a3 = sh7.a(H4);
                    sh7 a4 = sh7.a(H5);
                    th7Var = (intBitsToFloat <= 0.0f && a3 == null && a4 == null) ? null : new th7(intBitsToFloat, a3, a4);
                    ey7Var.O(2);
                    int D = ey7Var.D();
                    i8 = (16773120 & D) >> 12;
                    i7 = D & 4095;
                    if (y.startsWith("LAME") || y.startsWith("Lavf") || y.startsWith("Lavc")) {
                        i8 += 529;
                        i7 = Math.max(0, i7 - 529);
                    }
                } else {
                    i7 = -1;
                    i8 = -1;
                    th7Var = null;
                }
                long j13 = E;
                pl6 pl6Var = new pl6();
                di7 di7Var3 = new di7();
                di7Var3.a = di7Var.a;
                di7Var3.b = di7Var.b;
                di7Var3.c = di7Var.c;
                di7Var3.d = di7Var.d;
                di7Var3.e = di7Var.e;
                di7Var3.f = di7Var.f;
                di7Var3.g = di7Var.g;
                pl6Var.d = di7Var3;
                pl6Var.a = j13;
                pl6Var.b = i8;
                pl6Var.c = i7;
                di7 di7Var4 = (di7) pl6Var.d;
                du4Var = du4Var3;
                if ((du4Var.a != -1 || du4Var.b == -1) && i8 != -1 && i7 != -1) {
                    du4Var.a = i8;
                    du4Var.b = i7;
                }
                if (th7Var != null) {
                    z2 = false;
                    vf7Var = new vf7(th7Var);
                } else {
                    z2 = false;
                    vf7Var = null;
                }
                this.m = vf7Var;
                cb3 cb3Var3 = (cb3) f84Var;
                long j14 = cb3Var3.d;
                cb3Var3.l(di7Var.c, z2);
                long j15 = cb3Var3.c;
                if (i6 == 1483304551) {
                    long a5 = pl6Var.a();
                    if (a5 != -9223372036854775807L) {
                        if (C != -1 && j15 != -1 && j14 + C != j15) {
                            long j16 = j15 - j14;
                            StringBuilder o3 = ik8.o(j16, "Data size mismatch between stream (", ") and Xing frame (");
                            o3.append(C);
                            o3.append("), using smaller value.");
                            efd.e("XingSeeker", o3.toString());
                            C = Math.min(C, j16);
                        }
                        kt2Var = new n3d(j14, di7Var4.c, a5, C, jArr);
                        vf7Var2 = this.l;
                        cb3 cb3Var2222 = (cb3) f84Var;
                        long j10222 = cb3Var2222.d;
                        if (vf7Var2 != null) {
                        }
                        ez9Var = null;
                        z3 = this.t;
                        int i142222 = this.a;
                        if (z3) {
                        }
                        this.s = ez9Var2;
                        this.i.d(ez9Var2.h());
                        this.h.m0(this.s);
                        vf7Var3 = this.l;
                        if (vf7Var3 == null) {
                        }
                        vf7Var3 = this.m;
                        jo4 jo4Var2222 = new jo4();
                        jo4Var2222.r = eg7.n("audio/mpeg");
                        jo4Var2222.s = eg7.n(di7Var.b);
                        jo4Var2222.t = TLObject.FLAG_12;
                        jo4Var2222.M = di7Var.e;
                        jo4Var2222.O = di7Var.d;
                        jo4Var2222.Q = du4Var.a;
                        jo4Var2222.R = du4Var.b;
                        jo4Var2222.l = vf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        xnb.v(jo4Var2222, this.j);
                        this.p = cb3Var2222.d;
                    }
                    kt2Var = null;
                    vf7Var2 = this.l;
                    cb3 cb3Var22222 = (cb3) f84Var;
                    long j102222 = cb3Var22222.d;
                    if (vf7Var2 != null) {
                    }
                    ez9Var = null;
                    z3 = this.t;
                    int i1422222 = this.a;
                    if (z3) {
                    }
                    this.s = ez9Var2;
                    this.i.d(ez9Var2.h());
                    this.h.m0(this.s);
                    vf7Var3 = this.l;
                    if (vf7Var3 == null) {
                    }
                    vf7Var3 = this.m;
                    jo4 jo4Var22222 = new jo4();
                    jo4Var22222.r = eg7.n("audio/mpeg");
                    jo4Var22222.s = eg7.n(di7Var.b);
                    jo4Var22222.t = TLObject.FLAG_12;
                    jo4Var22222.M = di7Var.e;
                    jo4Var22222.O = di7Var.d;
                    jo4Var22222.Q = du4Var.a;
                    jo4Var22222.R = du4Var.b;
                    jo4Var22222.l = vf7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    xnb.v(jo4Var22222, this.j);
                    this.p = cb3Var22222.d;
                } else {
                    long a6 = pl6Var.a();
                    if (a6 != -9223372036854775807L) {
                        if (C != -1) {
                            j15 = j14 + C;
                            i9 = di7Var4.c;
                        } else if (j15 != -1) {
                            C = j15 - j14;
                            i9 = di7Var4.c;
                        }
                        long j17 = C - i9;
                        long j18 = j15;
                        int a7 = cue.a(j17, a6);
                        if (a7 != -2147483647) {
                            kt2Var = new kt2(j18, j14 + di7Var4.c, a7, ype.b(qse.b(j17, j13, RoundingMode.HALF_UP)), false, true, a6);
                            vf7Var2 = this.l;
                            cb3 cb3Var222222 = (cb3) f84Var;
                            long j1022222 = cb3Var222222.d;
                            if (vf7Var2 != null) {
                            }
                            ez9Var = null;
                            z3 = this.t;
                            int i14222222 = this.a;
                            if (z3) {
                            }
                            this.s = ez9Var2;
                            this.i.d(ez9Var2.h());
                            this.h.m0(this.s);
                            vf7Var3 = this.l;
                            if (vf7Var3 == null) {
                            }
                            vf7Var3 = this.m;
                            jo4 jo4Var222222 = new jo4();
                            jo4Var222222.r = eg7.n("audio/mpeg");
                            jo4Var222222.s = eg7.n(di7Var.b);
                            jo4Var222222.t = TLObject.FLAG_12;
                            jo4Var222222.M = di7Var.e;
                            jo4Var222222.O = di7Var.d;
                            jo4Var222222.Q = du4Var.a;
                            jo4Var222222.R = du4Var.b;
                            jo4Var222222.l = vf7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            xnb.v(jo4Var222222, this.j);
                            this.p = cb3Var222222.d;
                        }
                    }
                    kt2Var = null;
                    vf7Var2 = this.l;
                    cb3 cb3Var2222222 = (cb3) f84Var;
                    long j10222222 = cb3Var2222222.d;
                    if (vf7Var2 != null) {
                    }
                    ez9Var = null;
                    z3 = this.t;
                    int i142222222 = this.a;
                    if (z3) {
                    }
                    this.s = ez9Var2;
                    this.i.d(ez9Var2.h());
                    this.h.m0(this.s);
                    vf7Var3 = this.l;
                    if (vf7Var3 == null) {
                    }
                    vf7Var3 = this.m;
                    jo4 jo4Var2222222 = new jo4();
                    jo4Var2222222.r = eg7.n("audio/mpeg");
                    jo4Var2222222.s = eg7.n(di7Var.b);
                    jo4Var2222222.t = TLObject.FLAG_12;
                    jo4Var2222222.M = di7Var.e;
                    jo4Var2222222.O = di7Var.d;
                    jo4Var2222222.Q = du4Var.a;
                    jo4Var2222222.R = du4Var.b;
                    jo4Var2222222.l = vf7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    xnb.v(jo4Var2222222, this.j);
                    this.p = cb3Var2222222.d;
                }
            }
            if (ey7Var.c >= 40) {
                ey7Var.N(36);
                if (ey7Var.m() == 1447187017) {
                    i6 = 1447187017;
                    if (i6 != 1231971951) {
                    }
                    di7Var = di7Var2;
                    m = ey7Var.m();
                    if ((m & 1) != 0) {
                    }
                    if ((m & 2) != 0) {
                    }
                    if ((m & 4) == 4) {
                    }
                    if ((m & 8) != 0) {
                    }
                    if (ey7Var.a() >= 24) {
                    }
                    long j132 = E;
                    pl6 pl6Var2 = new pl6();
                    di7 di7Var32 = new di7();
                    di7Var32.a = di7Var.a;
                    di7Var32.b = di7Var.b;
                    di7Var32.c = di7Var.c;
                    di7Var32.d = di7Var.d;
                    di7Var32.e = di7Var.e;
                    di7Var32.f = di7Var.f;
                    di7Var32.g = di7Var.g;
                    pl6Var2.d = di7Var32;
                    pl6Var2.a = j132;
                    pl6Var2.b = i8;
                    pl6Var2.c = i7;
                    di7 di7Var42 = (di7) pl6Var2.d;
                    du4Var = du4Var3;
                    if (du4Var.a != -1) {
                    }
                    du4Var.a = i8;
                    du4Var.b = i7;
                    if (th7Var != null) {
                    }
                    this.m = vf7Var;
                    cb3 cb3Var32 = (cb3) f84Var;
                    long j142 = cb3Var32.d;
                    cb3Var32.l(di7Var.c, z2);
                    long j152 = cb3Var32.c;
                    if (i6 == 1483304551) {
                    }
                }
            }
            i6 = 0;
            if (i6 != 1231971951) {
            }
            di7Var = di7Var2;
            m = ey7Var.m();
            if ((m & 1) != 0) {
            }
            if ((m & 2) != 0) {
            }
            if ((m & 4) == 4) {
            }
            if ((m & 8) != 0) {
            }
            if (ey7Var.a() >= 24) {
            }
            long j1322 = E;
            pl6 pl6Var22 = new pl6();
            di7 di7Var322 = new di7();
            di7Var322.a = di7Var.a;
            di7Var322.b = di7Var.b;
            di7Var322.c = di7Var.c;
            di7Var322.d = di7Var.d;
            di7Var322.e = di7Var.e;
            di7Var322.f = di7Var.f;
            di7Var322.g = di7Var.g;
            pl6Var22.d = di7Var322;
            pl6Var22.a = j1322;
            pl6Var22.b = i8;
            pl6Var22.c = i7;
            di7 di7Var422 = (di7) pl6Var22.d;
            du4Var = du4Var3;
            if (du4Var.a != -1) {
            }
            du4Var.a = i8;
            du4Var.b = i7;
            if (th7Var != null) {
            }
            this.m = vf7Var;
            cb3 cb3Var322 = (cb3) f84Var;
            long j1422 = cb3Var322.d;
            cb3Var322.l(di7Var.c, z2);
            long j1522 = cb3Var322.c;
            if (i6 == 1483304551) {
            }
        } else {
            du4Var = du4Var3;
            di7Var = di7Var2;
            j = 1000000;
            j2 = 1;
            j5 = 0;
            long j19 = this.p;
            if (j19 != 0) {
                long j20 = ((cb3) f84Var).d;
                if (j20 < j19) {
                    int i21 = (int) (j19 - j20);
                    i4 = 0;
                    ((cb3) f84Var).l(i21, false);
                    if (this.r != 0) {
                        ((cb3) f84Var).f = i4;
                        cb3 cb3Var4 = (cb3) f84Var;
                        if (i(cb3Var4)) {
                            j3 = -9223372036854775807L;
                            i = -1;
                            i2 = -1;
                            if (i2 == i) {
                                ez9 ez9Var3 = this.s;
                                if (ez9Var3 instanceof mp5) {
                                    long j21 = this.o - j2;
                                    if (j21 >= 0) {
                                        int i22 = du4Var.a;
                                        if (i22 != i && (i3 = du4Var.b) != i) {
                                            j21 = (j21 - i22) - i3;
                                        }
                                        if (j21 >= 0) {
                                            j4 = ((j21 * j) / di7Var.d) + this.n;
                                            if (ez9Var3.h() != j4) {
                                                ez9 ez9Var4 = this.s;
                                                ((mp5) ez9Var4).d.c = j4;
                                                this.h.m0(ez9Var4);
                                                this.i.d(this.s.h());
                                            }
                                        }
                                    }
                                    j4 = j3;
                                    if (ez9Var3.h() != j4) {
                                    }
                                }
                            }
                            return i2;
                        }
                        ey7 ey7Var2 = this.c;
                        ey7Var2.N(i4);
                        int m4 = ey7Var2.m();
                        if (((-128000) & m4) != (this.k & (-128000))) {
                            r4 = 0;
                            j3 = -9223372036854775807L;
                            i5 = 1;
                        } else if (nfd.a(m4) == -1) {
                            r4 = 0;
                            i5 = 1;
                            j3 = -9223372036854775807L;
                        } else {
                            di7Var.a(m4);
                            long j22 = this.n;
                            j3 = -9223372036854775807L;
                            if (j22 == -9223372036854775807L) {
                                j22 = this.s.f(cb3Var4.d);
                                this.n = j22;
                                long j23 = this.b;
                                if (j23 != -9223372036854775807L) {
                                    j22 = (j23 - this.s.f(j5)) + this.n;
                                    this.n = j22;
                                }
                            }
                            int i23 = di7Var.c;
                            this.r = i23;
                            long j24 = cb3Var4.d + i23;
                            this.q = j24;
                            ez9 ez9Var5 = this.s;
                            if (ez9Var5 instanceof mp5) {
                                lp5 lp5Var = ((mp5) ez9Var5).d;
                                long j25 = (((this.o + di7Var.g) * j) / di7Var.d) + j22;
                                ed edVar = lp5Var.b;
                                int i24 = edVar.b;
                                if (i24 == 0 || j25 - edVar.h0(i24 - 1) >= 100000) {
                                    lp5Var.i(j25, j24);
                                }
                                if (this.u) {
                                    long j26 = this.v;
                                    ed edVar2 = lp5Var.b;
                                    int i25 = edVar2.b;
                                    if (i25 != 0 && j26 - edVar2.h0(i25 - 1) < 100000) {
                                        this.u = false;
                                        this.j = this.i;
                                    }
                                }
                            }
                            z = true;
                        }
                        cb3Var4.l(i5, r4);
                        this.k = r4;
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                    z = true;
                    j3 = -9223372036854775807L;
                    f = this.j.f(f84Var, this.r, z);
                    if (f != -1) {
                        int i26 = this.r - f;
                        this.r = i26;
                        if (i26 <= 0) {
                            this.j.a(this.n + ((this.o * j) / di7Var.d), 1, di7Var.c, 0, null);
                            this.o += di7Var.g;
                            this.r = 0;
                            i2 = 0;
                            i = -1;
                            if (i2 == i) {
                            }
                            return i2;
                        }
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                    i = -1;
                    i2 = -1;
                    if (i2 == i) {
                    }
                    return i2;
                }
            }
        }
        i4 = 0;
        if (this.r != 0) {
        }
        f = this.j.f(f84Var, this.r, z);
        if (f != -1) {
        }
        i = -1;
        i2 = -1;
        if (i2 == i) {
        }
        return i2;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        return j((cb3) f84Var, true);
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        ez9 ez9Var = this.s;
        if (ez9Var instanceof mp5) {
            ed edVar = ((mp5) ez9Var).d.b;
            int i = edVar.b;
            if (i == 0 || j2 - edVar.h0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.h = g84Var;
        x1c e0 = g84Var.e0(0, 1);
        this.i = e0;
        this.j = e0;
        this.h.D();
    }

    public final kt2 g(cb3 cb3Var) {
        ey7 ey7Var = this.c;
        cb3Var.d(ey7Var.a, 0, 4, false);
        ey7Var.N(0);
        int m = ey7Var.m();
        di7 di7Var = this.d;
        di7Var.a(m);
        return new kt2(cb3Var.c, cb3Var.d, di7Var.f, di7Var.c, (this.a & 2) != 0, true, -9223372036854775807L);
    }

    public final void h() {
        Object obj = this.s;
        if ((obj instanceof kt2) && ((jt2) obj).c()) {
            long j = this.q;
            if (j == -1 || j == this.s.a()) {
                return;
            }
            kt2 kt2Var = (kt2) this.s;
            this.s = new kt2(this.q, kt2Var.b, kt2Var.e, kt2Var.c, kt2Var.g, false, kt2Var.i);
            g84 g84Var = this.h;
            g84Var.getClass();
            g84Var.m0(this.s);
            x1c x1cVar = this.i;
            x1cVar.getClass();
            x1cVar.d(this.s.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.e() > (r2 - 4)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(cb3 cb3Var) {
        ez9 ez9Var = this.s;
        if (ez9Var != null) {
            long a = ez9Var.a();
            if (a != -1) {
            }
        }
        try {
            return !cb3Var.d(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean j(cb3 cb3Var, boolean z) {
        int i;
        int i2;
        int a;
        cb3Var.f = 0;
        if (cb3Var.d == 0) {
            int i3 = this.a;
            vf7 c0 = this.f.c0(cb3Var, !((i3 & 8) == 0) ? w : (i3 & 16) != 0 ? vl5.c : null, 131072);
            this.l = c0;
            if (c0 != null) {
                this.e.b(c0);
            }
            i = (int) cb3Var.e();
            if (!z) {
                cb3Var.l(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!i(cb3Var)) {
                ey7 ey7Var = this.c;
                ey7Var.N(0);
                int m = ey7Var.m();
                if ((i2 == 0 || ((-128000) & m) == (i2 & (-128000))) && (a = nfd.a(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m);
                        i2 = m;
                    }
                    cb3Var.a(a - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        cb3Var.f = 0;
                        cb3Var.a(i + i6, false);
                    } else {
                        cb3Var.l(1, false);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z) {
            cb3Var.l(i + i5, false);
        } else {
            cb3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }

    public rh7(int i) {
        this(i, -9223372036854775807L);
    }
}
