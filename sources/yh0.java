// default package

import java.util.Collections;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
