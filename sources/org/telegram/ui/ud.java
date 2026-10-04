package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements og1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = meVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.og1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.y0(false, tL_inputCheckPasswordSRP, this.c);
                break;
            case 1:
                this.b.y0(true, tL_inputCheckPasswordSRP, this.c);
                break;
            default:
                this.b.y0(true, tL_inputCheckPasswordSRP, this.c);
                break;
        }
    }
}
