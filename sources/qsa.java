// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qsa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ qsa(wua wuaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new wsa(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                hl.c3(new wsa(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
