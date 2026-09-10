package zh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g2 implements ok0 {
    public final /* synthetic */ a3 a;

    public g2(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean k() {
        ((l7) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        xh.n1 n1Var = new xh.n1(this, p0Var, view, 10);
        if (z10) {
            n1Var.run();
        } else {
            this.a.n0(n1Var);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
