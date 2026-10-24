package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k0 extends r {
    public final /* synthetic */ n0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, Activity activity, int i10, j0 j0Var) {
        super(activity, i10, j0Var);
        this.M = n0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        n0 n0Var = this.M;
        float min = Math.min(height, n0Var.v - (getTranslationY() + getTop()));
        c cVar = n0Var.x;
        if (cVar != null) {
            cVar.G = min;
        }
        n0Var.K = min;
        if (cVar != null) {
            cVar.U = n0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n0 n0Var = this.M;
        c1 c1Var = n0Var.d;
        if (c1Var == null || (c1Var.l1 <= 0.5f && c1Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            c1 c1Var2 = n0Var.d;
            c1Var2.l1 = 0.0f;
            c1Var2.invalidate();
        }
        return true;
    }
}
