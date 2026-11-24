// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zd5 implements rv3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final xx9 a;
    public final yw7 b;
    public final boolean[] c = new boolean[4];
    public final xd5 d;
    public final rj7 e;
    public yd5 f;
    public long g;
    public String h;
    public yzb i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public zd5(xx9 xx9Var) {
        this.a = xx9Var;
        xd5 xd5Var = new xd5();
        xd5Var.e = new byte[128];
        this.d = xd5Var;
        this.k = -9223372036854775807L;
        this.e = new rj7(nm7.H2);
        this.b = new yw7();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    @Override // rv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yw7 yw7Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = yw7Var.b;
        int i6 = yw7Var.c;
        byte[] bArr = yw7Var.a;
        this.g += yw7Var.a();
        this.i.e(yw7Var.a(), yw7Var);
        while (true) {
            int b = add.b(bArr, i5, i6, this.c);
            xd5 xd5Var = this.d;
            rj7 rj7Var = this.e;
            if (b == i6) {
                if (!this.j) {
                    xd5Var.b(i5, i6, bArr);
                }
                this.f.a(i5, i6, bArr);
                if (rj7Var != null) {
                    rj7Var.a(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = b + 3;
            byte b2 = yw7Var.a[i7];
            int i8 = b2 & 255;
            int i9 = b - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    xd5Var.b(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                byte b3 = xd5Var.d;
                if (b3 != 0) {
                    i = i6;
                    if (b3 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            ncd.f("H263Reader", "Unexpected start code value");
                            xd5Var.c = false;
                            xd5Var.a = 0;
                            xd5Var.d = (byte) 0;
                        } else {
                            xd5Var.d = (byte) 2;
                        }
                    } else if (b3 != 2) {
                        i2 = i7;
                        if (b3 != 3) {
                            if (b3 != 4) {
                                rjb.h();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                xd5Var.a -= i10;
                                xd5Var.c = false;
                                yzb yzbVar = this.i;
                                int i11 = xd5Var.b;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf((byte[]) xd5Var.e, xd5Var.a);
                                ye1 ye1Var = new ye1(copyOf.length, copyOf);
                                ye1Var.o(i11);
                                ye1Var.o(4);
                                ye1Var.m();
                                ye1Var.n(8);
                                if (ye1Var.e()) {
                                    ye1Var.n(4);
                                    ye1Var.n(3);
                                }
                                int f2 = ye1Var.f(4);
                                if (f2 == 15) {
                                    int f3 = ye1Var.f(8);
                                    int f4 = ye1Var.f(8);
                                    if (f4 == 0) {
                                        ncd.f("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (ye1Var.e()) {
                                            ye1Var.n(2);
                                            ye1Var.n(1);
                                            if (ye1Var.e()) {
                                                ye1Var.n(15);
                                                ye1Var.m();
                                                ye1Var.n(15);
                                                ye1Var.m();
                                                ye1Var.n(15);
                                                ye1Var.m();
                                                ye1Var.n(3);
                                                ye1Var.n(11);
                                                ye1Var.m();
                                                ye1Var.n(15);
                                                ye1Var.m();
                                            }
                                        }
                                        if (ye1Var.f(2) != 0) {
                                            ncd.f("H263Reader", "Unhandled video object layer shape");
                                        }
                                        ye1Var.m();
                                        int f5 = ye1Var.f(16);
                                        ye1Var.m();
                                        if (ye1Var.e()) {
                                            if (f5 == 0) {
                                                ncd.f("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i12 = 0;
                                                for (int i13 = f5 - 1; i13 > 0; i13 >>= 1) {
                                                    i12++;
                                                }
                                                ye1Var.n(i12);
                                            }
                                        }
                                        ye1Var.m();
                                        int f6 = ye1Var.f(13);
                                        ye1Var.m();
                                        int f7 = ye1Var.f(13);
                                        ye1Var.m();
                                        ye1Var.m();
                                        fo4 fo4Var = new fo4();
                                        fo4Var.a = str;
                                        fo4Var.r = wf7.n("video/mp2t");
                                        fo4Var.s = wf7.n("video/mp4v-es");
                                        fo4Var.z = f6;
                                        fo4Var.A = f7;
                                        fo4Var.H = f;
                                        fo4Var.v = Collections.singletonList(copyOf);
                                        mlb.w(fo4Var, yzbVar);
                                        this.j = true;
                                    } else {
                                        f = f3 / f4;
                                        if (ye1Var.e()) {
                                        }
                                        if (ye1Var.f(2) != 0) {
                                        }
                                        ye1Var.m();
                                        int f52 = ye1Var.f(16);
                                        ye1Var.m();
                                        if (ye1Var.e()) {
                                        }
                                        ye1Var.m();
                                        int f62 = ye1Var.f(13);
                                        ye1Var.m();
                                        int f72 = ye1Var.f(13);
                                        ye1Var.m();
                                        ye1Var.m();
                                        fo4 fo4Var2 = new fo4();
                                        fo4Var2.a = str;
                                        fo4Var2.r = wf7.n("video/mp2t");
                                        fo4Var2.s = wf7.n("video/mp4v-es");
                                        fo4Var2.z = f62;
                                        fo4Var2.A = f72;
                                        fo4Var2.H = f;
                                        fo4Var2.v = Collections.singletonList(copyOf);
                                        mlb.w(fo4Var2, yzbVar);
                                        this.j = true;
                                    }
                                } else if (f2 < 7) {
                                    f = l[f2];
                                    if (ye1Var.e()) {
                                    }
                                    if (ye1Var.f(2) != 0) {
                                    }
                                    ye1Var.m();
                                    int f522 = ye1Var.f(16);
                                    ye1Var.m();
                                    if (ye1Var.e()) {
                                    }
                                    ye1Var.m();
                                    int f622 = ye1Var.f(13);
                                    ye1Var.m();
                                    int f722 = ye1Var.f(13);
                                    ye1Var.m();
                                    ye1Var.m();
                                    fo4 fo4Var22 = new fo4();
                                    fo4Var22.a = str;
                                    fo4Var22.r = wf7.n("video/mp2t");
                                    fo4Var22.s = wf7.n("video/mp4v-es");
                                    fo4Var22.z = f622;
                                    fo4Var22.A = f722;
                                    fo4Var22.H = f;
                                    fo4Var22.v = Collections.singletonList(copyOf);
                                    mlb.w(fo4Var22, yzbVar);
                                    this.j = true;
                                } else {
                                    ncd.f("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (ye1Var.e()) {
                                    }
                                    if (ye1Var.f(2) != 0) {
                                    }
                                    ye1Var.m();
                                    int f5222 = ye1Var.f(16);
                                    ye1Var.m();
                                    if (ye1Var.e()) {
                                    }
                                    ye1Var.m();
                                    int f6222 = ye1Var.f(13);
                                    ye1Var.m();
                                    int f7222 = ye1Var.f(13);
                                    ye1Var.m();
                                    ye1Var.m();
                                    fo4 fo4Var222 = new fo4();
                                    fo4Var222.a = str;
                                    fo4Var222.r = wf7.n("video/mp2t");
                                    fo4Var222.s = wf7.n("video/mp4v-es");
                                    fo4Var222.z = f6222;
                                    fo4Var222.A = f7222;
                                    fo4Var222.H = f;
                                    fo4Var222.v = Collections.singletonList(copyOf);
                                    mlb.w(fo4Var222, yzbVar);
                                    this.j = true;
                                }
                            } else {
                                i4 = 0;
                            }
                        } else if ((b2 & 240) != 32) {
                            ncd.f("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            xd5Var.c = false;
                            xd5Var.a = 0;
                            xd5Var.d = (byte) 0;
                        } else {
                            i4 = 0;
                            xd5Var.b = xd5Var.a;
                            xd5Var.d = (byte) 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            ncd.f("H263Reader", "Unexpected start code value");
                            xd5Var.c = false;
                            xd5Var.a = 0;
                            xd5Var.d = (byte) 0;
                        } else {
                            xd5Var.d = (byte) 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        xd5Var.d = (byte) 1;
                        xd5Var.c = true;
                    }
                }
                xd5Var.b(i4, 3, xd5.f);
            }
            this.f.a(i5, b, bArr);
            if (rj7Var != null) {
                if (i9 > 0) {
                    rj7Var.a(i5, b, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (rj7Var.b(i3)) {
                    int m = add.m(rj7Var.e, rj7Var.d);
                    String str2 = hac.a;
                    byte[] bArr2 = rj7Var.d;
                    yw7 yw7Var2 = this.b;
                    yw7Var2.L(m, bArr2);
                    this.a.a(this.k, yw7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (yw7Var.a[b + 2] == 1) {
                        rj7Var.d(i8);
                    }
                    int i14 = i - b;
                    this.f.b(i14, this.g - i14, this.j);
                    yd5 yd5Var = this.f;
                    long j = this.k;
                    yd5Var.e = i8;
                    yd5Var.d = false;
                    yd5Var.b = (i8 != 182 || i8 == 179) ? z : false;
                    yd5Var.c = i8 != 182 ? z : false;
                    yd5Var.f = 0;
                    yd5Var.h = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i142 = i - b;
            this.f.b(i142, this.g - i142, this.j);
            yd5 yd5Var2 = this.f;
            long j2 = this.k;
            yd5Var2.e = i8;
            yd5Var2.d = false;
            yd5Var2.b = (i8 != 182 || i8 == 179) ? z : false;
            yd5Var2.c = i8 != 182 ? z : false;
            yd5Var2.f = 0;
            yd5Var2.h = j2;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // rv3
    public final void d() {
        add.a(this.c);
        xd5 xd5Var = this.d;
        xd5Var.c = false;
        xd5Var.a = 0;
        xd5Var.d = (byte) 0;
        yd5 yd5Var = this.f;
        if (yd5Var != null) {
            yd5Var.b = false;
            yd5Var.c = false;
            yd5Var.d = false;
            yd5Var.e = -1;
        }
        rj7 rj7Var = this.e;
        if (rj7Var != null) {
            rj7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // rv3
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        yd5 yd5Var = this.f;
        yd5Var.b = false;
        yd5Var.c = false;
        yd5Var.d = false;
        yd5Var.e = -1;
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.h = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 2);
        this.i = c0;
        this.f = new yd5(c0);
        this.a.b(u84Var, l4cVar);
    }

    @Override // rv3
    public final void e() {
    }
}
