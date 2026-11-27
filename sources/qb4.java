// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class qb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb4 b;

    public /* synthetic */ qb4(xb4 xb4Var, byte b) {
        this.a = b;
        this.b = xb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xb4 xb4Var = this.b;
        switch (b) {
            case 0:
                zb4[] zb4VarArr = xb4Var.c;
                zb4[] zb4VarArr2 = xb4Var.b;
                for (int i = 0; i < zb4VarArr2.length; i++) {
                    if (((ArrayList) zb4VarArr2[i].d).size() > 0 || ((ArrayList) zb4VarArr[i].d).size() > 0) {
                        cc4.b("download queue: dc" + (i + 1) + " account=" + xb4Var.currentAccount + " small_operations=" + ((ArrayList) zb4VarArr2[i].d).size() + " large_operations=" + ((ArrayList) zb4VarArr[i].d).size());
                    }
                }
                if (f11.a) {
                    xb4.K.a(xb4Var.I);
                    xb4.K.d(xb4Var.I, 10000L);
                    break;
                }
                break;
            default:
                xb4Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                break;
        }
    }
}
