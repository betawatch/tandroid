// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zz5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k16 b;

    public /* synthetic */ zz5(k16 k16Var, byte b) {
        this.a = b;
        this.b = k16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k16 k16Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    k16Var.run();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    k16Var.run();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    k16Var.run();
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
        }
    }
}
