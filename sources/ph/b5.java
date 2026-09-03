package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class b5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float Q;
    public float R;
    public final rc S;
    public boolean T;

    public b5(c5 c5Var, Context context) {
        super(context, c5Var.D1);
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
