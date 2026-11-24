// default package

import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sh7 implements s84 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public u84 F;
    public rh7[] G;
    public long[][] H;
    public int I;
    public final tcb a;
    public final int b;
    public final boolean c;
    public final yw7 d;
    public final yw7 e;
    public final yw7 f;
    public final yw7 g;
    public final ArrayDeque h;
    public final px9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public y79 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public yw7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public sh7(tcb tcbVar, int i) {
        this.a = tcbVar;
        this.b = i;
        this.c = (i & 256) != 0;
        ko5 ko5Var = mo5.b;
        this.m = y79.e;
        this.n = (i & 4) != 0 ? (byte) 3 : (byte) 0;
        this.i = new px9();
        this.j = new ArrayList();
        this.g = new yw7(16);
        this.h = new ArrayDeque();
        this.d = new yw7(add.a);
        this.e = new yw7(6);
        this.f = new yw7();
        this.s = -1;
        this.F = u84.v;
        this.G = new rh7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06e8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00f0, code lost:
    
        if ((r1 instanceof qk1) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0770, code lost:
    
        throw bx7.d("Atom size less than header length (unsupported).");
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
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
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
        yw7 yw7Var;
        char c2;
        char c3;
        rh7[] rh7VarArr;
        int i4;
        boolean z;
        lf7 lf7Var;
        boolean z2;
        boolean z3;
        oh7 oh7Var;
        if (!this.c || !this.B) {
            while (true) {
                byte b = this.n;
                ArrayDeque arrayDeque = this.h;
                yw7 yw7Var2 = this.f;
                int i5 = 0;
                boolean z4 = true;
                if (b != 0) {
                    int i6 = 4;
                    if (b == 1) {
                        long j5 = this.p - this.q;
                        long position2 = t84Var.getPosition() + j5;
                        yw7 yw7Var3 = this.r;
                        if (yw7Var3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 >= 262144) {
                                u21Var.a = t84Var.getPosition() + j5;
                                z2 = true;
                                g(position2);
                                i3 = 1;
                                if (this.y) {
                                    z3 = z2;
                                } else {
                                    this.A = true;
                                    u21Var.a = this.z;
                                    this.y = false;
                                    z3 = true;
                                }
                                if (z3 && this.n != 2) {
                                    break;
                                }
                            } else {
                                t84Var.k((int) j5);
                            }
                        } else {
                            t84Var.readFully(yw7Var3.a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                yw7Var3.N(8);
                                int i7 = yw7Var3.m() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    yw7Var3.O(4);
                                    while (true) {
                                        if (yw7Var3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = yw7Var3.m() != 1903435808 ? 0 : 1;
                                        if (i7 != 0) {
                                            break;
                                        }
                                    }
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((oh7) arrayDeque.peek()).f.add(new ph7(this.o, yw7Var3));
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
                            long position3 = t84Var.getPosition();
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
                                    rh7[] rh7VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= rh7VarArr2.length) {
                                        break;
                                    }
                                    rh7 rh7Var = rh7VarArr2[i9];
                                    int i13 = rh7Var.g;
                                    zzb zzbVar = rh7Var.b;
                                    boolean z7 = z5;
                                    if (i13 == zzbVar.b) {
                                        z5 = z7;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j11 = zzbVar.f[i13];
                                        if (rh7Var.e) {
                                            j6 = Math.min(j6, j11);
                                        } else if (rh7Var.f && j11 < j7) {
                                            i10 = i9;
                                            j7 = j11;
                                        }
                                        long j12 = zzbVar.c[i13];
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
                            rh7 rh7Var2 = this.G[i8];
                            yzb yzbVar = rh7Var2.c;
                            zzb zzbVar2 = rh7Var2.b;
                            qzb qzbVar = rh7Var2.a;
                            int i16 = rh7Var2.g;
                            long[] jArr2 = zzbVar2.c;
                            int[] iArr = zzbVar2.d;
                            long j15 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            g4c g4cVar = rh7Var2.d;
                            long j16 = (j15 - j) + this.t;
                            if (j16 < 0 || j16 >= 262144) {
                                u21Var.a = j15;
                                return 1;
                            }
                            boolean z9 = qzbVar.h;
                            int i18 = qzbVar.k;
                            go4 go4Var = qzbVar.g;
                            if (z9) {
                                j16 += 8;
                                i17 -= 8;
                            }
                            t84Var.k((int) j16);
                            String str = go4Var.t;
                            String str2 = go4Var.t;
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
                                go4 go4Var2 = rh7Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        ik7.b(i17, yw7Var2);
                                        yzbVar.e(7, yw7Var2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else {
                                    if (go4Var2 != null) {
                                        if (Objects.equals(str2, "audio/mpeg")) {
                                            yw7Var2.K(4);
                                            t84Var.b(0, 4, yw7Var2.a);
                                            t84Var.i();
                                            wh7 wh7Var = new wh7();
                                            if (wh7Var.a(yw7Var2.m()) && !Objects.equals(go4Var2.t, wh7Var.b)) {
                                                fo4 a = go4Var2.a();
                                                String str3 = wh7Var.b;
                                                str3.getClass();
                                                a.s = wf7.n(str3);
                                                go4Var2 = new go4(a);
                                            }
                                            yzbVar.g(go4Var2);
                                            rh7Var2.h = null;
                                        } else if (c1d.e(str2)) {
                                            yzbVar.g(c1d.h(t84Var, i17, go4Var2));
                                            rh7Var2.h = null;
                                        }
                                    }
                                    if (g4cVar != null) {
                                        g4cVar.c(t84Var);
                                    }
                                }
                                while (true) {
                                    int i20 = this.u;
                                    if (i20 >= i17) {
                                        break;
                                    }
                                    int f = yzbVar.f(t84Var, i17 - i20, false);
                                    this.t += f;
                                    this.u += f;
                                    this.v -= f;
                                }
                            } else {
                                yw7 yw7Var4 = this.e;
                                byte[] bArr = yw7Var4.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i21 = 4 - i18;
                                i17 += i21;
                                while (this.u < i17) {
                                    int i22 = this.v;
                                    if (i22 == 0) {
                                        if (this.w || add.e(go4Var) + i18 > iArr[i16] - this.t) {
                                            i = i18;
                                            i2 = 0;
                                        } else {
                                            i2 = add.e(go4Var);
                                            i = i18 + i2;
                                        }
                                        t84Var.readFully(bArr, i21, i);
                                        this.t += i;
                                        yw7Var4.N(0);
                                        int m = yw7Var4.m();
                                        if (m < 0) {
                                            throw bx7.a("Invalid NAL length", null);
                                        }
                                        this.v = m - i2;
                                        yw7 yw7Var5 = this.d;
                                        yw7Var5.N(0);
                                        yzbVar.e(4, yw7Var5);
                                        this.u += 4;
                                        if (i2 > 0) {
                                            yzbVar.e(i2, yw7Var4);
                                            this.u += i2;
                                            if (add.d(bArr, i2, go4Var)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int f2 = yzbVar.f(t84Var, i22, false);
                                        this.t += f2;
                                        this.u += f2;
                                        this.v -= f2;
                                    }
                                }
                            }
                            int i23 = i17;
                            long j17 = zzbVar2.f[i16];
                            int i24 = zzbVar2.g[i16];
                            if (!this.w) {
                                i24 |= 67108864;
                            }
                            int i25 = i24;
                            if (g4cVar != null) {
                                g4cVar.b(yzbVar, j17, i25, i23, 0, null);
                                if (i16 + 1 == zzbVar2.b) {
                                    g4cVar.a(yzbVar, null);
                                }
                            } else {
                                yzbVar.a(j17, i25, i23, 0, null);
                            }
                            rh7Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (b != 3) {
                            if (b != 4) {
                                rjb.h();
                                return 0;
                            }
                            int i26 = this.C;
                            ArrayList arrayList = this.k;
                            zzb zzbVar3 = (zzb) arrayList.get(i26);
                            int i27 = this.D;
                            int i28 = zzbVar3.b;
                            long[] jArr3 = zzbVar3.f;
                            ArrayList arrayList2 = this.l;
                            if (i27 < i28) {
                                long j18 = zzbVar3.c[i27];
                                if (t84Var.getPosition() != j18) {
                                    u21Var.a = j18;
                                    return 1;
                                }
                                int i29 = zzbVar3.d[this.D];
                                yw7Var2.K(i29);
                                t84Var.readFully(yw7Var2.a, 0, i29);
                                String y = yw7Var2.y(Math.min(yw7Var2.H(), yw7Var2.a()), StandardCharsets.UTF_8);
                                long i0 = hac.i0(jArr3[this.D]);
                                int i30 = this.D + 1;
                                arrayList2.add(new sk1(i0, i30 < zzbVar3.b ? hac.i0(jArr3[i30]) : hac.i0(zzbVar3.i), false, new sy5(null, y)));
                                this.D++;
                                return 0;
                            }
                            rh7[] rh7VarArr3 = this.G;
                            int length = rh7VarArr3.length;
                            int i31 = 0;
                            while (i31 < length) {
                                rh7 rh7Var3 = rh7VarArr3[i31];
                                if (rh7Var3.a.l == zzbVar3.a.a) {
                                    go4 go4Var3 = rh7Var3.h;
                                    go4Var3.getClass();
                                    nf7 nf7Var = go4Var3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (nf7Var != null) {
                                        z = z4;
                                        jo5 p = mo5.p();
                                        lf7[] lf7VarArr = nf7Var.a;
                                        int length2 = lf7VarArr.length;
                                        while (i5 < length2) {
                                            lf7 lf7Var2 = lf7VarArr[i5];
                                            rh7[] rh7VarArr4 = rh7VarArr3;
                                            int i32 = length;
                                            if (lf7.class.isAssignableFrom(lf7Var2.getClass())) {
                                                lf7Var = (lf7) lf7.class.cast(lf7Var2);
                                            }
                                            lf7Var = null;
                                            if (lf7Var != null) {
                                                p.c(lf7Var);
                                            }
                                            i5++;
                                            rh7VarArr3 = rh7VarArr4;
                                            length = i32;
                                        }
                                        rh7VarArr = rh7VarArr3;
                                        i4 = length;
                                        arrayList3.addAll(p.f());
                                    } else {
                                        rh7VarArr = rh7VarArr3;
                                        i4 = length;
                                        z = z4;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    fo4 a2 = go4Var3.a();
                                    a2.l = new nf7(arrayList3);
                                    go4 go4Var4 = new go4(a2);
                                    String str4 = go4Var4.t;
                                    if (Objects.equals(str4, "audio/mpeg") || c1d.e(str4)) {
                                        rh7Var3.h = go4Var4;
                                    } else {
                                        rh7Var3.c.g(go4Var4);
                                        rh7Var3.h = null;
                                    }
                                } else {
                                    rh7VarArr = rh7VarArr3;
                                    i4 = length;
                                    z = z4;
                                }
                                i31++;
                                rh7VarArr3 = rh7VarArr;
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
                        px9 px9Var = this.i;
                        ArrayList arrayList4 = px9Var.a;
                        byte b2 = px9Var.b;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                short s = 2817;
                                short s2 = 2820;
                                if (b2 == 2) {
                                    long length3 = t84Var.getLength();
                                    int i33 = px9Var.c - 20;
                                    yw7 yw7Var6 = new yw7(i33);
                                    t84Var.readFully(yw7Var6.a, 0, i33);
                                    int i34 = 0;
                                    while (i34 < i33 / 12) {
                                        yw7Var6.O(2);
                                        short q = yw7Var6.q();
                                        if (q == 2192 || q == 2816 || q == s || q == 2819 || q == s2) {
                                            yw7Var = yw7Var6;
                                            arrayList4.add(new ox9((length3 - px9Var.c) - yw7Var6.o(), yw7Var.o()));
                                        } else {
                                            yw7Var6.O(8);
                                            yw7Var = yw7Var6;
                                        }
                                        i34++;
                                        yw7Var6 = yw7Var;
                                        s = 2817;
                                        s2 = 2820;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        u21Var.a = 0L;
                                        j4 = 0;
                                    } else {
                                        px9Var.b = (byte) 3;
                                        j4 = ((ox9) arrayList4.get(0)).a;
                                        u21Var.a = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (b2 != 3) {
                                        rjb.h();
                                        return 0;
                                    }
                                    long position4 = t84Var.getPosition();
                                    int length4 = (int) ((t84Var.getLength() - t84Var.getPosition()) - px9Var.c);
                                    yw7 yw7Var7 = new yw7(length4);
                                    t84Var.readFully(yw7Var7.a, 0, length4);
                                    int i35 = 0;
                                    while (i35 < arrayList4.size()) {
                                        ox9 ox9Var = (ox9) arrayList4.get(i35);
                                        yw7Var7.N((int) (ox9Var.a - position4));
                                        yw7Var7.O(i6);
                                        int o = yw7Var7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String y2 = yw7Var7.y(o, charset);
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
                                                throw bx7.a("Invalid SEF name", null);
                                        }
                                        int i36 = ox9Var.b - (o + 8);
                                        if (c3 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List f0 = px9.e.f0(yw7Var7.y(i36, charset));
                                            for (int i37 = 0; i37 < f0.size(); i37++) {
                                                List f02 = px9.d.f0((CharSequence) f0.get(i37));
                                                if (f02.size() != 3) {
                                                    throw bx7.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new tla(Long.parseLong((String) f02.get(0)), 1 << (Integer.parseInt((String) f02.get(2)) - 1), Long.parseLong((String) f02.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw bx7.a(null, e);
                                                }
                                            }
                                            this.j.add(new ula(arrayList5));
                                        } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                            rjb.h();
                                            return 0;
                                        }
                                        i35++;
                                        i6 = 4;
                                    }
                                    u21Var.a = 0L;
                                    j3 = 0;
                                    i3 = 1;
                                    j2 = 0;
                                }
                            } else {
                                yw7 yw7Var8 = new yw7(8);
                                t84Var.readFully(yw7Var8.a, 0, 8);
                                px9Var.c = yw7Var8.o() + 8;
                                if (yw7Var8.m() != 1397048916) {
                                    u21Var.a = 0L;
                                    position = 0;
                                } else {
                                    position = t84Var.getPosition() - (px9Var.c - 12);
                                    u21Var.a = position;
                                    px9Var.b = (byte) 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i3 = 1;
                        } else {
                            long length5 = t84Var.getLength();
                            long j19 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            u21Var.a = j19;
                            i3 = 1;
                            px9Var.b = (byte) 1;
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
                    yw7 yw7Var9 = this.g;
                    if (i38 == 0) {
                        if (!t84Var.c(yw7Var9.a, 0, 8, true)) {
                            break;
                        }
                        this.q = 8;
                        yw7Var9.N(0);
                        this.p = yw7Var9.C();
                        this.o = yw7Var9.m();
                    }
                    long j20 = this.p;
                    if (j20 == 1) {
                        t84Var.readFully(yw7Var9.a, 8, 8);
                        this.q += 8;
                        this.p = yw7Var9.G();
                    } else if (j20 == 0) {
                        long length6 = t84Var.getLength();
                        if (length6 == -1 && (oh7Var = (oh7) arrayDeque.peek()) != null) {
                            length6 = oh7Var.e;
                        }
                        if (length6 != -1) {
                            this.p = (length6 - t84Var.getPosition()) + this.q;
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
                        long position5 = t84Var.getPosition();
                        long j23 = this.p;
                        long j24 = this.q;
                        long j25 = (position5 + j23) - j24;
                        if (j23 != j24 && this.o == 1835365473) {
                            yw7Var2.K(8);
                            t84Var.b(0, 8, yw7Var2.a);
                            yz0.a(yw7Var2);
                            t84Var.k(yw7Var2.b);
                            t84Var.i();
                        }
                        arrayDeque.push(new oh7(this.o, j25));
                        if (this.p == this.q) {
                            g(j25);
                        } else {
                            this.n = (byte) 0;
                            this.q = 0;
                        }
                    } else if (i40 == 1835296868 || i40 == 1836476516 || i40 == 1751411826 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1937011571 || i40 == 1668576371 || i40 == 1701606260 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1953196132 || i40 == 1718909296 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124 || i40 == 1667785072) {
                        jte.p(i39 == 8);
                        jte.p(this.p <= 2147483647L);
                        yw7 yw7Var10 = new yw7((int) this.p);
                        System.arraycopy(yw7Var9.a, 0, yw7Var10.a, 0, 8);
                        this.r = yw7Var10;
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

    @Override // s84
    public final boolean c(t84 t84Var) {
        y79 y79Var;
        bma a = zed.a(t84Var, false);
        if (a != null) {
            y79Var = mo5.u(a);
        } else {
            ko5 ko5Var = mo5.b;
            y79Var = y79.e;
        }
        this.m = y79Var;
        return a == null;
    }

    @Override // s84
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
                px9 px9Var = this.i;
                px9Var.a.clear();
                px9Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (rh7 rh7Var : this.G) {
            zzb zzbVar = rh7Var.b;
            int a = zzbVar.a(j2);
            if (a == -1) {
                a = zzbVar.b(j2);
            }
            rh7Var.g = a;
            g4c g4cVar = rh7Var.d;
            if (g4cVar != null) {
                g4cVar.b = false;
                g4cVar.c = 0;
            }
        }
    }

    @Override // s84
    public final List e() {
        return this.m;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        if ((this.b & 16) == 0) {
            u84Var = new yh4(u84Var, this.a);
        }
        this.F = u84Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (((vl6) r3).a.equals("auxiliary.tracks.interleaved") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0122, code lost:
    
        if (((vl6) r14).a.equals("auxiliary.tracks.offset") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (((vl6) r12).a.equals("auxiliary.tracks.map") == false) goto L35;
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
        nf7 nf7Var;
        ArrayDeque arrayDeque;
        boolean z;
        ArrayList arrayList2;
        nf7 nf7Var2;
        int i2;
        boolean z2;
        long[][] jArr;
        String str;
        nf7 nf7Var3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        rh7 rh7Var;
        long j2;
        int i4;
        nf7 nf7Var4;
        go4 go4Var;
        int i5;
        int i6;
        rh7 rh7Var2;
        int size;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList5;
        lf7 lf7Var;
        lf7 lf7Var2;
        lf7 lf7Var3;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((oh7) arrayDeque2.peek()).e != j) {
                break;
            }
            oh7 oh7Var = (oh7) arrayDeque2.pop();
            if (oh7Var.b == 1836019574) {
                oh7 u = oh7Var.u(1835365473);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = this.k;
                boolean z3 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (u != null) {
                    nf7Var = yz0.f(u);
                    if (this.A) {
                        nf7Var.getClass();
                        lf7[] lf7VarArr = nf7Var.a;
                        int length = lf7VarArr.length;
                        int i13 = 0;
                        while (true) {
                            i = 0;
                            if (i13 >= length) {
                                lf7Var2 = null;
                                break;
                            }
                            lf7 lf7Var4 = lf7VarArr[i13];
                            if (vl6.class.isAssignableFrom(lf7Var4.getClass())) {
                                lf7Var2 = (lf7) vl6.class.cast(lf7Var4);
                            }
                            lf7Var2 = null;
                            if (lf7Var2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        vl6 vl6Var = (vl6) lf7Var2;
                        if (vl6Var != null && vl6Var.b[0] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = lf7VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                lf7Var3 = null;
                                break;
                            }
                            lf7 lf7Var5 = lf7VarArr[i14];
                            if (vl6.class.isAssignableFrom(lf7Var5.getClass())) {
                                lf7Var3 = (lf7) vl6.class.cast(lf7Var5);
                            }
                            lf7Var3 = null;
                            if (lf7Var3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        vl6 vl6Var2 = (vl6) lf7Var3;
                        vl6Var2.getClass();
                        ArrayList d = vl6Var2.d();
                        arrayList6 = new ArrayList(d.size());
                        int i15 = 0;
                        while (i15 < d.size()) {
                            int intValue = ((Integer) d.get(i15)).intValue();
                            i15 = td4.g(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1, i15, 1, arrayList6);
                        }
                    } else {
                        i = 0;
                        if (nf7Var != null && (i12 & 64) != 0) {
                            lf7[] lf7VarArr2 = nf7Var.a;
                            int length3 = lf7VarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    lf7Var = null;
                                    break;
                                }
                                lf7 lf7Var6 = lf7VarArr2[i16];
                                if (vl6.class.isAssignableFrom(lf7Var6.getClass())) {
                                    lf7Var = (lf7) vl6.class.cast(lf7Var6);
                                }
                                lf7Var = null;
                                if (lf7Var != null) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            vl6 vl6Var3 = (vl6) lf7Var;
                            if (vl6Var3 != null) {
                                long G = new yw7(vl6Var3.b).G();
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
                    nf7Var = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z4 = this.I == 1 ? 1 : i;
                au4 au4Var = new au4();
                ph7 v = oh7Var.v(1969517665);
                if (v != null) {
                    nf7Var2 = yz0.k(v, (i12 & 512) != 0 ? 1 : i);
                    au4Var.b(nf7Var2);
                } else {
                    nf7Var2 = null;
                }
                ph7 v2 = oh7Var.v(1836476516);
                v2.getClass();
                lf7[] lf7VarArr3 = new lf7[1];
                lf7VarArr3[i] = yz0.g(v2.e);
                nf7 nf7Var5 = new nf7(lf7VarArr3);
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
                ArrayList j4 = yz0.j(oh7Var, au4Var, -9223372036854775807L, null, z2, z4, new ar4(this, (byte) 1), this.c);
                if (this.A) {
                    boolean z5 = arrayList.size() == j4.size() ? 1 : i;
                    Locale locale = Locale.US;
                    jte.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + j4.size() + ")", z5);
                }
                ArrayList arrayList10 = new ArrayList();
                int size2 = j4.size();
                int i18 = i;
                while (i18 < size2) {
                    Object obj = j4.get(i18);
                    i18++;
                    zzb zzbVar = (zzb) obj;
                    int i19 = zzbVar.a.l;
                    if (i19 != -1 && !arrayList10.contains(Integer.valueOf(i19))) {
                        arrayList10.add(Integer.valueOf(zzbVar.a.l));
                    }
                }
                arrayList9.clear();
                int size3 = j4.size();
                int i20 = i;
                while (i20 < size3) {
                    Object obj2 = j4.get(i20);
                    i20++;
                    zzb zzbVar2 = (zzb) obj2;
                    if (arrayList10.contains(Integer.valueOf(zzbVar2.a.a))) {
                        arrayList5 = arrayList9;
                        arrayList5.add(zzbVar2);
                    } else {
                        arrayList5 = arrayList9;
                    }
                    arrayList9 = arrayList5;
                }
                arrayList2 = arrayList9;
                String a = fre.a(j4);
                int i21 = -1;
                int i22 = i;
                int i23 = i22;
                long j5 = -9223372036854775807L;
                while (i22 < j4.size()) {
                    zzb zzbVar3 = (zzb) j4.get(i22);
                    nf7 nf7Var6 = nf7Var2;
                    int i24 = zzbVar3.b;
                    long[] jArr2 = zzbVar3.f;
                    ArrayList arrayList11 = j4;
                    qzb qzbVar = zzbVar3.a;
                    if (i24 == 0) {
                        arrayList3 = arrayList8;
                        str = a;
                        nf7Var3 = nf7Var5;
                    } else {
                        str = a;
                        boolean z6 = qzbVar.m;
                        go4 go4Var2 = qzbVar.g;
                        nf7Var3 = nf7Var5;
                        int i25 = qzbVar.l;
                        arrayList3 = arrayList8;
                        int i26 = qzbVar.b;
                        if (z6) {
                            ArrayList arrayList12 = arrayList2;
                            int i27 = i23 + 1;
                            yzb c0 = this.F.c0(i23, i26);
                            rh7 rh7Var3 = new rh7(qzbVar, zzbVar3, c0);
                            au4 au4Var2 = au4Var;
                            long j6 = qzbVar.e;
                            if (j6 == -9223372036854775807L) {
                                j6 = zzbVar3.i;
                            }
                            c0.d(j6);
                            long max = Math.max(j5, j6);
                            String str2 = go4Var2.t;
                            boolean equals = "audio/true-hd".equals(str2);
                            int i28 = zzbVar3.e;
                            int i29 = equals ? i28 << 4 : i28 + 30;
                            fo4 a2 = go4Var2.a();
                            a2.t = i29;
                            if (i26 == 2) {
                                int i30 = go4Var2.f;
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
                            int[] iArr = zzbVar3.h;
                            boolean z7 = zzbVar3.j;
                            if (!wf7.m(go4Var2.t) || jArr2.length <= 0) {
                                i3 = i22;
                                rh7Var = rh7Var3;
                            } else {
                                int min = Math.min(z7 ? zzbVar3.b : iArr.length, 20);
                                jte.p(j6 != -9223372036854775807L ? 1 : i);
                                i3 = i22;
                                rh7Var = rh7Var3;
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
                                        int i36 = zzbVar3.d[i35];
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
                                        mpb mpbVar = new mpb(j2);
                                        i4 = 1;
                                        lf7[] lf7VarArr4 = new lf7[1];
                                        lf7VarArr4[i] = mpbVar;
                                        nf7Var4 = new nf7(lf7VarArr4);
                                    } else {
                                        i4 = 1;
                                        nf7Var4 = null;
                                    }
                                    au4Var = au4Var2;
                                    if (i26 == i4 && (i8 = au4Var.a) != -1 && (i9 = au4Var.b) != -1) {
                                        a2.Q = i8;
                                        a2.R = i9;
                                    }
                                    nf7 nf7Var7 = go4Var2.m;
                                    ArrayList arrayList13 = this.j;
                                    nf7[] nf7VarArr = new nf7[4];
                                    nf7VarArr[i] = !arrayList13.isEmpty() ? null : new nf7(arrayList13);
                                    nf7VarArr[1] = nf7Var6;
                                    nf7VarArr[2] = nf7Var3;
                                    nf7VarArr[3] = nf7Var4;
                                    ere.f(i26, nf7Var, a2, nf7Var7, nf7VarArr);
                                    a2.r = wf7.n(str);
                                    go4Var = new go4(a2);
                                    i5 = (!Objects.equals(str2, "audio/mpeg") || c1d.e(str2)) ? 1 : i;
                                    if (!z && i25 != -1) {
                                        size = arrayList12.size();
                                        i7 = i;
                                        while (i7 < size) {
                                            arrayList2 = arrayList12;
                                            Object obj3 = arrayList2.get(i7);
                                            i7++;
                                            if (((zzb) obj3).a.a == i25) {
                                                i6 = 1;
                                                break;
                                            }
                                            arrayList12 = arrayList2;
                                        }
                                    }
                                    arrayList2 = arrayList12;
                                    i6 = i;
                                    if (i5 == 0 || i6 != 0) {
                                        rh7Var2 = rh7Var;
                                        rh7Var2.h = go4Var;
                                    } else {
                                        rh7Var2 = rh7Var;
                                        rh7Var2.c.g(go4Var);
                                    }
                                    if (i26 == 2 && i21 == -1) {
                                        i21 = arrayList3.size();
                                    }
                                    arrayList8 = arrayList3;
                                    arrayList8.add(rh7Var2);
                                    i23 = i27;
                                    j5 = max;
                                    i22 = i3 + 1;
                                    nf7Var2 = nf7Var6;
                                    a = str;
                                    j4 = arrayList11;
                                    nf7Var5 = nf7Var3;
                                    arrayList = arrayList4;
                                }
                            }
                            j2 = -9223372036854775807L;
                            if (j2 == -9223372036854775807L) {
                            }
                            au4Var = au4Var2;
                            if (i26 == i4) {
                                a2.Q = i8;
                                a2.R = i9;
                            }
                            nf7 nf7Var72 = go4Var2.m;
                            ArrayList arrayList132 = this.j;
                            nf7[] nf7VarArr2 = new nf7[4];
                            nf7VarArr2[i] = !arrayList132.isEmpty() ? null : new nf7(arrayList132);
                            nf7VarArr2[1] = nf7Var6;
                            nf7VarArr2[2] = nf7Var3;
                            nf7VarArr2[3] = nf7Var4;
                            ere.f(i26, nf7Var, a2, nf7Var72, nf7VarArr2);
                            a2.r = wf7.n(str);
                            go4Var = new go4(a2);
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
                            rh7Var2 = rh7Var;
                            rh7Var2.h = go4Var;
                            if (i26 == 2) {
                                i21 = arrayList3.size();
                            }
                            arrayList8 = arrayList3;
                            arrayList8.add(rh7Var2);
                            i23 = i27;
                            j5 = max;
                            i22 = i3 + 1;
                            nf7Var2 = nf7Var6;
                            a = str;
                            j4 = arrayList11;
                            nf7Var5 = nf7Var3;
                            arrayList = arrayList4;
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i22;
                    arrayList8 = arrayList3;
                    i22 = i3 + 1;
                    nf7Var2 = nf7Var6;
                    a = str;
                    j4 = arrayList11;
                    nf7Var5 = nf7Var3;
                    arrayList = arrayList4;
                }
                int i37 = -1;
                rh7[] rh7VarArr = (rh7[]) arrayList8.toArray(new rh7[i]);
                this.G = rh7VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[rh7VarArr.length][];
                    int[] iArr2 = new int[rh7VarArr.length];
                    long[] jArr3 = new long[rh7VarArr.length];
                    boolean[] zArr = new boolean[rh7VarArr.length];
                    for (int i38 = 0; i38 < rh7VarArr.length; i38++) {
                        jArr[i38] = new long[rh7VarArr[i38].b.b];
                        jArr3[i38] = rh7VarArr[i38].b.f[0];
                    }
                    int i39 = 0;
                    while (i39 < rh7VarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i40 = i37;
                        for (int i41 = 0; i41 < rh7VarArr.length; i41++) {
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
                        zzb zzbVar4 = rh7VarArr[i40].b;
                        rh7[] rh7VarArr2 = rh7VarArr;
                        j3 += zzbVar4.d[i42];
                        int i43 = i42 + 1;
                        iArr2[i40] = i43;
                        if (i43 < jArr4.length) {
                            jArr3[i40] = zzbVar4.f[i43];
                        } else {
                            zArr[i40] = true;
                            i39++;
                        }
                        rh7VarArr = rh7VarArr2;
                        i37 = -1;
                    }
                }
                this.H = jArr;
                this.F.B();
                this.F.f0(new qh7(j5, this.G, i21));
                arrayDeque.clear();
                this.B = true;
                if (!this.y) {
                    this.n = arrayList2.isEmpty() ? (byte) 4 : (byte) 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((oh7) arrayDeque2.peek()).g.add(oh7Var);
            }
        }
        byte b = this.n;
        if (b == 4 || b == 2) {
            return;
        }
        this.n = (byte) 0;
        this.q = 0;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
