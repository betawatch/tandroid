package sg;

import ai.de;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class s1 extends q8 {
    public final de R;
    public final int S;
    public final org.telegram.ui.web.a2 T;

    public s1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        this.R = new de(1, 15);
        this.T = new org.telegram.ui.web.a2(this, 25);
        this.S = i10 == 1 ? h6.fk : h6.Mj;
    }

    @Override // org.telegram.ui.Cells.q8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.a2 a2Var = this.T;
        if (isEnabled) {
            de deVar = this.R;
            deVar.d();
            deVar.a(canvas, h6.x0(null, this.S, false));
            zf.h.d().a(15, a2Var);
        } else {
            zf.h.d().f(a2Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.q8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zf.h.d().f(this.T);
    }

    @Override // org.telegram.ui.Cells.q8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        xj0 xj0Var = this.e;
        float width = (xj0Var.getWidth() / 2.0f) + xj0Var.getX();
        float height = ((xj0Var.getHeight() / 2.0f) + (xj0Var.getY() + xj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
