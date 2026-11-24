// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class upc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ypc b;

    public /* synthetic */ upc(ypc ypcVar, byte b) {
        this.a = b;
        this.b = ypcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        l7 l7Var;
        byte b = this.a;
        ypc ypcVar = this.b;
        switch (b) {
            case 0:
                ypcVar.e0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!ypcVar.isFinished && (l7Var = ypcVar.O) != null) {
                    if (user != null) {
                        gl.t1(l7Var);
                        ypcVar.l0(null, user);
                        break;
                    } else {
                        gl.d3(new vpc(ypcVar, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }
}
