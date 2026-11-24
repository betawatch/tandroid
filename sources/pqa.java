// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pqa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pqa(wsa wsaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gm.c3(new sqa(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                gm.c3(new sqa(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
