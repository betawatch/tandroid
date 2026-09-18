package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements vg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ td(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = leVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.vg1
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
