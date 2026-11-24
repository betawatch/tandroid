// default package

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qc0 implements j74 {
    public final xu7 a;
    public final pc0 b;
    public final boolean c;
    public final eef d;
    public byte e;
    public l74 f;
    public rc0 g;
    public long h;
    public ch2[] i;
    public long j;
    public ch2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public qc0(int i, eef eefVar) {
        this.d = eefVar;
        this.c = (i & 1) == 0;
        this.a = new xu7(12);
        this.b = new pc0();
        this.f = new o5f((byte) 22);
        this.i = new ch2[0];
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
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        boolean z;
        ch2 ch2Var;
        int i;
        long j;
        int i2;
        int i3;
        ch2 ch2Var2;
        long j2 = this.j;
        int i4 = 0;
        if (j2 != -1) {
            long j3 = ((ja3) k74Var).d;
            if (j2 < j3 || j2 > 262144 + j3) {
                m11Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                byte b = this.e;
                int i5 = 4;
                ch2 ch2Var3 = null;
                pc0 pc0Var = this.b;
                int i6 = 2;
                xu7 xu7Var = this.a;
                switch (b) {
                    case 0:
                        if (!c(k74Var)) {
                            throw av7.a("AVI Header List not found", null);
                        }
                        ((ja3) k74Var).l(12, false);
                        this.e = (byte) 1;
                        return 0;
                    case 1:
                        ((ja3) k74Var).c(xu7Var.a, 0, 12, false);
                        xu7Var.N(0);
                        pc0Var.a = xu7Var.o();
                        pc0Var.b = xu7Var.o();
                        pc0Var.c = 0;
                        if (pc0Var.a != 1414744396) {
                            throw av7.a("LIST expected, found: " + pc0Var.a, null);
                        }
                        int o = xu7Var.o();
                        pc0Var.c = o;
                        if (o == 1819436136) {
                            this.l = pc0Var.b;
                            this.e = (byte) 2;
                            return 0;
                        }
                        throw av7.a("hdrl expected, found: " + pc0Var.c, null);
                    case 2:
                        int i7 = this.l - 4;
                        xu7 xu7Var2 = new xu7(i7);
                        ((ja3) k74Var).c(xu7Var2.a, 0, i7, false);
                        b56 b2 = b56.b(1819436136, xu7Var2);
                        int i8 = b2.b;
                        if (i8 != 1819436136) {
                            throw av7.a("Unexpected header list type " + i8, null);
                        }
                        rc0 rc0Var = (rc0) b2.a(rc0.class);
                        if (rc0Var == null) {
                            throw av7.a("AviHeader not found", null);
                        }
                        this.g = rc0Var;
                        this.h = rc0Var.c * rc0Var.a;
                        ArrayList arrayList = new ArrayList();
                        km5 listIterator = b2.a.listIterator(0);
                        int i9 = 0;
                        while (listIterator.hasNext()) {
                            nc0 nc0Var = (nc0) listIterator.next();
                            if (nc0Var.getType() == 1819440243) {
                                b56 b56Var = (b56) nc0Var;
                                int i10 = i9 + 1;
                                sc0 sc0Var = (sc0) b56Var.a(sc0.class);
                                s8b s8bVar = (s8b) b56Var.a(s8b.class);
                                if (sc0Var == null) {
                                    lad.f("AviExtractor", "Missing Stream Header");
                                } else if (s8bVar == null) {
                                    lad.f("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j4 = sc0Var.c;
                                    String str = g8c.a;
                                    long b0 = g8c.b0(sc0Var.d, sc0Var.b * 1000000, j4, RoundingMode.DOWN);
                                    fm4 fm4Var = s8bVar.a;
                                    em4 a = fm4Var.a();
                                    a.a = Integer.toString(i9);
                                    int i11 = sc0Var.e;
                                    if (i11 != 0) {
                                        a.t = i11;
                                    }
                                    u8b u8bVar = (u8b) b56Var.a(u8b.class);
                                    if (u8bVar != null) {
                                        a.b = u8bVar.a;
                                    }
                                    int h = ud7.h(fm4Var.t);
                                    if (h == 1 || h == i6) {
                                        wxb S = this.f.S(i9, h);
                                        fm4 fm4Var2 = new fm4(a);
                                        S.g(fm4Var2);
                                        S.d(b0);
                                        this.h = Math.max(this.h, b0);
                                        ch2Var = new ch2(i9, sc0Var, S, ud7.a(fm4Var2.t, fm4Var2.l));
                                        if (ch2Var != null) {
                                            arrayList.add(ch2Var);
                                        }
                                        i9 = i10;
                                    }
                                }
                                ch2Var = null;
                                if (ch2Var != null) {
                                }
                                i9 = i10;
                            }
                            i4 = 0;
                            i6 = 2;
                        }
                        int i12 = i4;
                        this.i = (ch2[]) arrayList.toArray(new ch2[i12]);
                        this.f.z();
                        this.e = (byte) 3;
                        return i12;
                    case 3:
                        long j5 = this.m;
                        if (j5 != -1) {
                            i = 16;
                            if (((ja3) k74Var).d != j5) {
                                this.j = j5;
                                return 0;
                            }
                        } else {
                            i = 16;
                        }
                        ((ja3) k74Var).d(xu7Var.a, 0, 12, false);
                        ja3 ja3Var = (ja3) k74Var;
                        ja3Var.f = 0;
                        xu7Var.N(0);
                        pc0Var.a = xu7Var.o();
                        pc0Var.b = xu7Var.o();
                        pc0Var.c = 0;
                        int o2 = xu7Var.o();
                        int i13 = pc0Var.a;
                        if (i13 == 1179011410) {
                            ja3Var.l(12, false);
                            return 0;
                        }
                        if (i13 != 1414744396 || o2 != 1769369453) {
                            this.j = ja3Var.d + pc0Var.b + 8;
                            return 0;
                        }
                        long j6 = ja3Var.d;
                        this.m = j6;
                        this.n = j6 + pc0Var.b + 8;
                        if (!this.p) {
                            rc0 rc0Var2 = this.g;
                            rc0Var2.getClass();
                            if ((rc0Var2.b & i) == i) {
                                this.e = (byte) 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.g0(new oc0(this.h));
                            this.p = true;
                        }
                        this.j = ja3Var.d + 12;
                        this.e = (byte) 6;
                        return 0;
                    case 4:
                        ((ja3) k74Var).c(xu7Var.a, 0, 8, false);
                        xu7Var.N(0);
                        int o3 = xu7Var.o();
                        int o4 = xu7Var.o();
                        if (o3 != 829973609) {
                            this.j = ((ja3) k74Var).d + o4;
                            return 0;
                        }
                        this.e = (byte) 5;
                        this.o = o4;
                        return 0;
                    case 5:
                        xu7 xu7Var3 = new xu7(this.o);
                        ((ja3) k74Var).c(xu7Var3.a, 0, this.o, false);
                        if (xu7Var3.a() < 16) {
                            j = 0;
                        } else {
                            int i14 = xu7Var3.b;
                            xu7Var3.O(8);
                            long o5 = xu7Var3.o();
                            long j7 = this.m;
                            j = o5 > j7 ? 0L : j7 + 8;
                            xu7Var3.N(i14);
                        }
                        while (xu7Var3.a() >= 16) {
                            int o6 = xu7Var3.o();
                            int o7 = xu7Var3.o();
                            long o8 = xu7Var3.o() + j;
                            xu7Var3.O(i5);
                            ch2[] ch2VarArr = this.i;
                            int length = ch2VarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    ch2Var2 = ch2VarArr[i3];
                                    i3 = (ch2Var2.c == o6 || ch2Var2.d == o6) ? 0 : i3 + 1;
                                } else {
                                    ch2Var2 = null;
                                }
                            }
                            if (ch2Var2 != null) {
                                boolean z2 = (o7 & 16) == 16;
                                if (ch2Var2.m == -1) {
                                    ch2Var2.m = o8;
                                }
                                if (z2 || ch2Var2.f) {
                                    int i15 = ch2Var2.l;
                                    int[] iArr = ch2Var2.o;
                                    if (i15 == iArr.length) {
                                        long[] jArr = ch2Var2.n;
                                        ch2Var2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr2 = ch2Var2.o;
                                        iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                        ch2Var2.o = iArr;
                                    }
                                    long[] jArr2 = ch2Var2.n;
                                    int i16 = ch2Var2.l;
                                    jArr2[i16] = o8;
                                    iArr[i16] = ch2Var2.k;
                                    ch2Var2.l = i16 + 1;
                                }
                                ch2Var2.k++;
                            }
                            i5 = 4;
                        }
                        for (ch2 ch2Var4 : this.i) {
                            ch2Var4.n = Arrays.copyOf(ch2Var4.n, ch2Var4.l);
                            ch2Var4.o = Arrays.copyOf(ch2Var4.o, ch2Var4.l);
                            if (ch2Var4.f && ch2Var4.a.f != 0 && (i2 = ch2Var4.l) > 0) {
                                ch2Var4.g = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        l74 l74Var = this.f;
                        long j8 = this.h;
                        if (length2 == 0) {
                            l74Var.g0(new oc0(j8));
                        } else {
                            l74Var.g0(new oc0(this, j8, (byte) 0));
                        }
                        this.e = (byte) 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (((ja3) k74Var).d >= this.n) {
                            return -1;
                        }
                        ch2 ch2Var5 = this.k;
                        if (ch2Var5 != null) {
                            wxb wxbVar = ch2Var5.b;
                            int i17 = ch2Var5.i;
                            int f = i17 - wxbVar.f(k74Var, i17, false);
                            ch2Var5.i = f;
                            boolean z3 = f == 0;
                            if (z3) {
                                if (ch2Var5.h > 0) {
                                    int i18 = ch2Var5.j;
                                    wxbVar.a((ch2Var5.e * i18) / ch2Var5.g, (ch2Var5.f || Arrays.binarySearch(ch2Var5.o, i18) >= 0) ? 1 : 0, ch2Var5.h, 0, null);
                                }
                                ch2Var5.j++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        ja3 ja3Var2 = (ja3) k74Var;
                        if ((ja3Var2.d & 1) == 1) {
                            ja3Var2.l(1, false);
                        }
                        ja3Var2.d(xu7Var.a, 0, 12, false);
                        xu7Var.N(0);
                        int o9 = xu7Var.o();
                        if (o9 == 1414744396) {
                            xu7Var.N(8);
                            ja3Var2.l(xu7Var.o() == 1769369453 ? 12 : 8, false);
                            ja3Var2.f = 0;
                            return 0;
                        }
                        int o10 = xu7Var.o();
                        if (o9 == 1263424842) {
                            this.j = ja3Var2.d + o10 + 8;
                            return 0;
                        }
                        ja3Var2.l(8, false);
                        ja3Var2.f = 0;
                        for (ch2 ch2Var6 : this.i) {
                            if (ch2Var6.c == o9 || ch2Var6.d == o9) {
                                ch2Var3 = ch2Var6;
                                if (ch2Var3 != null) {
                                    this.j = ja3Var2.d + o10;
                                    return 0;
                                }
                                ch2Var3.h = o10;
                                ch2Var3.i = o10;
                                this.k = ch2Var3;
                                return 0;
                            }
                        }
                        if (ch2Var3 != null) {
                        }
                        break;
                    default:
                        wn4.f();
                        return 0;
                }
            } else {
                ((ja3) k74Var).l((int) (j2 - j3), false);
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        xu7 xu7Var = this.a;
        ((ja3) k74Var).d(xu7Var.a, 0, 12, false);
        xu7Var.N(0);
        if (xu7Var.o() == 1179011410) {
            xu7Var.O(4);
            if (xu7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (ch2 ch2Var : this.i) {
            if (ch2Var.l == 0) {
                ch2Var.j = 0;
            } else {
                ch2Var.j = ch2Var.o[g8c.f(ch2Var.n, j, true)];
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

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.e = (byte) 0;
        if (this.c) {
            l74Var = new xf4(l74Var, this.d);
        }
        this.f = l74Var;
        this.j = -1L;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
