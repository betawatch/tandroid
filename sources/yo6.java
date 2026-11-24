// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class yo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ yo6(hq6 hq6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getNotificationCenter().k(56, Long.valueOf(k27.B0(((k27) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    vf6 vf6Var = new vf6();
                    vf6 vf6Var2 = new vf6();
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            ad7.c((TLRPC.Message) arrayList.get(i), vf6Var, vf6Var2);
                        } catch (Exception e) {
                            hq6Var.getMessagesStorage().n(e, true);
                        }
                    }
                    hq6Var.getMessagesStorage().H0(vf6Var, vf6Var2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
