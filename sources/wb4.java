// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc4 b;

    public /* synthetic */ wb4(bc4 bc4Var, byte b) {
        this.a = b;
        this.b = bc4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bc4 bc4Var = this.b;
        switch (b) {
            case 0:
                u30[] u30VarArr = bc4Var.c;
                u30[] u30VarArr2 = bc4Var.b;
                for (int i = 0; i < u30VarArr2.length; i++) {
                    if (((ArrayList) u30VarArr2[i].d).size() > 0 || ((ArrayList) u30VarArr[i].d).size() > 0) {
                        fc4.b("download queue: dc" + (i + 1) + " account=" + bc4Var.currentAccount + " small_operations=" + ((ArrayList) u30VarArr2[i].d).size() + " large_operations=" + ((ArrayList) u30VarArr[i].d).size());
                    }
                }
                if (e21.a) {
                    bc4.K.a(bc4Var.I);
                    bc4.K.d(bc4Var.I, 10000L);
                    break;
                }
                break;
            default:
                bc4Var.getNotificationCenter().k(nm7.f5, new Object[0]);
                break;
        }
    }
}
