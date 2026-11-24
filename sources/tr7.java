// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
