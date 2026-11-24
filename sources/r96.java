// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class r96 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s96 b;

    public /* synthetic */ r96(s96 s96Var, byte b) {
        this.a = b;
        this.b = s96Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        s96 s96Var = this.b;
        switch (b) {
            case 0:
                int i = s96Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        gm.c3(new q96(s96Var, (byte) 2));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(i).d4(updates.users, false);
                    oc7.r1(i).X3(updates.chats, false);
                    oc7.r1(i).T3(updates, false);
                    break;
                }
                break;
            case 1:
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(s96Var.e).T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 2:
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(s96Var.e).T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                gm.c3(new dt5(s96Var, tLObject, tL_error, (byte) 12));
                break;
        }
    }
}
