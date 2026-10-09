package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.k71;
import org.telegram.ui.t61;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w extends k71 {
    public final /* synthetic */ kl0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ a0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, n2 n2Var, Context context, int i10, boolean z10, e6 e6Var, kl0 kl0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, e6Var, 16);
        this.f2 = a0Var;
        this.d2 = kl0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.k71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.k71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        xh.m mVar = this.f2.c;
        kl0 kl0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !kl0Var.A0 && kl0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                mVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new ad(mVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new yh.f0(this, 15)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            s5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        n0 n0Var = new n0();
        n0Var.g = longValue;
        n0Var.h = longValue;
        kl0Var.l(view, n0Var, false);
        AndroidUtilities.hideKeyboard(mVar);
    }

    @Override // org.telegram.ui.k71
    public final void q() {
        a0 a0Var = this.f2;
        if (a0Var.v) {
            return;
        }
        a0Var.v = true;
        if (!a0Var.d) {
            a0Var.b.updateViewLayout(a0Var.c, a0Var.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof zn) {
            ((zn) n2Var).U9();
        }
        kl0 kl0Var = this.d2;
        if (kl0Var.getDelegate() != null) {
            kl0Var.getDelegate().q();
        }
    }

    @Override // org.telegram.ui.k71
    public final void r(t61 t61Var, n0 n0Var) {
        this.d2.l(t61Var, n0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.k71
    public final boolean u() {
        kl0 kl0Var = this.d2;
        if (kl0Var.getDelegate() != null) {
            return kl0Var.getDelegate().q();
        }
        return false;
    }
}
