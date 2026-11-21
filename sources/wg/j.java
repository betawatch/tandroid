package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j extends j71 {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final /* synthetic */ w0 e0;
    public final /* synthetic */ h6 f0;
    public final /* synthetic */ a0 g0;
    public final /* synthetic */ l h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context, w0 w0Var, h6 h6Var, a0 a0Var) {
        super(context, null);
        this.h0 = lVar;
        this.e0 = w0Var;
        this.f0 = h6Var;
        this.g0 = a0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = org.telegram.messenger.g0.Q1();
    }

    @Override // org.telegram.ui.Components.j71
    public final boolean b(MotionEvent motionEvent) {
        return this.h0.m1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        l lVar = this.h0;
        j jVar = lVar.m1;
        int w02 = m6.w0(m6.h5, this.f0);
        Paint paint = this.a0;
        paint.setColor(w02);
        if (!this.b0) {
            if (this.d0 || lVar.o1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i7 = -org.telegram.messenger.g0.L(16.0f);
        a0 a0Var = this.g0;
        int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i7, a0Var.o2 - (a0Var.p1.getVisibility() == 0 ? org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m : 0));
        w0 w0Var = this.e0;
        int max = Math.max(0, w0Var.p2 - (w0Var.i2.c == 1.0f ? org.telegram.messenger.g0.m : 0));
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
        Path path = this.W;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.j71
    public final float getAvailableTranslationX() {
        return (this.d0 || this.h0.o1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = this.c0;
        boolean z12 = this.h0.d;
        if (z11 != z12) {
            this.c0 = z12;
            if (z12) {
                this.e0.k1(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void q() {
        this.b0 = false;
        this.h0.m1.invalidate();
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        l lVar = this.h0;
        j jVar = lVar.m1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.b0 = false;
        } else if (!this.b0) {
            this.b0 = true;
            if (lVar.d) {
                org.telegram.messenger.g0.v1(lVar.n1.b);
            }
        }
        jVar.invalidate();
    }
}
