package yh;

import ai.ie;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class h extends ie {
    public final /* synthetic */ m m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, d6 d6Var) {
        super(context, d6Var);
        this.m0 = mVar;
    }

    @Override // ai.ie
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m.V(this.m0);
        return true;
    }

    @Override // ai.ie, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // ai.ie
    public final void e(int i10) {
        m.U(this.m0, i10);
    }

    @Override // ai.ie
    public final void setValue(int i10) {
        super.setValue(i10);
        m.U(this.m0, i10);
    }
}
