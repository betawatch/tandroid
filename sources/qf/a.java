package qf;

import java.io.FilterInputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a extends of.a {
    public static String b(int i3, int i10, byte[] bArr) {
        try {
            String str = new String(bArr, i3, i10, "ISO-8859-1");
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
