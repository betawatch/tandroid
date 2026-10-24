package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j extends l91 {
    public final Path T;
    public final Paint U;
    public boolean V;
    public boolean W;
    public final boolean a0;
    public final /* synthetic */ x0 b0;
    public final /* synthetic */ g6 c0;
    public final /* synthetic */ y d0;
    public final /* synthetic */ l e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context, x0 x0Var, g6 g6Var, y yVar) {
        super(context, null);
        this.e0 = lVar;
        this.b0 = x0Var;
        this.c0 = g6Var;
        this.d0 = yVar;
        this.T = new Path();
        this.U = new Paint(1);
        this.a0 = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        l lVar = this.e0;
        j jVar = lVar.b;
        int w02 = k6.w0(k6.h5, this.c0);
        Paint paint = this.U;
        paint.setColor(w02);
        if (!this.V) {
            if (this.a0 || lVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        y yVar = this.d0;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, yVar.s0 - (yVar.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        x0 x0Var = this.b0;
        int max = Math.max(0, x0Var.t0 - (x0Var.m0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (jVar.getCurrentPosition() == 0) {
            float positionAnimated = jVar.getPositionAnimated() * abs;
            f7 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - jVar.getPositionAnimated()) * abs;
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

    @Override // org.telegram.ui.Components.l91
    public final float getAvailableTranslationX() {
        return (this.a0 || this.e0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean i(MotionEvent motionEvent) {
        return this.e0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.W;
        l lVar = this.e0;
        if (z11 != lVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = lVar.isKeyboardVisible();
            this.W = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.b0.X(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final void u() {
        this.V = false;
        this.e0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.l91
    public final void w(boolean z10) {
        l lVar = this.e0;
        j jVar = lVar.b;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.V = false;
        } else if (!this.V) {
            this.V = true;
            if (lVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(lVar.c.getContainerView());
            }
        }
        jVar.invalidate();
    }
}
