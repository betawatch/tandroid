package pf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i9) {
        this.a = i9;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        f fVar = this.b;
        switch (i9) {
            case 0:
                fVar.a();
                break;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = fVar.a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i10).getInputPeer(fVar.s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                MessagesController.getNotificationsSettings(i10).edit().remove("dialog_botid" + fVar.s).remove("dialog_boturl" + fVar.s).remove("dialog_botflags" + fVar.s).apply();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.s));
                g.a(i10).f = false;
                break;
            default:
                ve.e.s(fVar.getContext(), fVar.x);
                break;
        }
    }
}
