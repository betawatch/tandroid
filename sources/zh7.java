// default package

import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zh7 implements e84 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public g84 F;
    public yh7[] G;
    public long[][] H;
    public int I;
    public final peb a;
    public final int b;
    public final boolean c;
    public final ey7 d;
    public final ey7 e;
    public final ey7 f;
    public final ey7 g;
    public final ArrayDeque h;
    public final gz9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public j99 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public ey7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public zh7(peb pebVar, int i) {
        this.a = pebVar;
        this.b = i;
        this.c = (i & 256) != 0;
        no5 no5Var = po5.b;
        this.m = j99.e;
        this.n = (i & 4) != 0 ? (byte) 3 : (byte) 0;
        this.i = new gz9();
        this.j = new ArrayList();
        this.g = new ey7(16);
        this.h = new ArrayDeque();
        this.d = new ey7(rfd.a);
        this.e = new ey7(6);
        this.f = new ey7();
        this.s = -1;
        this.F = g84.v;
        this.G = new yh7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06e8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00f0, code lost:
    
        if ((r1 instanceof rj1) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0770, code lost:
    
        throw hy7.d("Atom size less than header length (unsupported).");
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
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
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
        ey7 ey7Var;
        char c2;
        char c3;
        yh7[] yh7VarArr;
        int i4;
        boolean z;
        tf7 tf7Var;
        boolean z2;
        boolean z3;
        vh7 vh7Var;
        if (!this.c || !this.B) {
            while (true) {
                byte b = this.n;
                ArrayDeque arrayDeque = this.h;
                ey7 ey7Var2 = this.f;
                int i5 = 0;
                boolean z4 = true;
                if (b != 0) {
                    int i6 = 4;
                    if (b == 1) {
                        long j5 = this.p - this.q;
                        long position2 = f84Var.getPosition() + j5;
                        ey7 ey7Var3 = this.r;
                        if (ey7Var3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 >= 262144) {
                                v11Var.a = f84Var.getPosition() + j5;
                                z2 = true;
                                g(position2);
                                i3 = 1;
                                if (this.y) {
                                    z3 = z2;
                                } else {
                                    this.A = true;
                                    v11Var.a = this.z;
                                    this.y = false;
                                    z3 = true;
                                }
                                if (z3 && this.n != 2) {
                                    break;
                                }
                            } else {
                                f84Var.n((int) j5);
                            }
                        } else {
                            f84Var.readFully(ey7Var3.a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                ey7Var3.N(8);
                                int i7 = ey7Var3.m() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    ey7Var3.O(4);
                                    while (true) {
                                        if (ey7Var3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = ey7Var3.m() != 1903435808 ? 0 : 1;
                                        if (i7 != 0) {
                                            break;
                                        }
                                    }
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((vh7) arrayDeque.peek()).f.add(new wh7(this.o, ey7Var3));
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
                            long position3 = f84Var.getPosition();
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
                                    yh7[] yh7VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= yh7VarArr2.length) {
                                        break;
                                    }
                                    yh7 yh7Var = yh7VarArr2[i9];
                                    int i13 = yh7Var.g;
                                    y1c y1cVar = yh7Var.b;
                                    boolean z7 = z5;
                                    if (i13 == y1cVar.b) {
                                        z5 = z7;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j11 = y1cVar.f[i13];
                                        if (yh7Var.e) {
                                            j6 = Math.min(j6, j11);
                                        } else if (yh7Var.f && j11 < j7) {
                                            i10 = i9;
                                            j7 = j11;
                                        }
                                        long j12 = y1cVar.c[i13];
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
                            yh7 yh7Var2 = this.G[i8];
                            x1c x1cVar = yh7Var2.c;
                            y1c y1cVar2 = yh7Var2.b;
                            p1c p1cVar = yh7Var2.a;
                            int i16 = yh7Var2.g;
                            long[] jArr2 = y1cVar2.c;
                            int[] iArr = y1cVar2.d;
                            long j15 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            g6c g6cVar = yh7Var2.d;
                            long j16 = (j15 - j) + this.t;
                            if (j16 < 0 || j16 >= 262144) {
                                v11Var.a = j15;
                                return 1;
                            }
                            boolean z9 = p1cVar.h;
                            int i18 = p1cVar.k;
                            ko4 ko4Var = p1cVar.g;
                            if (z9) {
                                j16 += 8;
                                i17 -= 8;
                            }
                            f84Var.n((int) j16);
                            String str = ko4Var.t;
                            String str2 = ko4Var.t;
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
                                ko4 ko4Var2 = yh7Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        pk7.b(i17, ey7Var2);
                                        x1cVar.e(7, ey7Var2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else {
                                    if (ko4Var2 != null) {
                                        if (Objects.equals(str2, "audio/mpeg")) {
                                            ey7Var2.K(4);
                                            f84Var.b(0, 4, ey7Var2.a);
                                            f84Var.h();
                                            di7 di7Var = new di7();
                                            if (di7Var.a(ey7Var2.m()) && !Objects.equals(ko4Var2.t, di7Var.b)) {
                                                jo4 a = ko4Var2.a();
                                                String str3 = di7Var.b;
                                                str3.getClass();
                                                a.s = eg7.n(str3);
                                                ko4Var2 = new ko4(a);
                                            }
                                            x1cVar.g(ko4Var2);
                                            yh7Var2.h = null;
                                        } else if (s3d.e(str2)) {
                                            x1cVar.g(s3d.h(f84Var, i17, ko4Var2));
                                            yh7Var2.h = null;
                                        }
                                    }
                                    if (g6cVar != null) {
                                        g6cVar.c(f84Var);
                                    }
                                }
                                while (true) {
                                    int i20 = this.u;
                                    if (i20 >= i17) {
                                        break;
                                    }
                                    int f = x1cVar.f(f84Var, i17 - i20, false);
                                    this.t += f;
                                    this.u += f;
                                    this.v -= f;
                                }
                            } else {
                                ey7 ey7Var4 = this.e;
                                byte[] bArr = ey7Var4.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i21 = 4 - i18;
                                i17 += i21;
                                while (this.u < i17) {
                                    int i22 = this.v;
                                    if (i22 == 0) {
                                        if (this.w || rfd.e(ko4Var) + i18 > iArr[i16] - this.t) {
                                            i = i18;
                                            i2 = 0;
                                        } else {
                                            i2 = rfd.e(ko4Var);
                                            i = i18 + i2;
                                        }
                                        f84Var.readFully(bArr, i21, i);
                                        this.t += i;
                                        ey7Var4.N(0);
                                        int m = ey7Var4.m();
                                        if (m < 0) {
                                            throw hy7.a("Invalid NAL length", null);
                                        }
                                        this.v = m - i2;
                                        ey7 ey7Var5 = this.d;
                                        ey7Var5.N(0);
                                        x1cVar.e(4, ey7Var5);
                                        this.u += 4;
                                        if (i2 > 0) {
                                            x1cVar.e(i2, ey7Var4);
                                            this.u += i2;
                                            if (rfd.d(bArr, i2, ko4Var)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int f2 = x1cVar.f(f84Var, i22, false);
                                        this.t += f2;
                                        this.u += f2;
                                        this.v -= f2;
                                    }
                                }
                            }
                            int i23 = i17;
                            long j17 = y1cVar2.f[i16];
                            int i24 = y1cVar2.g[i16];
                            if (!this.w) {
                                i24 |= 67108864;
                            }
                            int i25 = i24;
                            if (g6cVar != null) {
                                g6cVar.b(x1cVar, j17, i25, i23, 0, null);
                                if (i16 + 1 == y1cVar2.b) {
                                    g6cVar.a(x1cVar, null);
                                }
                            } else {
                                x1cVar.a(j17, i25, i23, 0, null);
                            }
                            yh7Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (b != 3) {
                            if (b != 4) {
                                grb.g();
                                return 0;
                            }
                            int i26 = this.C;
                            ArrayList arrayList = this.k;
                            y1c y1cVar3 = (y1c) arrayList.get(i26);
                            int i27 = this.D;
                            int i28 = y1cVar3.b;
                            long[] jArr3 = y1cVar3.f;
                            ArrayList arrayList2 = this.l;
                            if (i27 < i28) {
                                long j18 = y1cVar3.c[i27];
                                if (f84Var.getPosition() != j18) {
                                    v11Var.a = j18;
                                    return 1;
                                }
                                int i29 = y1cVar3.d[this.D];
                                ey7Var2.K(i29);
                                f84Var.readFully(ey7Var2.a, 0, i29);
                                String y = ey7Var2.y(Math.min(ey7Var2.H(), ey7Var2.a()), StandardCharsets.UTF_8);
                                long i0 = gcc.i0(jArr3[this.D]);
                                int i30 = this.D + 1;
                                arrayList2.add(new tj1(i0, i30 < y1cVar3.b ? gcc.i0(jArr3[i30]) : gcc.i0(y1cVar3.i), false, new xy5(null, y)));
                                this.D++;
                                return 0;
                            }
                            yh7[] yh7VarArr3 = this.G;
                            int length = yh7VarArr3.length;
                            int i31 = 0;
                            while (i31 < length) {
                                yh7 yh7Var3 = yh7VarArr3[i31];
                                if (yh7Var3.a.l == y1cVar3.a.a) {
                                    ko4 ko4Var3 = yh7Var3.h;
                                    ko4Var3.getClass();
                                    vf7 vf7Var = ko4Var3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (vf7Var != null) {
                                        z = z4;
                                        mo5 p = po5.p();
                                        tf7[] tf7VarArr = vf7Var.a;
                                        int length2 = tf7VarArr.length;
                                        while (i5 < length2) {
                                            tf7 tf7Var2 = tf7VarArr[i5];
                                            yh7[] yh7VarArr4 = yh7VarArr3;
                                            int i32 = length;
                                            if (tf7.class.isAssignableFrom(tf7Var2.getClass())) {
                                                tf7Var = (tf7) tf7.class.cast(tf7Var2);
                                            }
                                            tf7Var = null;
                                            if (tf7Var != null) {
                                                p.c(tf7Var);
                                            }
                                            i5++;
                                            yh7VarArr3 = yh7VarArr4;
                                            length = i32;
                                        }
                                        yh7VarArr = yh7VarArr3;
                                        i4 = length;
                                        arrayList3.addAll(p.f());
                                    } else {
                                        yh7VarArr = yh7VarArr3;
                                        i4 = length;
                                        z = z4;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    jo4 a2 = ko4Var3.a();
                                    a2.l = new vf7(arrayList3);
                                    ko4 ko4Var4 = new ko4(a2);
                                    String str4 = ko4Var4.t;
                                    if (Objects.equals(str4, "audio/mpeg") || s3d.e(str4)) {
                                        yh7Var3.h = ko4Var4;
                                    } else {
                                        yh7Var3.c.g(ko4Var4);
                                        yh7Var3.h = null;
                                    }
                                } else {
                                    yh7VarArr = yh7VarArr3;
                                    i4 = length;
                                    z = z4;
                                }
                                i31++;
                                yh7VarArr3 = yh7VarArr;
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
                        gz9 gz9Var = this.i;
                        ArrayList arrayList4 = gz9Var.a;
                        byte b2 = gz9Var.b;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                short s = 2817;
                                short s2 = 2820;
                                if (b2 == 2) {
                                    long length3 = f84Var.getLength();
                                    int i33 = gz9Var.c - 20;
                                    ey7 ey7Var6 = new ey7(i33);
                                    f84Var.readFully(ey7Var6.a, 0, i33);
                                    int i34 = 0;
                                    while (i34 < i33 / 12) {
                                        ey7Var6.O(2);
                                        short q = ey7Var6.q();
                                        if (q == 2192 || q == 2816 || q == s || q == 2819 || q == s2) {
                                            ey7Var = ey7Var6;
                                            arrayList4.add(new fz9((length3 - gz9Var.c) - ey7Var6.o(), ey7Var.o()));
                                        } else {
                                            ey7Var6.O(8);
                                            ey7Var = ey7Var6;
                                        }
                                        i34++;
                                        ey7Var6 = ey7Var;
                                        s = 2817;
                                        s2 = 2820;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        v11Var.a = 0L;
                                        j4 = 0;
                                    } else {
                                        gz9Var.b = (byte) 3;
                                        j4 = ((fz9) arrayList4.get(0)).a;
                                        v11Var.a = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (b2 != 3) {
                                        grb.g();
                                        return 0;
                                    }
                                    long position4 = f84Var.getPosition();
                                    int length4 = (int) ((f84Var.getLength() - f84Var.getPosition()) - gz9Var.c);
                                    ey7 ey7Var7 = new ey7(length4);
                                    f84Var.readFully(ey7Var7.a, 0, length4);
                                    int i35 = 0;
                                    while (i35 < arrayList4.size()) {
                                        fz9 fz9Var = (fz9) arrayList4.get(i35);
                                        ey7Var7.N((int) (fz9Var.a - position4));
                                        ey7Var7.O(i6);
                                        int o = ey7Var7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String y2 = ey7Var7.y(o, charset);
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
                                                throw hy7.a("Invalid SEF name", null);
                                        }
                                        int i36 = fz9Var.b - (o + 8);
                                        if (c3 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List d0 = gz9.e.d0(ey7Var7.y(i36, charset));
                                            for (int i37 = 0; i37 < d0.size(); i37++) {
                                                List d02 = gz9.d.d0((CharSequence) d0.get(i37));
                                                if (d02.size() != 3) {
                                                    throw hy7.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new mna(Long.parseLong((String) d02.get(0)), 1 << (Integer.parseInt((String) d02.get(2)) - 1), Long.parseLong((String) d02.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw hy7.a(null, e);
                                                }
                                            }
                                            this.j.add(new nna(arrayList5));
                                        } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                            grb.g();
                                            return 0;
                                        }
                                        i35++;
                                        i6 = 4;
                                    }
                                    v11Var.a = 0L;
                                    j3 = 0;
                                    i3 = 1;
                                    j2 = 0;
                                }
                            } else {
                                ey7 ey7Var8 = new ey7(8);
                                f84Var.readFully(ey7Var8.a, 0, 8);
                                gz9Var.c = ey7Var8.o() + 8;
                                if (ey7Var8.m() != 1397048916) {
                                    v11Var.a = 0L;
                                    position = 0;
                                } else {
                                    position = f84Var.getPosition() - (gz9Var.c - 12);
                                    v11Var.a = position;
                                    gz9Var.b = (byte) 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i3 = 1;
                        } else {
                            long length5 = f84Var.getLength();
                            long j19 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            v11Var.a = j19;
                            i3 = 1;
                            gz9Var.b = (byte) 1;
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
                    ey7 ey7Var9 = this.g;
                    if (i38 == 0) {
                        if (!f84Var.c(ey7Var9.a, 0, 8, true)) {
                            break;
                        }
                        this.q = 8;
                        ey7Var9.N(0);
                        this.p = ey7Var9.C();
                        this.o = ey7Var9.m();
                    }
                    long j20 = this.p;
                    if (j20 == 1) {
                        f84Var.readFully(ey7Var9.a, 8, 8);
                        this.q += 8;
                        this.p = ey7Var9.G();
                    } else if (j20 == 0) {
                        long length6 = f84Var.getLength();
                        if (length6 == -1 && (vh7Var = (vh7) arrayDeque.peek()) != null) {
                            length6 = vh7Var.e;
                        }
                        if (length6 != -1) {
                            this.p = (length6 - f84Var.getPosition()) + this.q;
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
                        long position5 = f84Var.getPosition();
                        long j23 = this.p;
                        long j24 = this.q;
                        long j25 = (position5 + j23) - j24;
                        if (j23 != j24 && this.o == 1835365473) {
                            ey7Var2.K(8);
                            f84Var.b(0, 8, ey7Var2.a);
                            zy0.a(ey7Var2);
                            f84Var.n(ey7Var2.b);
                            f84Var.h();
                        }
                        arrayDeque.push(new vh7(this.o, j25));
                        if (this.p == this.q) {
                            g(j25);
                        } else {
                            this.n = (byte) 0;
                            this.q = 0;
                        }
                    } else if (i40 == 1835296868 || i40 == 1836476516 || i40 == 1751411826 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1937011571 || i40 == 1668576371 || i40 == 1701606260 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1953196132 || i40 == 1718909296 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124 || i40 == 1667785072) {
                        yve.p(i39 == 8);
                        yve.p(this.p <= 2147483647L);
                        ey7 ey7Var10 = new ey7((int) this.p);
                        System.arraycopy(ey7Var9.a, 0, ey7Var10.a, 0, 8);
                        this.r = ey7Var10;
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

    @Override // e84
    public final boolean c(f84 f84Var) {
        j99 j99Var;
        una a = qhd.a(f84Var, false);
        if (a != null) {
            j99Var = po5.u(a);
        } else {
            no5 no5Var = po5.b;
            j99Var = j99.e;
        }
        this.m = j99Var;
        return a == null;
    }

    @Override // e84
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
                gz9 gz9Var = this.i;
                gz9Var.a.clear();
                gz9Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (yh7 yh7Var : this.G) {
            y1c y1cVar = yh7Var.b;
            int a = y1cVar.a(j2);
            if (a == -1) {
                a = y1cVar.b(j2);
            }
            yh7Var.g = a;
            g6c g6cVar = yh7Var.d;
            if (g6cVar != null) {
                g6cVar.b = false;
                g6cVar.c = 0;
            }
        }
    }

    @Override // e84
    public final List e() {
        return this.m;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        if ((this.b & 16) == 0) {
            g84Var = new vh4(g84Var, this.a);
        }
        this.F = g84Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (((xl6) r3).a.equals("auxiliary.tracks.interleaved") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0122, code lost:
    
        if (((xl6) r14).a.equals("auxiliary.tracks.offset") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (((xl6) r12).a.equals("auxiliary.tracks.map") == false) goto L35;
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
        vf7 vf7Var;
        ArrayDeque arrayDeque;
        boolean z;
        ArrayList arrayList2;
        vf7 vf7Var2;
        int i2;
        boolean z2;
        long[][] jArr;
        String str;
        vf7 vf7Var3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        yh7 yh7Var;
        long j2;
        int i4;
        vf7 vf7Var4;
        ko4 ko4Var;
        int i5;
        int i6;
        yh7 yh7Var2;
        int size;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList5;
        tf7 tf7Var;
        tf7 tf7Var2;
        tf7 tf7Var3;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((vh7) arrayDeque2.peek()).e != j) {
                break;
            }
            vh7 vh7Var = (vh7) arrayDeque2.pop();
            if (vh7Var.b == 1836019574) {
                vh7 u = vh7Var.u(1835365473);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = this.k;
                boolean z3 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (u != null) {
                    vf7Var = zy0.f(u);
                    if (this.A) {
                        vf7Var.getClass();
                        tf7[] tf7VarArr = vf7Var.a;
                        int length = tf7VarArr.length;
                        int i13 = 0;
                        while (true) {
                            i = 0;
                            if (i13 >= length) {
                                tf7Var2 = null;
                                break;
                            }
                            tf7 tf7Var4 = tf7VarArr[i13];
                            if (xl6.class.isAssignableFrom(tf7Var4.getClass())) {
                                tf7Var2 = (tf7) xl6.class.cast(tf7Var4);
                            }
                            tf7Var2 = null;
                            if (tf7Var2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        xl6 xl6Var = (xl6) tf7Var2;
                        if (xl6Var != null && xl6Var.b[0] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = tf7VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                tf7Var3 = null;
                                break;
                            }
                            tf7 tf7Var5 = tf7VarArr[i14];
                            if (xl6.class.isAssignableFrom(tf7Var5.getClass())) {
                                tf7Var3 = (tf7) xl6.class.cast(tf7Var5);
                            }
                            tf7Var3 = null;
                            if (tf7Var3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        xl6 xl6Var2 = (xl6) tf7Var3;
                        xl6Var2.getClass();
                        ArrayList d = xl6Var2.d();
                        arrayList6 = new ArrayList(d.size());
                        int i15 = 0;
                        while (i15 < d.size()) {
                            int intValue = ((Integer) d.get(i15)).intValue();
                            i15 = qd4.g(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1, i15, 1, arrayList6);
                        }
                    } else {
                        i = 0;
                        if (vf7Var != null && (i12 & 64) != 0) {
                            tf7[] tf7VarArr2 = vf7Var.a;
                            int length3 = tf7VarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    tf7Var = null;
                                    break;
                                }
                                tf7 tf7Var6 = tf7VarArr2[i16];
                                if (xl6.class.isAssignableFrom(tf7Var6.getClass())) {
                                    tf7Var = (tf7) xl6.class.cast(tf7Var6);
                                }
                                tf7Var = null;
                                if (tf7Var != null) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            xl6 xl6Var3 = (xl6) tf7Var;
                            if (xl6Var3 != null) {
                                long G = new ey7(xl6Var3.b).G();
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
                    vf7Var = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z4 = this.I == 1 ? 1 : i;
                du4 du4Var = new du4();
                wh7 v = vh7Var.v(1969517665);
                if (v != null) {
                    vf7Var2 = zy0.k(v, (i12 & 512) != 0 ? 1 : i);
                    du4Var.b(vf7Var2);
                } else {
                    vf7Var2 = null;
                }
                wh7 v2 = vh7Var.v(1836476516);
                v2.getClass();
                tf7[] tf7VarArr3 = new tf7[1];
                tf7VarArr3[i] = zy0.g(v2.e);
                vf7 vf7Var5 = new vf7(tf7VarArr3);
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
                ArrayList j4 = zy0.j(vh7Var, du4Var, -9223372036854775807L, null, z2, z4, new dr4(this, (byte) 1), this.c);
                if (this.A) {
                    boolean z5 = arrayList.size() == j4.size() ? 1 : i;
                    Locale locale = Locale.US;
                    yve.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + j4.size() + ")", z5);
                }
                ArrayList arrayList10 = new ArrayList();
                int size2 = j4.size();
                int i18 = i;
                while (i18 < size2) {
                    Object obj = j4.get(i18);
                    i18++;
                    y1c y1cVar = (y1c) obj;
                    int i19 = y1cVar.a.l;
                    if (i19 != -1 && !arrayList10.contains(Integer.valueOf(i19))) {
                        arrayList10.add(Integer.valueOf(y1cVar.a.l));
                    }
                }
                arrayList9.clear();
                int size3 = j4.size();
                int i20 = i;
                while (i20 < size3) {
                    Object obj2 = j4.get(i20);
                    i20++;
                    y1c y1cVar2 = (y1c) obj2;
                    if (arrayList10.contains(Integer.valueOf(y1cVar2.a.a))) {
                        arrayList5 = arrayList9;
                        arrayList5.add(y1cVar2);
                    } else {
                        arrayList5 = arrayList9;
                    }
                    arrayList9 = arrayList5;
                }
                arrayList2 = arrayList9;
                String a = ute.a(j4);
                int i21 = -1;
                int i22 = i;
                int i23 = i22;
                long j5 = -9223372036854775807L;
                while (i22 < j4.size()) {
                    y1c y1cVar3 = (y1c) j4.get(i22);
                    vf7 vf7Var6 = vf7Var2;
                    int i24 = y1cVar3.b;
                    long[] jArr2 = y1cVar3.f;
                    ArrayList arrayList11 = j4;
                    p1c p1cVar = y1cVar3.a;
                    if (i24 == 0) {
                        arrayList3 = arrayList8;
                        str = a;
                        vf7Var3 = vf7Var5;
                    } else {
                        str = a;
                        boolean z6 = p1cVar.m;
                        ko4 ko4Var2 = p1cVar.g;
                        vf7Var3 = vf7Var5;
                        int i25 = p1cVar.l;
                        arrayList3 = arrayList8;
                        int i26 = p1cVar.b;
                        if (z6) {
                            ArrayList arrayList12 = arrayList2;
                            int i27 = i23 + 1;
                            x1c e0 = this.F.e0(i23, i26);
                            yh7 yh7Var3 = new yh7(p1cVar, y1cVar3, e0);
                            du4 du4Var2 = du4Var;
                            long j6 = p1cVar.e;
                            if (j6 == -9223372036854775807L) {
                                j6 = y1cVar3.i;
                            }
                            e0.d(j6);
                            long max = Math.max(j5, j6);
                            String str2 = ko4Var2.t;
                            boolean equals = "audio/true-hd".equals(str2);
                            int i28 = y1cVar3.e;
                            int i29 = equals ? i28 << 4 : i28 + 30;
                            jo4 a2 = ko4Var2.a();
                            a2.t = i29;
                            if (i26 == 2) {
                                int i30 = ko4Var2.f;
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
                            int[] iArr = y1cVar3.h;
                            boolean z7 = y1cVar3.j;
                            if (!eg7.m(ko4Var2.t) || jArr2.length <= 0) {
                                i3 = i22;
                                yh7Var = yh7Var3;
                            } else {
                                int min = Math.min(z7 ? y1cVar3.b : iArr.length, 20);
                                yve.p(j6 != -9223372036854775807L ? 1 : i);
                                i3 = i22;
                                yh7Var = yh7Var3;
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
                                        int i36 = y1cVar3.d[i35];
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
                                        lrb lrbVar = new lrb(j2);
                                        i4 = 1;
                                        tf7[] tf7VarArr4 = new tf7[1];
                                        tf7VarArr4[i] = lrbVar;
                                        vf7Var4 = new vf7(tf7VarArr4);
                                    } else {
                                        i4 = 1;
                                        vf7Var4 = null;
                                    }
                                    du4Var = du4Var2;
                                    if (i26 == i4 && (i8 = du4Var.a) != -1 && (i9 = du4Var.b) != -1) {
                                        a2.Q = i8;
                                        a2.R = i9;
                                    }
                                    vf7 vf7Var7 = ko4Var2.m;
                                    ArrayList arrayList13 = this.j;
                                    vf7[] vf7VarArr = new vf7[4];
                                    vf7VarArr[i] = !arrayList13.isEmpty() ? null : new vf7(arrayList13);
                                    vf7VarArr[1] = vf7Var6;
                                    vf7VarArr[2] = vf7Var3;
                                    vf7VarArr[3] = vf7Var4;
                                    tte.f(i26, vf7Var, a2, vf7Var7, vf7VarArr);
                                    a2.r = eg7.n(str);
                                    ko4Var = new ko4(a2);
                                    i5 = (!Objects.equals(str2, "audio/mpeg") || s3d.e(str2)) ? 1 : i;
                                    if (!z && i25 != -1) {
                                        size = arrayList12.size();
                                        i7 = i;
                                        while (i7 < size) {
                                            arrayList2 = arrayList12;
                                            Object obj3 = arrayList2.get(i7);
                                            i7++;
                                            if (((y1c) obj3).a.a == i25) {
                                                i6 = 1;
                                                break;
                                            }
                                            arrayList12 = arrayList2;
                                        }
                                    }
                                    arrayList2 = arrayList12;
                                    i6 = i;
                                    if (i5 == 0 || i6 != 0) {
                                        yh7Var2 = yh7Var;
                                        yh7Var2.h = ko4Var;
                                    } else {
                                        yh7Var2 = yh7Var;
                                        yh7Var2.c.g(ko4Var);
                                    }
                                    if (i26 == 2 && i21 == -1) {
                                        i21 = arrayList3.size();
                                    }
                                    arrayList8 = arrayList3;
                                    arrayList8.add(yh7Var2);
                                    i23 = i27;
                                    j5 = max;
                                    i22 = i3 + 1;
                                    vf7Var2 = vf7Var6;
                                    a = str;
                                    j4 = arrayList11;
                                    vf7Var5 = vf7Var3;
                                    arrayList = arrayList4;
                                }
                            }
                            j2 = -9223372036854775807L;
                            if (j2 == -9223372036854775807L) {
                            }
                            du4Var = du4Var2;
                            if (i26 == i4) {
                                a2.Q = i8;
                                a2.R = i9;
                            }
                            vf7 vf7Var72 = ko4Var2.m;
                            ArrayList arrayList132 = this.j;
                            vf7[] vf7VarArr2 = new vf7[4];
                            vf7VarArr2[i] = !arrayList132.isEmpty() ? null : new vf7(arrayList132);
                            vf7VarArr2[1] = vf7Var6;
                            vf7VarArr2[2] = vf7Var3;
                            vf7VarArr2[3] = vf7Var4;
                            tte.f(i26, vf7Var, a2, vf7Var72, vf7VarArr2);
                            a2.r = eg7.n(str);
                            ko4Var = new ko4(a2);
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
                            yh7Var2 = yh7Var;
                            yh7Var2.h = ko4Var;
                            if (i26 == 2) {
                                i21 = arrayList3.size();
                            }
                            arrayList8 = arrayList3;
                            arrayList8.add(yh7Var2);
                            i23 = i27;
                            j5 = max;
                            i22 = i3 + 1;
                            vf7Var2 = vf7Var6;
                            a = str;
                            j4 = arrayList11;
                            vf7Var5 = vf7Var3;
                            arrayList = arrayList4;
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i22;
                    arrayList8 = arrayList3;
                    i22 = i3 + 1;
                    vf7Var2 = vf7Var6;
                    a = str;
                    j4 = arrayList11;
                    vf7Var5 = vf7Var3;
                    arrayList = arrayList4;
                }
                int i37 = -1;
                yh7[] yh7VarArr = (yh7[]) arrayList8.toArray(new yh7[i]);
                this.G = yh7VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[yh7VarArr.length][];
                    int[] iArr2 = new int[yh7VarArr.length];
                    long[] jArr3 = new long[yh7VarArr.length];
                    boolean[] zArr = new boolean[yh7VarArr.length];
                    for (int i38 = 0; i38 < yh7VarArr.length; i38++) {
                        jArr[i38] = new long[yh7VarArr[i38].b.b];
                        jArr3[i38] = yh7VarArr[i38].b.f[0];
                    }
                    int i39 = 0;
                    while (i39 < yh7VarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i40 = i37;
                        for (int i41 = 0; i41 < yh7VarArr.length; i41++) {
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
                        y1c y1cVar4 = yh7VarArr[i40].b;
                        yh7[] yh7VarArr2 = yh7VarArr;
                        j3 += y1cVar4.d[i42];
                        int i43 = i42 + 1;
                        iArr2[i40] = i43;
                        if (i43 < jArr4.length) {
                            jArr3[i40] = y1cVar4.f[i43];
                        } else {
                            zArr[i40] = true;
                            i39++;
                        }
                        yh7VarArr = yh7VarArr2;
                        i37 = -1;
                    }
                }
                this.H = jArr;
                this.F.D();
                this.F.m0(new xh7(j5, this.G, i21));
                arrayDeque.clear();
                this.B = true;
                if (!this.y) {
                    this.n = arrayList2.isEmpty() ? (byte) 4 : (byte) 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((vh7) arrayDeque2.peek()).g.add(vh7Var);
            }
        }
        byte b = this.n;
        if (b == 4 || b == 2) {
            return;
        }
        this.n = (byte) 0;
        this.q = 0;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
