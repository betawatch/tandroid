package u2;

import a8.yb;
import java.io.IOException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends IOException {
    public g(int i10) {
        this(i10, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(int i10, long j10, long j11) {
        super(r0.toString());
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i10 != 0) {
            if (i10 == 1) {
                str = "not seekable to start";
            } else if (i10 != 2) {
                str = "unknown";
            } else {
                yb.p((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j10 + ", End time: " + j11;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
    }
}
