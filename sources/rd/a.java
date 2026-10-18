package rd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
