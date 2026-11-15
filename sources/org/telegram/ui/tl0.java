package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tl0 extends org.telegram.ui.Components.uj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ cm0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(cm0 cm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.g3 = cm0Var;
        this.f3 = i7;
    }

    @Override // org.telegram.ui.Components.uj0
    public final Integer V0(int i7) {
        cm0 cm0Var = this.g3;
        if ((i7 < cm0Var.c0 || i7 >= cm0Var.d0) && (i7 < cm0Var.e0 || i7 >= cm0Var.f0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cm0 cm0Var = this.g3;
        if (!cm0Var.H || cm0Var.F == null || cm0Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(cm0Var.F.getLeft() + cm0Var.G.getLeft(), cm0Var.G.getTop());
        cm0Var.F.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        cm0 cm0Var = this.g3;
        im0 im0Var = cm0Var.q0;
        cm0Var.h();
        if (cm0Var.L != null) {
            if (cm0Var.K == null || !cm0Var.c()) {
                return;
            }
            cm0Var.K.g(false);
            return;
        }
        di.m8 m8Var = this.f3 == 1 ? im0Var.c : im0Var.b;
        if (m8Var == null || !cm0Var.c()) {
            return;
        }
        m8Var.a();
    }
}
