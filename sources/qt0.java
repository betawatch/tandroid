// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt0 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ qt0(au0 au0Var, byte b) {
        this.a = b;
        this.b = au0Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.p0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                break;
            default:
                this.b.o0((ArrayList) obj);
                break;
        }
    }
}
