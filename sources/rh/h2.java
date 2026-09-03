package rh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h2 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ p2 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p2 p2Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.P0 = p2Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void E(String str, boolean z4) {
        p2 p2Var = this.P0;
        Paint paint = p2Var.M;
        if (z4) {
            p2Var.i();
            p2Var.R0.a(UserObject.getUserName(MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E))), str);
            p2Var.R0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            p2Var.R0.setBackgroundColor(paint.getColor());
            p2Var.Q0 = str;
        }
        org.telegram.ui.h3 h3Var = p2Var.R0;
        p2Var.P0 = z4;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var, z4, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        p2 p2Var = this.P0;
        p2Var.v.setWebView(y0Var);
        u0 u0Var = p2Var.y0;
        if (u0Var != null) {
            u0Var.k = y0Var;
        }
        p2Var.j0.setWebView(y0Var);
        p2Var.F();
    }

    @Override // org.telegram.ui.web.c1
    public final void L(org.telegram.ui.web.y0 y0Var) {
        p2 p2Var = this.P0;
        u0 u0Var = p2Var.y0;
        if (u0Var != null && u0Var.k == y0Var) {
            u0Var.k = null;
            u0Var.b();
        }
        p2Var.j0.setWebView(null);
    }
}
