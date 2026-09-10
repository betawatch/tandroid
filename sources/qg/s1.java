package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.kj0;
import xh.l8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s1 extends s8 {
    public final l8 Q;
    public final int R;
    public final q0 S;

    public s1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.Q = new l8(1, 15);
        this.S = new q0(this, 3);
        this.R = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        q0 q0Var = this.S;
        if (isEnabled) {
            l8 l8Var = this.Q;
            l8Var.d();
            l8Var.a(canvas, j6.w0(null, this.R, false));
            xf.h.d().a(15, q0Var);
        } else {
            xf.h.d().f(q0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xf.h.d().f(this.S);
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        kj0 kj0Var = this.e;
        float width = (kj0Var.getWidth() / 2.0f) + kj0Var.getX();
        float height = ((kj0Var.getHeight() / 2.0f) + (kj0Var.getY() + kj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
