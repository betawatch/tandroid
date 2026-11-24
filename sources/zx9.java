// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vz9 b;

    public /* synthetic */ zx9(vz9 vz9Var, byte b) {
        this.a = b;
        this.b = vz9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vz9 vz9Var = this.b;
        switch (b) {
            case 0:
                vz9Var.getClass();
                HashSet hashSet = oi5.a;
                ix2 ix2Var = fn5.z().p;
                if (((CountDownLatch) ix2Var.c) == null) {
                    ix2Var.c = new CountDownLatch(1);
                }
                oi5.b = true;
                oi5.e = false;
                oi5.g = false;
                gm.d3(new zx9(vz9Var, (byte) 2), 0L);
                break;
            case 1:
                ArrayList arrayList = vz9Var.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = vz9Var.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = vz9Var.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                vz9Var.r0.E(true);
                break;
            case 2:
                vz9Var.W1.start();
                break;
            case 3:
                vz9Var.B(true, true, true);
                break;
            default:
                nm7 e = nm7.e();
                zx9 zx9Var = vz9Var.T1;
                e.e.remove(zx9Var);
                nm7.e().d(zx9Var);
                break;
        }
    }
}
