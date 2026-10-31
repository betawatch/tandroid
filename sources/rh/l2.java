package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w71;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l2 extends w71 {
    public final /* synthetic */ e4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(e4 e4Var, Context context) {
        super(context, null);
        this.V = e4Var;
    }

    @Override // org.telegram.ui.Components.w71
    public final void F(View view, float f7) {
        View view2;
        ph.w0 w0Var;
        ph.w0 w0Var2;
        n2 n2Var;
        n2 n2Var2;
        n2 n2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float i10 = Utilities.i(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        e4 e4Var = this.V;
        view.setTranslationX(((-i10) * 2.0f * e4Var.t0) + f7);
        view.setPivotX(i10 <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i10));
        view.setRotationY(i10 * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                w0Var = e4Var.U1;
                if (w0Var != null && view2 == w0Var.Q1 && (n2Var3 = w0Var.W1) != null) {
                    n2Var3.invalidate();
                }
                if (view2 == e4Var.Q1 && (n2Var2 = e4Var.W1) != null) {
                    n2Var2.invalidate();
                }
                w0Var2 = e4Var.V1;
                if (w0Var2 == null && view2 == w0Var2.Q1 && (n2Var = w0Var2.W1) != null) {
                    n2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        w0Var = e4Var.U1;
        if (w0Var != null) {
            n2Var3.invalidate();
        }
        if (view2 == e4Var.Q1) {
            n2Var2.invalidate();
        }
        w0Var2 = e4Var.V1;
        if (w0Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.w71
    public final void G() {
        super.G();
        int i10 = this.b;
        e4 e4Var = this.V;
        if (i10 != e4Var.I1(false)) {
            org.telegram.messenger.i0.g3(new yv0(7, this, this.b > e4Var.I1(false)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        e4 e4Var = this.V;
        canvas.clipRect(e4Var.t0, -getHeight(), getWidth() - e4Var.t0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.w71
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.V.t0 * 2));
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.V.T2;
        return dVar == null || dVar.c(0);
    }
}
