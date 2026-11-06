package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class sl0 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ bm0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl0(bm0 bm0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f3 = bm0Var;
        this.e3 = i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public final Integer V0(int i7) {
        bm0 bm0Var = this.f3;
        if ((i7 < bm0Var.b0 || i7 >= bm0Var.c0) && (i7 < bm0Var.d0 || i7 >= bm0Var.e0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bm0 bm0Var = this.f3;
        if (!bm0Var.G || bm0Var.E == null || bm0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(bm0Var.E.getLeft() + bm0Var.F.getLeft(), bm0Var.F.getTop());
        bm0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        bm0 bm0Var = this.f3;
        hm0 hm0Var = bm0Var.p0;
        bm0Var.h();
        if (bm0Var.K != null) {
            if (bm0Var.J == null || !bm0Var.c()) {
                return;
            }
            bm0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.e3 == 1 ? hm0Var.c : hm0Var.b;
        if (v9Var == null || !bm0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
