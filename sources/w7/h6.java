package w7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class h6 {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }
}
