// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pz8 extends dz8 {
    public final /* synthetic */ rz8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz8(rz8 rz8Var, Activity activity, int i, oz8 oz8Var) {
        super(activity, i, oz8Var);
        this.N = rz8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        rz8 rz8Var = this.N;
        float min = Math.min(height, rz8Var.w - (getTranslationY() + getTop()));
        ny3 ny3Var = rz8Var.y;
        if (ny3Var != null) {
            ny3Var.H = min;
        }
        rz8Var.L = min;
        if (ny3Var != null) {
            ny3Var.V = rz8Var.s - ny3Var.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rz8 rz8Var = this.N;
        g09 g09Var = rz8Var.d;
        if (g09Var == null || (g09Var.m1 <= 0.5f && g09Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            g09 g09Var2 = rz8Var.d;
            g09Var2.m1 = 0.0f;
            g09Var2.invalidate();
        }
        return true;
    }
}
