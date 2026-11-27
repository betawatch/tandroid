// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
