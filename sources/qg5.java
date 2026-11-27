// default package

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qg5 extends wg0 {
    public int h;

    @Override // e74
    public final void b(long j, long j2, long j3, List list, gm6[] gm6VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.h, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, elapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            grb.g();
        }
    }

    @Override // e74
    public final int d() {
        return this.h;
    }

    @Override // e74
    public final int o() {
        return 0;
    }

    @Override // e74
    public final Object r() {
        return null;
    }
}
