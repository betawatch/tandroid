package w7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }
}
