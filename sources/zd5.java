// default package

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zd5 implements av3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public x1c b;
    public final oz9 c;
    public final String d;
    public final ey7 e;
    public final yj7 f;
    public final boolean[] g = new boolean[4];
    public final yd5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public zd5(oz9 oz9Var, String str) {
        this.c = oz9Var;
        this.d = str;
        yd5 yd5Var = new yd5();
        yd5Var.a = new byte[128];
        this.h = yd5Var;
        if (oz9Var != null) {
            this.f = new yj7(jn7.H2);
            this.e = new ey7();
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
    @Override // av3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ey7 ey7Var) {
        yd5 yd5Var;
        yj7 yj7Var;
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
        int i5 = ey7Var.b;
        int i6 = ey7Var.c;
        byte[] bArr = ey7Var.a;
        this.i += ey7Var.a();
        this.b.e(ey7Var.a(), ey7Var);
        while (true) {
            int b = rfd.b(bArr, i5, i6, this.g);
            yd5Var = this.h;
            yj7Var = this.f;
            if (b == i6) {
                break;
            }
            int i7 = b + 3;
            int i8 = ey7Var.a[i7] & 255;
            int i9 = b - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    yd5Var.a(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (yd5Var.d) {
                    int i11 = yd5Var.b - i10;
                    yd5Var.b = i11;
                    if (yd5Var.c == 0 && i8 == 181) {
                        yd5Var.c = i11;
                        i = i6;
                    } else {
                        yd5Var.d = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(yd5Var.a, yd5Var.b);
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
                            jo4 jo4Var = new jo4();
                            jo4Var.a = str;
                            jo4Var.r = eg7.n(this.d);
                            jo4Var.s = eg7.n("video/mpeg2");
                            jo4Var.z = i13;
                            jo4Var.A = i14;
                            jo4Var.H = f2;
                            jo4Var.v = Collections.singletonList(copyOf);
                            ko4 ko4Var = new ko4(jo4Var);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = r[i4];
                                byte b3 = copyOf[yd5Var.c + 9];
                                int i16 = (b3 & 96) >> 5;
                                if (i16 != (b3 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(ko4Var, Long.valueOf(j4));
                            this.b.g((ko4) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i14 * 121;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        jo4 jo4Var2 = new jo4();
                        jo4Var2.a = str;
                        jo4Var2.r = eg7.n(this.d);
                        jo4Var2.s = eg7.n("video/mpeg2");
                        jo4Var2.z = i13;
                        jo4Var2.A = i14;
                        jo4Var2.H = f2;
                        jo4Var2.v = Collections.singletonList(copyOf);
                        ko4 ko4Var2 = new ko4(jo4Var2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(ko4Var2, Long.valueOf(j4));
                        this.b.g((ko4) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        yd5Var.d = true;
                    }
                }
                yd5Var.a(0, 3, yd5.e);
            }
            if (yj7Var != null) {
                if (i9 > 0) {
                    yj7Var.a(i5, b, bArr);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (yj7Var.b(i2)) {
                    int m = rfd.m(yj7Var.e, yj7Var.d);
                    String str2 = gcc.a;
                    byte[] bArr2 = yj7Var.d;
                    ey7 ey7Var2 = this.e;
                    ey7Var2.L(m, bArr2);
                    this.c.a(this.o, ey7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (ey7Var.a[b + 2] == 1) {
                        yj7Var.d(i8);
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
            yd5Var.a(i5, i6, bArr);
        }
        if (yj7Var != null) {
            yj7Var.a(i5, i6, bArr);
        }
    }

    @Override // av3
    public final void d() {
        rfd.a(this.g);
        yd5 yd5Var = this.h;
        yd5Var.d = false;
        yd5Var.b = 0;
        yd5Var.c = 0;
        yj7 yj7Var = this.f;
        if (yj7Var != null) {
            yj7Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // av3
    public final void f() {
        this.b.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            this.b.a(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // av3
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.a = l6cVar.e;
        l6cVar.b();
        this.b = g84Var.e0(l6cVar.d, 2);
        oz9 oz9Var = this.c;
        if (oz9Var != null) {
            oz9Var.b(g84Var, l6cVar);
        }
    }

    @Override // av3
    public final void e() {
    }
}
