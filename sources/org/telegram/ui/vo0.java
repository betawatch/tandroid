package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ ep0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(ep0 ep0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = ep0Var;
        this.V2 = i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final Integer W0(int i10) {
        ep0 ep0Var = this.W2;
        if ((i10 < ep0Var.b0 || i10 >= ep0Var.c0) && (i10 < ep0Var.d0 || i10 >= ep0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ep0 ep0Var = this.W2;
        if (!ep0Var.G || ep0Var.E == null || ep0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(ep0Var.E.getLeft() + ep0Var.F.getLeft(), ep0Var.F.getTop());
        ep0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ep0 ep0Var = this.W2;
        kp0 kp0Var = ep0Var.p0;
        ep0Var.h();
        if (ep0Var.K != null) {
            if (ep0Var.J == null || !ep0Var.c()) {
                return;
            }
            ep0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.V2 == 1 ? kp0Var.c : kp0Var.b;
        if (y9Var == null || !ep0Var.c()) {
            return;
        }
        y9Var.a();
    }
}
