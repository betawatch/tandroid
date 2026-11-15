package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ul0 extends org.telegram.ui.Components.uj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ dm0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(dm0 dm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.g3 = dm0Var;
        this.f3 = i7;
    }

    @Override // org.telegram.ui.Components.uj0
    public final Integer V0(int i7) {
        dm0 dm0Var = this.g3;
        if ((i7 < dm0Var.c0 || i7 >= dm0Var.d0) && (i7 < dm0Var.e0 || i7 >= dm0Var.f0)) {
            return super.V0(i7);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dm0 dm0Var = this.g3;
        if (!dm0Var.H || dm0Var.F == null || dm0Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(dm0Var.F.getLeft() + dm0Var.G.getLeft(), dm0Var.G.getTop());
        dm0Var.F.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        dm0 dm0Var = this.g3;
        jm0 jm0Var = dm0Var.q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K == null || !dm0Var.c()) {
                return;
            }
            dm0Var.K.g(false);
            return;
        }
        di.l8 l8Var = this.f3 == 1 ? jm0Var.c : jm0Var.b;
        if (l8Var == null || !dm0Var.c()) {
            return;
        }
        l8Var.a();
    }
}
