package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yo0 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ hp0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(hp0 hp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.V2 = hp0Var;
        this.U2 = i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final Integer V0(int i10) {
        hp0 hp0Var = this.V2;
        if ((i10 < hp0Var.V || i10 >= hp0Var.W) && (i10 < hp0Var.a0 || i10 >= hp0Var.b0)) {
            return super.V0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hp0 hp0Var = this.V2;
        if (!hp0Var.D || hp0Var.B == null || hp0Var.C == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(hp0Var.B.getLeft() + hp0Var.C.getLeft(), hp0Var.C.getTop());
        hp0Var.B.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        hp0 hp0Var = this.V2;
        np0 np0Var = hp0Var.m0;
        hp0Var.h();
        if (hp0Var.H != null) {
            if (hp0Var.G == null || !hp0Var.c()) {
                return;
            }
            hp0Var.G.g(false);
            return;
        }
        mh.l7 l7Var = this.U2 == 1 ? np0Var.c : np0Var.b;
        if (l7Var == null || !hp0Var.c()) {
            return;
        }
        l7Var.a();
    }
}
