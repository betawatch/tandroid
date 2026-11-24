// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr7 b;

    public /* synthetic */ tr7(vr7 vr7Var, byte b) {
        this.a = b;
        this.b = vr7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vr7 vr7Var = this.b;
        switch (b) {
            case 0:
                vr7Var.invalidate();
                vr7Var.b();
                break;
            default:
                ArrayList arrayList = vr7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((oy8) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
