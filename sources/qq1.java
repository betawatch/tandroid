// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        if (aVar.y() || mu1Var.R7()) {
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
