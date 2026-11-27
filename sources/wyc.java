// default package

import java.io.BufferedOutputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wyc extends BufferedOutputStream {
    public final void a(vyc vycVar) {
        byte[] bArr;
        write((vycVar.a ? 128 : 0) | (vycVar.b ? 64 : 0) | (vycVar.c ? 32 : 0) | (vycVar.d ? 16 : 0) | (vycVar.e & 15));
        byte[] bArr2 = vycVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? jn7.c4 : 255);
        byte[] bArr3 = vycVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & jn7.d4), (byte) (length2 & jn7.d4)};
            } else {
                bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) (length2 & jn7.d4);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        hg7.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = vycVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i2 = 0; i2 < bArr5.length; i2++) {
            bArr6[i2] = (byte) ((bArr5[i2] ^ bArr4[i2 % 4]) & jn7.d4);
        }
        write(bArr6);
    }
}
