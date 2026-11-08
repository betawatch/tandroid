package tf;

import java.io.FilterInputStream;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class a extends rf.a {
    public static String b(int i7, int i10, byte[] bArr) {
        try {
            String str = new String(bArr, i7, i10, "ISO-8859-1");
            int indexOf = str.indexOf(0);
            return indexOf < 0 ? str : str.substring(0, indexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(FilterInputStream filterInputStream) {
        boolean z9;
        filterInputStream.mark(3);
        try {
            if (filterInputStream.read() == 84 && filterInputStream.read() == 65) {
                if (filterInputStream.read() == 71) {
                    z9 = true;
                    return z9;
                }
            }
            z9 = false;
            return z9;
        } finally {
            filterInputStream.reset();
        }
    }
}
