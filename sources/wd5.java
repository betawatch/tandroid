// default package

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wd5 implements rv3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public yzb b;
    public final xx9 c;
    public final String d;
    public final yw7 e;
    public final rj7 f;
    public final boolean[] g = new boolean[4];
    public final vd5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public wd5(xx9 xx9Var, String str) {
        this.c = xx9Var;
        this.d = str;
        vd5 vd5Var = new vd5();
        vd5Var.a = new byte[128];
        this.h = vd5Var;
        if (xx9Var != null) {
            this.f = new rj7(nm7.H2);
            this.e = new yw7();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01de  */
    @Override // rv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yw7 yw7Var) {
        vd5 vd5Var;
        rj7 rj7Var;
        int i;
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j4;
        this.b.getClass();
        int i5 = yw7Var.b;
        int i6 = yw7Var.c;
        byte[] bArr = yw7Var.a;
        this.i += yw7Var.a();
        this.b.e(yw7Var.a(), yw7Var);
        while (true) {
            int b = add.b(bArr, i5, i6, this.g);
            vd5Var = this.h;
            rj7Var = this.f;
            if (b == i6) {
                break;
            }
            int i7 = b + 3;
            int i8 = yw7Var.a[i7] & 255;
            int i9 = b - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    vd5Var.a(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (vd5Var.d) {
                    int i11 = vd5Var.b - i10;
                    vd5Var.b = i11;
                    if (vd5Var.c == 0 && i8 == 181) {
                        vd5Var.c = i11;
                        i = i6;
                    } else {
                        vd5Var.d = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(vd5Var.a, vd5Var.b);
                        int i12 = copyOf[4] & 255;
                        byte b2 = copyOf[5];
                        i = i6;
                        int i13 = (i12 << 4) | ((b2 & 255) >> 4);
                        int i14 = ((b2 & 15) << 8) | (copyOf[6] & 255);
                        int i15 = (copyOf[7] & 240) >> 4;
                        if (i15 == 2) {
                            f = i14 << 2;
                            i3 = i13 * 3;
                        } else if (i15 == 3) {
                            f = i14 << 4;
                            i3 = i13 * 9;
                        } else if (i15 != 4) {
                            f2 = 1.0f;
                            fo4 fo4Var = new fo4();
                            fo4Var.a = str;
                            fo4Var.r = wf7.n(this.d);
                            fo4Var.s = wf7.n("video/mpeg2");
                            fo4Var.z = i13;
                            fo4Var.A = i14;
                            fo4Var.H = f2;
                            fo4Var.v = Collections.singletonList(copyOf);
                            go4 go4Var = new go4(fo4Var);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = r[i4];
                                byte b3 = copyOf[vd5Var.c + 9];
                                int i16 = (b3 & 96) >> 5;
                                if (i16 != (b3 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(go4Var, Long.valueOf(j4));
                            this.b.g((go4) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i14 * 121;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        fo4 fo4Var2 = new fo4();
                        fo4Var2.a = str;
                        fo4Var2.r = wf7.n(this.d);
                        fo4Var2.s = wf7.n("video/mpeg2");
                        fo4Var2.z = i13;
                        fo4Var2.A = i14;
                        fo4Var2.H = f2;
                        fo4Var2.v = Collections.singletonList(copyOf);
                        go4 go4Var2 = new go4(fo4Var2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(go4Var2, Long.valueOf(j4));
                        this.b.g((go4) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        vd5Var.d = true;
                    }
                }
                vd5Var.a(0, 3, vd5.e);
            }
            if (rj7Var != null) {
                if (i9 > 0) {
                    rj7Var.a(i5, b, bArr);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (rj7Var.b(i2)) {
                    int m = add.m(rj7Var.e, rj7Var.d);
                    String str2 = hac.a;
                    byte[] bArr2 = rj7Var.d;
                    yw7 yw7Var2 = this.e;
                    yw7Var2.L(m, bArr2);
                    this.c.a(this.o, yw7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (yw7Var.a[b + 2] == 1) {
                        rj7Var.d(i8);
                    }
                    if (i8 != 0 || i8 == 179) {
                        int i17 = i - b;
                        if (this.q && this.k) {
                            j3 = this.o;
                            if (j3 != -9223372036854775807L) {
                                j = -9223372036854775807L;
                                this.b.a(j3, this.p ? 1 : 0, ((int) (this.i - this.n)) - i17, i17, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i17;
                                    j2 = this.m;
                                    if (j2 == j) {
                                        long j5 = this.o;
                                        j2 = j5 != j ? j5 + this.l : j;
                                    }
                                    this.o = j2;
                                    z2 = false;
                                    this.p = false;
                                    this.m = j;
                                    z3 = true;
                                    this.j = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.q = i8 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i17;
                        j2 = this.m;
                        if (j2 == j) {
                        }
                        this.o = j2;
                        z2 = false;
                        this.p = false;
                        this.m = j;
                        z3 = true;
                        this.j = true;
                        this.q = i8 == 0 ? z3 : z2;
                    } else if (i8 == 184) {
                        this.p = z;
                    }
                    i5 = i7;
                    i6 = i;
                }
            }
            z = true;
            if (i8 != 0) {
            }
            int i172 = i - b;
            if (this.q) {
                j3 = this.o;
                if (j3 != -9223372036854775807L) {
                }
            }
            j = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i172;
            j2 = this.m;
            if (j2 == j) {
            }
            this.o = j2;
            z2 = false;
            this.p = false;
            this.m = j;
            z3 = true;
            this.j = true;
            this.q = i8 == 0 ? z3 : z2;
            i5 = i7;
            i6 = i;
        }
        if (!this.k) {
            vd5Var.a(i5, i6, bArr);
        }
        if (rj7Var != null) {
            rj7Var.a(i5, i6, bArr);
        }
    }

    @Override // rv3
    public final void d() {
        add.a(this.g);
        vd5 vd5Var = this.h;
        vd5Var.d = false;
        vd5Var.b = 0;
        vd5Var.c = 0;
        rj7 rj7Var = this.f;
        if (rj7Var != null) {
            rj7Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // rv3
    public final void f() {
        this.b.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            this.b.a(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.a = l4cVar.e;
        l4cVar.b();
        this.b = u84Var.c0(l4cVar.d, 2);
        xx9 xx9Var = this.c;
        if (xx9Var != null) {
            xx9Var.b(u84Var, l4cVar);
        }
    }

    @Override // rv3
    public final void e() {
    }
}
