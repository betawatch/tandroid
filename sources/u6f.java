// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class u6f {
    public static byte[] a(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }
}
