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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.h71;
import org.telegram.ui.q61;
import yh.v3;
import yh.x2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y extends h71 {
    public final /* synthetic */ fk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ c0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, e6 e6Var, fk0 fk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, e6Var, 16);
        this.f2 = c0Var;
        this.d2 = fk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.h71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        v3 v3Var = this.f2.c;
        fk0 fk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !fk0Var.A0 && fk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                v3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new vc(v3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new x2(this, 10)).j();
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
        fk0Var.l(view, p0Var, false);
        AndroidUtilities.hideKeyboard(v3Var);
    }

    @Override // org.telegram.ui.h71
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
        if (n2Var instanceof bo) {
            ((bo) n2Var).P9();
        }
        fk0 fk0Var = this.d2;
        if (fk0Var.getDelegate() != null) {
            fk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.h71
    public final void r(q61 q61Var, p0 p0Var) {
        this.d2.l(q61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.h71
    public final boolean u() {
        fk0 fk0Var = this.d2;
        if (fk0Var.getDelegate() != null) {
            return fk0Var.getDelegate().k();
        }
        return false;
    }
}
