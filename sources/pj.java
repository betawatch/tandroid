// default package

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pj implements j74 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final yn3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public l74 l;
    public wxb m;
    public wxb n;
    public fv9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = g8c.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public pj(int i) {
        this.b = i;
        yn3 yn3Var = new yn3();
        this.c = yn3Var;
        this.n = yn3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        long j;
        int g;
        fv9 fv9Var;
        int i;
        int i2;
        int f;
        int i3;
        int i4;
        String str;
        String str2;
        this.m.getClass();
        String str3 = g8c.a;
        if (((ja3) k74Var).d == 0 && !h((ja3) k74Var)) {
            throw av7.a("Could not find AMR header.", null);
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
            wxb wxbVar = this.m;
            em4 em4Var = new em4();
            em4Var.r = ud7.n(str);
            em4Var.s = ud7.n(str2);
            em4Var.t = i3;
            em4Var.M = 1;
            em4Var.O = i4;
            yjb.v(em4Var, wxbVar);
        }
        if (this.g == 0) {
            try {
                g = g((ja3) k74Var);
                this.f = g;
                this.g = g;
                int i5 = this.i;
                if (i5 == -1) {
                    this.h = ((ja3) k74Var).d;
                    this.i = g;
                    i5 = g;
                }
                if (i5 == g) {
                    this.j++;
                }
                fv9Var = this.o;
            } catch (EOFException unused) {
                j = 0;
            }
            if (fv9Var instanceof in5) {
                in5 in5Var = (in5) fv9Var;
                long j2 = this.k + this.e + 20000;
                j = 0;
                long j3 = ((ja3) k74Var).d + g;
                dd ddVar = in5Var.b;
                int i6 = ddVar.b;
                if (i6 == 0 || j2 - ddVar.f0(i6 - 1) >= 100000) {
                    in5Var.i(j2, j3);
                }
                if (this.p && Math.abs(this.q - j2) < 20000) {
                    this.p = false;
                    this.n = this.m;
                }
                f = this.n.f(k74Var, this.g, true);
                if (f != -1) {
                    int i7 = this.g - f;
                    this.g = i7;
                    if (i7 <= 0) {
                        this.n.a(this.k + this.e, 1, this.f, 0, null);
                        this.e += 20000;
                    }
                    i = 0;
                    long j4 = ((ja3) k74Var).c;
                    if (this.o == null) {
                        int i8 = this.b;
                        if ((i8 & 4) != 0) {
                            this.o = new in5(-9223372036854775807L, new long[]{this.h}, new long[]{j});
                        } else if ((i8 & 1) == 0 || !((i2 = this.i) == -1 || i2 == this.f)) {
                            this.o = new oc0(-9223372036854775807L);
                        } else if (this.j >= 20 || i == -1) {
                            ps2 ps2Var = new ps2(j4, this.h, (int) (((i2 << 3) * 1000000) / 20000), i2, (i8 & 2) != 0, true);
                            this.o = ps2Var;
                            this.m.d(ps2Var.f);
                        }
                        fv9 fv9Var2 = this.o;
                        if (fv9Var2 != null) {
                            this.l.g0(fv9Var2);
                        }
                    }
                    if (i == -1) {
                        fv9 fv9Var3 = this.o;
                        if (fv9Var3 instanceof in5) {
                            long j5 = this.k + this.e;
                            ((in5) fv9Var3).c = j5;
                            this.l.g0(fv9Var3);
                            this.m.d(j5);
                        }
                    }
                    return i;
                }
                i = -1;
                long j42 = ((ja3) k74Var).c;
                if (this.o == null) {
                }
                if (i == -1) {
                }
                return i;
            }
        }
        j = 0;
        f = this.n.f(k74Var, this.g, true);
        if (f != -1) {
        }
        i = -1;
        long j422 = ((ja3) k74Var).c;
        if (this.o == null) {
        }
        if (i == -1) {
        }
        return i;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        return h((ja3) k74Var);
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        fv9 fv9Var = this.o;
        if (!(fv9Var instanceof in5)) {
            if (j == 0 || !(fv9Var instanceof ps2)) {
                this.k = 0L;
                return;
            } else {
                this.k = ((Math.max(0L, j - ((ps2) fv9Var).b) << 3) * 1000000) / r7.e;
                return;
            }
        }
        in5 in5Var = (in5) fv9Var;
        dd ddVar = in5Var.b;
        long f0 = ddVar.b == 0 ? -9223372036854775807L : ddVar.f0(g8c.c(in5Var.a, j));
        this.k = f0;
        if (Math.abs(this.q - f0) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.l = l74Var;
        wxb S = l74Var.S(0, 1);
        this.m = S;
        this.n = S;
        l74Var.z();
    }

    public final int g(ja3 ja3Var) {
        boolean z;
        ja3Var.f = 0;
        byte[] bArr = this.a;
        ja3Var.d(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw av7.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (!(z = this.d) ? !(i < 12 || i > 14) : !(i < 10 || i > 13))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw av7.a(sb.toString(), null);
    }

    public final boolean h(ja3 ja3Var) {
        ja3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        ja3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            ja3Var.l(bArr.length, false);
            return true;
        }
        ja3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        ja3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        ja3Var.l(bArr3.length, false);
        return true;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
