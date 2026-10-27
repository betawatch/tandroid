package zh;

import android.content.Context;
import android.view.MotionEvent;
import bi.yd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends yd {
    public final /* synthetic */ m m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, u6 u6Var) {
        super(context, u6Var);
        this.m0 = mVar;
    }

    @Override // bi.yd
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m.U(this.m0);
        return true;
    }

    @Override // bi.yd, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // bi.yd
    public final void e(int i10) {
        m.T(this.m0, i10);
    }

    @Override // bi.yd
    public final void setValue(int i10) {
        super.setValue(i10);
        m.T(this.m0, i10);
    }
}
