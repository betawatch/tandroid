package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z4 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float Q;
    public float R;
    public final rc S;
    public boolean T;

    public z4(a5 a5Var, Context context) {
        super(context, a5Var.D1);
        this.S = new rc(this);
        this.T = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.S.a(0.05f);
        if (a2 < 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, this.Q, this.R);
        }
        super.dispatchDraw(canvas);
        if (a2 < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rc rcVar = this.S;
        if (action == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            rcVar.c(this.T);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
