package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements hf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = ieVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.hf1
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
