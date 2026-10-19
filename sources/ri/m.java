package ri;

import java.io.File;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
