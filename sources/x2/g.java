package x2;

import a8.la;
import java.io.IOException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g extends IOException {
    public g(int i7) {
        this(-9223372036854775807L, i7, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(long j3, int i7, long j10) {
        super(r0.toString());
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i7 != 0) {
            if (i7 == 1) {
                str = "not seekable to start";
            } else if (i7 != 2) {
                str = "unknown";
            } else {
                la.p((j3 == -9223372036854775807L || j10 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j3 + ", End time: " + j10;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
    }
}
