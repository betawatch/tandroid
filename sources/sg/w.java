package sg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.i31;
import org.telegram.ui.s21;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w extends i31 {
    public final /* synthetic */ mj0 e2;
    public final /* synthetic */ k2 f2;
    public final /* synthetic */ b0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, k2 k2Var, Context context, int i10, boolean z10, p6 p6Var, mj0 mj0Var, k2 k2Var2) {
        super(k2Var, context, false, null, i10, z10, p6Var, 16);
        this.g2 = b0Var;
        this.e2 = mj0Var;
        this.f2 = k2Var2;
    }

    @Override // org.telegram.ui.i31
    public final void m() {
        this.g2.a.invalidate();
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ph.k kVar = this.g2.c;
        mj0 mj0Var = this.e2;
        k2 k2Var = this.f2;
        if (k2Var != null && !mj0Var.A0 && mj0Var.getWindowType() != 13 && !d20.i(k2Var.getCurrentAccount()).q()) {
            try {
                kVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new cc(kVar, null).r(document, org.telegram.messenger.i0.W2(cd.L0(2131743886, null)), cd.L0(2131747048, null), new v(this, 1)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            f5.g(d20.s0).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        o0 o0Var = new o0();
        o0Var.g = longValue;
        o0Var.h = longValue;
        mj0Var.l(view, o0Var, false);
        org.telegram.messenger.i0.v1(kVar);
    }

    @Override // org.telegram.ui.i31
    public final void q() {
        b0 b0Var = this.g2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        k2 k2Var = this.f2;
        if (k2Var instanceof un) {
            ((un) k2Var).fa();
        }
        mj0 mj0Var = this.e2;
        if (mj0Var.getDelegate() != null) {
            mj0Var.getDelegate().h();
        }
    }

    @Override // org.telegram.ui.i31
    public final void r(s21 s21Var, o0 o0Var) {
        this.e2.l(s21Var, o0Var, false);
        org.telegram.messenger.i0.v1(this.g2.c);
    }

    @Override // org.telegram.ui.i31
    public final boolean u() {
        mj0 mj0Var = this.e2;
        if (mj0Var.getDelegate() != null) {
            return mj0Var.getDelegate().h();
        }
        return false;
    }
}
