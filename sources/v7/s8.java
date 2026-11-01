package v7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = new byte[TLObject.FLAG_13];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }
}
