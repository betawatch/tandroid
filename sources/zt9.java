// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zt9(bu9 bu9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    k27 k27Var = new k27(bu9Var.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
                    k27Var.C0 = true;
                    bu9Var.getSendMessagesHelper().j0(0L, k27Var, true);
                }
                break;
            default:
                bu9Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    k27 k27Var2 = (k27) bu9Var.getMessagesController().T.f(((Long) arrayList.get(i2)).longValue());
                    if (k27Var2 != null) {
                        k27Var2.Z = true;
                    }
                }
                break;
        }
    }
}
