// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class w94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba4 b;

    public /* synthetic */ w94(ba4 ba4Var, byte b) {
        this.a = b;
        this.b = ba4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ba4 ba4Var = this.b;
        switch (b) {
            case 0:
                u20[] u20VarArr = ba4Var.c;
                u20[] u20VarArr2 = ba4Var.b;
                for (int i = 0; i < u20VarArr2.length; i++) {
                    if (((ArrayList) u20VarArr2[i].d).size() > 0 || ((ArrayList) u20VarArr[i].d).size() > 0) {
                        fa4.b("download queue: dc" + (i + 1) + " account=" + ba4Var.currentAccount + " small_operations=" + ((ArrayList) u20VarArr2[i].d).size() + " large_operations=" + ((ArrayList) u20VarArr[i].d).size());
                    }
                }
                if (w01.a) {
                    ba4.K.a(ba4Var.I);
                    ba4.K.d(ba4Var.I, 10000L);
                    break;
                }
                break;
            default:
                ba4Var.getNotificationCenter().k(kk7.d5, new Object[0]);
                break;
        }
    }
}
