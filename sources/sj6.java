// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sj6 implements Runnable {
    public final /* synthetic */ ck6 a;

    public sj6(ck6 ck6Var) {
        this.a = ck6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck6 ck6Var = this.a;
        if (ck6Var.b == null) {
            return;
        }
        for (int i = 0; i < ck6Var.b.getChildCount(); i++) {
            View childAt = ck6Var.b.getChildAt(i);
            if (childAt instanceof zj6) {
                zj6 zj6Var = (zj6) childAt;
                if (zj6Var.J) {
                    zj6Var.b(zj6Var.n, zj6Var.r);
                }
            }
        }
        hl.d3(this, 500L);
    }
}
