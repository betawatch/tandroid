// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class tx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ tx9(wx9 wx9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    r47 r47Var = new r47(wx9Var.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
                    r47Var.C0 = true;
                    wx9Var.getSendMessagesHelper().j0(0L, r47Var, true);
                }
                break;
            default:
                wx9Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    r47 r47Var2 = (r47) wx9Var.getMessagesController().T.f(((Long) arrayList.get(i2)).longValue());
                    if (r47Var2 != null) {
                        r47Var2.Z = true;
                    }
                }
                break;
        }
    }
}
