package qh;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ k c;

    public g(k kVar) {
        this.c = kVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        k kVar = this.c;
        e eVar = kVar.W;
        org.telegram.ui.Components.k6 k6Var = kVar.v;
        kVar.w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = kVar.getCaptionLimit();
        if (kVar.w + 25 > captionLimit) {
            str = "" + (captionLimit - kVar.w);
        } else {
            str = null;
        }
        k6Var.a();
        k6Var.setText(str);
        k6Var.setTextColor(kVar.w >= captionLimit ? -1280137 : -1);
        if (kVar.w > captionLimit && !UserConfig.getInstance(kVar.R).isPremium() && kVar.w < kVar.getCaptionPremiumLimit() && kVar.w > this.a && (kVar.e() || MessagesController.getInstance(kVar.R).premiumFeaturesBlocked())) {
            int i10 = -kVar.K;
            kVar.K = i10;
            AndroidUtilities.shakeViewSpring(k6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = kVar.w;
        this.a = i11;
        boolean z4 = i11 > captionLimit;
        if (z4 != this.b) {
            kVar.q(z4);
        }
        this.b = z4;
        if (!kVar.S) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        kVar.S = false;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 8));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.c;
        ObjectAnimator objectAnimator = kVar.d0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            kVar.U = kVar.f.getEditText().getScrollY();
            kVar.T = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.c;
        f fVar = kVar.f;
        if (fVar.getEditText().suppressOnTextChanged) {
            return;
        }
        if (kVar.J == null) {
            zh zhVar = new zh(kVar, kVar.getContext(), kVar.x, LaunchActivity.R(), new oh.b(), 1);
            kVar.J = zhVar;
            kVar.Q = new org.telegram.ui.Components.fa(kVar.L, zhVar, 0, false);
            kVar.J.p(new ai(kVar, 7));
            og.a aVar = kVar.e0;
            if (aVar != null) {
                zh zhVar2 = kVar.J;
                qg.b c3 = aVar.c(zhVar2, null, false);
                c3.n(sg.b.i(kVar.a));
                zhVar2.setBackgroundDrawable(c3);
            }
            kVar.b.addView(kVar.J, k7.c6.e(-1, -1, 83));
            kVar.w();
        }
        if (kVar.J.getAdapter() != null) {
            uf.u0 adapter = kVar.J.getAdapter();
            MessagesController.getInstance(kVar.R).getUser(Long.valueOf(kVar.x));
            TLRPC.Chat chat = MessagesController.getInstance(kVar.R).getChat(Long.valueOf(-kVar.x));
            adapter.getClass();
            adapter.i0 = chat;
            kVar.J.getAdapter().U(charSequence, fVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
