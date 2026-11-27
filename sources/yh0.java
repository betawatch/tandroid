// default package

import java.util.Collections;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class yh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ di0 b;

    public /* synthetic */ yh0(di0 di0Var, byte b) {
        this.a = b;
        this.b = di0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        di0 di0Var = this.b;
        switch (b) {
            case 0:
                di0Var.getClass();
                try {
                    di0Var.o(Collections.singletonList(di0.k), new zh0(di0Var, (byte) 0));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                di0Var.q();
                break;
        }
    }
}
