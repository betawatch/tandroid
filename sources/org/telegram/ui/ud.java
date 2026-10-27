package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements sf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.sf1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.F(tL_inputCheckPasswordSRP, this.c, false);
                break;
            case 1:
                this.b.F(tL_inputCheckPasswordSRP, this.c, true);
                break;
            default:
                this.b.F(tL_inputCheckPasswordSRP, this.c, true);
                break;
        }
    }
}
