package pd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        j.d(buf, "buf");
        return buf;
    }
}
