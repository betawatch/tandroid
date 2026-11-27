// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bv7 b;

    public /* synthetic */ zu7(bv7 bv7Var, byte b) {
        this.a = b;
        this.b = bv7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bv7 bv7Var = this.b;
        switch (b) {
            case 0:
                bv7Var.invalidate();
                bv7Var.b();
                break;
            default:
                ArrayList arrayList = bv7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((b29) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
