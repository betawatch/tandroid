// default package

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pk implements s84 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final ip3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public u84 l;
    public yzb m;
    public yzb n;
    public ix9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = hac.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public pk(int i) {
        this.b = i;
        ip3 ip3Var = new ip3();
        this.c = ip3Var;
        this.n = ip3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        long j;
        int g;
        ix9 ix9Var;
        int i;
        int i2;
        int f;
        int i3;
        int i4;
        String str;
        String str2;
        this.m.getClass();
        String str3 = hac.a;
        if (((vb3) t84Var).d == 0 && !h((vb3) t84Var)) {
            throw bx7.a("Could not find AMR header.", null);
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
            yzb yzbVar = this.m;
            fo4 fo4Var = new fo4();
            fo4Var.r = wf7.n(str);
            fo4Var.s = wf7.n(str2);
            fo4Var.t = i3;
            fo4Var.M = 1;
            fo4Var.O = i4;
            mlb.w(fo4Var, yzbVar);
        }
        if (this.g == 0) {
            try {
                g = g((vb3) t84Var);
                this.f = g;
                this.g = g;
                int i5 = this.i;
                if (i5 == -1) {
                    this.h = ((vb3) t84Var).d;
                    this.i = g;
                    i5 = g;
                }
                if (i5 == g) {
                    this.j++;
                }
                ix9Var = this.o;
            } catch (EOFException unused) {
                j = 0;
            }
            if (ix9Var instanceof ip5) {
                ip5 ip5Var = (ip5) ix9Var;
                long j2 = this.k + this.e + 20000;
                j = 0;
                long j3 = ((vb3) t84Var).d + g;
                de deVar = ip5Var.b;
                int i6 = deVar.b;
                if (i6 == 0 || j2 - deVar.g0(i6 - 1) >= 100000) {
                    ip5Var.i(j2, j3);
                }
                if (this.p && Math.abs(this.q - j2) < 20000) {
                    this.p = false;
                    this.n = this.m;
                }
                f = this.n.f(t84Var, this.g, true);
                if (f != -1) {
                    int i7 = this.g - f;
                    this.g = i7;
                    if (i7 <= 0) {
                        this.n.a(this.k + this.e, 1, this.f, 0, null);
                        this.e += 20000;
                    }
                    i = 0;
                    long j4 = ((vb3) t84Var).c;
                    if (this.o == null) {
                        int i8 = this.b;
                        if ((i8 & 4) != 0) {
                            this.o = new ip5(-9223372036854775807L, new long[]{this.h}, new long[]{j});
                        } else if ((i8 & 1) == 0 || !((i2 = this.i) == -1 || i2 == this.f)) {
                            this.o = new od0(-9223372036854775807L);
                        } else if (this.j >= 20 || i == -1) {
                            au2 au2Var = new au2(j4, this.h, (int) (((i2 << 3) * 1000000) / 20000), i2, (i8 & 2) != 0, true);
                            this.o = au2Var;
                            this.m.d(au2Var.f);
                        }
                        ix9 ix9Var2 = this.o;
                        if (ix9Var2 != null) {
                            this.l.f0(ix9Var2);
                        }
                    }
                    if (i == -1) {
                        ix9 ix9Var3 = this.o;
                        if (ix9Var3 instanceof ip5) {
                            long j5 = this.k + this.e;
                            ((ip5) ix9Var3).c = j5;
                            this.l.f0(ix9Var3);
                            this.m.d(j5);
                        }
                    }
                    return i;
                }
                i = -1;
                long j42 = ((vb3) t84Var).c;
                if (this.o == null) {
                }
                if (i == -1) {
                }
                return i;
            }
        }
        j = 0;
        f = this.n.f(t84Var, this.g, true);
        if (f != -1) {
        }
        i = -1;
        long j422 = ((vb3) t84Var).c;
        if (this.o == null) {
        }
        if (i == -1) {
        }
        return i;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        return h((vb3) t84Var);
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        ix9 ix9Var = this.o;
        if (!(ix9Var instanceof ip5)) {
            if (j == 0 || !(ix9Var instanceof au2)) {
                this.k = 0L;
                return;
            } else {
                this.k = ((Math.max(0L, j - ((au2) ix9Var).b) << 3) * 1000000) / r7.e;
                return;
            }
        }
        ip5 ip5Var = (ip5) ix9Var;
        de deVar = ip5Var.b;
        long g0 = deVar.b == 0 ? -9223372036854775807L : deVar.g0(hac.c(ip5Var.a, j));
        this.k = g0;
        if (Math.abs(this.q - g0) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.l = u84Var;
        yzb c0 = u84Var.c0(0, 1);
        this.m = c0;
        this.n = c0;
        u84Var.B();
    }

    public final int g(vb3 vb3Var) {
        boolean z;
        vb3Var.f = 0;
        byte[] bArr = this.a;
        vb3Var.d(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw bx7.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (!(z = this.d) ? !(i < 12 || i > 14) : !(i < 10 || i > 13))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw bx7.a(sb.toString(), null);
    }

    public final boolean h(vb3 vb3Var) {
        vb3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        vb3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            vb3Var.m(bArr.length, false);
            return true;
        }
        vb3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        vb3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        vb3Var.m(bArr3.length, false);
        return true;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
