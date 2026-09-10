package pc;

import c5.b0;
import java.io.InputStream;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public b0 e;

    public final int a() {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i10 = this.b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        b0 b0Var = this.e;
        char c10 = i12 == 0 ? '0' : '1';
        int i13 = b0Var.b;
        char[] cArr = (char[]) b0Var.c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c10;
            b0Var.b = i13 + 1;
        }
        f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z10 = a() != 0;
        f(str, z10 ? "1" : "0");
        return z10;
    }

    public final long c(int i10) {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 1) | a();
        }
        return j3;
    }

    public final long d(int i10, String str) {
        long c10 = c(i10);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i10 = 0;
        int i11 = 0;
        while (a() == 0) {
            i11++;
        }
        if (i11 > 0) {
            i10 = (int) (((1 << i11) - 1) + c(i11));
        }
        f(str, String.valueOf(i10));
        return i10;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = f;
        b0 b0Var = this.e;
        String valueOf = String.valueOf(i10 - b0Var.b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - b0Var.b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(' ');
        }
        sb2.append(b0Var);
        sb2.append(" (" + str2 + ")");
        b0Var.b = 0;
    }
}
