package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.i71;
import org.telegram.ui.r61;
import yh.w3;
import yh.y2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y extends i71 {
    public final /* synthetic */ gk0 d2;
    public final /* synthetic */ o2 e2;
    public final /* synthetic */ c0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, o2 o2Var, Context context, int i10, boolean z10, f6 f6Var, gk0 gk0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, f6Var, 16);
        this.f2 = c0Var;
        this.d2 = gk0Var;
        this.e2 = o2Var2;
    }

    @Override // org.telegram.ui.i71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.i71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        w3 w3Var = this.f2.c;
        gk0 gk0Var = this.d2;
        o2 o2Var = this.e2;
        if (o2Var != null && !gk0Var.A0 && gk0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                w3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new vc(w3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new y2(this, 10)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            o5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        gk0Var.l(view, p0Var, false);
        AndroidUtilities.hideKeyboard(w3Var);
    }

    @Override // org.telegram.ui.i71
    public final void q() {
        c0 c0Var = this.f2;
        if (c0Var.v) {
            return;
        }
        c0Var.v = true;
        if (!c0Var.d) {
            c0Var.b.updateViewLayout(c0Var.c, c0Var.b(true));
        }
        o2 o2Var = this.e2;
        if (o2Var instanceof bo) {
            ((bo) o2Var).P9();
        }
        gk0 gk0Var = this.d2;
        if (gk0Var.getDelegate() != null) {
            gk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.i71
    public final void r(r61 r61Var, p0 p0Var) {
        this.d2.l(r61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.i71
    public final boolean u() {
        gk0 gk0Var = this.d2;
        if (gk0Var.getDelegate() != null) {
            return gk0Var.getDelegate().k();
        }
        return false;
    }
}
