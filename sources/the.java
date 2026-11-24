// default package

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class the implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static the d(byte... bArr) {
        bArr.getClass();
        iie iieVar = new iie(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return m4f.a(iieVar);
        } finally {
            try {
                iieVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final the b(Class cls) {
        if (cls.isInstance(this)) {
            return (the) cls.cast(this);
        }
        throw new jhe(td4.r("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public int zza() {
        return c(Byte.MIN_VALUE);
    }
}
