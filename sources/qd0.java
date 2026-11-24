// default package

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qd0 implements s84 {
    public final yw7 a;
    public final pd0 b;
    public final boolean c;
    public final fgf d;
    public byte e;
    public u84 f;
    public rd0 g;
    public long h;
    public qi2[] i;
    public long j;
    public qi2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public qd0(int i, fgf fgfVar) {
        this.d = fgfVar;
        this.c = (i & 1) == 0;
        this.a = new yw7(12);
        this.b = new pd0();
        this.f = new q7f((byte) 22);
        this.i = new qi2[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        boolean z;
        qi2 qi2Var;
        int i;
        long j;
        int i2;
        int i3;
        qi2 qi2Var2;
        long j2 = this.j;
        int i4 = 0;
        if (j2 != -1) {
            long j3 = ((vb3) t84Var).d;
            if (j2 < j3 || j2 > 262144 + j3) {
                u21Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                byte b = this.e;
                int i5 = 4;
                qi2 qi2Var3 = null;
                pd0 pd0Var = this.b;
                int i6 = 2;
                yw7 yw7Var = this.a;
                switch (b) {
                    case 0:
                        if (!c(t84Var)) {
                            throw bx7.a("AVI Header List not found", null);
                        }
                        ((vb3) t84Var).m(12, false);
                        this.e = (byte) 1;
                        return 0;
                    case 1:
                        ((vb3) t84Var).c(yw7Var.a, 0, 12, false);
                        yw7Var.N(0);
                        pd0Var.a = yw7Var.o();
                        pd0Var.b = yw7Var.o();
                        pd0Var.c = 0;
                        if (pd0Var.a != 1414744396) {
                            throw bx7.a("LIST expected, found: " + pd0Var.a, null);
                        }
                        int o = yw7Var.o();
                        pd0Var.c = o;
                        if (o == 1819436136) {
                            this.l = pd0Var.b;
                            this.e = (byte) 2;
                            return 0;
                        }
                        throw bx7.a("hdrl expected, found: " + pd0Var.c, null);
                    case 2:
                        int i7 = this.l - 4;
                        yw7 yw7Var2 = new yw7(i7);
                        ((vb3) t84Var).c(yw7Var2.a, 0, i7, false);
                        b76 b2 = b76.b(1819436136, yw7Var2);
                        int i8 = b2.b;
                        if (i8 != 1819436136) {
                            throw bx7.a("Unexpected header list type " + i8, null);
                        }
                        rd0 rd0Var = (rd0) b2.a(rd0.class);
                        if (rd0Var == null) {
                            throw bx7.a("AviHeader not found", null);
                        }
                        this.g = rd0Var;
                        this.h = rd0Var.c * rd0Var.a;
                        ArrayList arrayList = new ArrayList();
                        ko5 listIterator = b2.a.listIterator(0);
                        int i9 = 0;
                        while (listIterator.hasNext()) {
                            nd0 nd0Var = (nd0) listIterator.next();
                            if (nd0Var.getType() == 1819440243) {
                                b76 b76Var = (b76) nd0Var;
                                int i10 = i9 + 1;
                                sd0 sd0Var = (sd0) b76Var.a(sd0.class);
                                uab uabVar = (uab) b76Var.a(uab.class);
                                if (sd0Var == null) {
                                    ncd.f("AviExtractor", "Missing Stream Header");
                                } else if (uabVar == null) {
                                    ncd.f("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j4 = sd0Var.c;
                                    String str = hac.a;
                                    long b0 = hac.b0(sd0Var.d, sd0Var.b * 1000000, j4, RoundingMode.DOWN);
                                    go4 go4Var = uabVar.a;
                                    fo4 a = go4Var.a();
                                    a.a = Integer.toString(i9);
                                    int i11 = sd0Var.e;
                                    if (i11 != 0) {
                                        a.t = i11;
                                    }
                                    wab wabVar = (wab) b76Var.a(wab.class);
                                    if (wabVar != null) {
                                        a.b = wabVar.a;
                                    }
                                    int h = wf7.h(go4Var.t);
                                    if (h == 1 || h == i6) {
                                        yzb c0 = this.f.c0(i9, h);
                                        go4 go4Var2 = new go4(a);
                                        c0.g(go4Var2);
                                        c0.d(b0);
                                        this.h = Math.max(this.h, b0);
                                        qi2Var = new qi2(i9, sd0Var, c0, wf7.a(go4Var2.t, go4Var2.l));
                                        if (qi2Var != null) {
                                            arrayList.add(qi2Var);
                                        }
                                        i9 = i10;
                                    }
                                }
                                qi2Var = null;
                                if (qi2Var != null) {
                                }
                                i9 = i10;
                            }
                            i4 = 0;
                            i6 = 2;
                        }
                        int i12 = i4;
                        this.i = (qi2[]) arrayList.toArray(new qi2[i12]);
                        this.f.B();
                        this.e = (byte) 3;
                        return i12;
                    case 3:
                        long j5 = this.m;
                        if (j5 != -1) {
                            i = 16;
                            if (((vb3) t84Var).d != j5) {
                                this.j = j5;
                                return 0;
                            }
                        } else {
                            i = 16;
                        }
                        ((vb3) t84Var).d(yw7Var.a, 0, 12, false);
                        vb3 vb3Var = (vb3) t84Var;
                        vb3Var.f = 0;
                        yw7Var.N(0);
                        pd0Var.a = yw7Var.o();
                        pd0Var.b = yw7Var.o();
                        pd0Var.c = 0;
                        int o2 = yw7Var.o();
                        int i13 = pd0Var.a;
                        if (i13 == 1179011410) {
                            vb3Var.m(12, false);
                            return 0;
                        }
                        if (i13 != 1414744396 || o2 != 1769369453) {
                            this.j = vb3Var.d + pd0Var.b + 8;
                            return 0;
                        }
                        long j6 = vb3Var.d;
                        this.m = j6;
                        this.n = j6 + pd0Var.b + 8;
                        if (!this.p) {
                            rd0 rd0Var2 = this.g;
                            rd0Var2.getClass();
                            if ((rd0Var2.b & i) == i) {
                                this.e = (byte) 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.f0(new od0(this.h));
                            this.p = true;
                        }
                        this.j = vb3Var.d + 12;
                        this.e = (byte) 6;
                        return 0;
                    case 4:
                        ((vb3) t84Var).c(yw7Var.a, 0, 8, false);
                        yw7Var.N(0);
                        int o3 = yw7Var.o();
                        int o4 = yw7Var.o();
                        if (o3 != 829973609) {
                            this.j = ((vb3) t84Var).d + o4;
                            return 0;
                        }
                        this.e = (byte) 5;
                        this.o = o4;
                        return 0;
                    case 5:
                        yw7 yw7Var3 = new yw7(this.o);
                        ((vb3) t84Var).c(yw7Var3.a, 0, this.o, false);
                        if (yw7Var3.a() < 16) {
                            j = 0;
                        } else {
                            int i14 = yw7Var3.b;
                            yw7Var3.O(8);
                            long o5 = yw7Var3.o();
                            long j7 = this.m;
                            j = o5 > j7 ? 0L : j7 + 8;
                            yw7Var3.N(i14);
                        }
                        while (yw7Var3.a() >= 16) {
                            int o6 = yw7Var3.o();
                            int o7 = yw7Var3.o();
                            long o8 = yw7Var3.o() + j;
                            yw7Var3.O(i5);
                            qi2[] qi2VarArr = this.i;
                            int length = qi2VarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    qi2Var2 = qi2VarArr[i3];
                                    i3 = (qi2Var2.c == o6 || qi2Var2.d == o6) ? 0 : i3 + 1;
                                } else {
                                    qi2Var2 = null;
                                }
                            }
                            if (qi2Var2 != null) {
                                boolean z2 = (o7 & 16) == 16;
                                if (qi2Var2.m == -1) {
                                    qi2Var2.m = o8;
                                }
                                if (z2 || qi2Var2.f) {
                                    int i15 = qi2Var2.l;
                                    int[] iArr = qi2Var2.o;
                                    if (i15 == iArr.length) {
                                        long[] jArr = qi2Var2.n;
                                        qi2Var2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr2 = qi2Var2.o;
                                        iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                        qi2Var2.o = iArr;
                                    }
                                    long[] jArr2 = qi2Var2.n;
                                    int i16 = qi2Var2.l;
                                    jArr2[i16] = o8;
                                    iArr[i16] = qi2Var2.k;
                                    qi2Var2.l = i16 + 1;
                                }
                                qi2Var2.k++;
                            }
                            i5 = 4;
                        }
                        for (qi2 qi2Var4 : this.i) {
                            qi2Var4.n = Arrays.copyOf(qi2Var4.n, qi2Var4.l);
                            qi2Var4.o = Arrays.copyOf(qi2Var4.o, qi2Var4.l);
                            if (qi2Var4.f && qi2Var4.a.f != 0 && (i2 = qi2Var4.l) > 0) {
                                qi2Var4.g = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        u84 u84Var = this.f;
                        long j8 = this.h;
                        if (length2 == 0) {
                            u84Var.f0(new od0(j8));
                        } else {
                            u84Var.f0(new od0(this, j8, (byte) 0));
                        }
                        this.e = (byte) 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (((vb3) t84Var).d >= this.n) {
                            return -1;
                        }
                        qi2 qi2Var5 = this.k;
                        if (qi2Var5 != null) {
                            yzb yzbVar = qi2Var5.b;
                            int i17 = qi2Var5.i;
                            int f = i17 - yzbVar.f(t84Var, i17, false);
                            qi2Var5.i = f;
                            boolean z3 = f == 0;
                            if (z3) {
                                if (qi2Var5.h > 0) {
                                    int i18 = qi2Var5.j;
                                    yzbVar.a((qi2Var5.e * i18) / qi2Var5.g, (qi2Var5.f || Arrays.binarySearch(qi2Var5.o, i18) >= 0) ? 1 : 0, qi2Var5.h, 0, null);
                                }
                                qi2Var5.j++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        vb3 vb3Var2 = (vb3) t84Var;
                        if ((vb3Var2.d & 1) == 1) {
                            vb3Var2.m(1, false);
                        }
                        vb3Var2.d(yw7Var.a, 0, 12, false);
                        yw7Var.N(0);
                        int o9 = yw7Var.o();
                        if (o9 == 1414744396) {
                            yw7Var.N(8);
                            vb3Var2.m(yw7Var.o() == 1769369453 ? 12 : 8, false);
                            vb3Var2.f = 0;
                            return 0;
                        }
                        int o10 = yw7Var.o();
                        if (o9 == 1263424842) {
                            this.j = vb3Var2.d + o10 + 8;
                            return 0;
                        }
                        vb3Var2.m(8, false);
                        vb3Var2.f = 0;
                        for (qi2 qi2Var6 : this.i) {
                            if (qi2Var6.c == o9 || qi2Var6.d == o9) {
                                qi2Var3 = qi2Var6;
                                if (qi2Var3 != null) {
                                    this.j = vb3Var2.d + o10;
                                    return 0;
                                }
                                qi2Var3.h = o10;
                                qi2Var3.i = o10;
                                this.k = qi2Var3;
                                return 0;
                            }
                        }
                        if (qi2Var3 != null) {
                        }
                        break;
                    default:
                        zo4.f();
                        return 0;
                }
            } else {
                ((vb3) t84Var).m((int) (j2 - j3), false);
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        yw7 yw7Var = this.a;
        ((vb3) t84Var).d(yw7Var.a, 0, 12, false);
        yw7Var.N(0);
        if (yw7Var.o() == 1179011410) {
            yw7Var.O(4);
            if (yw7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (qi2 qi2Var : this.i) {
            if (qi2Var.l == 0) {
                qi2Var.j = 0;
            } else {
                qi2Var.j = qi2Var.o[hac.f(qi2Var.n, j, true)];
            }
        }
        if (j != 0) {
            this.e = (byte) 6;
        } else if (this.i.length == 0) {
            this.e = (byte) 0;
        } else {
            this.e = (byte) 3;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.e = (byte) 0;
        if (this.c) {
            u84Var = new yh4(u84Var, this.d);
        }
        this.f = u84Var;
        this.j = -1L;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
