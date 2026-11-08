package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j extends v61 {
    public final Path V;
    public final Paint W;
    public boolean a0;
    public boolean b0;
    public final boolean c0;
    public final /* synthetic */ w0 d0;
    public final /* synthetic */ f6 e0;
    public final /* synthetic */ a0 f0;
    public final /* synthetic */ l g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context, w0 w0Var, f6 f6Var, a0 a0Var) {
        super(context, null);
        this.g0 = lVar;
        this.d0 = w0Var;
        this.e0 = f6Var;
        this.f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.c0 = org.telegram.messenger.g0.Q1();
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean b(MotionEvent motionEvent) {
        return this.g0.i1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        l lVar = this.g0;
        j jVar = lVar.i1;
        int w02 = k6.w0(k6.h5, this.e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (!this.a0) {
            if (this.c0 || lVar.k1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i7 = -org.telegram.messenger.g0.L(16.0f);
        a0 a0Var = this.f0;
        int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i7, a0Var.k2 - (a0Var.l1.getVisibility() == 0 ? org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m : 0));
        w0 w0Var = this.d0;
        int max = Math.max(0, w0Var.l2 - (w0Var.e2.c == 1.0f ? org.telegram.messenger.g0.m : 0));
        int abs = Math.abs(L - max);
        if (jVar.getCurrentPosition() == 0) {
            float positionAnimated = jVar.getPositionAnimated() * abs;
            f10 = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - jVar.getPositionAnimated()) * abs;
            f10 = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i10 = (int) f10;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, i10, getWidth(), org.telegram.messenger.g0.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.V;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.v61
    public final float getAvailableTranslationX() {
        return (this.c0 || this.g0.k1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = this.b0;
        boolean z11 = this.g0.d;
        if (z10 != z11) {
            this.b0 = z11;
            if (z11) {
                this.d0.j1(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void u() {
        this.a0 = false;
        this.g0.i1.invalidate();
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        l lVar = this.g0;
        j jVar = lVar.i1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.a0 = false;
        } else if (!this.a0) {
            this.a0 = true;
            if (lVar.d) {
                org.telegram.messenger.g0.v1(lVar.j1.b);
            }
        }
        jVar.invalidate();
    }
}
