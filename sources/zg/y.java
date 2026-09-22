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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import yh.s2;
import yh.u3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y extends j71 {
    public final /* synthetic */ sk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ c0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f2 = c0Var;
        this.d2 = sk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.j71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        u3 u3Var = this.f2.c;
        sk0 sk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new s2(this, 11)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            p5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        sk0Var.l(view, p0Var, false);
        AndroidUtilities.hideKeyboard(u3Var);
    }

    @Override // org.telegram.ui.j71
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
        if (n2Var instanceof zn) {
            ((zn) n2Var).P9();
        }
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            sk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.j71
    public final void r(s61 s61Var, p0 p0Var) {
        this.d2.l(s61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.j71
    public final boolean u() {
        sk0 sk0Var = this.d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().k();
        }
        return false;
    }
}
