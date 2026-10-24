package ri;

import java.io.File;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class l {
    public final File a;
    public final long b;
    public final byte[] c;

    public l(File file, long j10, byte[] bArr) {
        this.a = file;
        this.b = j10;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }
}
