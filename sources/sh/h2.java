package sh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h2 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ p2 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p2 p2Var, Context context, g6 g6Var, int i10) {
        super(i10, context, g6Var, true);
        this.M0 = p2Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void A(String str, boolean z4) {
        p2 p2Var = this.M0;
        Paint paint = p2Var.M;
        if (z4) {
            p2Var.i();
            p2Var.R0.a(UserObject.getUserName(MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E))), str);
            p2Var.R0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            p2Var.R0.setBackgroundColor(paint.getColor());
            p2Var.Q0 = str;
        }
        org.telegram.ui.f3 f3Var = p2Var.R0;
        p2Var.P0 = z4;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var, z4, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.a1
    public final void G(org.telegram.ui.web.x0 x0Var) {
        p2 p2Var = this.M0;
        p2Var.v.setWebView(x0Var);
        u0 u0Var = p2Var.y0;
        if (u0Var != null) {
            u0Var.k = x0Var;
        }
        p2Var.j0.setWebView(x0Var);
        p2Var.F();
    }

    @Override // org.telegram.ui.web.a1
    public final void H(org.telegram.ui.web.x0 x0Var) {
        p2 p2Var = this.M0;
        u0 u0Var = p2Var.y0;
        if (u0Var != null && u0Var.k == x0Var) {
            u0Var.k = null;
            u0Var.b();
        }
        p2Var.j0.setWebView(null);
    }
}
