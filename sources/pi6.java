// default package

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pi6 extends FilterInputStream {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi6(BufferedInputStream bufferedInputStream, byte b) {
        super(bufferedInputStream);
        this.a = b;
    }

    public static int a(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return 0;
        }
        return i - 87;
    }

    public final void b(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new er5(i2);
            }
            i2 += read;
        }
    }

    public final vyc c() {
        byte[] bArr;
        byte[] bArr2 = new byte[8];
        try {
            b(2, bArr2);
            byte b = bArr2[0];
            boolean z = (b & 128) != 0;
            boolean z2 = (b & 64) != 0;
            boolean z3 = (b & 32) != 0;
            boolean z4 = (b & 16) != 0;
            int i = b & 15;
            byte b2 = bArr2[1];
            boolean z5 = (b2 & 128) != 0;
            long j = b2 & Byte.MAX_VALUE;
            if (j == 126) {
                b(2, bArr2);
                j = ((bArr2[0] & 255) << 8) | (bArr2[1] & 255);
            } else if (j == 127) {
                b(8, bArr2);
                byte b3 = bArr2[0];
                if ((b3 & 128) != 0) {
                    throw new syc(21, "The payload length of a frame is invalid.");
                }
                j = ((b3 & 255) << 56) | ((bArr2[1] & 255) << 48) | ((bArr2[2] & 255) << 40) | ((bArr2[3] & 255) << 32) | ((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16) | ((bArr2[6] & 255) << 8) | (bArr2[7] & 255);
            }
            byte[] bArr3 = null;
            if (z5) {
                bArr = new byte[4];
                b(4, bArr);
            } else {
                bArr = null;
            }
            if (2147483647L < j) {
                try {
                    skip(j);
                } catch (IOException unused) {
                }
                throw new syc(22, "The payload length of a frame exceeds the maximum array size in Java.");
            }
            if (j != 0) {
                int i2 = (int) j;
                try {
                    byte[] bArr4 = new byte[i2];
                    b(i2, bArr4);
                    if (z5 && bArr != null && bArr.length >= 4) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3 % 4]);
                        }
                    }
                    bArr3 = bArr4;
                } catch (OutOfMemoryError e) {
                    try {
                        skip(j);
                    } catch (IOException unused2) {
                    }
                    throw new syc(23, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e.getMessage(), e);
                }
            }
            vyc vycVar = new vyc();
            vycVar.a = z;
            vycVar.b = z2;
            vycVar.c = z3;
            vycVar.d = z4;
            vycVar.e = i;
            vycVar.f = z5;
            vycVar.c(bArr3);
            return vycVar;
        } catch (er5 e2) {
            if (e2.b == 0) {
                throw new pm7(48, "No more WebSocket frame from the server.");
            }
            throw e2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
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
                if (read2 == 13 && read3 == 10) {
                    return read();
                }
                if (read2 == 10 || read3 == 10) {
                    return read3;
                }
                return a(read3) | (a(read2) << 4);
            default:
                return super.read();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int read = read();
                    if (read == -1) {
                        if (i3 == 0) {
                            return -1;
                        }
                        return i3;
                    }
                    bArr[i + i4] = (byte) read;
                    i3++;
                }
                return i3;
            default:
                return super.read(bArr, i, i2);
        }
    }
}
