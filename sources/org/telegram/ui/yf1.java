package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yf1 extends og1 {
    public final /* synthetic */ TwoStepVerificationActivity h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.h0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.og1
    public final void B0() {
        this.h0.K = true;
    }
}
