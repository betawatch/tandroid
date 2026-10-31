package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a4 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final dc V;
    public boolean W;

    public a4(b4 b4Var, Context context) {
        super(context, b4Var.p1);
        this.V = new dc(this);
        this.W = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.V.a(0.05f);
        if (a2 < 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, this.T, this.U);
        }
        super.dispatchDraw(canvas);
        if (a2 < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            dcVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
