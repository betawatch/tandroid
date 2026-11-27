// default package

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qj implements e84 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final po3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public g84 l;
    public x1c m;
    public x1c n;
    public zy9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = gcc.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public qj(int i) {
        this.b = i;
        po3 po3Var = new po3();
        this.c = po3Var;
        this.n = po3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        long j;
        int g;
        zy9 zy9Var;
        int i;
        int i2;
        int f;
        int i3;
        int i4;
        String str;
        String str2;
        this.m.getClass();
        String str3 = gcc.a;
        if (((cb3) f84Var).d == 0 && !h((cb3) f84Var)) {
            throw hy7.a("Could not find AMR header.", null);
        }
        if (!this.r) {
            this.r = true;
            if (this.d) {
                i3 = t[8];
                str2 = "audio/amr-wb";
                i4 = 16000;
                str = "audio/amr-wb";
            } else {
                i3 = s[7];
                i4 = 8000;
                str = "audio/amr";
                str2 = "audio/3gpp";
            }
            x1c x1cVar = this.m;
            jo4 jo4Var = new jo4();
            jo4Var.r = dg7.n(str);
            jo4Var.s = dg7.n(str2);
            jo4Var.t = i3;
            jo4Var.M = 1;
            jo4Var.O = i4;
            xnb.v(jo4Var, x1cVar);
        }
        if (this.g == 0) {
            try {
                g = g((cb3) f84Var);
                this.f = g;
                this.g = g;
                int i5 = this.i;
                if (i5 == -1) {
                    this.h = ((cb3) f84Var).d;
                    this.i = g;
                    i5 = g;
                }
                if (i5 == g) {
                    this.j++;
                }
                zy9Var = this.o;
            } catch (EOFException unused) {
                j = 0;
            }
            if (zy9Var instanceof lp5) {
                lp5 lp5Var = (lp5) zy9Var;
                long j2 = this.k + this.e + 20000;
                j = 0;
                long j3 = ((cb3) f84Var).d + g;
                ed edVar = lp5Var.b;
                int i6 = edVar.b;
                if (i6 == 0 || j2 - edVar.h0(i6 - 1) >= 100000) {
                    lp5Var.i(j2, j3);
                }
                if (this.p && Math.abs(this.q - j2) < 20000) {
                    this.p = false;
                    this.n = this.m;
                }
                f = this.n.f(f84Var, this.g, true);
                if (f != -1) {
                    int i7 = this.g - f;
                    this.g = i7;
                    if (i7 <= 0) {
                        this.n.a(this.k + this.e, 1, this.f, 0, null);
                        this.e += 20000;
                    }
                    i = 0;
                    long j4 = ((cb3) f84Var).c;
                    if (this.o == null) {
                        int i8 = this.b;
                        if ((i8 & 4) != 0) {
                            this.o = new lp5(-9223372036854775807L, new long[]{this.h}, new long[]{j});
                        } else if ((i8 & 1) == 0 || !((i2 = this.i) == -1 || i2 == this.f)) {
                            this.o = new qc0(-9223372036854775807L);
                        } else if (this.j >= 20 || i == -1) {
                            jt2 jt2Var = new jt2(j4, this.h, (int) (((i2 << 3) * 1000000) / 20000), i2, (i8 & 2) != 0, true);
                            this.o = jt2Var;
                            this.m.d(jt2Var.f);
                        }
                        zy9 zy9Var2 = this.o;
                        if (zy9Var2 != null) {
                            this.l.m0(zy9Var2);
                        }
                    }
                    if (i == -1) {
                        zy9 zy9Var3 = this.o;
                        if (zy9Var3 instanceof lp5) {
                            long j5 = this.k + this.e;
                            ((lp5) zy9Var3).c = j5;
                            this.l.m0(zy9Var3);
                            this.m.d(j5);
                        }
                    }
                    return i;
                }
                i = -1;
                long j42 = ((cb3) f84Var).c;
                if (this.o == null) {
                }
                if (i == -1) {
                }
                return i;
            }
        }
        j = 0;
        f = this.n.f(f84Var, this.g, true);
        if (f != -1) {
        }
        i = -1;
        long j422 = ((cb3) f84Var).c;
        if (this.o == null) {
        }
        if (i == -1) {
        }
        return i;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        return h((cb3) f84Var);
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        zy9 zy9Var = this.o;
        if (!(zy9Var instanceof lp5)) {
            if (j == 0 || !(zy9Var instanceof jt2)) {
                this.k = 0L;
                return;
            } else {
                this.k = ((Math.max(0L, j - ((jt2) zy9Var).b) << 3) * 1000000) / r7.e;
                return;
            }
        }
        lp5 lp5Var = (lp5) zy9Var;
        ed edVar = lp5Var.b;
        long h0 = edVar.b == 0 ? -9223372036854775807L : edVar.h0(gcc.c(lp5Var.a, j));
        this.k = h0;
        if (Math.abs(this.q - h0) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.l = g84Var;
        x1c e0 = g84Var.e0(0, 1);
        this.m = e0;
        this.n = e0;
        g84Var.D();
    }

    public final int g(cb3 cb3Var) {
        boolean z;
        cb3Var.f = 0;
        byte[] bArr = this.a;
        cb3Var.d(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw hy7.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (!(z = this.d) ? !(i < 12 || i > 14) : !(i < 10 || i > 13))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw hy7.a(sb.toString(), null);
    }

    public final boolean h(cb3 cb3Var) {
        cb3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        cb3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            cb3Var.l(bArr.length, false);
            return true;
        }
        cb3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        cb3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        cb3Var.l(bArr3.length, false);
        return true;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
