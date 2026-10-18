package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c91;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k extends c91 {
    public final Path T;
    public final Paint U;
    public boolean V;
    public boolean W;
    public final boolean a0;
    public final /* synthetic */ y0 b0;
    public final /* synthetic */ d6 c0;
    public final /* synthetic */ z d0;
    public final /* synthetic */ m e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Context context, y0 y0Var, d6 d6Var, z zVar) {
        super(context, null);
        this.e0 = mVar;
        this.b0 = y0Var;
        this.c0 = d6Var;
        this.d0 = zVar;
        this.T = new Path();
        this.U = new Paint(1);
        this.a0 = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        m mVar = this.e0;
        k kVar = mVar.b;
        int w02 = h6.w0(h6.h5, this.c0);
        Paint paint = this.U;
        paint.setColor(w02);
        if (!this.V) {
            if (this.a0 || mVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        z zVar = this.d0;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, zVar.s0 - (zVar.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        y0 y0Var = this.b0;
        int max = Math.max(0, y0Var.t0 - (y0Var.m0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (kVar.getCurrentPosition() == 0) {
            float positionAnimated = kVar.getPositionAnimated() * abs;
            f7 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - kVar.getPositionAnimated()) * abs;
            f7 = max < dp ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i11 = (int) f7;
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i11, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        Path path = this.T;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.c91
    public final float getAvailableTranslationX() {
        return (this.a0 || this.e0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean i(MotionEvent motionEvent) {
        return this.e0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.W;
        m mVar = this.e0;
        if (z11 != mVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = mVar.isKeyboardVisible();
            this.W = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.b0.Y(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void u() {
        this.V = false;
        this.e0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        m mVar = this.e0;
        k kVar = mVar.b;
        float positionAnimated = kVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.V = false;
        } else if (!this.V) {
            this.V = true;
            if (mVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(mVar.c.getContainerView());
            }
        }
        kVar.invalidate();
    }
}
