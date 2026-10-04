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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.c71;
import org.telegram.ui.l61;
import org.telegram.ui.yn;
import yh.r2;
import yh.t3;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x extends c71 {
    public final /* synthetic */ sk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ b0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f2 = b0Var;
        this.d2 = sk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.c71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.c71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        t3 t3Var = this.f2.c;
        sk0 sk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new r2(this, 11)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            q5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        o0 o0Var = new o0();
        o0Var.g = longValue;
        o0Var.h = longValue;
        sk0Var.l(view, o0Var, false);
        AndroidUtilities.hideKeyboard(t3Var);
    }

    @Override // org.telegram.ui.c71
    public final void q() {
        b0 b0Var = this.f2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof yn) {
            ((yn) n2Var).O9();
        }
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            sk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.c71
    public final void r(l61 l61Var, o0 o0Var) {
        this.d2.l(l61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.c71
    public final boolean u() {
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().k();
        }
        return false;
    }
}
