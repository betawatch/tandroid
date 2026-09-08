package yf;

import java.io.OutputStream;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a0 extends OutputStream {
    public byte[] a;
    public int b;

    public a0(int i10) {
        this.a = new byte[i10];
    }

    public final void a(int i10) {
        byte[] bArr = this.a;
        if (i10 - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i10 < 0) {
                length = i10;
            }
            if (length - 2147483639 > 0) {
                if (i10 < 0) {
                    throw new OutOfMemoryError();
                }
                length = i10 > 2147483639 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483639;
            }
            this.a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.b = 0;
    }

    public final void c(int i10) {
        a(this.b + 4);
        byte[] bArr = this.a;
        int i11 = this.b;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.b = i11 + 4;
    }

    public final void d(long j3) {
        a(this.b + 8);
        byte[] bArr = this.a;
        int i10 = this.b;
        bArr[i10] = (byte) (j3 >>> 56);
        bArr[i10 + 1] = (byte) (j3 >>> 48);
        bArr[i10 + 2] = (byte) (j3 >>> 40);
        bArr[i10 + 3] = (byte) (j3 >>> 32);
        bArr[i10 + 4] = (byte) (j3 >>> 24);
        bArr[i10 + 5] = (byte) (j3 >>> 16);
        bArr[i10 + 6] = (byte) (j3 >>> 8);
        bArr[i10 + 7] = (byte) j3;
        this.b = i10 + 8;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        a(this.b + 1);
        byte[] bArr = this.a;
        int i11 = this.b;
        bArr[i11] = (byte) i10;
        this.b = i11 + 1;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        if (i10 >= 0) {
            if (i10 <= bArr.length && i11 >= 0 && (i10 + i11) - bArr.length <= 0) {
                a(this.b + i11);
                System.arraycopy(bArr, i10, this.a, this.b, i11);
                this.b += i11;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
