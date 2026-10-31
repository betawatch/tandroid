package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends r {
    public final /* synthetic */ i0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Activity activity, int i10, f0 f0Var) {
        super(activity, i10, f0Var);
        this.M = i0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        i0 i0Var = this.M;
        float min = Math.min(height, i0Var.w - (getTranslationY() + getTop()));
        c cVar = i0Var.y;
        if (cVar != null) {
            cVar.G = min;
        }
        i0Var.K = min;
        if (cVar != null) {
            cVar.U = i0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.M;
        x0 x0Var = i0Var.d;
        if (x0Var == null || (x0Var.l1 <= 0.5f && x0Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            x0 x0Var2 = i0Var.d;
            x0Var2.l1 = 0.0f;
            x0Var2.invalidate();
        }
        return true;
    }
}
