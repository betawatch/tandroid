// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wv7 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final u51 W;
    public boolean a0;

    public wv7(xv7 xv7Var, Context context) {
        super(context, xv7Var.w1);
        this.W = new u51(this);
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
        u51 u51Var = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            u51Var.c(this.a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u51Var.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
