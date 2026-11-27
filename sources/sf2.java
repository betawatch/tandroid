// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
