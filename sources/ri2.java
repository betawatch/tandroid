// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ri2 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ri2(long j, int i, long j2) {
        super("Illegal clipping: ".concat(r4));
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                gre.p((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
        } else {
            str = "invalid period count";
        }
    }

    public ri2(int i) {
        this(-9223372036854775807L, i, -9223372036854775807L);
    }
}
