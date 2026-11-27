// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class xse {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw wte.b();
            }
            if (length > Integer.MAX_VALUE) {
                throw wte.a();
            }
        } catch (wte e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static ese b(Object obj, Object obj2) {
        ese eseVar = (ese) ((hie) obj);
        ase aseVar = (ase) eseVar.d(5);
        aseVar.a(eseVar);
        hie hieVar = (hie) obj2;
        if (aseVar.a.getClass().isInstance(hieVar)) {
            aseVar.a((ese) hieVar);
            return aseVar.e();
        }
        lq5.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
