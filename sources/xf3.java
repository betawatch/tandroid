// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xf3 implements oj3, lu2 {
    public final /* synthetic */ bg3 a;

    public /* synthetic */ xf3(bg3 bg3Var) {
        this.a = bg3Var;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // lu2
    public final void b(TLRPC.User user) {
        this.a.p0(user);
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j = ((jf7) arrayList.get(0)).a;
        if (!wf3.D(j)) {
            return true;
        }
        bg3 bg3Var = this.a;
        bg3Var.p0(bg3Var.getMessagesController().X1(Long.valueOf(j)));
        return true;
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
