// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rq1 extends uk1 {
    public final /* synthetic */ mu1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(mu1 mu1Var, wjb wjbVar, Context context) {
        super(wjbVar, context, false);
        this.z2 = mu1Var;
    }

    @Override // uk1, android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        mu1 mu1Var = this.z2;
        if (mu1Var.R8 == null) {
            float y = ((mu1Var.A0.getY() + mu1Var.P9) - getY()) - gl.L(4.0f);
            aVar = ((d) mu1Var).actionBar;
            if (aVar.getVisibility() == 0 || mu1Var.Aa != null) {
                y -= a.getCurrentActionBarHeight() / 2.0f;
            }
            if (y <= 0.0f) {
                super.onDraw(canvas);
            } else if (y < getMeasuredHeight()) {
                canvas.save();
                canvas.clipRect(0.0f, y, getMeasuredWidth(), getMeasuredHeight());
                super.onDraw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        mu1 mu1Var = this.z2;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.y() || mu1Var.T7()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // uk1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        mu1 mu1Var = this.z2;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.y() || mu1Var.T7()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
