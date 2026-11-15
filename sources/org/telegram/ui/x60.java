package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g50 b;

    public /* synthetic */ x60(g50 g50Var, int i7) {
        this.a = i7;
        this.b = g50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g50 g50Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    g50Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
