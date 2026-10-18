package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d0 extends r {
    public final /* synthetic */ f0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, Activity activity, int i10, c0 c0Var) {
        super(activity, i10, c0Var);
        this.M = f0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        f0 f0Var = this.M;
        float min = Math.min(height, f0Var.v - (getTranslationY() + getTop()));
        c cVar = f0Var.x;
        if (cVar != null) {
            cVar.G = min;
        }
        f0Var.K = min;
        if (cVar != null) {
            cVar.U = f0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.M;
        u0 u0Var = f0Var.d;
        if (u0Var == null || (u0Var.l1 <= 0.5f && u0Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            u0 u0Var2 = f0Var.d;
            u0Var2.l1 = 0.0f;
            u0Var2.invalidate();
        }
        return true;
    }
}
