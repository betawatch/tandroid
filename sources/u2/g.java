package u2;

import java.io.IOException;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class g extends IOException {
    public g(int i10) {
        this(i10, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(int i10, long j3, long j10) {
        super(r0.toString());
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i10 != 0) {
            if (i10 == 1) {
                str = "not seekable to start";
            } else if (i10 != 2) {
                str = "unknown";
            } else {
                e2.d.g((j3 == -9223372036854775807L || j10 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j3 + ", End time: " + j10;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
    }
}
