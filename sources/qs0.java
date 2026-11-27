// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qs0 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ qs0(at0 at0Var, byte b) {
        this.a = b;
        this.b = at0Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.o0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                break;
            default:
                this.b.n0((ArrayList) obj);
                break;
        }
    }
}
