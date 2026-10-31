package vh;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
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
        e eVar = kVar.c0;
        org.telegram.ui.Components.f6 f6Var = kVar.w;
        kVar.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = kVar.getCaptionLimit();
        if (kVar.x + 25 > captionLimit) {
            str = "" + (captionLimit - kVar.x);
        } else {
            str = null;
        }
        f6Var.a();
        f6Var.setText(str);
        f6Var.setTextColor(kVar.x >= captionLimit ? -1280137 : -1);
        if (kVar.x > captionLimit && !d20.i(kVar.U).q() && kVar.x < kVar.getCaptionPremiumLimit() && kVar.x > this.a && (kVar.e() || vp.r1(kVar.U).A3())) {
            int i10 = -kVar.N;
            kVar.N = i10;
            org.telegram.messenger.i0.F3(i10, f6Var, null);
            org.telegram.messenger.t2.D.a();
        }
        int i11 = kVar.x;
        this.a = i11;
        boolean z10 = i11 > captionLimit;
        if (z10 != this.b) {
            kVar.q(z10);
        }
        this.b = z10;
        if (!kVar.V) {
            org.telegram.messenger.i0.r(eVar);
            org.telegram.messenger.i0.h3(eVar, 1500L);
        }
        kVar.V = false;
        org.telegram.messenger.i0.g3(new sg.v(this, 27));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.c;
        ObjectAnimator objectAnimator = kVar.f0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            kVar.a0 = kVar.f.getEditText().getScrollY();
            kVar.W = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.c;
        f fVar = kVar.f;
        if (fVar.getEditText().h) {
            return;
        }
        if (kVar.M == null) {
            oh ohVar = new oh(kVar, kVar.getContext(), kVar.y, LaunchActivity.Q(), new th.b(), 1);
            kVar.M = ohVar;
            kVar.T = new w9(kVar.O, ohVar, 0, false);
            kVar.M.p(new m2.t(kVar, 29));
            tg.b bVar = kVar.g0;
            if (bVar != null) {
                oh ohVar2 = kVar.M;
                vg.f c10 = bVar.c(ohVar2, null, false);
                c10.o(w7.b9.i(kVar.a));
                ohVar2.setBackgroundDrawable(c10);
            }
            kVar.b.addView(kVar.M, w7.b6.e(-1, -1, 83));
            kVar.w();
        }
        if (kVar.M.getAdapter() != null) {
            zf.x0 adapter = kVar.M.getAdapter();
            vp.r1(kVar.U).Z1(Long.valueOf(kVar.y));
            TLRPC.Chat L0 = vp.r1(kVar.U).L0(Long.valueOf(-kVar.y));
            adapter.getClass();
            adapter.l0 = L0;
            kVar.M.getAdapter().U(charSequence, fVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
