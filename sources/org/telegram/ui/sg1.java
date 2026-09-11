package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
