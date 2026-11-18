package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ z60(n60 n60Var, int i7) {
        this.a = i7;
        this.b = n60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n60 n60Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    n60Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    n60Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    n60Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
