// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class poa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ poa(vqa vqaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.c3(new soa(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                gl.c3(new soa(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
