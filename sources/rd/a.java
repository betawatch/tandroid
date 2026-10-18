package rd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
