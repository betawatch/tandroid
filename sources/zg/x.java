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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import yh.s2;
import yh.u3;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x extends j71 {
    public final /* synthetic */ pk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ b0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, pk0 pk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f2 = b0Var;
        this.d2 = pk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.j71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        u3 u3Var = this.f2.c;
        pk0 pk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !pk0Var.A0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
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
        o0 o0Var = new o0();
        o0Var.g = longValue;
        o0Var.h = longValue;
        pk0Var.l(view, o0Var, false);
        AndroidUtilities.hideKeyboard(u3Var);
    }

    @Override // org.telegram.ui.j71
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
        if (n2Var instanceof zn) {
            ((zn) n2Var).P9();
        }
        pk0 pk0Var = this.d2;
        if (pk0Var.getDelegate() != null) {
            pk0Var.getDelegate().k();
        }
    }

    @Override // org.telegram.ui.j71
    public final void r(s61 s61Var, o0 o0Var) {
        this.d2.l(s61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.j71
    public final boolean u() {
        pk0 pk0Var = this.d2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().k();
        }
        return false;
    }
}
