// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        f09 f09Var = rz8Var.d;
        if (f09Var == null || (f09Var.m1 <= 0.5f && f09Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            f09 f09Var2 = rz8Var.d;
            f09Var2.m1 = 0.0f;
            f09Var2.invalidate();
        }
        return true;
    }
}
