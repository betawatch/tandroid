// default package

import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zi5 extends g10 {
    public static String b(int i, int i2, byte[] bArr) {
        try {
            String str = new String(bArr, i, i2, "ISO-8859-1");
            int indexOf = str.indexOf(0);
            return indexOf < 0 ? str : str.substring(0, indexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(InputStream inputStream) {
        boolean z;
        inputStream.mark(3);
        try {
            if (inputStream.read() == 84 && inputStream.read() == 65) {
                if (inputStream.read() == 71) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            inputStream.reset();
        }
    }
}
