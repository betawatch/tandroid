package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.z5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ l7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(l7 l7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = l7Var;
        this.c = f6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        l7 l7Var = this.d;
        float max = Math.max(0.0f, l7Var.s());
        boolean z4 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.z5 z5Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        l7Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        l7 l7Var = this.d;
        if (y10 >= l7Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        l7Var.dismiss();
        return true;
    }
}
