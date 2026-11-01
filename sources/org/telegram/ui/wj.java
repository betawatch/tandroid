package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj b;

    public /* synthetic */ wj(xj xjVar, int i10) {
        this.a = i10;
        this.b = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xj xjVar = this.b;
                xjVar.W = null;
                un unVar = xjVar.X;
                if (unVar.aa != -1) {
                    unVar.getNotificationCenter().j(unVar.aa);
                    unVar.aa = -1;
                }
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                xj xjVar2 = this.b;
                xjVar2.W = null;
                un unVar2 = xjVar2.X;
                if (unVar2.aa != -1) {
                    unVar2.getNotificationCenter().j(unVar2.aa);
                    unVar2.aa = -1;
                }
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
