package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly b;

    public /* synthetic */ t60(ly lyVar, int i3) {
        this.a = i3;
        this.b = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ly lyVar = this.b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.E1;
                try {
                    lyVar.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
