// default package

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class sfe implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static sfe d(byte... bArr) {
        bArr.getClass();
        hge hgeVar = new hge(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return k2f.a(hgeVar);
        } finally {
            try {
                hgeVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final sfe b(Class cls) {
        if (cls.isInstance(this)) {
            return (sfe) cls.cast(this);
        }
        throw new ife(tb4.q("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public int zza() {
        return c(Byte.MIN_VALUE);
    }
}
