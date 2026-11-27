// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sf2 implements lc5 {
    public final /* synthetic */ rc5 a;
    public final /* synthetic */ bg2 b;

    public sf2(bg2 bg2Var, rc5 rc5Var) {
        this.b = bg2Var;
        this.a = rc5Var;
    }

    @Override // lc5
    public final void d(TLRPC.User user) {
        this.b.x0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // lc5
    public final void f(int i, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        bg2 bg2Var = this.b;
        bg2Var.getMessagesController().l(bg2Var.n, bg2Var, arrayList, i, new hw(this, (byte) 6), new t42((byte) 1), null);
    }
}
