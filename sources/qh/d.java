package qh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = c2Var;
        this.c = j10;
        this.d = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public final void run(long j10) {
        switch (this.a) {
            case 0:
                g gVar = (g) this.e;
                gVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    gVar.a = -j10;
                    gVar.b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.c, this.d);
                    break;
                }
                break;
            default:
                i0.p((i0) this.e, this.b, this.c, this.d, j10);
                break;
        }
    }
}
