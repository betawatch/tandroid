package vh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((d2) obj).c();
                break;
            case 1:
                ((xg.b) obj).invalidate();
                break;
            case 2:
                yg.c cVar = (yg.c) obj;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.E.isSendError(), true);
                    break;
                }
                break;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) obj, Boolean.TRUE, null, -1);
                break;
        }
    }
}
