package zb;

import java.io.InputStream;
import p2.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public u e;

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
        u uVar = this.e;
        char c3 = i12 == 0 ? '0' : '1';
        int i13 = uVar.b;
        char[] cArr = (char[]) uVar.c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c3;
            uVar.b = i13 + 1;
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
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 1) | a();
        }
        return j10;
    }

    public final long d(int i10, String str) {
        long c3 = c(i10);
        f(str, String.valueOf(c3));
        return c3;
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
        u uVar = this.e;
        String valueOf = String.valueOf(i10 - uVar.b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - uVar.b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(' ');
        }
        sb2.append(uVar);
        sb2.append(" (" + str2 + ")");
        uVar.b = 0;
    }
}
