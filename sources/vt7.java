// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vt7 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final n41 W;
    public boolean a0;

    public vt7(wt7 wt7Var, Context context) {
        super(context, wt7Var.w1);
        this.W = new n41(this);
        this.a0 = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a = this.W.a(0.05f);
        if (a < 1.0f) {
            canvas.save();
            canvas.scale(a, a, this.U, this.V);
        }
        super.dispatchDraw(canvas);
        if (a < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        n41 n41Var = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            n41Var.c(this.a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            n41Var.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
