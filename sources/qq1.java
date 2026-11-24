// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qq1 extends ztb {
    public final /* synthetic */ mu1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq1(mu1 mu1Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.e = mu1Var;
    }

    @Override // ztb, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        mu1 mu1Var = this.e;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.y() || mu1Var.T7()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
