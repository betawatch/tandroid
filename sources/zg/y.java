package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.i61;
import org.telegram.ui.xn;
import org.telegram.ui.z61;
import yh.u3;
import yh.w2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y extends z61 {
    public final /* synthetic */ gk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ c0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, gk0 gk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f2 = c0Var;
        this.d2 = gk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.z61
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        u3 u3Var = this.f2.c;
        gk0 gk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !gk0Var.A0 && gk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new w2(this, 10)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            q5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        gk0Var.l(view, p0Var, false);
        AndroidUtilities.hideKeyboard(u3Var);
    }

    @Override // org.telegram.ui.z61
    public final void q() {
        c0 c0Var = this.f2;
        if (c0Var.v) {
            return;
        }
        c0Var.v = true;
        if (!c0Var.d) {
            c0Var.b.updateViewLayout(c0Var.c, c0Var.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof xn) {
            ((xn) n2Var).P9();
        }
        gk0 gk0Var = this.d2;
        if (gk0Var.getDelegate() != null) {
            gk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.z61
    public final void r(i61 i61Var, p0 p0Var) {
        this.d2.l(i61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.z61
    public final boolean u() {
        gk0 gk0Var = this.d2;
        if (gk0Var.getDelegate() != null) {
            return gk0Var.getDelegate().k();
        }
        return false;
    }
}
