// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pm5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn5 b;

    public pm5(fn5 fn5Var, int i) {
        this.b = fn5Var;
        this.a = i;
    }

    public final void a(qd4 qd4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = qd4Var.S;
        if (j3 == 0 || j3 < elapsedRealtime - 100 || j == j2) {
            qd4Var.S = elapsedRealtime;
            final int i = this.a;
            gm.c3(new Runnable() { // from class: nm5
                @Override // java.lang.Runnable
                public final void run() {
                    nm7.f(i).k(nm7.W1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
                }
            });
        }
    }
}
