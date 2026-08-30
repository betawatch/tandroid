package rh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i2 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ q2 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(q2 q2Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.M0 = q2Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void A(String str, boolean z4) {
        q2 q2Var = this.M0;
        Paint paint = q2Var.M;
        if (z4) {
            q2Var.i();
            q2Var.R0.a(UserObject.getUserName(MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E))), str);
            q2Var.R0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            q2Var.R0.setBackgroundColor(paint.getColor());
            q2Var.Q0 = str;
        }
        org.telegram.ui.f3 f3Var = q2Var.R0;
        q2Var.P0 = z4;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var, z4, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.a1
    public final void G(org.telegram.ui.web.w0 w0Var) {
        q2 q2Var = this.M0;
        q2Var.v.setWebView(w0Var);
        v0 v0Var = q2Var.y0;
        if (v0Var != null) {
            v0Var.k = w0Var;
        }
        q2Var.j0.setWebView(w0Var);
        q2Var.F();
    }

    @Override // org.telegram.ui.web.a1
    public final void H(org.telegram.ui.web.w0 w0Var) {
        q2 q2Var = this.M0;
        v0 v0Var = q2Var.y0;
        if (v0Var != null && v0Var.k == w0Var) {
            v0Var.k = null;
            v0Var.b();
        }
        q2Var.j0.setWebView(null);
    }
}
