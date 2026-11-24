// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
            gl.c3(new Runnable() { // from class: nk5
                @Override // java.lang.Runnable
                public final void run() {
                    kk7.f(i).k(kk7.V1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
                }
            });
        }
    }
}
