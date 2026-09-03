package vb;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final byte[][] a;
    public final int b;
    public final int c;

    public b(int i10, int i11) {
        this.a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.b = i10;
        this.c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.a[i11][i10] = (byte) i12;
    }

    public final String toString() {
        int i10 = this.b;
        int i11 = this.c;
        StringBuilder sb = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 == 0) {
                    sb.append(" 0");
                } else if (b10 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
