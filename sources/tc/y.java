package tc;

import java.io.BufferedOutputStream;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class y extends BufferedOutputStream {
    public final void a(x xVar) {
        byte[] bArr;
        write((xVar.a ? 128 : 0) | (xVar.b ? 64 : 0) | (xVar.c ? 32 : 0) | (xVar.d ? 16 : 0) | (xVar.e & 15));
        byte[] bArr2 = xVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? 254 : 255);
        byte[] bArr3 = xVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & 255), (byte) (length2 & 255)};
            } else {
                bArr = new byte[8];
                for (int i10 = 7; i10 >= 0; i10--) {
                    bArr[i10] = (byte) (length2 & 255);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        k.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = xVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i11 = 0; i11 < bArr5.length; i11++) {
            bArr6[i11] = (byte) ((bArr5[i11] ^ bArr4[i11 % 4]) & 255);
        }
        write(bArr6);
    }
}
