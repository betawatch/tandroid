package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e1 extends FilterInputStream {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(BufferedInputStream bufferedInputStream, int i7) {
        super(bufferedInputStream);
        this.a = i7;
    }

    public static int a(int i7) {
        if (i7 >= 48 && i7 <= 57) {
            return i7 - 48;
        }
        if (i7 >= 65 && i7 <= 70) {
            return i7 - 55;
        }
        if (i7 < 97 || i7 > 102) {
            return 0;
        }
        return i7 - 87;
    }

    public void b(int i7, byte[] bArr) {
        int i10 = 0;
        while (i10 < i7) {
            int read = read(bArr, i10, i7 - i10);
            if (read <= 0) {
                throw new rc.j(i10);
            }
            i10 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rc.x c() {
        int i7;
        byte b10;
        byte[] bArr;
        byte[] bArr2 = new byte[8];
        try {
            b(2, bArr2);
            byte b11 = bArr2[0];
            boolean z9 = (b11 & 128) != 0;
            boolean z10 = (b11 & 64) != 0;
            boolean z11 = (b11 & 32) != 0;
            boolean z12 = (b11 & 16) != 0;
            int i10 = b11 & 15;
            byte b12 = bArr2[1];
            boolean z13 = (b12 & 128) != 0;
            long j3 = b12 & Byte.MAX_VALUE;
            if (j3 != 126) {
                if (j3 == 127) {
                    b(8, bArr2);
                    byte b13 = bArr2[0];
                    if ((b13 & 128) != 0) {
                        throw new rc.v(21, "The payload length of a frame is invalid.");
                    }
                    i7 = ((bArr2[6] & 255) << 8) | ((bArr2[1] & 255) << 48) | ((b13 & 255) << 56) | ((bArr2[2] & 255) << 40) | ((bArr2[3] & 255) << 32) | ((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16);
                    b10 = bArr2[7];
                }
                byte[] bArr3 = null;
                if (z13) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                    b(4, bArr);
                }
                if (2147483647L >= j3) {
                    try {
                        skip(j3);
                    } catch (IOException unused) {
                    }
                    throw new rc.v(22, "The payload length of a frame exceeds the maximum array size in Java.");
                }
                if (j3 != 0) {
                    int i11 = (int) j3;
                    try {
                        byte[] bArr4 = new byte[i11];
                        b(i11, bArr4);
                        if (z13 && bArr != null && bArr.length >= 4) {
                            for (int i12 = 0; i12 < i11; i12++) {
                                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12 % 4]);
                            }
                        }
                        bArr3 = bArr4;
                    } catch (OutOfMemoryError e10) {
                        try {
                            skip(j3);
                        } catch (IOException unused2) {
                        }
                        throw new rc.v(23, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e10.getMessage(), e10);
                    }
                }
                rc.x xVar = new rc.x();
                xVar.a = z9;
                xVar.b = z10;
                xVar.c = z11;
                xVar.d = z12;
                xVar.e = i10;
                xVar.f = z13;
                xVar.c(bArr3);
                return xVar;
            }
            b(2, bArr2);
            i7 = (bArr2[0] & 255) << 8;
            b10 = bArr2[1];
            j3 = i7 | (b10 & 255);
            byte[] bArr32 = null;
            if (z13) {
            }
            if (2147483647L >= j3) {
            }
        } catch (rc.j e11) {
            if (e11.b == 0) {
                throw new rc.l(48, "No more WebSocket frame from the server.");
            }
            throw e11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        switch (this.a) {
            case 0:
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
            default:
                return super.read();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i10) {
        switch (this.a) {
            case 0:
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int read = read();
                    if (read == -1) {
                        if (i11 == 0) {
                            return -1;
                        }
                        return i11;
                    }
                    bArr[i7 + i12] = (byte) read;
                    i11++;
                }
                return i11;
            default:
                return super.read(bArr, i7, i10);
        }
    }
}
