package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class sg1 extends hh1 {
    public final /* synthetic */ TwoStepVerificationActivity k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.k0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.hh1
    public final void B0() {
        this.k0.N = true;
    }
}
