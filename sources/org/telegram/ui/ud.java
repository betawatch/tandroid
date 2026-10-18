package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements jf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.jf1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.b0(tL_inputCheckPasswordSRP, this.c, false);
                break;
            case 1:
                this.b.b0(tL_inputCheckPasswordSRP, this.c, true);
                break;
            default:
                this.b.b0(tL_inputCheckPasswordSRP, this.c, true);
                break;
        }
    }
}
