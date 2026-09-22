package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements ug1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = jeVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ug1
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
