// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ tj3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.c = false;
                uj3Var.b.run();
                ArrayList arrayList = uj3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - uj3Var.f > 3600000) {
                    arrayList.clear();
                    uj3Var.e = false;
                    uj3Var.g = null;
                    uj3Var.a();
                    break;
                }
                break;
            default:
                uj3Var.i = false;
                break;
        }
    }
}
