// default package

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xb5 {
    public static final byte[] e = {0, 0, 1};
    public byte[] a;
    public int b;
    public int c;
    public boolean d;

    public final void a(int i, int i2, byte[] bArr) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                bArr2 = Arrays.copyOf(bArr2, i4 << 1);
                this.a = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.b, i3);
            this.b += i3;
        }
    }

    public final int b() {
        int i;
        int i2;
        if (this.d || (i2 = (i = this.c) + 4) > this.b) {
            this.d = true;
            return 0;
        }
        byte[] bArr = this.a;
        int i3 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        this.c = i2;
        return i3;
    }

    public final String c() {
        int i;
        int i2;
        int i3;
        if (this.d || (i = this.c) >= (i2 = this.b)) {
            this.d = true;
            return null;
        }
        byte[] bArr = this.a;
        int i4 = bArr[i] & 255;
        if (i4 != 254) {
            i3 = 1;
        } else {
            if (i + 4 > i2) {
                this.d = true;
                return null;
            }
            i4 = (bArr[i + 1] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 3] & 255) << 16);
            i3 = 4;
        }
        int i5 = (i3 + i4 + 3) & (-4);
        if (i + i5 > i2) {
            this.d = true;
            return null;
        }
        String str = new String(bArr, i + i3, i4, StandardCharsets.UTF_8);
        this.c += i5;
        return str;
    }
}
