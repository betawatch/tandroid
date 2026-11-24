// default package

import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pf7 implements j74 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public l74 F;
    public of7[] G;
    public long[][] H;
    public int I;
    public final sab a;
    public final int b;
    public final boolean c;
    public final xu7 d;
    public final xu7 e;
    public final xu7 f;
    public final xu7 g;
    public final ArrayDeque h;
    public final mv9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public w59 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public xu7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public pf7(sab sabVar, int i) {
        this.a = sabVar;
        this.b = i;
        this.c = (i & 256) != 0;
        km5 km5Var = mm5.b;
        this.m = w59.e;
        this.n = (i & 4) != 0 ? (byte) 3 : (byte) 0;
        this.i = new mv9();
        this.j = new ArrayList();
        this.g = new xu7(16);
        this.h = new ArrayDeque();
        this.d = new xu7(yad.a);
        this.e = new xu7(6);
        this.f = new xu7();
        this.s = -1;
        this.F = l74.v;
        this.G = new of7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06e8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00f0, code lost:
    
        if ((r1 instanceof ij1) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0770, code lost:
    
        throw av7.d("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x04ac, code lost:
    
        if ((r14 & 32) != 0) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x04bd, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x04bb, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x04b9, code lost:
    
        if ((r14 & 128) != 0) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06df  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        long j;
        boolean equals;
        char c;
        int i;
        int i2;
        int i3;
        long j2;
        long j3;
        long position;
        long j4;
        xu7 xu7Var;
        char c2;
        char c3;
        of7[] of7VarArr;
        int i4;
        boolean z;
        jd7 jd7Var;
        boolean z2;
        boolean z3;
        lf7 lf7Var;
        if (!this.c || !this.B) {
            while (true) {
                byte b = this.n;
                ArrayDeque arrayDeque = this.h;
                xu7 xu7Var2 = this.f;
                int i5 = 0;
                boolean z4 = true;
                if (b != 0) {
                    int i6 = 4;
                    if (b == 1) {
                        long j5 = this.p - this.q;
                        long position2 = k74Var.getPosition() + j5;
                        xu7 xu7Var3 = this.r;
                        if (xu7Var3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 >= 262144) {
                                m11Var.a = k74Var.getPosition() + j5;
                                z2 = true;
                                g(position2);
                                i3 = 1;
                                if (this.y) {
                                    z3 = z2;
                                } else {
                                    this.A = true;
                                    m11Var.a = this.z;
                                    this.y = false;
                                    z3 = true;
                                }
                                if (z3 && this.n != 2) {
                                    break;
                                }
                            } else {
                                k74Var.m((int) j5);
                            }
                        } else {
                            k74Var.readFully(xu7Var3.a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                xu7Var3.N(8);
                                int i7 = xu7Var3.m() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    xu7Var3.O(4);
                                    while (true) {
                                        if (xu7Var3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = xu7Var3.m() != 1903435808 ? 0 : 1;
                                        if (i7 != 0) {
                                            break;
                                        }
                                    }
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((lf7) arrayDeque.peek()).f.add(new mf7(this.o, xu7Var3));
                            }
                        }
                        z2 = false;
                        g(position2);
                        i3 = 1;
                        if (this.y) {
                        }
                        if (z3) {
                            break;
                            break;
                        }
                        continue;
                    } else {
                        if (b == 2) {
                            long position3 = k74Var.getPosition();
                            int i8 = this.s;
                            if (i8 == -1) {
                                long j6 = Long.MAX_VALUE;
                                boolean z5 = true;
                                boolean z6 = true;
                                int i9 = 0;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                long j10 = Long.MAX_VALUE;
                                while (true) {
                                    of7[] of7VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= of7VarArr2.length) {
                                        break;
                                    }
                                    of7 of7Var = of7VarArr2[i9];
                                    int i13 = of7Var.g;
                                    xxb xxbVar = of7Var.b;
                                    boolean z7 = z5;
                                    if (i13 == xxbVar.b) {
                                        z5 = z7;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j11 = xxbVar.f[i13];
                                        if (of7Var.e) {
                                            j6 = Math.min(j6, j11);
                                        } else if (of7Var.f && j11 < j7) {
                                            i10 = i9;
                                            j7 = j11;
                                        }
                                        long j12 = xxbVar.c[i13];
                                        long[][] jArr = this.H;
                                        jArr.getClass();
                                        long j13 = jArr[i9][i13];
                                        long j14 = j12 - j;
                                        boolean z8 = j14 < 0 || j14 >= 262144;
                                        if ((z8 || !z6) && (z8 != z6 || j14 >= j10)) {
                                            i12 = i15;
                                        } else {
                                            z6 = z8;
                                            j10 = j14;
                                            j8 = j13;
                                            i12 = i9;
                                        }
                                        if (j13 < j9) {
                                            z5 = z8;
                                            i11 = i9;
                                            j9 = j13;
                                        } else {
                                            z5 = z7;
                                            i11 = i14;
                                        }
                                    }
                                    i9++;
                                    position3 = j;
                                }
                                i8 = (j6 == Long.MAX_VALUE || i10 == -1 || j7 > j6) ? (j9 == Long.MAX_VALUE || !z5 || j8 < j9 + 524288) ? i12 : i11 : i10;
                                this.s = i8;
                                if (i8 == -1) {
                                    return -1;
                                }
                            } else {
                                j = position3;
                            }
                            of7 of7Var2 = this.G[i8];
                            wxb wxbVar = of7Var2.c;
                            xxb xxbVar2 = of7Var2.b;
                            oxb oxbVar = of7Var2.a;
                            int i16 = of7Var2.g;
                            long[] jArr2 = xxbVar2.c;
                            int[] iArr = xxbVar2.d;
                            long j15 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            g2c g2cVar = of7Var2.d;
                            long j16 = (j15 - j) + this.t;
                            if (j16 < 0 || j16 >= 262144) {
                                m11Var.a = j15;
                                return 1;
                            }
                            boolean z9 = oxbVar.h;
                            int i18 = oxbVar.k;
                            fm4 fm4Var = oxbVar.g;
                            if (z9) {
                                j16 += 8;
                                i17 -= 8;
                            }
                            k74Var.m((int) j16);
                            String str = fm4Var.t;
                            String str2 = fm4Var.t;
                            boolean equals2 = Objects.equals(str, "video/avc");
                            int i19 = this.b;
                            if (!equals2) {
                                if (!Objects.equals(str, "video/hevc")) {
                                    equals = Objects.equals(str, "video/apv");
                                }
                            }
                            if (equals) {
                                c = 1;
                            } else {
                                c = 1;
                                this.w = true;
                            }
                            if (i18 == 0) {
                                fm4 fm4Var2 = of7Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        gi7.b(i17, xu7Var2);
                                        wxbVar.e(7, xu7Var2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else {
                                    if (fm4Var2 != null) {
                                        if (Objects.equals(str2, "audio/mpeg")) {
                                            xu7Var2.K(4);
                                            k74Var.b(0, 4, xu7Var2.a);
                                            k74Var.h();
                                            tf7 tf7Var = new tf7();
                                            if (tf7Var.a(xu7Var2.m()) && !Objects.equals(fm4Var2.t, tf7Var.b)) {
                                                em4 a = fm4Var2.a();
                                                String str3 = tf7Var.b;
                                                str3.getClass();
                                                a.s = ud7.n(str3);
                                                fm4Var2 = new fm4(a);
                                            }
                                            wxbVar.g(fm4Var2);
                                            of7Var2.h = null;
                                        } else if (bzc.e(str2)) {
                                            wxbVar.g(bzc.h(k74Var, i17, fm4Var2));
                                            of7Var2.h = null;
                                        }
                                    }
                                    if (g2cVar != null) {
                                        g2cVar.c(k74Var);
                                    }
                                }
                                while (true) {
                                    int i20 = this.u;
                                    if (i20 >= i17) {
                                        break;
                                    }
                                    int f = wxbVar.f(k74Var, i17 - i20, false);
                                    this.t += f;
                                    this.u += f;
                                    this.v -= f;
                                }
                            } else {
                                xu7 xu7Var4 = this.e;
                                byte[] bArr = xu7Var4.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i21 = 4 - i18;
                                i17 += i21;
                                while (this.u < i17) {
                                    int i22 = this.v;
                                    if (i22 == 0) {
                                        if (this.w || yad.e(fm4Var) + i18 > iArr[i16] - this.t) {
                                            i = i18;
                                            i2 = 0;
                                        } else {
                                            i2 = yad.e(fm4Var);
                                            i = i18 + i2;
                                        }
                                        k74Var.readFully(bArr, i21, i);
                                        this.t += i;
                                        xu7Var4.N(0);
                                        int m = xu7Var4.m();
                                        if (m < 0) {
                                            throw av7.a("Invalid NAL length", null);
                                        }
                                        this.v = m - i2;
                                        xu7 xu7Var5 = this.d;
                                        xu7Var5.N(0);
                                        wxbVar.e(4, xu7Var5);
                                        this.u += 4;
                                        if (i2 > 0) {
                                            wxbVar.e(i2, xu7Var4);
                                            this.u += i2;
                                            if (yad.d(bArr, i2, fm4Var)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int f2 = wxbVar.f(k74Var, i22, false);
                                        this.t += f2;
                                        this.u += f2;
                                        this.v -= f2;
                                    }
                                }
                            }
                            int i23 = i17;
                            long j17 = xxbVar2.f[i16];
                            int i24 = xxbVar2.g[i16];
                            if (!this.w) {
                                i24 |= 67108864;
                            }
                            int i25 = i24;
                            if (g2cVar != null) {
                                g2cVar.b(wxbVar, j17, i25, i23, 0, null);
                                if (i16 + 1 == xxbVar2.b) {
                                    g2cVar.a(wxbVar, null);
                                }
                            } else {
                                wxbVar.a(j17, i25, i23, 0, null);
                            }
                            of7Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (b != 3) {
                            if (b != 4) {
                                sdb.a();
                                return 0;
                            }
                            int i26 = this.C;
                            ArrayList arrayList = this.k;
                            xxb xxbVar3 = (xxb) arrayList.get(i26);
                            int i27 = this.D;
                            int i28 = xxbVar3.b;
                            long[] jArr3 = xxbVar3.f;
                            ArrayList arrayList2 = this.l;
                            if (i27 < i28) {
                                long j18 = xxbVar3.c[i27];
                                if (k74Var.getPosition() != j18) {
                                    m11Var.a = j18;
                                    return 1;
                                }
                                int i29 = xxbVar3.d[this.D];
                                xu7Var2.K(i29);
                                k74Var.readFully(xu7Var2.a, 0, i29);
                                String y = xu7Var2.y(Math.min(xu7Var2.H(), xu7Var2.a()), StandardCharsets.UTF_8);
                                long i0 = g8c.i0(jArr3[this.D]);
                                int i30 = this.D + 1;
                                arrayList2.add(new kj1(i0, i30 < xxbVar3.b ? g8c.i0(jArr3[i30]) : g8c.i0(xxbVar3.i), false, new sw5(null, y)));
                                this.D++;
                                return 0;
                            }
                            of7[] of7VarArr3 = this.G;
                            int length = of7VarArr3.length;
                            int i31 = 0;
                            while (i31 < length) {
                                of7 of7Var3 = of7VarArr3[i31];
                                if (of7Var3.a.l == xxbVar3.a.a) {
                                    fm4 fm4Var3 = of7Var3.h;
                                    fm4Var3.getClass();
                                    ld7 ld7Var = fm4Var3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (ld7Var != null) {
                                        z = z4;
                                        jm5 p = mm5.p();
                                        jd7[] jd7VarArr = ld7Var.a;
                                        int length2 = jd7VarArr.length;
                                        while (i5 < length2) {
                                            jd7 jd7Var2 = jd7VarArr[i5];
                                            of7[] of7VarArr4 = of7VarArr3;
                                            int i32 = length;
                                            if (jd7.class.isAssignableFrom(jd7Var2.getClass())) {
                                                jd7Var = (jd7) jd7.class.cast(jd7Var2);
                                            }
                                            jd7Var = null;
                                            if (jd7Var != null) {
                                                p.c(jd7Var);
                                            }
                                            i5++;
                                            of7VarArr3 = of7VarArr4;
                                            length = i32;
                                        }
                                        of7VarArr = of7VarArr3;
                                        i4 = length;
                                        arrayList3.addAll(p.f());
                                    } else {
                                        of7VarArr = of7VarArr3;
                                        i4 = length;
                                        z = z4;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    em4 a2 = fm4Var3.a();
                                    a2.l = new ld7(arrayList3);
                                    fm4 fm4Var4 = new fm4(a2);
                                    String str4 = fm4Var4.t;
                                    if (Objects.equals(str4, "audio/mpeg") || bzc.e(str4)) {
                                        of7Var3.h = fm4Var4;
                                    } else {
                                        of7Var3.c.g(fm4Var4);
                                        of7Var3.h = null;
                                    }
                                } else {
                                    of7VarArr = of7VarArr3;
                                    i4 = length;
                                    z = z4;
                                }
                                i31++;
                                of7VarArr3 = of7VarArr;
                                length = i4;
                                z4 = z;
                                i5 = 0;
                            }
                            this.C++;
                            this.D = 0;
                            arrayList2.clear();
                            if (this.C == arrayList.size()) {
                                this.n = (byte) 2;
                            }
                            return 0;
                        }
                        mv9 mv9Var = this.i;
                        ArrayList arrayList4 = mv9Var.a;
                        byte b2 = mv9Var.b;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                short s = 2817;
                                short s2 = 2820;
                                if (b2 == 2) {
                                    long length3 = k74Var.getLength();
                                    int i33 = mv9Var.c - 20;
                                    xu7 xu7Var6 = new xu7(i33);
                                    k74Var.readFully(xu7Var6.a, 0, i33);
                                    int i34 = 0;
                                    while (i34 < i33 / 12) {
                                        xu7Var6.O(2);
                                        short q = xu7Var6.q();
                                        if (q == 2192 || q == 2816 || q == s || q == 2819 || q == s2) {
                                            xu7Var = xu7Var6;
                                            arrayList4.add(new lv9((length3 - mv9Var.c) - xu7Var6.o(), xu7Var.o()));
                                        } else {
                                            xu7Var6.O(8);
                                            xu7Var = xu7Var6;
                                        }
                                        i34++;
                                        xu7Var6 = xu7Var;
                                        s = 2817;
                                        s2 = 2820;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        m11Var.a = 0L;
                                        j4 = 0;
                                    } else {
                                        mv9Var.b = (byte) 3;
                                        j4 = ((lv9) arrayList4.get(0)).a;
                                        m11Var.a = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (b2 != 3) {
                                        sdb.a();
                                        return 0;
                                    }
                                    long position4 = k74Var.getPosition();
                                    int length4 = (int) ((k74Var.getLength() - k74Var.getPosition()) - mv9Var.c);
                                    xu7 xu7Var7 = new xu7(length4);
                                    k74Var.readFully(xu7Var7.a, 0, length4);
                                    int i35 = 0;
                                    while (i35 < arrayList4.size()) {
                                        lv9 lv9Var = (lv9) arrayList4.get(i35);
                                        xu7Var7.N((int) (lv9Var.a - position4));
                                        xu7Var7.O(i6);
                                        int o = xu7Var7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String y2 = xu7Var7.y(o, charset);
                                        switch (y2.hashCode()) {
                                            case -1711564334:
                                                if (y2.equals("SlowMotion_Data")) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1332107749:
                                                if (y2.equals("Super_SlowMotion_Edit_Data")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1251387154:
                                                if (y2.equals("Super_SlowMotion_Data")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -830665521:
                                                if (y2.equals("Super_SlowMotion_Deflickering_On")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1760745220:
                                                if (y2.equals("Super_SlowMotion_BGM")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        switch (c2) {
                                            case 0:
                                                c3 = 2192;
                                                break;
                                            case 1:
                                                c3 = 2819;
                                                break;
                                            case 2:
                                                c3 = 2816;
                                                break;
                                            case 3:
                                                c3 = 2820;
                                                break;
                                            case 4:
                                                c3 = 2817;
                                                break;
                                            default:
                                                throw av7.a("Invalid SEF name", null);
                                        }
                                        int i36 = lv9Var.b - (o + 8);
                                        if (c3 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List g0 = mv9.e.g0(xu7Var7.y(i36, charset));
                                            for (int i37 = 0; i37 < g0.size(); i37++) {
                                                List g02 = mv9.d.g0((CharSequence) g0.get(i37));
                                                if (g02.size() != 3) {
                                                    throw av7.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new sja(Long.parseLong((String) g02.get(0)), 1 << (Integer.parseInt((String) g02.get(2)) - 1), Long.parseLong((String) g02.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw av7.a(null, e);
                                                }
                                            }
                                            this.j.add(new tja(arrayList5));
                                        } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                            sdb.a();
                                            return 0;
                                        }
                                        i35++;
                                        i6 = 4;
                                    }
                                    m11Var.a = 0L;
                                    j3 = 0;
                                    i3 = 1;
                                    j2 = 0;
                                }
                            } else {
                                xu7 xu7Var8 = new xu7(8);
                                k74Var.readFully(xu7Var8.a, 0, 8);
                                mv9Var.c = xu7Var8.o() + 8;
                                if (xu7Var8.m() != 1397048916) {
                                    m11Var.a = 0L;
                                    position = 0;
                                } else {
                                    position = k74Var.getPosition() - (mv9Var.c - 12);
                                    m11Var.a = position;
                                    mv9Var.b = (byte) 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i3 = 1;
                        } else {
                            long length5 = k74Var.getLength();
                            long j19 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            m11Var.a = j19;
                            i3 = 1;
                            mv9Var.b = (byte) 1;
                            j2 = j19;
                            j3 = 0;
                        }
                        if (j2 == j3) {
                            this.n = (byte) 0;
                            this.q = 0;
                            return i3;
                        }
                    }
                } else {
                    int i38 = this.q;
                    xu7 xu7Var9 = this.g;
                    if (i38 == 0) {
                        if (!k74Var.c(xu7Var9.a, 0, 8, true)) {
                            break;
                        }
                        this.q = 8;
                        xu7Var9.N(0);
                        this.p = xu7Var9.C();
                        this.o = xu7Var9.m();
                    }
                    long j20 = this.p;
                    if (j20 == 1) {
                        k74Var.readFully(xu7Var9.a, 8, 8);
                        this.q += 8;
                        this.p = xu7Var9.G();
                    } else if (j20 == 0) {
                        long length6 = k74Var.getLength();
                        if (length6 == -1 && (lf7Var = (lf7) arrayDeque.peek()) != null) {
                            length6 = lf7Var.e;
                        }
                        if (length6 != -1) {
                            this.p = (length6 - k74Var.getPosition()) + this.q;
                        }
                    }
                    long j21 = this.p;
                    int i39 = this.q;
                    long j22 = i39;
                    if (j21 < j22) {
                        if (this.o != 1718773093 || i39 != 8) {
                            break;
                        }
                        this.p = j22;
                    }
                    int i40 = this.o;
                    if (i40 == 1836019574 || i40 == 1953653099 || i40 == 1835297121 || i40 == 1835626086 || i40 == 1937007212 || i40 == 1701082227 || i40 == 1835365473 || i40 == 1635284069 || i40 == 1953654118) {
                        long position5 = k74Var.getPosition();
                        long j23 = this.p;
                        long j24 = this.q;
                        long j25 = (position5 + j23) - j24;
                        if (j23 != j24 && this.o == 1835365473) {
                            xu7Var2.K(8);
                            k74Var.b(0, 8, xu7Var2.a);
                            ry0.a(xu7Var2);
                            k74Var.m(xu7Var2.b);
                            k74Var.h();
                        }
                        arrayDeque.push(new lf7(this.o, j25));
                        if (this.p == this.q) {
                            g(j25);
                        } else {
                            this.n = (byte) 0;
                            this.q = 0;
                        }
                    } else if (i40 == 1835296868 || i40 == 1836476516 || i40 == 1751411826 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1937011571 || i40 == 1668576371 || i40 == 1701606260 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1953196132 || i40 == 1718909296 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124 || i40 == 1667785072) {
                        gre.p(i39 == 8);
                        gre.p(this.p <= 2147483647L);
                        xu7 xu7Var10 = new xu7((int) this.p);
                        System.arraycopy(xu7Var9.a, 0, xu7Var10.a, 0, 8);
                        this.r = xu7Var10;
                        this.n = (byte) 1;
                    } else {
                        this.r = null;
                        this.n = (byte) 1;
                    }
                }
            }
        }
        return -1;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        w59 w59Var;
        aka a = xcd.a(k74Var, false);
        if (a != null) {
            w59Var = mm5.u(a);
        } else {
            km5 km5Var = mm5.b;
            w59Var = w59.e;
        }
        this.m = w59Var;
        return a == null;
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = (byte) 0;
                this.q = 0;
                return;
            } else {
                mv9 mv9Var = this.i;
                mv9Var.a.clear();
                mv9Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (of7 of7Var : this.G) {
            xxb xxbVar = of7Var.b;
            int a = xxbVar.a(j2);
            if (a == -1) {
                a = xxbVar.b(j2);
            }
            of7Var.g = a;
            g2c g2cVar = of7Var.d;
            if (g2cVar != null) {
                g2cVar.b = false;
                g2cVar.c = 0;
            }
        }
    }

    @Override // j74
    public final List e() {
        return this.m;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        if ((this.b & 16) == 0) {
            l74Var = new xf4(l74Var, this.a);
        }
        this.F = l74Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (((sj6) r3).a.equals("auxiliary.tracks.interleaved") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0122, code lost:
    
        if (((sj6) r14).a.equals("auxiliary.tracks.offset") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (((sj6) r12).a.equals("auxiliary.tracks.map") == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j) {
        int i;
        ArrayList arrayList;
        ld7 ld7Var;
        ArrayDeque arrayDeque;
        boolean z;
        ArrayList arrayList2;
        ld7 ld7Var2;
        int i2;
        boolean z2;
        long[][] jArr;
        String str;
        ld7 ld7Var3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        of7 of7Var;
        long j2;
        int i4;
        ld7 ld7Var4;
        fm4 fm4Var;
        int i5;
        int i6;
        of7 of7Var2;
        int size;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList5;
        jd7 jd7Var;
        jd7 jd7Var2;
        jd7 jd7Var3;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((lf7) arrayDeque2.peek()).e != j) {
                break;
            }
            lf7 lf7Var = (lf7) arrayDeque2.pop();
            if (lf7Var.b == 1836019574) {
                lf7 u = lf7Var.u(1835365473);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = this.k;
                boolean z3 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (u != null) {
                    ld7Var = ry0.f(u);
                    if (this.A) {
                        ld7Var.getClass();
                        jd7[] jd7VarArr = ld7Var.a;
                        int length = jd7VarArr.length;
                        int i13 = 0;
                        while (true) {
                            i = 0;
                            if (i13 >= length) {
                                jd7Var2 = null;
                                break;
                            }
                            jd7 jd7Var4 = jd7VarArr[i13];
                            if (sj6.class.isAssignableFrom(jd7Var4.getClass())) {
                                jd7Var2 = (jd7) sj6.class.cast(jd7Var4);
                            }
                            jd7Var2 = null;
                            if (jd7Var2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        sj6 sj6Var = (sj6) jd7Var2;
                        if (sj6Var != null && sj6Var.b[0] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = jd7VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                jd7Var3 = null;
                                break;
                            }
                            jd7 jd7Var5 = jd7VarArr[i14];
                            if (sj6.class.isAssignableFrom(jd7Var5.getClass())) {
                                jd7Var3 = (jd7) sj6.class.cast(jd7Var5);
                            }
                            jd7Var3 = null;
                            if (jd7Var3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        sj6 sj6Var2 = (sj6) jd7Var3;
                        sj6Var2.getClass();
                        ArrayList d = sj6Var2.d();
                        arrayList6 = new ArrayList(d.size());
                        int i15 = 0;
                        while (i15 < d.size()) {
                            int intValue = ((Integer) d.get(i15)).intValue();
                            i15 = tb4.g(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1, i15, 1, arrayList6);
                        }
                    } else {
                        i = 0;
                        if (ld7Var != null && (i12 & 64) != 0) {
                            jd7[] jd7VarArr2 = ld7Var.a;
                            int length3 = jd7VarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    jd7Var = null;
                                    break;
                                }
                                jd7 jd7Var6 = jd7VarArr2[i16];
                                if (sj6.class.isAssignableFrom(jd7Var6.getClass())) {
                                    jd7Var = (jd7) sj6.class.cast(jd7Var6);
                                }
                                jd7Var = null;
                                if (jd7Var != null) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            sj6 sj6Var3 = (sj6) jd7Var;
                            if (sj6Var3 != null) {
                                long G = new xu7(sj6Var3.b).G();
                                if (G > 0) {
                                    this.z = G;
                                    this.y = true;
                                    arrayDeque = arrayDeque2;
                                    arrayList2 = arrayList7;
                                    z = z3;
                                    arrayDeque.clear();
                                    this.B = true;
                                    if (!this.y && !z) {
                                        this.n = arrayList2.isEmpty() ? (byte) 4 : (byte) 2;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = arrayList6;
                } else {
                    i = 0;
                    arrayList = arrayList6;
                    ld7Var = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z4 = this.I == 1 ? 1 : i;
                zr4 zr4Var = new zr4();
                mf7 v = lf7Var.v(1969517665);
                if (v != null) {
                    ld7Var2 = ry0.k(v, (i12 & 512) != 0 ? 1 : i);
                    zr4Var.b(ld7Var2);
                } else {
                    ld7Var2 = null;
                }
                mf7 v2 = lf7Var.v(1836476516);
                v2.getClass();
                jd7[] jd7VarArr3 = new jd7[1];
                jd7VarArr3[i] = ry0.g(v2.e);
                ld7 ld7Var5 = new ld7(jd7VarArr3);
                if ((i12 & 1) != 0) {
                    i2 = i12;
                    z2 = 1;
                } else {
                    i2 = i12;
                    z2 = i;
                }
                int i17 = i2;
                ArrayList arrayList9 = arrayList7;
                z = z3;
                arrayDeque = arrayDeque2;
                ArrayList j4 = ry0.j(lf7Var, zr4Var, -9223372036854775807L, null, z2, z4, new zo4(this, (byte) 1), this.c);
                if (this.A) {
                    boolean z5 = arrayList.size() == j4.size() ? 1 : i;
                    Locale locale = Locale.US;
                    gre.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + j4.size() + ")", z5);
                }
                ArrayList arrayList10 = new ArrayList();
                int size2 = j4.size();
                int i18 = i;
                while (i18 < size2) {
                    Object obj = j4.get(i18);
                    i18++;
                    xxb xxbVar = (xxb) obj;
                    int i19 = xxbVar.a.l;
                    if (i19 != -1 && !arrayList10.contains(Integer.valueOf(i19))) {
                        arrayList10.add(Integer.valueOf(xxbVar.a.l));
                    }
                }
                arrayList9.clear();
                int size3 = j4.size();
                int i20 = i;
                while (i20 < size3) {
                    Object obj2 = j4.get(i20);
                    i20++;
                    xxb xxbVar2 = (xxb) obj2;
                    if (arrayList10.contains(Integer.valueOf(xxbVar2.a.a))) {
                        arrayList5 = arrayList9;
                        arrayList5.add(xxbVar2);
                    } else {
                        arrayList5 = arrayList9;
                    }
                    arrayList9 = arrayList5;
                }
                arrayList2 = arrayList9;
                String a = cpe.a(j4);
                int i21 = -1;
                int i22 = i;
                int i23 = i22;
                long j5 = -9223372036854775807L;
                while (i22 < j4.size()) {
                    xxb xxbVar3 = (xxb) j4.get(i22);
                    ld7 ld7Var6 = ld7Var2;
                    int i24 = xxbVar3.b;
                    long[] jArr2 = xxbVar3.f;
                    ArrayList arrayList11 = j4;
                    oxb oxbVar = xxbVar3.a;
                    if (i24 == 0) {
                        arrayList3 = arrayList8;
                        str = a;
                        ld7Var3 = ld7Var5;
                    } else {
                        str = a;
                        boolean z6 = oxbVar.m;
                        fm4 fm4Var2 = oxbVar.g;
                        ld7Var3 = ld7Var5;
                        int i25 = oxbVar.l;
                        arrayList3 = arrayList8;
                        int i26 = oxbVar.b;
                        if (z6) {
                            ArrayList arrayList12 = arrayList2;
                            int i27 = i23 + 1;
                            wxb S = this.F.S(i23, i26);
                            of7 of7Var3 = new of7(oxbVar, xxbVar3, S);
                            zr4 zr4Var2 = zr4Var;
                            long j6 = oxbVar.e;
                            if (j6 == -9223372036854775807L) {
                                j6 = xxbVar3.i;
                            }
                            S.d(j6);
                            long max = Math.max(j5, j6);
                            String str2 = fm4Var2.t;
                            boolean equals = "audio/true-hd".equals(str2);
                            int i28 = xxbVar3.e;
                            int i29 = equals ? i28 << 4 : i28 + 30;
                            em4 a2 = fm4Var2.a();
                            a2.t = i29;
                            if (i26 == 2) {
                                int i30 = fm4Var2.f;
                                if ((i17 & 8) != 0) {
                                    i30 |= i21 == -1 ? 1 : 2;
                                }
                                int i31 = i30;
                                if (this.A) {
                                    i11 = i31 | 32768;
                                    arrayList4 = arrayList;
                                    a2.h = ((Integer) arrayList.get(i22)).intValue();
                                } else {
                                    arrayList4 = arrayList;
                                    i11 = i31;
                                }
                                a2.f = i11;
                            } else {
                                arrayList4 = arrayList;
                            }
                            int[] iArr = xxbVar3.h;
                            boolean z7 = xxbVar3.j;
                            if (!ud7.m(fm4Var2.t) || jArr2.length <= 0) {
                                i3 = i22;
                                of7Var = of7Var3;
                            } else {
                                int min = Math.min(z7 ? xxbVar3.b : iArr.length, 20);
                                gre.p(j6 != -9223372036854775807L ? 1 : i);
                                i3 = i22;
                                of7Var = of7Var3;
                                long min2 = Math.min(j6, 10000000L);
                                int i32 = i;
                                int i33 = i32;
                                int i34 = -1;
                                while (i32 < min) {
                                    int i35 = z7 ? i32 : iArr[i32];
                                    long j7 = jArr2[i35];
                                    if (j7 > min2) {
                                        break;
                                    }
                                    if (j7 >= 0) {
                                        i10 = min;
                                        int i36 = xxbVar3.d[i35];
                                        if (i36 > i33) {
                                            i33 = i36;
                                            i34 = i35;
                                        }
                                    } else {
                                        i10 = min;
                                    }
                                    i32++;
                                    min = i10;
                                }
                                if (i34 != -1) {
                                    j2 = jArr2[i34];
                                    if (j2 == -9223372036854775807L) {
                                        lnb lnbVar = new lnb(j2);
                                        i4 = 1;
                                        jd7[] jd7VarArr4 = new jd7[1];
                                        jd7VarArr4[i] = lnbVar;
                                        ld7Var4 = new ld7(jd7VarArr4);
                                    } else {
                                        i4 = 1;
                                        ld7Var4 = null;
                                    }
                                    zr4Var = zr4Var2;
                                    if (i26 == i4 && (i8 = zr4Var.a) != -1 && (i9 = zr4Var.b) != -1) {
                                        a2.Q = i8;
                                        a2.R = i9;
                                    }
                                    ld7 ld7Var7 = fm4Var2.m;
                                    ArrayList arrayList13 = this.j;
                                    ld7[] ld7VarArr = new ld7[4];
                                    ld7VarArr[i] = !arrayList13.isEmpty() ? null : new ld7(arrayList13);
                                    ld7VarArr[1] = ld7Var6;
                                    ld7VarArr[2] = ld7Var3;
                                    ld7VarArr[3] = ld7Var4;
                                    bpe.f(i26, ld7Var, a2, ld7Var7, ld7VarArr);
                                    a2.r = ud7.n(str);
                                    fm4Var = new fm4(a2);
                                    i5 = (!Objects.equals(str2, "audio/mpeg") || bzc.e(str2)) ? 1 : i;
                                    if (!z && i25 != -1) {
                                        size = arrayList12.size();
                                        i7 = i;
                                        while (i7 < size) {
                                            arrayList2 = arrayList12;
                                            Object obj3 = arrayList2.get(i7);
                                            i7++;
                                            if (((xxb) obj3).a.a == i25) {
                                                i6 = 1;
                                                break;
                                            }
                                            arrayList12 = arrayList2;
                                        }
                                    }
                                    arrayList2 = arrayList12;
                                    i6 = i;
                                    if (i5 == 0 || i6 != 0) {
                                        of7Var2 = of7Var;
                                        of7Var2.h = fm4Var;
                                    } else {
                                        of7Var2 = of7Var;
                                        of7Var2.c.g(fm4Var);
                                    }
                                    if (i26 == 2 && i21 == -1) {
                                        i21 = arrayList3.size();
                                    }
                                    arrayList8 = arrayList3;
                                    arrayList8.add(of7Var2);
                                    i23 = i27;
                                    j5 = max;
                                    i22 = i3 + 1;
                                    ld7Var2 = ld7Var6;
                                    a = str;
                                    j4 = arrayList11;
                                    ld7Var5 = ld7Var3;
                                    arrayList = arrayList4;
                                }
                            }
                            j2 = -9223372036854775807L;
                            if (j2 == -9223372036854775807L) {
                            }
                            zr4Var = zr4Var2;
                            if (i26 == i4) {
                                a2.Q = i8;
                                a2.R = i9;
                            }
                            ld7 ld7Var72 = fm4Var2.m;
                            ArrayList arrayList132 = this.j;
                            ld7[] ld7VarArr2 = new ld7[4];
                            ld7VarArr2[i] = !arrayList132.isEmpty() ? null : new ld7(arrayList132);
                            ld7VarArr2[1] = ld7Var6;
                            ld7VarArr2[2] = ld7Var3;
                            ld7VarArr2[3] = ld7Var4;
                            bpe.f(i26, ld7Var, a2, ld7Var72, ld7VarArr2);
                            a2.r = ud7.n(str);
                            fm4Var = new fm4(a2);
                            if (Objects.equals(str2, "audio/mpeg")) {
                            }
                            if (!z) {
                                size = arrayList12.size();
                                i7 = i;
                                while (i7 < size) {
                                }
                            }
                            arrayList2 = arrayList12;
                            i6 = i;
                            if (i5 == 0) {
                            }
                            of7Var2 = of7Var;
                            of7Var2.h = fm4Var;
                            if (i26 == 2) {
                                i21 = arrayList3.size();
                            }
                            arrayList8 = arrayList3;
                            arrayList8.add(of7Var2);
                            i23 = i27;
                            j5 = max;
                            i22 = i3 + 1;
                            ld7Var2 = ld7Var6;
                            a = str;
                            j4 = arrayList11;
                            ld7Var5 = ld7Var3;
                            arrayList = arrayList4;
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i22;
                    arrayList8 = arrayList3;
                    i22 = i3 + 1;
                    ld7Var2 = ld7Var6;
                    a = str;
                    j4 = arrayList11;
                    ld7Var5 = ld7Var3;
                    arrayList = arrayList4;
                }
                int i37 = -1;
                of7[] of7VarArr = (of7[]) arrayList8.toArray(new of7[i]);
                this.G = of7VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[of7VarArr.length][];
                    int[] iArr2 = new int[of7VarArr.length];
                    long[] jArr3 = new long[of7VarArr.length];
                    boolean[] zArr = new boolean[of7VarArr.length];
                    for (int i38 = 0; i38 < of7VarArr.length; i38++) {
                        jArr[i38] = new long[of7VarArr[i38].b.b];
                        jArr3[i38] = of7VarArr[i38].b.f[0];
                    }
                    int i39 = 0;
                    while (i39 < of7VarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i40 = i37;
                        for (int i41 = 0; i41 < of7VarArr.length; i41++) {
                            if (!zArr[i41]) {
                                long j9 = jArr3[i41];
                                if (j9 <= j8) {
                                    i40 = i41;
                                    j8 = j9;
                                }
                            }
                        }
                        int i42 = iArr2[i40];
                        long[] jArr4 = jArr[i40];
                        jArr4[i42] = j3;
                        xxb xxbVar4 = of7VarArr[i40].b;
                        of7[] of7VarArr2 = of7VarArr;
                        j3 += xxbVar4.d[i42];
                        int i43 = i42 + 1;
                        iArr2[i40] = i43;
                        if (i43 < jArr4.length) {
                            jArr3[i40] = xxbVar4.f[i43];
                        } else {
                            zArr[i40] = true;
                            i39++;
                        }
                        of7VarArr = of7VarArr2;
                        i37 = -1;
                    }
                }
                this.H = jArr;
                this.F.z();
                this.F.g0(new nf7(j5, this.G, i21));
                arrayDeque.clear();
                this.B = true;
                if (!this.y) {
                    this.n = arrayList2.isEmpty() ? (byte) 4 : (byte) 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((lf7) arrayDeque2.peek()).g.add(lf7Var);
            }
        }
        byte b = this.n;
        if (b == 4 || b == 2) {
            return;
        }
        this.n = (byte) 0;
        this.q = 0;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
