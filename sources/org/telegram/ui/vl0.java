package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vl0 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ em0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(em0 em0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f3 = em0Var;
        this.e3 = i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public final Integer V0(int i7) {
        em0 em0Var = this.f3;
        if ((i7 < em0Var.b0 || i7 >= em0Var.c0) && (i7 < em0Var.d0 || i7 >= em0Var.e0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        em0 em0Var = this.f3;
        if (!em0Var.G || em0Var.E == null || em0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(em0Var.E.getLeft() + em0Var.F.getLeft(), em0Var.F.getTop());
        em0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        em0 em0Var = this.f3;
        km0 km0Var = em0Var.p0;
        em0Var.h();
        if (em0Var.K != null) {
            if (em0Var.J == null || !em0Var.c()) {
                return;
            }
            em0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.e3 == 1 ? km0Var.c : km0Var.b;
        if (v9Var == null || !em0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
