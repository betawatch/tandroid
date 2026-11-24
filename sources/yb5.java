// default package

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yb5 implements gu3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public wxb b;
    public final uv9 c;
    public final String d;
    public final xu7 e;
    public final oh7 f;
    public final boolean[] g = new boolean[4];
    public final xb5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public yb5(uv9 uv9Var, String str) {
        this.c = uv9Var;
        this.d = str;
        xb5 xb5Var = new xb5();
        xb5Var.a = new byte[128];
        this.h = xb5Var;
        if (uv9Var != null) {
            this.f = new oh7(kk7.H2);
            this.e = new xu7();
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
    @Override // gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xu7 xu7Var) {
        xb5 xb5Var;
        oh7 oh7Var;
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
        int i5 = xu7Var.b;
        int i6 = xu7Var.c;
        byte[] bArr = xu7Var.a;
        this.i += xu7Var.a();
        this.b.e(xu7Var.a(), xu7Var);
        while (true) {
            int b = yad.b(bArr, i5, i6, this.g);
            xb5Var = this.h;
            oh7Var = this.f;
            if (b == i6) {
                break;
            }
            int i7 = b + 3;
            int i8 = xu7Var.a[i7] & 255;
            int i9 = b - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    xb5Var.a(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (xb5Var.d) {
                    int i11 = xb5Var.b - i10;
                    xb5Var.b = i11;
                    if (xb5Var.c == 0 && i8 == 181) {
                        xb5Var.c = i11;
                        i = i6;
                    } else {
                        xb5Var.d = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(xb5Var.a, xb5Var.b);
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
                            em4 em4Var = new em4();
                            em4Var.a = str;
                            em4Var.r = ud7.n(this.d);
                            em4Var.s = ud7.n("video/mpeg2");
                            em4Var.z = i13;
                            em4Var.A = i14;
                            em4Var.H = f2;
                            em4Var.v = Collections.singletonList(copyOf);
                            fm4 fm4Var = new fm4(em4Var);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = r[i4];
                                byte b3 = copyOf[xb5Var.c + 9];
                                int i16 = (b3 & 96) >> 5;
                                if (i16 != (b3 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(fm4Var, Long.valueOf(j4));
                            this.b.g((fm4) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i14 * kk7.E1;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        em4 em4Var2 = new em4();
                        em4Var2.a = str;
                        em4Var2.r = ud7.n(this.d);
                        em4Var2.s = ud7.n("video/mpeg2");
                        em4Var2.z = i13;
                        em4Var2.A = i14;
                        em4Var2.H = f2;
                        em4Var2.v = Collections.singletonList(copyOf);
                        fm4 fm4Var2 = new fm4(em4Var2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(fm4Var2, Long.valueOf(j4));
                        this.b.g((fm4) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        xb5Var.d = true;
                    }
                }
                xb5Var.a(0, 3, xb5.e);
            }
            if (oh7Var != null) {
                if (i9 > 0) {
                    oh7Var.a(i5, b, bArr);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (oh7Var.b(i2)) {
                    int m = yad.m(oh7Var.e, oh7Var.d);
                    String str2 = g8c.a;
                    byte[] bArr2 = oh7Var.d;
                    xu7 xu7Var2 = this.e;
                    xu7Var2.L(m, bArr2);
                    this.c.a(this.o, xu7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (xu7Var.a[b + 2] == 1) {
                        oh7Var.d(i8);
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
            xb5Var.a(i5, i6, bArr);
        }
        if (oh7Var != null) {
            oh7Var.a(i5, i6, bArr);
        }
    }

    @Override // gu3
    public final void d() {
        yad.a(this.g);
        xb5 xb5Var = this.h;
        xb5Var.d = false;
        xb5Var.b = 0;
        xb5Var.c = 0;
        oh7 oh7Var = this.f;
        if (oh7Var != null) {
            oh7Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // gu3
    public final void f() {
        this.b.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            this.b.a(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.a = l2cVar.e;
        l2cVar.b();
        this.b = l74Var.S(l2cVar.d, 2);
        uv9 uv9Var = this.c;
        if (uv9Var != null) {
            uv9Var.b(l74Var, l2cVar);
        }
    }

    @Override // gu3
    public final void e() {
    }
}
