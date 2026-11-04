package w2;

import b8.zb;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends IOException {
    public g(int i3) {
        this(-9223372036854775807L, i3, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(long j10, int i3, long j11) {
        super(r0.toString());
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i3 != 0) {
            if (i3 == 1) {
                str = "not seekable to start";
            } else if (i3 != 2) {
                str = "unknown";
            } else {
                zb.p((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j10 + ", End time: " + j11;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
    }
}
