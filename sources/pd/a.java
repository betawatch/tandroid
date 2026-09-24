package pd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
