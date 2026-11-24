// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s76 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t76 b;

    public /* synthetic */ s76(t76 t76Var, byte b) {
        this.a = b;
        this.b = t76Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        t76 t76Var = this.b;
        switch (b) {
            case 0:
                int i = t76Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        gl.d3(new r76(t76Var, (byte) 2));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(i).a4(updates.users, false);
                    na7.q1(i).U3(updates.chats, false);
                    na7.q1(i).Q3(updates, false);
                    break;
                }
                break;
            case 1:
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(t76Var.e).Q3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 2:
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(t76Var.e).Q3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                gl.d3(new sx5((byte) 10, t76Var, tL_error, tLObject));
                break;
        }
    }
}
