package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i1 extends FilterInputStream {
    public i1(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    public static int a(int i9) {
        if (i9 >= 48 && i9 <= 57) {
            return i9 - 48;
        }
        if (i9 >= 65 && i9 <= 70) {
            return i9 - 55;
        }
        if (i9 < 97 || i9 > 102) {
            return 0;
        }
        return i9 - 87;
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
    public final int read(byte[] bArr, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int read = read();
            if (read != -1) {
                bArr[i9 + i11] = (byte) read;
                i12++;
                i11++;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }
}
