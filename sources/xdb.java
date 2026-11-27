// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xdb {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ q90 e;

    public xdb(q90 q90Var, int i) {
        this.e = q90Var;
        this.a = i;
    }

    public final void a() {
        q90 q90Var = this.e;
        xgb xgbVar = (xgb) q90Var.f;
        s64 s64Var = (s64) q90Var.a;
        int v0 = s64Var.v0();
        if (!s64Var.s() || s64Var.h() == 1 || s64Var.h() == 4 || v0 == 0 || v0 == 1) {
            if (this.c) {
                xgbVar.g(4);
            }
            this.c = false;
            return;
        }
        ((vgb) q90Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == v0) {
            if (elapsedRealtime - this.d >= i) {
                ((n64) q90Var.c).a.t1(new e64(2, new ydb(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = v0;
        xgbVar.g(4);
        xgbVar.a.sendEmptyMessageDelayed(4, i);
    }
}
