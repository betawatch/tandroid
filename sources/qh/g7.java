package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.z5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ j7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(j7 j7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = j7Var;
        this.c = g6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        j7 j7Var = this.d;
        float max = Math.max(0.0f, j7Var.s());
        boolean z4 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.z5 z5Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        j7Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        j7 j7Var = this.d;
        if (y10 >= j7Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        j7Var.dismiss();
        return true;
    }
}
