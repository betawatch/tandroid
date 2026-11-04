package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ xi(yi yiVar, int i3) {
        this.a = i3;
        this.b = yiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yi yiVar = this.b;
                yiVar.W = null;
                wm wmVar = yiVar.X;
                if (wmVar.ba != -1) {
                    wmVar.getNotificationCenter().j(wmVar.ba);
                    wmVar.ba = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                yi yiVar2 = this.b;
                yiVar2.W = null;
                wm wmVar2 = yiVar2.X;
                if (wmVar2.ba != -1) {
                    wmVar2.getNotificationCenter().j(wmVar2.ba);
                    wmVar2.ba = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
