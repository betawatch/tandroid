package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements ug1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
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
