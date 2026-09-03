package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements ig1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ td(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ig1
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.b0(false, tL_inputCheckPasswordSRP, this.c);
                break;
            case 1:
                this.b.b0(true, tL_inputCheckPasswordSRP, this.c);
                break;
            default:
                this.b.b0(true, tL_inputCheckPasswordSRP, this.c);
                break;
        }
    }
}
