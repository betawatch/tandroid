package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m1 extends FilterInputStream {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(BufferedInputStream bufferedInputStream, int i10) {
        super(bufferedInputStream);
        this.a = i10;
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

    public void b(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 < i10) {
            int read = read(bArr, i11, i10 - i11);
            if (read <= 0) {
                throw new sc.j(i11);
            }
            i11 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sc.y c() {
        int i10;
        byte b10;
        byte[] bArr;
        byte[] bArr2 = new byte[8];
        try {
            b(2, bArr2);
            byte b11 = bArr2[0];
            boolean z10 = (b11 & 128) != 0;
            boolean z11 = (b11 & 64) != 0;
            boolean z12 = (b11 & 32) != 0;
            boolean z13 = (b11 & 16) != 0;
            int i11 = b11 & 15;
            byte b12 = bArr2[1];
            boolean z14 = (b12 & 128) != 0;
            long j3 = b12 & Byte.MAX_VALUE;
            if (j3 != 126) {
                if (j3 == 127) {
                    b(8, bArr2);
                    byte b13 = bArr2[0];
                    if ((b13 & 128) != 0) {
                        throw new sc.w(21, "The payload length of a frame is invalid.");
                    }
                    i10 = ((bArr2[6] & 255) << 8) | ((bArr2[1] & 255) << 48) | ((b13 & 255) << 56) | ((bArr2[2] & 255) << 40) | ((bArr2[3] & 255) << 32) | ((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16);
                    b10 = bArr2[7];
                }
                byte[] bArr3 = null;
                if (z14) {
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
                    throw new sc.w(22, "The payload length of a frame exceeds the maximum array size in Java.");
                }
                if (j3 != 0) {
                    int i12 = (int) j3;
                    try {
                        byte[] bArr4 = new byte[i12];
                        b(i12, bArr4);
                        if (z14 && bArr != null && bArr.length >= 4) {
                            for (int i13 = 0; i13 < i12; i13++) {
                                bArr4[i13] = (byte) (bArr4[i13] ^ bArr[i13 % 4]);
                            }
                        }
                        bArr3 = bArr4;
                    } catch (OutOfMemoryError e7) {
                        try {
                            skip(j3);
                        } catch (IOException unused2) {
                        }
                        throw new sc.w(23, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e7.getMessage(), e7);
                    }
                }
                sc.y yVar = new sc.y();
                yVar.a = z10;
                yVar.b = z11;
                yVar.c = z12;
                yVar.d = z13;
                yVar.e = i11;
                yVar.f = z14;
                yVar.c(bArr3);
                return yVar;
            }
            b(2, bArr2);
            i10 = (bArr2[0] & 255) << 8;
            b10 = bArr2[1];
            j3 = i10 | (b10 & 255);
            byte[] bArr32 = null;
            if (z14) {
            }
            if (2147483647L >= j3) {
            }
        } catch (sc.j e10) {
            if (e10.b == 0) {
                throw new sc.l(48, "No more WebSocket frame from the server.");
            }
            throw e10;
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
    public int read(byte[] bArr, int i10, int i11) {
        switch (this.a) {
            case 0:
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    int read = read();
                    if (read == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    bArr[i10 + i13] = (byte) read;
                    i12++;
                }
                return i12;
            default:
                return super.read(bArr, i10, i11);
        }
    }
}
