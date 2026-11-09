package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ul0 extends org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ dm0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(dm0 dm0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f3 = dm0Var;
        this.e3 = i7;
    }

    @Override // org.telegram.ui.Components.qj0
    public final Integer V0(int i7) {
        dm0 dm0Var = this.f3;
        if ((i7 < dm0Var.b0 || i7 >= dm0Var.c0) && (i7 < dm0Var.d0 || i7 >= dm0Var.e0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dm0 dm0Var = this.f3;
        if (!dm0Var.G || dm0Var.E == null || dm0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(dm0Var.E.getLeft() + dm0Var.F.getLeft(), dm0Var.F.getTop());
        dm0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        dm0 dm0Var = this.f3;
        jm0 jm0Var = dm0Var.p0;
        dm0Var.h();
        if (dm0Var.K != null) {
            if (dm0Var.J == null || !dm0Var.c()) {
                return;
            }
            dm0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.e3 == 1 ? jm0Var.c : jm0Var.b;
        if (v9Var == null || !dm0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
