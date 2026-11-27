// default package

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
