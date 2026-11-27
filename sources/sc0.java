// default package

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sc0 implements e84 {
    public final ey7 a;
    public final rc0 b;
    public final boolean c;
    public final uif d;
    public byte e;
    public g84 f;
    public tc0 g;
    public long h;
    public uh2[] i;
    public long j;
    public uh2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public sc0(int i, uif uifVar) {
        this.d = uifVar;
        this.c = (i & 1) == 0;
        this.a = new ey7(12);
        this.b = new rc0();
        this.f = new faf((byte) 22);
        this.i = new uh2[0];
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
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        boolean z;
        uh2 uh2Var;
        int i;
        long j;
        int i2;
        int i3;
        uh2 uh2Var2;
        long j2 = this.j;
        int i4 = 0;
        if (j2 != -1) {
            long j3 = ((cb3) f84Var).d;
            if (j2 < j3 || j2 > 262144 + j3) {
                v11Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                byte b = this.e;
                int i5 = 4;
                uh2 uh2Var3 = null;
                rc0 rc0Var = this.b;
                int i6 = 2;
                ey7 ey7Var = this.a;
                switch (b) {
                    case 0:
                        if (!c(f84Var)) {
                            throw hy7.a("AVI Header List not found", null);
                        }
                        ((cb3) f84Var).l(12, false);
                        this.e = (byte) 1;
                        return 0;
                    case 1:
                        ((cb3) f84Var).c(ey7Var.a, 0, 12, false);
                        ey7Var.N(0);
                        rc0Var.a = ey7Var.o();
                        rc0Var.b = ey7Var.o();
                        rc0Var.c = 0;
                        if (rc0Var.a != 1414744396) {
                            throw hy7.a("LIST expected, found: " + rc0Var.a, null);
                        }
                        int o = ey7Var.o();
                        rc0Var.c = o;
                        if (o == 1819436136) {
                            this.l = rc0Var.b;
                            this.e = (byte) 2;
                            return 0;
                        }
                        throw hy7.a("hdrl expected, found: " + rc0Var.c, null);
                    case 2:
                        int i7 = this.l - 4;
                        ey7 ey7Var2 = new ey7(i7);
                        ((cb3) f84Var).c(ey7Var2.a, 0, i7, false);
                        f76 b2 = f76.b(1819436136, ey7Var2);
                        int i8 = b2.b;
                        if (i8 != 1819436136) {
                            throw hy7.a("Unexpected header list type " + i8, null);
                        }
                        tc0 tc0Var = (tc0) b2.a(tc0.class);
                        if (tc0Var == null) {
                            throw hy7.a("AviHeader not found", null);
                        }
                        this.g = tc0Var;
                        this.h = tc0Var.c * tc0Var.a;
                        ArrayList arrayList = new ArrayList();
                        no5 listIterator = b2.a.listIterator(0);
                        int i9 = 0;
                        while (listIterator.hasNext()) {
                            pc0 pc0Var = (pc0) listIterator.next();
                            if (pc0Var.getType() == 1819440243) {
                                f76 f76Var = (f76) pc0Var;
                                int i10 = i9 + 1;
                                uc0 uc0Var = (uc0) f76Var.a(uc0.class);
                                rcb rcbVar = (rcb) f76Var.a(rcb.class);
                                if (uc0Var == null) {
                                    efd.f("AviExtractor", "Missing Stream Header");
                                } else if (rcbVar == null) {
                                    efd.f("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j4 = uc0Var.c;
                                    String str = gcc.a;
                                    long b0 = gcc.b0(uc0Var.d, uc0Var.b * 1000000, j4, RoundingMode.DOWN);
                                    ko4 ko4Var = rcbVar.a;
                                    jo4 a = ko4Var.a();
                                    a.a = Integer.toString(i9);
                                    int i11 = uc0Var.e;
                                    if (i11 != 0) {
                                        a.t = i11;
                                    }
                                    tcb tcbVar = (tcb) f76Var.a(tcb.class);
                                    if (tcbVar != null) {
                                        a.b = tcbVar.a;
                                    }
                                    int h = eg7.h(ko4Var.t);
                                    if (h == 1 || h == i6) {
                                        x1c e0 = this.f.e0(i9, h);
                                        ko4 ko4Var2 = new ko4(a);
                                        e0.g(ko4Var2);
                                        e0.d(b0);
                                        this.h = Math.max(this.h, b0);
                                        uh2Var = new uh2(i9, uc0Var, e0, eg7.a(ko4Var2.t, ko4Var2.l));
                                        if (uh2Var != null) {
                                            arrayList.add(uh2Var);
                                        }
                                        i9 = i10;
                                    }
                                }
                                uh2Var = null;
                                if (uh2Var != null) {
                                }
                                i9 = i10;
                            }
                            i4 = 0;
                            i6 = 2;
                        }
                        int i12 = i4;
                        this.i = (uh2[]) arrayList.toArray(new uh2[i12]);
                        this.f.D();
                        this.e = (byte) 3;
                        return i12;
                    case 3:
                        long j5 = this.m;
                        if (j5 != -1) {
                            i = 16;
                            if (((cb3) f84Var).d != j5) {
                                this.j = j5;
                                return 0;
                            }
                        } else {
                            i = 16;
                        }
                        ((cb3) f84Var).d(ey7Var.a, 0, 12, false);
                        cb3 cb3Var = (cb3) f84Var;
                        cb3Var.f = 0;
                        ey7Var.N(0);
                        rc0Var.a = ey7Var.o();
                        rc0Var.b = ey7Var.o();
                        rc0Var.c = 0;
                        int o2 = ey7Var.o();
                        int i13 = rc0Var.a;
                        if (i13 == 1179011410) {
                            cb3Var.l(12, false);
                            return 0;
                        }
                        if (i13 != 1414744396 || o2 != 1769369453) {
                            this.j = cb3Var.d + rc0Var.b + 8;
                            return 0;
                        }
                        long j6 = cb3Var.d;
                        this.m = j6;
                        this.n = j6 + rc0Var.b + 8;
                        if (!this.p) {
                            tc0 tc0Var2 = this.g;
                            tc0Var2.getClass();
                            if ((tc0Var2.b & i) == i) {
                                this.e = (byte) 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.m0(new qc0(this.h));
                            this.p = true;
                        }
                        this.j = cb3Var.d + 12;
                        this.e = (byte) 6;
                        return 0;
                    case 4:
                        ((cb3) f84Var).c(ey7Var.a, 0, 8, false);
                        ey7Var.N(0);
                        int o3 = ey7Var.o();
                        int o4 = ey7Var.o();
                        if (o3 != 829973609) {
                            this.j = ((cb3) f84Var).d + o4;
                            return 0;
                        }
                        this.e = (byte) 5;
                        this.o = o4;
                        return 0;
                    case 5:
                        ey7 ey7Var3 = new ey7(this.o);
                        ((cb3) f84Var).c(ey7Var3.a, 0, this.o, false);
                        if (ey7Var3.a() < 16) {
                            j = 0;
                        } else {
                            int i14 = ey7Var3.b;
                            ey7Var3.O(8);
                            long o5 = ey7Var3.o();
                            long j7 = this.m;
                            j = o5 > j7 ? 0L : j7 + 8;
                            ey7Var3.N(i14);
                        }
                        while (ey7Var3.a() >= 16) {
                            int o6 = ey7Var3.o();
                            int o7 = ey7Var3.o();
                            long o8 = ey7Var3.o() + j;
                            ey7Var3.O(i5);
                            uh2[] uh2VarArr = this.i;
                            int length = uh2VarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    uh2Var2 = uh2VarArr[i3];
                                    i3 = (uh2Var2.c == o6 || uh2Var2.d == o6) ? 0 : i3 + 1;
                                } else {
                                    uh2Var2 = null;
                                }
                            }
                            if (uh2Var2 != null) {
                                boolean z2 = (o7 & 16) == 16;
                                if (uh2Var2.m == -1) {
                                    uh2Var2.m = o8;
                                }
                                if (z2 || uh2Var2.f) {
                                    int i15 = uh2Var2.l;
                                    int[] iArr = uh2Var2.o;
                                    if (i15 == iArr.length) {
                                        long[] jArr = uh2Var2.n;
                                        uh2Var2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr2 = uh2Var2.o;
                                        iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                        uh2Var2.o = iArr;
                                    }
                                    long[] jArr2 = uh2Var2.n;
                                    int i16 = uh2Var2.l;
                                    jArr2[i16] = o8;
                                    iArr[i16] = uh2Var2.k;
                                    uh2Var2.l = i16 + 1;
                                }
                                uh2Var2.k++;
                            }
                            i5 = 4;
                        }
                        for (uh2 uh2Var4 : this.i) {
                            uh2Var4.n = Arrays.copyOf(uh2Var4.n, uh2Var4.l);
                            uh2Var4.o = Arrays.copyOf(uh2Var4.o, uh2Var4.l);
                            if (uh2Var4.f && uh2Var4.a.f != 0 && (i2 = uh2Var4.l) > 0) {
                                uh2Var4.g = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        g84 g84Var = this.f;
                        long j8 = this.h;
                        if (length2 == 0) {
                            g84Var.m0(new qc0(j8));
                        } else {
                            g84Var.m0(new qc0(this, j8, (byte) 0));
                        }
                        this.e = (byte) 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (((cb3) f84Var).d >= this.n) {
                            return -1;
                        }
                        uh2 uh2Var5 = this.k;
                        if (uh2Var5 != null) {
                            x1c x1cVar = uh2Var5.b;
                            int i17 = uh2Var5.i;
                            int f = i17 - x1cVar.f(f84Var, i17, false);
                            uh2Var5.i = f;
                            boolean z3 = f == 0;
                            if (z3) {
                                if (uh2Var5.h > 0) {
                                    int i18 = uh2Var5.j;
                                    x1cVar.a((uh2Var5.e * i18) / uh2Var5.g, (uh2Var5.f || Arrays.binarySearch(uh2Var5.o, i18) >= 0) ? 1 : 0, uh2Var5.h, 0, null);
                                }
                                uh2Var5.j++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        cb3 cb3Var2 = (cb3) f84Var;
                        if ((cb3Var2.d & 1) == 1) {
                            cb3Var2.l(1, false);
                        }
                        cb3Var2.d(ey7Var.a, 0, 12, false);
                        ey7Var.N(0);
                        int o9 = ey7Var.o();
                        if (o9 == 1414744396) {
                            ey7Var.N(8);
                            cb3Var2.l(ey7Var.o() == 1769369453 ? 12 : 8, false);
                            cb3Var2.f = 0;
                            return 0;
                        }
                        int o10 = ey7Var.o();
                        if (o9 == 1263424842) {
                            this.j = cb3Var2.d + o10 + 8;
                            return 0;
                        }
                        cb3Var2.l(8, false);
                        cb3Var2.f = 0;
                        for (uh2 uh2Var6 : this.i) {
                            if (uh2Var6.c == o9 || uh2Var6.d == o9) {
                                uh2Var3 = uh2Var6;
                                if (uh2Var3 != null) {
                                    this.j = cb3Var2.d + o10;
                                    return 0;
                                }
                                uh2Var3.h = o10;
                                uh2Var3.i = o10;
                                this.k = uh2Var3;
                                return 0;
                            }
                        }
                        if (uh2Var3 != null) {
                        }
                        break;
                    default:
                        lq5.f();
                        return 0;
                }
            } else {
                ((cb3) f84Var).l((int) (j2 - j3), false);
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        ey7 ey7Var = this.a;
        ((cb3) f84Var).d(ey7Var.a, 0, 12, false);
        ey7Var.N(0);
        if (ey7Var.o() == 1179011410) {
            ey7Var.O(4);
            if (ey7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (uh2 uh2Var : this.i) {
            if (uh2Var.l == 0) {
                uh2Var.j = 0;
            } else {
                uh2Var.j = uh2Var.o[gcc.f(uh2Var.n, j, true)];
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

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.e = (byte) 0;
        if (this.c) {
            g84Var = new vh4(g84Var, this.d);
        }
        this.f = g84Var;
        this.j = -1L;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
