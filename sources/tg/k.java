package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h91;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class k extends h91 {
    public final Path V;
    public final Paint W;
    public boolean a0;
    public boolean b0;
    public final boolean c0;
    public final /* synthetic */ z0 d0;
    public final /* synthetic */ d6 e0;
    public final /* synthetic */ a0 f0;
    public final /* synthetic */ m g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Context context, z0 z0Var, d6 d6Var, a0 a0Var) {
        super(context, null);
        this.g0 = mVar;
        this.d0 = z0Var;
        this.e0 = d6Var;
        this.f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.c0 = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        m mVar = this.g0;
        k kVar = mVar.b;
        int v02 = i6.v0(i6.h5, this.e0);
        Paint paint = this.W;
        paint.setColor(v02);
        if (!this.a0) {
            if (this.c0 || mVar.d) {
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
        Path path = this.V;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.h91
    public final float getAvailableTranslationX() {
        return (this.c0 || this.g0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.h91
    public final boolean i(MotionEvent motionEvent) {
        return this.g0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.b0;
        m mVar = this.g0;
        if (z11 != mVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = mVar.isKeyboardVisible();
            this.b0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.d0.W(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.h91
    public final void u() {
        this.a0 = false;
        this.g0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        m mVar = this.g0;
        k kVar = mVar.b;
        float positionAnimated = kVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.a0 = false;
        } else if (!this.a0) {
            this.a0 = true;
            if (mVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(mVar.c.getContainerView());
            }
        }
        kVar.invalidate();
    }
}
