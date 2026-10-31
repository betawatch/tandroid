package rh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a2(e4 e4Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new u0(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new u0(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
