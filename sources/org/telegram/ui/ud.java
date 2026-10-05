package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements mg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = meVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.mg1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
