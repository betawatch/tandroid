package ri;

import java.io.File;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m {
    public final File a;
    public final long b;
    public final byte[] c;

    public m(File file, long j10, byte[] bArr) {
        this.a = file;
        this.b = j10;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }
}
