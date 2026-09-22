package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.nj0;
import yh.i8;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r1 extends s8 {
    public final i8 Q;
    public final int R;
    public final q1 S;

    public r1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.Q = new i8(1, 15);
        this.S = new q1(this, 0);
        this.R = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        q1 q1Var = this.S;
        if (isEnabled) {
            i8 i8Var = this.Q;
            i8Var.d();
            i8Var.a(canvas, j6.w0(null, this.R, false));
            yf.h.d().a(15, q1Var);
        } else {
            yf.h.d().f(q1Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.S);
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        nj0 nj0Var = this.e;
        float width = (nj0Var.getWidth() / 2.0f) + nj0Var.getX();
        float height = ((nj0Var.getHeight() / 2.0f) + (nj0Var.getY() + nj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
