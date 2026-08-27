package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        ut0 ut0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((qb) obj).V0(true);
                break;
            case 1:
                rn rnVar = ((dn) obj).a;
                if (i10 > 0 && rnVar.getParentActivity() != null && rnVar.fragmentView != null) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(org.telegram.ui.Components.lc.E, i10, 0, 0, rnVar.aa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (ut0Var = photoViewer.a0) != null && i10 > 0) {
                    org.telegram.ui.Components.mc.F(ut0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.a1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                we1 we1Var = ((be1) obj).a;
                if (i10 != 0) {
                    we1Var.finishFragment();
                    break;
                } else {
                    we1Var.O0(false);
                    break;
                }
        }
    }
}
