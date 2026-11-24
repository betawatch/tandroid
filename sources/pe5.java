// default package

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pe5 extends vg0 {
    public int h;

    @Override // k64
    public final void b(long j, long j2, long j3, List list, bk6[] bk6VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.h, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, elapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            sdb.a();
        }
    }

    @Override // k64
    public final int d() {
        return this.h;
    }

    @Override // k64
    public final int p() {
        return 0;
    }

    @Override // k64
    public final Object s() {
        return null;
    }
}
