// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sm5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ in5 b;

    public sm5(in5 in5Var, int i) {
        this.b = in5Var;
        this.a = i;
    }

    public final void a(nd4 nd4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = nd4Var.S;
        if (j3 == 0 || j3 < elapsedRealtime - 100 || j == j2) {
            nd4Var.S = elapsedRealtime;
            final int i = this.a;
            hl.c3(new Runnable() { // from class: qm5
                @Override // java.lang.Runnable
                public final void run() {
                    jn7.f(i).k(jn7.W1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
                }
            });
        }
    }
}
