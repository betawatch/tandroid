package rb;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final byte[][] a;
    public final int b;
    public final int c;

    public b(int i9, int i10) {
        this.a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i9);
        this.b = i9;
        this.c = i10;
    }

    public final byte a(int i9, int i10) {
        return this.a[i10][i9];
    }

    public final void b(int i9, int i10, int i11) {
        this.a[i10][i9] = (byte) i11;
    }

    public final String toString() {
        int i9 = this.b;
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder((i9 * 2 * i10) + 2);
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr = this.a[i11];
            for (int i12 = 0; i12 < i9; i12++) {
                byte b10 = bArr[i12];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
