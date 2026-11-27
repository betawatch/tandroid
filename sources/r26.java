// default package

import java.io.OutputStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r26 extends OutputStream {
    public final /* synthetic */ byte a;
    public long b;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        int length3;
        int i6;
        int length4;
        int i7;
        switch (this.a) {
            case 0:
                if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += i2;
                return;
            case 1:
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i4 = i + i2) > length || i4 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += i2;
                return;
            case 2:
                if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i5 = i + i2) > length2 || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += i2;
                return;
            case 3:
                if (i < 0 || i > (length3 = bArr.length) || i2 < 0 || (i6 = i + i2) > length3 || i6 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += i2;
                return;
            default:
                if (i < 0 || i > (length4 = bArr.length) || i2 < 0 || (i7 = i + i2) > length4 || i7 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += i2;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.b += bArr.length;
                break;
            case 1:
                this.b += bArr.length;
                break;
            case 2:
                this.b += bArr.length;
                break;
            case 3:
                this.b += bArr.length;
                break;
            default:
                this.b += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.a) {
            case 0:
                this.b++;
                break;
            case 1:
                this.b++;
                break;
            case 2:
                this.b++;
                break;
            case 3:
                this.b++;
                break;
            default:
                this.b++;
                break;
        }
    }
}
