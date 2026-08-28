package w3;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(int i9, int i10, byte[] bArr) {
        if (this.a) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i12 = this.c + i11;
            if (length < i12) {
                this.e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i9, this.e, this.c, i11);
            this.c += i11;
        }
    }
}
