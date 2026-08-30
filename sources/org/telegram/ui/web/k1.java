package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k1 extends FilterInputStream {
    public k1(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    public static int a(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return 0;
        }
        return i10 - 87;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != 61) {
            return read;
        }
        int read2 = ((FilterInputStream) this).in.read();
        int read3 = ((FilterInputStream) this).in.read();
        if (read2 == -1 || read3 == -1) {
            return -1;
        }
        return (read2 == 13 && read3 == 10) ? read() : (read2 == 10 || read3 == 10) ? read3 : (a(read2) << 4) | a(read3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int read = read();
            if (read != -1) {
                bArr[i10 + i12] = (byte) read;
                i13++;
                i12++;
            } else if (i13 == 0) {
                return -1;
            }
        }
        return i13;
    }
}
