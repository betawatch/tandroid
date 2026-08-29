package q4;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends d5.c {
    public int g;

    @Override // d5.r
    public final void b(long j10, long j11, long j12, List list, n4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (e(this.g, elapsedRealtime)) {
            for (int i10 = this.b - 1; i10 >= 0; i10--) {
                if (!e(i10, elapsedRealtime)) {
                    this.g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // d5.r
    public final int c() {
        return this.g;
    }

    @Override // d5.r
    public final int o() {
        return 0;
    }

    @Override // d5.r
    public final Object r() {
        return null;
    }
}
