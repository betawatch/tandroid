package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends n61 {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final /* synthetic */ w0 e0;
    public final /* synthetic */ e6 f0;
    public final /* synthetic */ a0 g0;
    public final /* synthetic */ n h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, w0 w0Var, e6 e6Var, a0 a0Var) {
        super(context, null);
        this.h0 = nVar;
        this.e0 = w0Var;
        this.f0 = e6Var;
        this.g0 = a0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = org.telegram.messenger.g0.Q1();
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c(MotionEvent motionEvent) {
        return this.h0.j1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        n nVar = this.h0;
        l lVar = nVar.j1;
        int w02 = k6.w0(k6.h5, this.f0);
        Paint paint = this.a0;
        paint.setColor(w02);
        if (!this.b0) {
            if (this.d0 || nVar.l1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i3 = -org.telegram.messenger.g0.L(16.0f);
        a0 a0Var = this.g0;
        int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i3, a0Var.l2 - (a0Var.m1.getVisibility() == 0 ? org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m : 0));
        w0 w0Var = this.e0;
        int max = Math.max(0, w0Var.m2 - (w0Var.f2.c == 1.0f ? org.telegram.messenger.g0.m : 0));
        int abs = Math.abs(L - max);
        if (lVar.getCurrentPosition() == 0) {
            float positionAnimated = lVar.getPositionAnimated() * abs;
            f10 = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - lVar.getPositionAnimated()) * abs;
            f10 = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i10 = (int) f10;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, i10, getWidth(), org.telegram.messenger.g0.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.W;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.n61
    public final float getAvailableTranslationX() {
        return (this.d0 || this.h0.l1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = this.c0;
        boolean z12 = this.h0.d;
        if (z11 != z12) {
            this.c0 = z12;
            if (z12) {
                this.e0.j1(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void s() {
        this.b0 = false;
        this.h0.j1.invalidate();
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        n nVar = this.h0;
        l lVar = nVar.j1;
        float positionAnimated = lVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.b0 = false;
        } else if (!this.b0) {
            this.b0 = true;
            if (nVar.d) {
                org.telegram.messenger.g0.v1(nVar.k1.b);
            }
        }
        lVar.invalidate();
    }
}
