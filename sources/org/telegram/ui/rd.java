package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements gc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ rd(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = leVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.gc1
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.F(false, tL_inputCheckPasswordSRP, this.c);
                break;
            case 1:
                this.b.F(true, tL_inputCheckPasswordSRP, this.c);
                break;
            default:
                this.b.F(true, tL_inputCheckPasswordSRP, this.c);
                break;
        }
    }
}
