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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a71;
import org.telegram.ui.j61;
import org.telegram.ui.wn;
import yh.r2;
import yh.t3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x extends a71 {
    public final /* synthetic */ qk0 d2;
    public final /* synthetic */ m2 e2;
    public final /* synthetic */ b0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, m2 m2Var, Context context, int i10, boolean z10, d6 d6Var, qk0 qk0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, d6Var, 16);
        this.f2 = b0Var;
        this.d2 = qk0Var;
        this.e2 = m2Var2;
    }

    @Override // org.telegram.ui.a71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        t3 t3Var = this.f2.c;
        qk0 qk0Var = this.d2;
        m2 m2Var = this.e2;
        if (m2Var != null && !qk0Var.A0 && qk0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new r2(this, 11)).j();
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
        qk0Var.l(view, o0Var, false);
        AndroidUtilities.hideKeyboard(t3Var);
    }

    @Override // org.telegram.ui.a71
    public final void q() {
        b0 b0Var = this.f2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        m2 m2Var = this.e2;
        if (m2Var instanceof wn) {
            ((wn) m2Var).P9();
        }
        qk0 qk0Var = this.d2;
        if (qk0Var.getDelegate() != null) {
            qk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.a71
    public final void r(j61 j61Var, o0 o0Var) {
        this.d2.l(j61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.a71
    public final boolean u() {
        qk0 qk0Var = this.d2;
        if (qk0Var.getDelegate() != null) {
            return qk0Var.getDelegate().k();
        }
        return false;
    }
}
