// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
