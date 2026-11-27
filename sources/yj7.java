// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yj7 {
    public final short a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public yj7(int i) {
        this.a = i;
        byte[] bArr = new byte[jn7.O1];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                bArr2 = Arrays.copyOf(bArr2, i4 << 1);
                this.d = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.e, i3);
            this.e += i3;
        }
    }

    public final boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int i) {
        yve.p(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
