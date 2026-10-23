package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements of1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = ieVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.of1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.a0(tL_inputCheckPasswordSRP, this.c, false);
                break;
            case 1:
                this.b.a0(tL_inputCheckPasswordSRP, this.c, true);
                break;
            default:
                this.b.a0(tL_inputCheckPasswordSRP, this.c, true);
                break;
        }
    }
}
