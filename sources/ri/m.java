package ri;

import java.io.File;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
