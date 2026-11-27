// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class t96 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w96 b;

    public /* synthetic */ t96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(w96Var.e).Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                hl.c3(new ls5(w96Var, tLObject, tL_error, (byte) 15));
                break;
            case 2:
                int i = w96Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        hl.c3(new u96(w96Var, (byte) 7));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(i).j4(updates.users, false);
                    uc7.s1(i).c4(updates.chats, false);
                    uc7.s1(i).Y3(updates, false);
                    break;
                }
                break;
            default:
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(w96Var.e).Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
        }
    }
}
