package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k0 extends x {
    public final /* synthetic */ m0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, Activity activity, int i10, j0 j0Var) {
        super(activity, i10, j0Var);
        this.M = m0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        m0 m0Var = this.M;
        float min = Math.min(height, m0Var.v - (getTranslationY() + getTop()));
        c cVar = m0Var.x;
        if (cVar != null) {
            cVar.G = min;
        }
        m0Var.I = min;
        if (cVar != null) {
            cVar.U = m0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m0 m0Var = this.M;
        b1 b1Var = m0Var.d;
        if (b1Var == null || (b1Var.l1 <= 0.5f && b1Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            b1 b1Var2 = m0Var.d;
            b1Var2.l1 = 0.0f;
            b1Var2.invalidate();
        }
        return true;
    }
}
