package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class j0 extends r {
    public final /* synthetic */ m0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Activity activity, int i10, i0 i0Var) {
        super(activity, i10, i0Var);
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
        m0Var.K = min;
        if (cVar != null) {
            cVar.U = m0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m0 m0Var = this.M;
        c1 c1Var = m0Var.d;
        if (c1Var == null || (c1Var.l1 <= 0.5f && c1Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            c1 c1Var2 = m0Var.d;
            c1Var2.l1 = 0.0f;
            c1Var2.invalidate();
        }
        return true;
    }
}
