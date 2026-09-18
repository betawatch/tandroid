package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j81;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m extends j81 {
    public final Path U;
    public final Paint V;
    public boolean W;
    public boolean a0;
    public final boolean b0;
    public final /* synthetic */ a1 c0;
    public final /* synthetic */ f6 d0;
    public final /* synthetic */ b0 e0;
    public final /* synthetic */ o f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Context context, a1 a1Var, f6 f6Var, b0 b0Var) {
        super(context, null);
        this.f0 = oVar;
        this.c0 = a1Var;
        this.d0 = f6Var;
        this.e0 = b0Var;
        this.U = new Path();
        this.V = new Paint(1);
        this.b0 = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        o oVar = this.f0;
        m mVar = oVar.b;
        int v02 = j6.v0(j6.h5, this.d0);
        Paint paint = this.V;
        paint.setColor(v02);
        if (!this.W) {
            if (this.b0 || oVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        b0 b0Var = this.e0;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, b0Var.s0 - (b0Var.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        a1 a1Var = this.c0;
        int max = Math.max(0, a1Var.t0 - (a1Var.m0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (mVar.getCurrentPosition() == 0) {
            float positionAnimated = mVar.getPositionAnimated() * abs;
            f7 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - mVar.getPositionAnimated()) * abs;
            f7 = max < dp ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i11 = (int) f7;
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i11, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        Path path = this.U;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.j81
    public final float getAvailableTranslationX() {
        return (this.b0 || this.f0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.j81
    public final boolean i(MotionEvent motionEvent) {
        return this.f0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.a0;
        o oVar = this.f0;
        if (z11 != oVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = oVar.isKeyboardVisible();
            this.a0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.c0.X(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void u() {
        this.W = false;
        this.f0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.j81
    public final void w(boolean z10) {
        o oVar = this.f0;
        m mVar = oVar.b;
        float positionAnimated = mVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.W = false;
        } else if (!this.W) {
            this.W = true;
            if (oVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(oVar.c.getContainerView());
            }
        }
        mVar.invalidate();
    }
}
