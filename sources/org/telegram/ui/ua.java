package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        nu0 nu0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                break;
            case 1:
                wn wnVar = ((in) obj).a;
                if (i10 > 0 && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(wnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, wnVar.ea).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (nu0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(nu0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.e1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                wf1 wf1Var = ((bf1) obj).a;
                if (i10 != 0) {
                    wf1Var.finishFragment();
                    break;
                } else {
                    wf1Var.O0(false);
                    break;
                }
        }
    }
}
