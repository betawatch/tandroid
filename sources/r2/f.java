package r2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f extends a3.d {
    public int g;

    @Override // a3.u
    public final int d() {
        return this.g;
    }

    @Override // a3.u
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, elapsedRealtime)) {
            for (int i7 = this.b - 1; i7 >= 0; i7--) {
                if (!a(i7, elapsedRealtime)) {
                    this.g = i7;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // a3.u
    public final int o() {
        return 0;
    }

    @Override // a3.u
    public final Object r() {
        return null;
    }
}
