// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pk5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl5 b;

    public pk5(fl5 fl5Var, int i) {
        this.b = fl5Var;
        this.a = i;
    }

    public final void a(qb4 qb4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = qb4Var.S;
        if (j3 == 0 || j3 < elapsedRealtime - 100 || j == j2) {
            qb4Var.S = elapsedRealtime;
            final int i = this.a;
            gl.d3(new Runnable() { // from class: nk5
                @Override // java.lang.Runnable
                public final void run() {
                    kk7.f(i).k(kk7.V1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
                }
            });
        }
    }
}
