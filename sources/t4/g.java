package t4;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends f5.c {
    public int g;

    @Override // f5.c
    public final int h() {
        return this.g;
    }

    @Override // f5.c
    public final Object j() {
        return null;
    }

    @Override // f5.c
    public final int k() {
        return 0;
    }

    @Override // f5.c
    public final void v(long j10, long j11, long j12, List list, q4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o(this.g, elapsedRealtime)) {
            for (int i10 = this.b - 1; i10 >= 0; i10--) {
                if (!o(i10, elapsedRealtime)) {
                    this.g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
