package zh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ j2(u7 u7Var, int i10) {
        this.a = i10;
        this.b = u7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                u7 u7Var = this.b;
                u7Var.c0 = true;
                u7Var.n(true);
                break;
            case 2:
                u7 u7Var2 = this.b;
                if (u7Var2.F != null) {
                    j7 j7Var = u7Var2.v;
                    if (j7Var != null) {
                        p.c = true;
                        j7Var.setLayerType(2, null);
                    }
                    u7Var2.F.addListener(new d7(u7Var2, 0));
                    u7Var2.F.setDuration(320L);
                    u7Var2.F.setInterpolator(wr.h);
                    u7Var2.F.start();
                    break;
                }
                break;
            case 3:
                u7 u7Var3 = this.b;
                u7Var3.v0 = null;
                u7Var3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                u7 u7Var4 = this.b;
                u7Var4.Q();
                r7 r7Var = u7Var4.s0;
                ImageReceiver imageReceiver = r7Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = r7Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
