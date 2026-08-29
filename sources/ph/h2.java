package ph;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h2 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ p2 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p2 p2Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = p2Var;
    }

    @Override // org.telegram.ui.web.z0
    public final void A(String str, boolean z10) {
        p2 p2Var = this.L0;
        Paint paint = p2Var.L;
        if (z10) {
            p2Var.i();
            p2Var.Q0.a(UserObject.getUserName(MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D))), str);
            p2Var.Q0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            p2Var.Q0.setBackgroundColor(paint.getColor());
            p2Var.P0 = str;
        }
        org.telegram.ui.h3 h3Var = p2Var.Q0;
        p2Var.O0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.z0
    public final void G(org.telegram.ui.web.w0 w0Var) {
        p2 p2Var = this.L0;
        p2Var.v.setWebView(w0Var);
        u0 u0Var = p2Var.x0;
        if (u0Var != null) {
            u0Var.k = w0Var;
        }
        p2Var.i0.setWebView(w0Var);
        p2Var.F();
    }

    @Override // org.telegram.ui.web.z0
    public final void H(org.telegram.ui.web.w0 w0Var) {
        p2 p2Var = this.L0;
        u0 u0Var = p2Var.x0;
        if (u0Var != null && u0Var.k == w0Var) {
            u0Var.k = null;
            u0Var.b();
        }
        p2Var.i0.setWebView(null);
    }
}
