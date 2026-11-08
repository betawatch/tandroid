package org.telegram.utils.twidget;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class i {
    public final ByteBuffer a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int[] e;
    public final int[] f;
    public final String[] g;

    public i(ByteBuffer byteBuffer, int i7, boolean z9, int i10, int[] iArr, int[] iArr2) {
        this.a = byteBuffer;
        this.b = i7;
        this.c = z9;
        this.d = i10;
        this.e = iArr;
        this.f = iArr2;
        this.g = new String[iArr.length];
    }

    public static IllegalArgumentException a() {
        return new IllegalArgumentException("Display list");
    }

    public static i b(byte[] bArr) {
        if (bArr.length < 24 || (bArr.length & 3) != 0) {
            throw a();
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (order.getInt(0) != 1279547220 || order.getInt(4) != 1) {
            throw a();
        }
        int i7 = order.getInt(8);
        int i10 = order.getInt(12);
        long j3 = order.getInt(16) * 4;
        if (i7 < 0 || i7 > 200000 || j3 < 20 || 4 + j3 > bArr.length) {
            throw a();
        }
        int i11 = (int) j3;
        int i12 = order.getInt(i11);
        int i13 = i11 + 4;
        if (i12 < 0 || i12 > i7 || i12 > (bArr.length - i13) / 4) {
            throw a();
        }
        int[] iArr = new int[i12];
        int i14 = i13;
        int[] iArr2 = new int[i12];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i14 + 4;
            if (i16 > bArr.length) {
                throw a();
            }
            int i17 = order.getInt(i14);
            if (i17 < 0 || i17 > (bArr.length - i14) - 4) {
                throw a();
            }
            iArr[i15] = i16;
            iArr2[i15] = i17;
            i14 += ((i17 + 3) & (-4)) + 4;
        }
        if (i14 <= bArr.length) {
            return new i(order, i7, (i10 & 1) != 0, i11, iArr, iArr2);
        }
        throw a();
    }
}
