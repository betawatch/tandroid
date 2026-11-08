package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;

    public /* synthetic */ z60(q10 q10Var, int i7) {
        this.a = i7;
        this.b = q10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        q10 q10Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    q10Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.B1;
                try {
                    q10Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.B1;
                try {
                    q10Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
