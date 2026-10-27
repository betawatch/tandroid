package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.v91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l extends v91 {
    public final Path V;
    public final Paint W;
    public boolean a0;
    public boolean b0;
    public final boolean c0;
    public final /* synthetic */ z0 d0;
    public final /* synthetic */ u6 e0;
    public final /* synthetic */ a0 f0;
    public final /* synthetic */ n g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, z0 z0Var, u6 u6Var, a0 a0Var) {
        super(context, null);
        this.g0 = nVar;
        this.d0 = z0Var;
        this.e0 = u6Var;
        this.f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.c0 = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        n nVar = this.g0;
        l lVar = nVar.b;
        int w02 = y6.w0(y6.h5, this.e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (!this.a0) {
            if (this.c0 || nVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        a0 a0Var = this.f0;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, a0Var.s0 - (a0Var.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        z0 z0Var = this.d0;
        int max = Math.max(0, z0Var.t0 - (z0Var.m0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (lVar.getCurrentPosition() == 0) {
            float positionAnimated = lVar.getPositionAnimated() * abs;
            f7 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - lVar.getPositionAnimated()) * abs;
            f7 = max < dp ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i11 = (int) f7;
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i11, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        Path path = this.V;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.v91
    public final float getAvailableTranslationX() {
        return (this.c0 || this.g0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.v91
    public final boolean i(MotionEvent motionEvent) {
        return this.g0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.b0;
        n nVar = this.g0;
        if (z11 != nVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = nVar.isKeyboardVisible();
            this.b0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.d0.X(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.v91
    public final void u() {
        this.a0 = false;
        this.g0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        n nVar = this.g0;
        l lVar = nVar.b;
        float positionAnimated = lVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.a0 = false;
        } else if (!this.a0) {
            this.a0 = true;
            if (nVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(nVar.c.getContainerView());
            }
        }
        lVar.invalidate();
    }
}
