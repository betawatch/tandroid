package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
import org.telegram.ui.l71;
import org.telegram.ui.u61;
import xh.t3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y extends l71 {
    public final /* synthetic */ pk0 d2;
    public final /* synthetic */ p2 e2;
    public final /* synthetic */ c0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, p2 p2Var, Context context, int i10, boolean z10, f6 f6Var, pk0 pk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z10, f6Var, 16);
        this.f2 = c0Var;
        this.d2 = pk0Var;
        this.e2 = p2Var2;
    }

    @Override // org.telegram.ui.l71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        t3 t3Var = this.f2.c;
        pk0 pk0Var = this.d2;
        p2 p2Var = this.e2;
        if (p2Var != null && !pk0Var.A0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new wc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new xh.x(this, 17)).j();
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
        pk0Var.l(view, p0Var, false);
        AndroidUtilities.hideKeyboard(t3Var);
    }

    @Override // org.telegram.ui.l71
    public final void q() {
        c0 c0Var = this.f2;
        if (c0Var.v) {
            return;
        }
        c0Var.v = true;
        if (!c0Var.d) {
            c0Var.b.updateViewLayout(c0Var.c, c0Var.b(true));
        }
        p2 p2Var = this.e2;
        if (p2Var instanceof eo) {
            ((eo) p2Var).P9();
        }
        pk0 pk0Var = this.d2;
        if (pk0Var.getDelegate() != null) {
            pk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.l71
    public final void r(u61 u61Var, p0 p0Var) {
        this.d2.l(u61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.l71
    public final boolean u() {
        pk0 pk0Var = this.d2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().k();
        }
        return false;
    }
}
