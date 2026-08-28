package te;

import java.io.FilterInputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends re.a {
    public static String b(int i9, int i10, byte[] bArr) {
        try {
            String str = new String(bArr, i9, i10, "ISO-8859-1");
            int indexOf = str.indexOf(0);
            return indexOf < 0 ? str : str.substring(0, indexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(FilterInputStream filterInputStream) {
        boolean z10;
        filterInputStream.mark(3);
        try {
            if (filterInputStream.read() == 84 && filterInputStream.read() == 65) {
                if (filterInputStream.read() == 71) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            filterInputStream.reset();
        }
    }
}
