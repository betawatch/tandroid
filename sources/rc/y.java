package rc;

import java.io.BufferedOutputStream;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class y extends BufferedOutputStream {
    public final void a(x xVar) {
        byte[] bArr;
        write((xVar.a ? 128 : 0) | (xVar.b ? 64 : 0) | (xVar.c ? 32 : 0) | (xVar.d ? 16 : 0) | (xVar.e & 15));
        byte[] bArr2 = xVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? qs.d4 : 255);
        byte[] bArr3 = xVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & qs.e4), (byte) (length2 & qs.e4)};
            } else {
                bArr = new byte[8];
                for (int i7 = 7; i7 >= 0; i7--) {
                    bArr[i7] = (byte) (length2 & qs.e4);
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
        for (int i10 = 0; i10 < bArr5.length; i10++) {
            bArr6[i10] = (byte) ((bArr5[i10] ^ bArr4[i10 % 4]) & qs.e4);
        }
        write(bArr6);
    }
}
