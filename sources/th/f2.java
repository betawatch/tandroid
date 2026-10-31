package th;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.lj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 implements lj0 {
    public final /* synthetic */ z2 a;

    public f2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public final boolean h() {
        ((f7) this.a.z1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        rh.l5 l5Var = new rh.l5(this, o0Var, view, 3);
        if (z10) {
            l5Var.run();
        } else {
            this.a.l0(l5Var);
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
