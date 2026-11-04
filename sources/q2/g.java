package q2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends z2.c {
    public int g;

    @Override // z2.p
    public final int c() {
        return this.g;
    }

    @Override // z2.p
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, elapsedRealtime)) {
            for (int i3 = this.b - 1; i3 >= 0; i3--) {
                if (!a(i3, elapsedRealtime)) {
                    this.g = i3;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // z2.p
    public final int o() {
        return 0;
    }

    @Override // z2.p
    public final Object r() {
        return null;
    }
}
