package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class wl0 extends org.telegram.ui.Components.ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ fm0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl0(fm0 fm0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.g3 = fm0Var;
        this.f3 = i7;
    }

    @Override // org.telegram.ui.Components.ek0
    public final Integer V0(int i7) {
        fm0 fm0Var = this.g3;
        if ((i7 < fm0Var.c0 || i7 >= fm0Var.d0) && (i7 < fm0Var.e0 || i7 >= fm0Var.f0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fm0 fm0Var = this.g3;
        if (!fm0Var.H || fm0Var.F == null || fm0Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(fm0Var.F.getLeft() + fm0Var.G.getLeft(), fm0Var.G.getTop());
        fm0Var.F.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        fm0 fm0Var = this.g3;
        lm0 lm0Var = fm0Var.q0;
        fm0Var.h();
        if (fm0Var.L != null) {
            if (fm0Var.K == null || !fm0Var.c()) {
                return;
            }
            fm0Var.K.l(false);
            return;
        }
        di.p8 p8Var = this.f3 == 1 ? lm0Var.c : lm0Var.b;
        if (p8Var == null || !fm0Var.c()) {
            return;
        }
        p8Var.a();
    }
}
