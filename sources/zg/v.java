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
import org.telegram.ui.a71;
import org.telegram.ui.j61;
import org.telegram.ui.yn;
import yh.o2;
import yh.u3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class v extends a71 {
    public final /* synthetic */ sk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ z f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f2 = zVar;
        this.d2 = sk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.a71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        u3 u3Var = this.f2.c;
        sk0 sk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new o2(this, 12)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            q5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        m0 m0Var = new m0();
        m0Var.g = longValue;
        m0Var.h = longValue;
        sk0Var.l(view, m0Var, false);
        AndroidUtilities.hideKeyboard(u3Var);
    }

    @Override // org.telegram.ui.a71
    public final void q() {
        z zVar = this.f2;
        if (zVar.v) {
            return;
        }
        zVar.v = true;
        if (!zVar.d) {
            zVar.b.updateViewLayout(zVar.c, zVar.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof yn) {
            ((yn) n2Var).O9();
        }
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            sk0Var.getDelegate().E();
        }
    }

    @Override // org.telegram.ui.a71
    public final void r(j61 j61Var, m0 m0Var) {
        this.d2.l(j61Var, m0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.a71
    public final boolean u() {
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().E();
        }
        return false;
    }
}
