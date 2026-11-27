// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class xed {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i > 0 ? length / i : 0)];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i > 0 && i3 % i == 0 && i2 > 0) {
                cArr[i2] = '-';
                i2++;
            }
            int i4 = i2 + 1;
            byte b = bArr[i3];
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b & 240) >>> 4];
            i2 += 2;
            cArr[i4] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
