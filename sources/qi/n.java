package qi;

import java.io.File;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n {
    public final File a;
    public final long b;
    public final byte[] c;

    public n(File file, long j10, byte[] bArr) {
        this.a = file;
        this.b = j10;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }
}
