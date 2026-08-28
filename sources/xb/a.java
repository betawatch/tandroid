package xb;

import java.io.InputStream;
import n2.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public w e;

    public final int a() {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i9 = this.b;
        int i10 = this.d;
        int i11 = (i9 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        w wVar = this.e;
        char c10 = i11 == 0 ? '0' : '1';
        int i12 = wVar.b;
        char[] cArr = (char[]) wVar.c;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c10;
            wVar.b = i12 + 1;
        }
        f++;
        return i11;
    }

    public final boolean b(String str) {
        boolean z10 = a() != 0;
        f(str, z10 ? "1" : "0");
        return z10;
    }

    public final long c(int i9) {
        if (i9 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j10 = (j10 << 1) | a();
        }
        return j10;
    }

    public final long d(int i9, String str) {
        long c10 = c(i9);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i9 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i9 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i9));
        return i9;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i9 = f;
        w wVar = this.e;
        String valueOf = String.valueOf(i9 - wVar.b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - wVar.b;
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(wVar);
        sb2.append(" (" + str2 + ")");
        wVar.b = 0;
    }
}
